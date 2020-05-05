/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_03_01.VpnSitesConfigurations;
import rx.Completable;
import com.microsoft.azure.management.network.v2020_03_01.GetVpnSitesConfigurationRequest;

class VpnSitesConfigurationsImpl extends WrapperImpl<VpnSitesConfigurationsInner> implements VpnSitesConfigurations {
    private final NetworkManager manager;

    VpnSitesConfigurationsImpl(NetworkManager manager) {
        super(manager.inner().vpnSitesConfigurations());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Completable downloadAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request) {
        VpnSitesConfigurationsInner client = this.inner();
        return client.downloadAsync(resourceGroupName, virtualWANName, request).toCompletable();
    }

}
