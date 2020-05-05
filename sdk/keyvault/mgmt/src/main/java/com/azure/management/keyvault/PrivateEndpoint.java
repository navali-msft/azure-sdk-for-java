// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PrivateEndpoint model. */
@Immutable
public final class PrivateEndpoint {
    /*
     * Full identifier of the private endpoint resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the id property: Full identifier of the private endpoint resource.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }
}
