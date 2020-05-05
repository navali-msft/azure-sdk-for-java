// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InnerError model. */
@Fluent
public final class InnerError {
    /*
     * The exception type.
     */
    @JsonProperty(value = "exceptiontype")
    private String exceptiontype;

    /*
     * The internal error message or exception dump.
     */
    @JsonProperty(value = "errordetail")
    private String errordetail;

    /**
     * Get the exceptiontype property: The exception type.
     *
     * @return the exceptiontype value.
     */
    public String exceptiontype() {
        return this.exceptiontype;
    }

    /**
     * Set the exceptiontype property: The exception type.
     *
     * @param exceptiontype the exceptiontype value to set.
     * @return the InnerError object itself.
     */
    public InnerError withExceptiontype(String exceptiontype) {
        this.exceptiontype = exceptiontype;
        return this;
    }

    /**
     * Get the errordetail property: The internal error message or exception dump.
     *
     * @return the errordetail value.
     */
    public String errordetail() {
        return this.errordetail;
    }

    /**
     * Set the errordetail property: The internal error message or exception dump.
     *
     * @param errordetail the errordetail value to set.
     * @return the InnerError object itself.
     */
    public InnerError withErrordetail(String errordetail) {
        this.errordetail = errordetail;
        return this;
    }
}
