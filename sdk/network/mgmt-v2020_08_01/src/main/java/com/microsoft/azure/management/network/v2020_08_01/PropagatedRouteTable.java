/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of RouteTables to advertise the routes to.
 */
public class PropagatedRouteTable {
    /**
     * The list of labels.
     */
    @JsonProperty(value = "labels")
    private List<String> labels;

    /**
     * The list of resource ids of all the RouteTables.
     */
    @JsonProperty(value = "ids")
    private List<SubResource> ids;

    /**
     * Get the list of labels.
     *
     * @return the labels value
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the list of labels.
     *
     * @param labels the labels value to set
     * @return the PropagatedRouteTable object itself.
     */
    public PropagatedRouteTable withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the list of resource ids of all the RouteTables.
     *
     * @return the ids value
     */
    public List<SubResource> ids() {
        return this.ids;
    }

    /**
     * Set the list of resource ids of all the RouteTables.
     *
     * @param ids the ids value to set
     * @return the PropagatedRouteTable object itself.
     */
    public PropagatedRouteTable withIds(List<SubResource> ids) {
        this.ids = ids;
        return this;
    }

}