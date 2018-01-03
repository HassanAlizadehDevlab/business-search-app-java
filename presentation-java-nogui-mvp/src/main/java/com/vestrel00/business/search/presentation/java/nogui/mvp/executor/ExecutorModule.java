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

package com.vestrel00.business.search.presentation.java.nogui.mvp.executor;

import com.vestrel00.business.search.domain.executor.ExecutionThread;
import com.vestrel00.business.search.domain.executor.PostExecutionThread;

import dagger.Binds;
import dagger.Module;
import dagger.Reusable;

/**
 * Provides executor dependencies.
 */
@Module
public abstract class ExecutorModule {

    @Binds
    @Reusable
    abstract ExecutionThread executionThread(BlockingExecutionThread blockingExecutionThread);

    @Binds
    @Reusable
    abstract PostExecutionThread
    postExecutionThread(BlockingPostExecutionThread blockingPostExecutionThread);
}
