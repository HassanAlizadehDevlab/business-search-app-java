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

package com.vestrel00.business.search.presentation.java.android.mvp.ui.business.search.options.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Switch;

import com.vestrel00.business.search.presentation.java.android.mvp.R;
import com.vestrel00.business.search.presentation.java.android.mvp.ui.business.search.options.presenter.BusinessSearchOptionsPresenter;
import com.vestrel00.business.search.presentation.java.android.mvp.ui.common.view.BaseViewFragment;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnEditorAction;

/**
 * A fragment implementation of {@link BusinessSearchOptionsView}.
 */
public final class BusinessSearchOptionsFragment
        extends BaseViewFragment<BusinessSearchOptionsPresenter>
        implements BusinessSearchOptionsView {

    @BindView(R.id.location_input)
    EditText locationInput;

    @BindView(R.id.search_around_current_location)
    Switch searchAroundCurrentLocation;

    @Inject
    BusinessSearchOptionsFragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.business_search_options_fragment, container, false);
    }

    @Override
    public void showBusinessesAroundLocation(String location) {
        listener.onSearchAroundLocation(location);
    }

    @Override
    public void showBusinessesAroundCurrentLocation() {
        listener.onSearchAroundCurrentLocation();
    }

    @Override
    public void showListView() {
        listener.onShowListView();
    }

    @Override
    public void showMapView() {
        listener.onShowMapView();
    }

    @Override
    public void setLocationInputEnabled(boolean enabled) {
        locationInput.setEnabled(enabled);
    }

    @Override
    public void setLocationInputToUsingCurrentLocation() {
        locationInput.setText(R.string.using_current_location);
    }

    @Override
    public void setLocationInput(String location) {
        locationInput.setText(location);
    }

    @Override
    public String getLocationInput() {
        return locationInput.getText().toString();
    }

    @Override
    public boolean useCurrentLocationChecked() {
        return searchAroundCurrentLocation.isChecked();
    }

    @OnEditorAction(R.id.location_input)
    boolean onLocationInputEditorSearchAction() {
        locationInput.clearFocus();
        hideSoftKeyboard();
        searchAroundLocation();
        return true;
    }

    @OnClick(R.id.search_around_location)
    void onSearchAroundLocationClicked() {
        searchAroundLocation();
    }

    @OnCheckedChanged(R.id.search_around_current_location)
    void onToggleSearchAroundCurrentLocation(boolean checked) {
        presenter.onToggleSearchAroundCurrentLocation(checked);
    }

    @OnCheckedChanged(R.id.toggle_map_list_view)
    void onToggleMapListView(boolean checked) {
        presenter.onToggleMapListView(checked);
    }

    private void searchAroundLocation() {
        presenter.onSearchAroundLocationClicked();
    }
}
