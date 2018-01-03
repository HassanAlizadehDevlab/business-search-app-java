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

package com.vestrel00.business.search.data.entity.mapper;

import com.vestrel00.business.search.data.entity.BusinessEntity;
import com.vestrel00.business.search.data.entity.BusinessHourEntity;
import com.vestrel00.business.search.data.entity.BusinessHoursEntity;
import com.vestrel00.business.search.data.entity.BusinessTransactionTypeEntity;
import com.vestrel00.business.search.data.entity.CoordinatesEntity;
import com.vestrel00.business.search.data.entity.LocationEntity;
import com.vestrel00.business.search.domain.Business;
import com.vestrel00.business.search.domain.BusinessHour;
import com.vestrel00.business.search.domain.BusinessHours;
import com.vestrel00.business.search.domain.BusinessTransactionType;
import com.vestrel00.business.search.domain.Coordinates;
import com.vestrel00.business.search.domain.Location;

import dagger.Binds;
import dagger.Module;
import dagger.Reusable;

/**
 * Provides entity mapper dependencies.
 */
@Module
public abstract class EntityMapperModule {

    @Binds
    @Reusable
    abstract EntityMapper<BusinessEntity, Business>
    businessEntityMapper(BusinessEntityMapper businessEntityMapper);

    @Binds
    @Reusable
    abstract EntityMapper<BusinessTransactionTypeEntity, BusinessTransactionType>
    businessTransactionTypeEntityMapper(BusinessTransactionTypeEntityMapper
                                                businessTransactionTypeEntityMapper);

    @Binds
    @Reusable
    abstract EntityMapper<BusinessHoursEntity, BusinessHours>
    businessHoursEntityMapper(BusinessHoursEntityMapper businessHoursEntityMapper);

    @Binds
    @Reusable
    abstract EntityMapper<BusinessHourEntity, BusinessHour>
    businessHourEntityMapper(BusinessHourEntityMapper businessHourEntityMapper);

    @Binds
    @Reusable
    abstract EntityMapper<LocationEntity, Location>
    locationEntityMapper(LocationEntityMapper locationEntityMapper);

    @Binds
    @Reusable
    abstract EntityMapper<CoordinatesEntity, Coordinates>
    coordinatesEntityMapper(CoordinatesEntityMapper coordinatesEntityMapper);
}
