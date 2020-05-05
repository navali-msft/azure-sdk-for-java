/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection info for the given notebook workspace.
 */
public class NotebookWorkspaceConnectionInfoResultInner {
    /**
     * Specifies auth token used for connecting to Notebook server (uses
     * token-based auth).
     */
    @JsonProperty(value = "authToken", access = JsonProperty.Access.WRITE_ONLY)
    private String authToken;

    /**
     * Specifies the endpoint of Notebook server.
     */
    @JsonProperty(value = "notebookServerEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String notebookServerEndpoint;

    /**
     * Get specifies auth token used for connecting to Notebook server (uses token-based auth).
     *
     * @return the authToken value
     */
    public String authToken() {
        return this.authToken;
    }

    /**
     * Get specifies the endpoint of Notebook server.
     *
     * @return the notebookServerEndpoint value
     */
    public String notebookServerEndpoint() {
        return this.notebookServerEndpoint;
    }

}
