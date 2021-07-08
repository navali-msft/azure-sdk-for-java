// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elastic.fluent.VMCollectionsClient;
import com.azure.resourcemanager.elastic.models.VMCollectionUpdate;
import com.azure.resourcemanager.elastic.models.VMCollections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VMCollectionsImpl implements VMCollections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VMCollectionsImpl.class);

    private final VMCollectionsClient innerClient;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    public VMCollectionsImpl(
        VMCollectionsClient innerClient, com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void update(String resourceGroupName, String monitorName) {
        this.serviceClient().update(resourceGroupName, monitorName);
    }

    public Response<Void> updateWithResponse(
        String resourceGroupName, String monitorName, VMCollectionUpdate body, Context context) {
        return this.serviceClient().updateWithResponse(resourceGroupName, monitorName, body, context);
    }

    private VMCollectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }
}
