// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComputeOperationListResult model. */
@Immutable
public final class ComputeOperationListResultInner {
    /*
     * The list of compute operations
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ComputeOperationValueInner> value;

    /**
     * Get the value property: The list of compute operations.
     *
     * @return the value value.
     */
    public List<ComputeOperationValueInner> value() {
        return this.value;
    }
}
