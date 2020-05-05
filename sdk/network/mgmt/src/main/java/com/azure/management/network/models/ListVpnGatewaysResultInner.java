// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListVpnGatewaysResult model. */
@Fluent
public final class ListVpnGatewaysResultInner {
    /*
     * List of VpnGateways.
     */
    @JsonProperty(value = "value")
    private List<VpnGatewayInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of VpnGateways.
     *
     * @return the value value.
     */
    public List<VpnGatewayInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of VpnGateways.
     *
     * @param value the value value to set.
     * @return the ListVpnGatewaysResultInner object itself.
     */
    public ListVpnGatewaysResultInner withValue(List<VpnGatewayInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListVpnGatewaysResultInner object itself.
     */
    public ListVpnGatewaysResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
