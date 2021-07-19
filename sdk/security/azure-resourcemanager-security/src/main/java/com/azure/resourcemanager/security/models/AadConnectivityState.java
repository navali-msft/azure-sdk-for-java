// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes an Azure resource with kind. */
@Fluent
public class AadConnectivityState {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AadConnectivityState.class);

    /*
     * The connectivity state of the external AAD solution
     */
    @JsonProperty(value = "connectivityState")
    private AadConnectivityStateValue connectivityState;

    /**
     * Get the connectivityState property: The connectivity state of the external AAD solution.
     *
     * @return the connectivityState value.
     */
    public AadConnectivityStateValue connectivityState() {
        return this.connectivityState;
    }

    /**
     * Set the connectivityState property: The connectivity state of the external AAD solution.
     *
     * @param connectivityState the connectivityState value to set.
     * @return the AadConnectivityState object itself.
     */
    public AadConnectivityState withConnectivityState(AadConnectivityStateValue connectivityState) {
        this.connectivityState = connectivityState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
