// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.monitor.Baseline;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The CalculateBaselineResponse model. */
@Fluent
public final class CalculateBaselineResponseInner {
    /*
     * the resource type of the baseline resource.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * the array of timestamps of the baselines.
     */
    @JsonProperty(value = "timestamps")
    private List<OffsetDateTime> timestamps;

    /*
     * the baseline values for each sensitivity.
     */
    @JsonProperty(value = "baseline", required = true)
    private List<Baseline> baseline;

    /**
     * Get the type property: the resource type of the baseline resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: the resource type of the baseline resource.
     *
     * @param type the type value to set.
     * @return the CalculateBaselineResponseInner object itself.
     */
    public CalculateBaselineResponseInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the timestamps property: the array of timestamps of the baselines.
     *
     * @return the timestamps value.
     */
    public List<OffsetDateTime> timestamps() {
        return this.timestamps;
    }

    /**
     * Set the timestamps property: the array of timestamps of the baselines.
     *
     * @param timestamps the timestamps value to set.
     * @return the CalculateBaselineResponseInner object itself.
     */
    public CalculateBaselineResponseInner withTimestamps(List<OffsetDateTime> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    /**
     * Get the baseline property: the baseline values for each sensitivity.
     *
     * @return the baseline value.
     */
    public List<Baseline> baseline() {
        return this.baseline;
    }

    /**
     * Set the baseline property: the baseline values for each sensitivity.
     *
     * @param baseline the baseline value to set.
     * @return the CalculateBaselineResponseInner object itself.
     */
    public CalculateBaselineResponseInner withBaseline(List<Baseline> baseline) {
        this.baseline = baseline;
        return this;
    }
}
