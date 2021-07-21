// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for DeviceSecurityGroups Get. */
public final class DeviceSecurityGroupsGetSamples {
    /**
     * Sample code: Get a device security group for the specified IoT Hub resource.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getADeviceSecurityGroupForTheSpecifiedIoTHubResource(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .deviceSecurityGroups()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/SampleRG/providers/Microsoft.Devices/iotHubs/sampleiothub",
                "samplesecuritygroup",
                Context.NONE);
    }
}
