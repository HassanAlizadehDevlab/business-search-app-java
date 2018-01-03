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

package com.vestrel00.business.search.commons;

import java.util.Calendar;
import java.util.Locale;

import javax.inject.Inject;

import dagger.Reusable;

/**
 * Creates instances of {@link Calendar} with a {@link Locale}.
 */
@Reusable
public final class CalendarFactory {

    private final Locale locale;

    @Inject
    CalendarFactory(Locale locale) {
        this.locale = locale;
    }

    public Calendar create() {
        return Calendar.getInstance(locale);
    }
}
