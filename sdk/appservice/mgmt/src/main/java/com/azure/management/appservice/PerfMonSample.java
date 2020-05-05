// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The PerfMonSample model. */
@Fluent
public final class PerfMonSample {
    /*
     * Point in time for which counter was measured.
     */
    @JsonProperty(value = "time")
    private OffsetDateTime time;

    /*
     * Name of the server on which the measurement is made.
     */
    @JsonProperty(value = "instanceName")
    private String instanceName;

    /*
     * Value of counter at a certain time.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Get the time property: Point in time for which counter was measured.
     *
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Set the time property: Point in time for which counter was measured.
     *
     * @param time the time value to set.
     * @return the PerfMonSample object itself.
     */
    public PerfMonSample withTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Get the instanceName property: Name of the server on which the measurement is made.
     *
     * @return the instanceName value.
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Set the instanceName property: Name of the server on which the measurement is made.
     *
     * @param instanceName the instanceName value to set.
     * @return the PerfMonSample object itself.
     */
    public PerfMonSample withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * Get the value property: Value of counter at a certain time.
     *
     * @return the value value.
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the value property: Value of counter at a certain time.
     *
     * @param value the value value to set.
     * @return the PerfMonSample object itself.
     */
    public PerfMonSample withValue(Double value) {
        this.value = value;
        return this;
    }
}
