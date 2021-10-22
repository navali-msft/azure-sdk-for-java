// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result of Autocomplete requests. */
@Immutable
public final class AutocompleteItem {
    /*
     * The completed term.
     */
    @JsonProperty(value = "text", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String text;

    /*
     * The query along with the completed term.
     */
    @JsonProperty(value = "queryPlusText", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String queryPlusText;

    /**
     * Creates an instance of AutocompleteItem class.
     *
     * @param text the text value to set.
     * @param queryPlusText the queryPlusText value to set.
     */
    @JsonCreator
    public AutocompleteItem(
            @JsonProperty(value = "text", required = true, access = JsonProperty.Access.WRITE_ONLY) String text,
            @JsonProperty(value = "queryPlusText", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    String queryPlusText) {
        this.text = text;
        this.queryPlusText = queryPlusText;
    }

    /**
     * Get the text property: The completed term.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the queryPlusText property: The query along with the completed term.
     *
     * @return the queryPlusText value.
     */
    public String getQueryPlusText() {
        return this.queryPlusText;
    }
}
