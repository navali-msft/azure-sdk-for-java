// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The CreateCluster request parameters. */
@Fluent
public class ClusterCreateParametersExtended {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterCreateParametersExtended.class);

    /*
     * The location of the cluster.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The availability zones.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The cluster create parameters.
     */
    @JsonProperty(value = "properties")
    private ClusterCreateProperties properties;

    /*
     * The identity of the cluster, if configured.
     */
    @JsonProperty(value = "identity")
    private ClusterIdentity identity;

    /**
     * Get the location property: The location of the cluster.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the cluster.
     *
     * @param location the location value to set.
     * @return the ClusterCreateParametersExtended object itself.
     */
    public ClusterCreateParametersExtended withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: The resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The resource tags.
     *
     * @param tags the tags value to set.
     * @return the ClusterCreateParametersExtended object itself.
     */
    public ClusterCreateParametersExtended withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the zones property: The availability zones.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: The availability zones.
     *
     * @param zones the zones value to set.
     * @return the ClusterCreateParametersExtended object itself.
     */
    public ClusterCreateParametersExtended withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the properties property: The cluster create parameters.
     *
     * @return the properties value.
     */
    public ClusterCreateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The cluster create parameters.
     *
     * @param properties the properties value to set.
     * @return the ClusterCreateParametersExtended object itself.
     */
    public ClusterCreateParametersExtended withProperties(ClusterCreateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the identity property: The identity of the cluster, if configured.
     *
     * @return the identity value.
     */
    public ClusterIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the cluster, if configured.
     *
     * @param identity the identity value to set.
     * @return the ClusterCreateParametersExtended object itself.
     */
    public ClusterCreateParametersExtended withIdentity(ClusterIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
