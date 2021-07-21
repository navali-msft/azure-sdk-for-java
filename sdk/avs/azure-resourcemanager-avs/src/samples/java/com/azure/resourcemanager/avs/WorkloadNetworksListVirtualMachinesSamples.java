// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks ListVirtualMachines. */
public final class WorkloadNetworksListVirtualMachinesSamples {
    /**
     * Sample code: WorkloadNetworks_ListVirtualMachines.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksListVirtualMachines(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.workloadNetworks().listVirtualMachines("group1", "cloud1", Context.NONE);
    }
}
