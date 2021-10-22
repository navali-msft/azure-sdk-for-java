// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.PortalRevisionContract;

/** Samples for PortalRevision Update. */
public final class PortalRevisionUpdateSamples {
    /*
     * operationId: PortalRevision_Update
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementUpdatePortalRevision
     */
    /**
     * Sample code: ApiManagementUpdatePortalRevision.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUpdatePortalRevision(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        PortalRevisionContract resource =
            manager.portalRevisions().getWithResponse("rg1", "apimService1", "20201112101010", Context.NONE).getValue();
        resource.update().withDescription("portal revision update").withIsCurrent(true).withIfMatch("*").apply();
    }
}
