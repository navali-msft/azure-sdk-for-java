// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.models.DomainRegenerateKeyRequest;

/** Samples for Domains RegenerateKey. */
public final class DomainsRegenerateKeySamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/stable/2021-12-01/examples/Domains_RegenerateKey.json
     */
    /**
     * Sample code: Domains_RegenerateKey.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void domainsRegenerateKey(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .domains()
            .regenerateKeyWithResponse(
                "examplerg", "exampledomain2", new DomainRegenerateKeyRequest().withKeyName("key1"), Context.NONE);
    }
}
