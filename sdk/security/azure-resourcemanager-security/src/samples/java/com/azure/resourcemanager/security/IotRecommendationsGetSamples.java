// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotRecommendations Get. */
public final class IotRecommendationsGetSamples {
    /**
     * Sample code: Get IoT Recommendation.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getIoTRecommendation(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .iotRecommendations()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myGroup/providers/Microsoft.Devices/IotHubs/myIotHub",
                "903e76ff-17eb-4bac-ac8a-2bc31ab68fd8",
                Context.NONE);
    }
}
