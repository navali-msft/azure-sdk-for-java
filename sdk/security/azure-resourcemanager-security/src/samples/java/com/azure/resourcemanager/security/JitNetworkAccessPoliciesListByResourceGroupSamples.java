// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for JitNetworkAccessPolicies ListByResourceGroup. */
public final class JitNetworkAccessPoliciesListByResourceGroupSamples {
    /**
     * Sample code: Get JIT network access policies on a resource group.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getJITNetworkAccessPoliciesOnAResourceGroup(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.jitNetworkAccessPolicies().listByResourceGroup("myRg1", Context.NONE);
    }
}
