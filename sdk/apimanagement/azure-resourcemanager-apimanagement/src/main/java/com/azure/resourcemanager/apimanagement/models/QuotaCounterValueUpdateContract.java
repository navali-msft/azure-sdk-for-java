// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.models.QuotaCounterValueContractProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Quota counter value details. */
@Fluent
public final class QuotaCounterValueUpdateContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QuotaCounterValueUpdateContract.class);

    /*
     * Quota counter value details.
     */
    @JsonProperty(value = "properties")
    private QuotaCounterValueContractProperties innerProperties;

    /**
     * Get the innerProperties property: Quota counter value details.
     *
     * @return the innerProperties value.
     */
    private QuotaCounterValueContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the callsCount property: Number of times Counter was called.
     *
     * @return the callsCount value.
     */
    public Integer callsCount() {
        return this.innerProperties() == null ? null : this.innerProperties().callsCount();
    }

    /**
     * Set the callsCount property: Number of times Counter was called.
     *
     * @param callsCount the callsCount value to set.
     * @return the QuotaCounterValueUpdateContract object itself.
     */
    public QuotaCounterValueUpdateContract withCallsCount(Integer callsCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaCounterValueContractProperties();
        }
        this.innerProperties().withCallsCount(callsCount);
        return this;
    }

    /**
     * Get the kbTransferred property: Data Transferred in KiloBytes.
     *
     * @return the kbTransferred value.
     */
    public Double kbTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().kbTransferred();
    }

    /**
     * Set the kbTransferred property: Data Transferred in KiloBytes.
     *
     * @param kbTransferred the kbTransferred value to set.
     * @return the QuotaCounterValueUpdateContract object itself.
     */
    public QuotaCounterValueUpdateContract withKbTransferred(Double kbTransferred) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaCounterValueContractProperties();
        }
        this.innerProperties().withKbTransferred(kbTransferred);
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
