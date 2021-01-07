// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** contentTypeOrder. */
@Fluent
public final class MicrosoftGraphContentTypeOrder {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphContentTypeOrder.class);

    /*
     * Whether this is the default Content Type
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /*
     * Specifies the position in which the Content Type appears in the
     * selection UI.
     */
    @JsonProperty(value = "position")
    private Integer position;

    /*
     * contentTypeOrder
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the defaultProperty property: Whether this is the default Content Type.
     *
     * @return the defaultProperty value.
     */
    public Boolean defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: Whether this is the default Content Type.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the MicrosoftGraphContentTypeOrder object itself.
     */
    public MicrosoftGraphContentTypeOrder withDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the position property: Specifies the position in which the Content Type appears in the selection UI.
     *
     * @return the position value.
     */
    public Integer position() {
        return this.position;
    }

    /**
     * Set the position property: Specifies the position in which the Content Type appears in the selection UI.
     *
     * @param position the position value to set.
     * @return the MicrosoftGraphContentTypeOrder object itself.
     */
    public MicrosoftGraphContentTypeOrder withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * Get the additionalProperties property: contentTypeOrder.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: contentTypeOrder.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphContentTypeOrder object itself.
     */
    public MicrosoftGraphContentTypeOrder withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}