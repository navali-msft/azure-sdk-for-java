// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GeoRegion model. */
@JsonFlatten
@Immutable
public class GeoRegionInner extends ProxyOnlyResource {
    /*
     * Region description.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Display name for region.
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Display name for region.
     */
    @JsonProperty(value = "properties.orgDomain", access = JsonProperty.Access.WRITE_ONLY)
    private String orgDomain;

    /**
     * Get the description property: Region description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the displayName property: Display name for region.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the orgDomain property: Display name for region.
     *
     * @return the orgDomain value.
     */
    public String orgDomain() {
        return this.orgDomain;
    }
}
