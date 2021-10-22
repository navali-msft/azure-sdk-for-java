// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.AsyncOperationStatus;
import com.azure.resourcemanager.apimanagement.models.OperationResultLogItemContract;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Operation Result. */
@Fluent
public final class OperationResultContractProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationResultContractProperties.class);

    /*
     * Operation result identifier.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Status of an async operation.
     */
    @JsonProperty(value = "status")
    private AsyncOperationStatus status;

    /*
     * Start time of an async operation. The date conforms to the following
     * format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     */
    @JsonProperty(value = "started")
    private OffsetDateTime started;

    /*
     * Last update time of an async operation. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     */
    @JsonProperty(value = "updated")
    private OffsetDateTime updated;

    /*
     * Optional result info.
     */
    @JsonProperty(value = "resultInfo")
    private String resultInfo;

    /*
     * Error Body Contract
     */
    @JsonProperty(value = "error")
    private ManagementError error;

    /*
     * This property if only provided as part of the
     * TenantConfiguration_Validate operation. It contains the log the entities
     * which will be updated/created/deleted as part of the
     * TenantConfiguration_Deploy operation.
     */
    @JsonProperty(value = "actionLog", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationResultLogItemContract> actionLog;

    /**
     * Get the id property: Operation result identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Operation result identifier.
     *
     * @param id the id value to set.
     * @return the OperationResultContractProperties object itself.
     */
    public OperationResultContractProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the status property: Status of an async operation.
     *
     * @return the status value.
     */
    public AsyncOperationStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Status of an async operation.
     *
     * @param status the status value to set.
     * @return the OperationResultContractProperties object itself.
     */
    public OperationResultContractProperties withStatus(AsyncOperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the started property: Start time of an async operation. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the started value.
     */
    public OffsetDateTime started() {
        return this.started;
    }

    /**
     * Set the started property: Start time of an async operation. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param started the started value to set.
     * @return the OperationResultContractProperties object itself.
     */
    public OperationResultContractProperties withStarted(OffsetDateTime started) {
        this.started = started;
        return this;
    }

    /**
     * Get the updated property: Last update time of an async operation. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the updated value.
     */
    public OffsetDateTime updated() {
        return this.updated;
    }

    /**
     * Set the updated property: Last update time of an async operation. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param updated the updated value to set.
     * @return the OperationResultContractProperties object itself.
     */
    public OperationResultContractProperties withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Get the resultInfo property: Optional result info.
     *
     * @return the resultInfo value.
     */
    public String resultInfo() {
        return this.resultInfo;
    }

    /**
     * Set the resultInfo property: Optional result info.
     *
     * @param resultInfo the resultInfo value to set.
     * @return the OperationResultContractProperties object itself.
     */
    public OperationResultContractProperties withResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
        return this;
    }

    /**
     * Get the error property: Error Body Contract.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: Error Body Contract.
     *
     * @param error the error value to set.
     * @return the OperationResultContractProperties object itself.
     */
    public OperationResultContractProperties withError(ManagementError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the actionLog property: This property if only provided as part of the TenantConfiguration_Validate operation.
     * It contains the log the entities which will be updated/created/deleted as part of the TenantConfiguration_Deploy
     * operation.
     *
     * @return the actionLog value.
     */
    public List<OperationResultLogItemContract> actionLog() {
        return this.actionLog;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actionLog() != null) {
            actionLog().forEach(e -> e.validate());
        }
    }
}
