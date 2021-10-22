// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the app registration for the custom Open ID Connect provider. */
@Fluent
public final class OpenIdConnectRegistration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenIdConnectRegistration.class);

    /*
     * The client id of the custom Open ID Connect provider.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * The authentication credentials of the custom Open ID Connect provider.
     */
    @JsonProperty(value = "clientCredential")
    private OpenIdConnectClientCredential clientCredential;

    /*
     * The configuration settings of the endpoints used for the custom Open ID
     * Connect provider.
     */
    @JsonProperty(value = "openIdConnectConfiguration")
    private OpenIdConnectConfig openIdConnectConfiguration;

    /**
     * Get the clientId property: The client id of the custom Open ID Connect provider.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client id of the custom Open ID Connect provider.
     *
     * @param clientId the clientId value to set.
     * @return the OpenIdConnectRegistration object itself.
     */
    public OpenIdConnectRegistration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientCredential property: The authentication credentials of the custom Open ID Connect provider.
     *
     * @return the clientCredential value.
     */
    public OpenIdConnectClientCredential clientCredential() {
        return this.clientCredential;
    }

    /**
     * Set the clientCredential property: The authentication credentials of the custom Open ID Connect provider.
     *
     * @param clientCredential the clientCredential value to set.
     * @return the OpenIdConnectRegistration object itself.
     */
    public OpenIdConnectRegistration withClientCredential(OpenIdConnectClientCredential clientCredential) {
        this.clientCredential = clientCredential;
        return this;
    }

    /**
     * Get the openIdConnectConfiguration property: The configuration settings of the endpoints used for the custom Open
     * ID Connect provider.
     *
     * @return the openIdConnectConfiguration value.
     */
    public OpenIdConnectConfig openIdConnectConfiguration() {
        return this.openIdConnectConfiguration;
    }

    /**
     * Set the openIdConnectConfiguration property: The configuration settings of the endpoints used for the custom Open
     * ID Connect provider.
     *
     * @param openIdConnectConfiguration the openIdConnectConfiguration value to set.
     * @return the OpenIdConnectRegistration object itself.
     */
    public OpenIdConnectRegistration withOpenIdConnectConfiguration(OpenIdConnectConfig openIdConnectConfiguration) {
        this.openIdConnectConfiguration = openIdConnectConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientCredential() != null) {
            clientCredential().validate();
        }
        if (openIdConnectConfiguration() != null) {
            openIdConnectConfiguration().validate();
        }
    }
}
