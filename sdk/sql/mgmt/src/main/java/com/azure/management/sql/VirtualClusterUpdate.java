// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The VirtualClusterUpdate model. */
@JsonFlatten
@Fluent
public class VirtualClusterUpdate {
    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Subnet resource ID for the virtual cluster.
     */
    @JsonProperty(value = "properties.subnetId", access = JsonProperty.Access.WRITE_ONLY)
    private String subnetId;

    /*
     * If the service has different generations of hardware, for the same SKU,
     * then that can be captured here.
     */
    @JsonProperty(value = "properties.family")
    private String family;

    /*
     * List of resources in this virtual cluster.
     */
    @JsonProperty(value = "properties.childResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> childResources;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the VirtualClusterUpdate object itself.
     */
    public VirtualClusterUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the subnetId property: Subnet resource ID for the virtual cluster.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Get the family property: If the service has different generations of hardware, for the same SKU, then that can be
     * captured here.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: If the service has different generations of hardware, for the same SKU, then that can be
     * captured here.
     *
     * @param family the family value to set.
     * @return the VirtualClusterUpdate object itself.
     */
    public VirtualClusterUpdate withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the childResources property: List of resources in this virtual cluster.
     *
     * @return the childResources value.
     */
    public List<String> childResources() {
        return this.childResources;
    }
}
