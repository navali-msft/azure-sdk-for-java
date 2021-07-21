// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.WorkspaceSettingInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of workspace settings response. */
@Fluent
public final class WorkspaceSettingList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceSettingList.class);

    /*
     * List of workspace settings
     */
    @JsonProperty(value = "value", required = true)
    private List<WorkspaceSettingInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of workspace settings.
     *
     * @return the value value.
     */
    public List<WorkspaceSettingInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of workspace settings.
     *
     * @param value the value value to set.
     * @return the WorkspaceSettingList object itself.
     */
    public WorkspaceSettingList withValue(List<WorkspaceSettingInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model WorkspaceSettingList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
