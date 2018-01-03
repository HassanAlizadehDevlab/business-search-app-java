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

package com.vestrel00.business.search.presentation.java.nogui.mvp;

import com.vestrel00.business.search.presentation.java.PresentationJavaModule;
import com.vestrel00.business.search.presentation.java.nogui.mvp.config.ConfigModule;
import com.vestrel00.business.search.presentation.java.nogui.mvp.display.DisplayModule;
import com.vestrel00.business.search.presentation.java.nogui.mvp.executor.ExecutorModule;
import com.vestrel00.business.search.presentation.java.nogui.mvp.net.NetModule;
import com.vestrel00.business.search.presentation.java.nogui.mvp.ui.UIModule;

import dagger.Module;

/**
 * Provides application dependencies.
 */
@Module(includes = {
        PresentationJavaModule.class,
        ConfigModule.class,
        DisplayModule.class,
        ExecutorModule.class,
        NetModule.class,
        UIModule.class
})
abstract class ApplicationModule {
}
