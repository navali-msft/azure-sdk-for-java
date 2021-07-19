// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for Topology List. */
public final class TopologyListSamples {
    /**
     * Sample code: Get topology on a subscription.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getTopologyOnASubscription(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.topologies().list(Context.NONE);
    }
}
