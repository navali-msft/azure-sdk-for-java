// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for GroupUser Create. */
public final class GroupUserCreateSamples {
    /*
     * operationId: GroupUser_Create
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateGroupUser
     */
    /**
     * Sample code: ApiManagementCreateGroupUser.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateGroupUser(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .groupUsers()
            .createWithResponse("rg1", "apimService1", "tempgroup", "59307d350af58404d8a26300", Context.NONE);
    }
}
