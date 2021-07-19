// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the additional workspaces. */
@Fluent
public final class AdditionalWorkspacesProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdditionalWorkspacesProperties.class);

    /*
     * Workspace resource id
     */
    @JsonProperty(value = "workspace")
    private String workspace;

    /*
     * Workspace type.
     */
    @JsonProperty(value = "type")
    private AdditionalWorkspaceType type;

    /*
     * List of data types sent to workspace
     */
    @JsonProperty(value = "dataTypes")
    private List<AdditionalWorkspaceDataType> dataTypes;

    /**
     * Get the workspace property: Workspace resource id.
     *
     * @return the workspace value.
     */
    public String workspace() {
        return this.workspace;
    }

    /**
     * Set the workspace property: Workspace resource id.
     *
     * @param workspace the workspace value to set.
     * @return the AdditionalWorkspacesProperties object itself.
     */
    public AdditionalWorkspacesProperties withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * Get the type property: Workspace type.
     *
     * @return the type value.
     */
    public AdditionalWorkspaceType type() {
        return this.type;
    }

    /**
     * Set the type property: Workspace type.
     *
     * @param type the type value to set.
     * @return the AdditionalWorkspacesProperties object itself.
     */
    public AdditionalWorkspacesProperties withType(AdditionalWorkspaceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the dataTypes property: List of data types sent to workspace.
     *
     * @return the dataTypes value.
     */
    public List<AdditionalWorkspaceDataType> dataTypes() {
        return this.dataTypes;
    }

    /**
     * Set the dataTypes property: List of data types sent to workspace.
     *
     * @param dataTypes the dataTypes value to set.
     * @return the AdditionalWorkspacesProperties object itself.
     */
    public AdditionalWorkspacesProperties withDataTypes(List<AdditionalWorkspaceDataType> dataTypes) {
        this.dataTypes = dataTypes;
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
