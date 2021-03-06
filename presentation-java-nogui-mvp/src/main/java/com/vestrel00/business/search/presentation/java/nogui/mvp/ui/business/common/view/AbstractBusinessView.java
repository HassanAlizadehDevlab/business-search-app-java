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

package com.vestrel00.business.search.presentation.java.nogui.mvp.ui.business.common.view;

import com.vestrel00.business.search.presentation.java.nogui.mvp.display.Display;

/**
 * Provides a default implementation of {@link BusinessView}.
 */
public abstract class AbstractBusinessView implements BusinessView {

    protected final Display display;

    protected AbstractBusinessView(Display display) {
        this.display = display;
    }

    @Override
    public void showMessage(String message) {
        display.showMessage(message);
    }

    @Override
    public void showError(String error) {
        display.showError(error);
    }
}
