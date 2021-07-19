// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.ScanResultsInner;
import java.util.List;

/** An immutable client-side representation of ScanResults. */
public interface ScanResults {
    /**
     * Gets the value property: List of vulnerability assessment scan results.
     *
     * @return the value value.
     */
    List<ScanResult> value();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.ScanResultsInner object.
     *
     * @return the inner object.
     */
    ScanResultsInner innerModel();
}
