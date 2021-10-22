// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.models.ShareablePrivateLinkResourceType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Private link resource. */
@Fluent
public final class PrivateLinkResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourceInner.class);

    /*
     * Properties of a private link resource
     */
    @JsonProperty(value = "properties")
    private PrivateLinkResourceProperties innerProperties;

    /**
     * Get the innerProperties property: Properties of a private link resource.
     *
     * @return the innerProperties value.
     */
    private PrivateLinkResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the groupId property: Group Id of the private link resource.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.innerProperties() == null ? null : this.innerProperties().groupId();
    }

    /**
     * Set the groupId property: Group Id of the private link resource.
     *
     * @param groupId the groupId value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withGroupId(String groupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withGroupId(groupId);
        return this;
    }

    /**
     * Get the requiredMembers property: Required members of the private link resource.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredMembers();
    }

    /**
     * Set the requiredMembers property: Required members of the private link resource.
     *
     * @param requiredMembers the requiredMembers value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredMembers(List<String> requiredMembers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withRequiredMembers(requiredMembers);
        return this;
    }

    /**
     * Get the requiredZoneNames property: Required private DNS zone names.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredZoneNames();
    }

    /**
     * Set the requiredZoneNames property: Required private DNS zone names.
     *
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredZoneNames(List<String> requiredZoneNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withRequiredZoneNames(requiredZoneNames);
        return this;
    }

    /**
     * Get the shareablePrivateLinkResourceTypes property: The list of resources that are onboarded to private link
     * service.
     *
     * @return the shareablePrivateLinkResourceTypes value.
     */
    public List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().shareablePrivateLinkResourceTypes();
    }

    /**
     * Set the shareablePrivateLinkResourceTypes property: The list of resources that are onboarded to private link
     * service.
     *
     * @param shareablePrivateLinkResourceTypes the shareablePrivateLinkResourceTypes value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withShareablePrivateLinkResourceTypes(
        List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withShareablePrivateLinkResourceTypes(shareablePrivateLinkResourceTypes);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
