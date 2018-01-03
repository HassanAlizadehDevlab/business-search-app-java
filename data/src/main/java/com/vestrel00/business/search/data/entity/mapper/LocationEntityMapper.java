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

import com.vestrel00.business.search.data.entity.LocationEntity;
import com.vestrel00.business.search.domain.Location;

import javax.inject.Inject;

import dagger.Reusable;

/**
 * Maps {@link LocationEntity} to {@link Location} and vice versa.
 */
@Reusable
final class LocationEntityMapper implements EntityMapper<LocationEntity, Location> {

    @Inject
    LocationEntityMapper() {
    }

    @Override
    public Location map(LocationEntity locationEntity) {
        return Location.builder()
                .address(locationEntity.address())
                .city(locationEntity.city())
                .state(locationEntity.state())
                .zipCode(locationEntity.zipCode())
                .country(locationEntity.country())
                .build();
    }

    @Override
    public LocationEntity map(Location location) {
        return LocationEntity.builder()
                .address(location.address())
                .city(location.city())
                .state(location.state())
                .zipCode(location.zipCode())
                .country(location.country())
                .build();
    }
}
