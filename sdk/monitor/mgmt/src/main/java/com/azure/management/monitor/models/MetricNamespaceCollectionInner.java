// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MetricNamespaceCollection model. */
@Fluent
public final class MetricNamespaceCollectionInner {
    /*
     * The values for the metric namespaces.
     */
    @JsonProperty(value = "value", required = true)
    private List<MetricNamespaceInner> value;

    /**
     * Get the value property: The values for the metric namespaces.
     *
     * @return the value value.
     */
    public List<MetricNamespaceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The values for the metric namespaces.
     *
     * @param value the value value to set.
     * @return the MetricNamespaceCollectionInner object itself.
     */
    public MetricNamespaceCollectionInner withValue(List<MetricNamespaceInner> value) {
        this.value = value;
        return this;
    }
}
