// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.resourcemanager.apimanagement.models.VersioningScheme;

/** Samples for ApiVersionSet CreateOrUpdate. */
public final class ApiVersionSetCreateOrUpdateSamples {
    /*
     * operationId: ApiVersionSet_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateApiVersionSet
     */
    /**
     * Sample code: ApiManagementCreateApiVersionSet.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateApiVersionSet(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiVersionSets()
            .define("api1")
            .withExistingService("rg1", "apimService1")
            .withDisplayName("api set 1")
            .withVersioningScheme(VersioningScheme.SEGMENT)
            .withDescription("Version configuration")
            .create();
    }
}
