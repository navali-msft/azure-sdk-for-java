// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metadata sync configuration Configuration for metadata sync. */
@Fluent
public final class MetadataSyncConfigInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetadataSyncConfigInner.class);

    /*
     * Metadata Sync Config properties
     */
    @JsonProperty(value = "properties")
    private MetadataSyncConfigProperties innerProperties;

    /**
     * Get the innerProperties property: Metadata Sync Config properties.
     *
     * @return the innerProperties value.
     */
    private MetadataSyncConfigProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the enabled property: Indicates whether the metadata sync is enabled or disabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Indicates whether the metadata sync is enabled or disabled.
     *
     * @param enabled the enabled value to set.
     * @return the MetadataSyncConfigInner object itself.
     */
    public MetadataSyncConfigInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataSyncConfigProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the syncIntervalInMinutes property: The Sync Interval in minutes.
     *
     * @return the syncIntervalInMinutes value.
     */
    public Integer syncIntervalInMinutes() {
        return this.innerProperties() == null ? null : this.innerProperties().syncIntervalInMinutes();
    }

    /**
     * Set the syncIntervalInMinutes property: The Sync Interval in minutes.
     *
     * @param syncIntervalInMinutes the syncIntervalInMinutes value to set.
     * @return the MetadataSyncConfigInner object itself.
     */
    public MetadataSyncConfigInner withSyncIntervalInMinutes(Integer syncIntervalInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataSyncConfigProperties();
        }
        this.innerProperties().withSyncIntervalInMinutes(syncIntervalInMinutes);
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
