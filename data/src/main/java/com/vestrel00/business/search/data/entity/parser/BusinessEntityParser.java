/*
 * Copyright 2018 Vandolf Estrellado
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vestrel00.business.search.data.entity.parser;

import com.fasterxml.jackson.databind.JsonNode;
import com.vestrel00.business.search.data.entity.BusinessEntity;
import com.vestrel00.business.search.data.entity.BusinessHoursEntity;
import com.vestrel00.business.search.data.entity.BusinessTransactionTypeEntity;
import com.vestrel00.business.search.data.entity.CoordinatesEntity;
import com.vestrel00.business.search.data.entity.LocationEntity;

/**
 * Parses {@link JsonNode} to a {@link BusinessEntity}.
 */
final class BusinessEntityParser implements EntityParser<BusinessEntity> {

    private final EntityParser<BusinessTransactionTypeEntity> transactionTypeEntityParser;
    private final EntityParser<BusinessHoursEntity> hoursEntityParser;
    private final EntityParser<LocationEntity> locationEntityParser;
    private final EntityParser<CoordinatesEntity> coordinatesEntityParser;
    private final EntityParserUtil entityParserUtil;

    BusinessEntityParser(EntityParser<BusinessTransactionTypeEntity> transactionTypeEntityParser,
                         EntityParser<BusinessHoursEntity> hoursEntityParser,
                         EntityParser<LocationEntity> locationEntityParser,
                         EntityParser<CoordinatesEntity> coordinatesEntityParser,
                         EntityParserUtil entityParserUtil) {
        this.transactionTypeEntityParser = transactionTypeEntityParser;
        this.hoursEntityParser = hoursEntityParser;
        this.locationEntityParser = locationEntityParser;
        this.coordinatesEntityParser = coordinatesEntityParser;
        this.entityParserUtil = entityParserUtil;
    }

    @SuppressWarnings("unchecked")
    @Override
    public BusinessEntity parse(JsonNode node) {
        return BusinessEntity.builder()
                .id(node.path("id").asText())
                .name(node.path("name").asText())
                .phoneNumber(node.path("display_phone").asText())
                .imageUrl(node.path("image_url").asText())
                .price(node.path("price").asText())
                .url(node.path("url").asText())
                .transactionTypes(entityParserUtil.parse(transactionTypeEntityParser,
                        node.path("transactions")))
                .categories(node.path("categories").findValuesAsText("title"))
                .photosUrls(entityParserUtil.parse(node.path("photosUrls")))
                .reviewCount(node.path("review_count").asInt())
                .rating((float) node.path("rating").asDouble())
                .distanceInMeters((float) node.path("distance").asDouble())
                .hoursEntity(hoursEntityParser.parse(entityParserUtil
                        .findObjectNode(node.path("hours"), "hours_type", "REGULAR")))
                .locationEntity(locationEntityParser.parse(node.path("location")))
                .coordinatesEntity(coordinatesEntityParser.parse(node.path("coordinates")))
                .build();
    }
}
