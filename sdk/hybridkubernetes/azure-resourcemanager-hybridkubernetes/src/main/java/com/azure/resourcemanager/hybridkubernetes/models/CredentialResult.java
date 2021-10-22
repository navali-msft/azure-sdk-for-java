// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The credential result response. */
@Immutable
public final class CredentialResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CredentialResult.class);

    /*
     * The name of the credential.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Base64-encoded Kubernetes configuration file.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private byte[] value;

    /**
     * Get the name property: The name of the credential.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: Base64-encoded Kubernetes configuration file.
     *
     * @return the value value.
     */
    public byte[] value() {
        return CoreUtils.clone(this.value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
