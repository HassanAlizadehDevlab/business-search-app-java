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

package com.vestrel00.business.search.presentation.java.android.mvp.ui.business.search;

import android.app.Activity;

import com.vestrel00.business.search.presentation.java.android.inject.PerActivity;
import com.vestrel00.business.search.presentation.java.android.inject.PerFragment;
import com.vestrel00.business.search.presentation.java.android.mvp.ui.business.list.view.BusinessListFragment;
import com.vestrel00.business.search.presentation.java.android.mvp.ui.business.list.view.BusinessListFragmentListener;
import com.vestrel00.business.search.presentation.java.android.mvp.ui.business.list.view.BusinessListFragmentModule;
import com.vestrel00.business.search.presentation.java.android.mvp.ui.business.search.options.view.BusinessSearchOptionsFragment;
import com.vestrel00.business.search.presentation.java.android.mvp.ui.business.search.options.view.BusinessSearchOptionsFragmentListener;
import com.vestrel00.business.search.presentation.java.android.mvp.ui.business.search.options.view.BusinessSearchOptionsFragmentModule;
import com.vestrel00.business.search.presentation.java.android.mvp.ui.common.BaseActivityModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Provides business search activity dependencies.
 */
@Module(includes = BaseActivityModule.class)
public abstract class BusinessSearchActivityModule {

    @Binds
    @PerActivity
    abstract BusinessSearchOptionsFragmentListener
    businessSearchOptionsFragmentListener(BusinessSearchActivity businessSearchActivity);

    @Binds
    @PerActivity
    abstract BusinessListFragmentListener
    businessListFragmentListener(BusinessSearchActivity businessSearchActivity);

    @PerFragment
    @ContributesAndroidInjector(modules = BusinessSearchOptionsFragmentModule.class)
    abstract BusinessSearchOptionsFragment businessSearchOptionsFragmentInjector();

    @PerFragment
    @ContributesAndroidInjector(modules = BusinessListFragmentModule.class)
    abstract BusinessListFragment businessListFragmentInjector();

    @Binds
    @PerActivity
    abstract Activity activity(BusinessSearchActivity businessSearchActivity);

}
