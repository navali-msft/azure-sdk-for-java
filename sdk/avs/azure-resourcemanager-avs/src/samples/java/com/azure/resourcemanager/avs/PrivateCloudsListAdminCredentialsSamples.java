// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for PrivateClouds ListAdminCredentials. */
public final class PrivateCloudsListAdminCredentialsSamples {
    /**
     * Sample code: PrivateClouds_ListAdminCredentials.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void privateCloudsListAdminCredentials(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.privateClouds().listAdminCredentialsWithResponse("group1", "cloud1", Context.NONE);
    }
}
