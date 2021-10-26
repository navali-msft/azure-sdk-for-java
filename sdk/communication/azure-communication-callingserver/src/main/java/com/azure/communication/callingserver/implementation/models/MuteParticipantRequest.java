// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload for muting any participant. */
@Fluent
public final class MuteParticipantRequest {
    /*
     * The identifier of the participant to be muted in the call.
     */
    @JsonProperty(value = "identifier", required = true)
    private CommunicationIdentifierModel identifier;

    /*
     * The operation context.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the identifier property: The identifier of the participant to be muted in the call.
     *
     * @return the identifier value.
     */
    public CommunicationIdentifierModel getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: The identifier of the participant to be muted in the call.
     *
     * @param identifier the identifier value to set.
     * @return the MuteParticipantRequest object itself.
     */
    public MuteParticipantRequest setIdentifier(CommunicationIdentifierModel identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the operationContext property: The operation context.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context.
     *
     * @param operationContext the operationContext value to set.
     * @return the MuteParticipantRequest object itself.
     */
    public MuteParticipantRequest setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
