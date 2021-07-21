// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.webpubsub.fluent.models.SharedPrivateLinkResourceInner;
import com.azure.resourcemanager.webpubsub.models.ProvisioningState;
import com.azure.resourcemanager.webpubsub.models.SharedPrivateLinkResource;
import com.azure.resourcemanager.webpubsub.models.SharedPrivateLinkResourceStatus;

public final class SharedPrivateLinkResourceImpl
    implements SharedPrivateLinkResource, SharedPrivateLinkResource.Definition, SharedPrivateLinkResource.Update {
    private SharedPrivateLinkResourceInner innerObject;

    private final com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String groupId() {
        return this.innerModel().groupId();
    }

    public String privateLinkResourceId() {
        return this.innerModel().privateLinkResourceId();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String requestMessage() {
        return this.innerModel().requestMessage();
    }

    public SharedPrivateLinkResourceStatus status() {
        return this.innerModel().status();
    }

    public SharedPrivateLinkResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.webpubsub.WebPubSubManager manager() {
        return this.serviceManager;
    }

    private String sharedPrivateLinkResourceName;

    private String resourceGroupName;

    private String resourceName;

    public SharedPrivateLinkResourceImpl withExistingWebPubSub(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    public SharedPrivateLinkResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubSharedPrivateLinkResources()
                .createOrUpdate(
                    sharedPrivateLinkResourceName, resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public SharedPrivateLinkResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubSharedPrivateLinkResources()
                .createOrUpdate(
                    sharedPrivateLinkResourceName, resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    SharedPrivateLinkResourceImpl(String name, com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager) {
        this.innerObject = new SharedPrivateLinkResourceInner();
        this.serviceManager = serviceManager;
        this.sharedPrivateLinkResourceName = name;
    }

    public SharedPrivateLinkResourceImpl update() {
        return this;
    }

    public SharedPrivateLinkResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubSharedPrivateLinkResources()
                .createOrUpdate(
                    sharedPrivateLinkResourceName, resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public SharedPrivateLinkResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubSharedPrivateLinkResources()
                .createOrUpdate(
                    sharedPrivateLinkResourceName, resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    SharedPrivateLinkResourceImpl(
        SharedPrivateLinkResourceInner innerObject,
        com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.sharedPrivateLinkResourceName = Utils.getValueFromIdByName(innerObject.id(), "sharedPrivateLinkResources");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "webPubSub");
    }

    public SharedPrivateLinkResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubSharedPrivateLinkResources()
                .getWithResponse(sharedPrivateLinkResourceName, resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public SharedPrivateLinkResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubSharedPrivateLinkResources()
                .getWithResponse(sharedPrivateLinkResourceName, resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public SharedPrivateLinkResourceImpl withGroupId(String groupId) {
        this.innerModel().withGroupId(groupId);
        return this;
    }

    public SharedPrivateLinkResourceImpl withPrivateLinkResourceId(String privateLinkResourceId) {
        this.innerModel().withPrivateLinkResourceId(privateLinkResourceId);
        return this;
    }

    public SharedPrivateLinkResourceImpl withRequestMessage(String requestMessage) {
        this.innerModel().withRequestMessage(requestMessage);
        return this;
    }
}
