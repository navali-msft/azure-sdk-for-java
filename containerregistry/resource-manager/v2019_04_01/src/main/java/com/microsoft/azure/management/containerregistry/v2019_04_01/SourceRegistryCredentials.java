/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the credential parameters for accessing the source registry.
 */
public class SourceRegistryCredentials {
    /**
     * The authentication mode which determines the source registry login
     * scope. The credentials for the source registry
     * will be generated using the given scope. These credentials will be used
     * to login to
     * the source registry during the run. Possible values include: 'None',
     * 'Default'.
     */
    @JsonProperty(value = "loginMode")
    private SourceRegistryLoginMode loginMode;

    /**
     * Get the authentication mode which determines the source registry login scope. The credentials for the source registry
     will be generated using the given scope. These credentials will be used to login to
     the source registry during the run. Possible values include: 'None', 'Default'.
     *
     * @return the loginMode value
     */
    public SourceRegistryLoginMode loginMode() {
        return this.loginMode;
    }

    /**
     * Set the authentication mode which determines the source registry login scope. The credentials for the source registry
     will be generated using the given scope. These credentials will be used to login to
     the source registry during the run. Possible values include: 'None', 'Default'.
     *
     * @param loginMode the loginMode value to set
     * @return the SourceRegistryCredentials object itself.
     */
    public SourceRegistryCredentials withLoginMode(SourceRegistryLoginMode loginMode) {
        this.loginMode = loginMode;
        return this;
    }

}
