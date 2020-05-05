// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The BlobRestoreParameters model. */
@Fluent
public final class BlobRestoreParameters {
    /*
     * Restore blob to the specified time.
     */
    @JsonProperty(value = "timeToRestore", required = true)
    private OffsetDateTime timeToRestore;

    /*
     * Blob ranges to restore.
     */
    @JsonProperty(value = "blobRanges", required = true)
    private List<BlobRestoreRange> blobRanges;

    /**
     * Get the timeToRestore property: Restore blob to the specified time.
     *
     * @return the timeToRestore value.
     */
    public OffsetDateTime timeToRestore() {
        return this.timeToRestore;
    }

    /**
     * Set the timeToRestore property: Restore blob to the specified time.
     *
     * @param timeToRestore the timeToRestore value to set.
     * @return the BlobRestoreParameters object itself.
     */
    public BlobRestoreParameters withTimeToRestore(OffsetDateTime timeToRestore) {
        this.timeToRestore = timeToRestore;
        return this;
    }

    /**
     * Get the blobRanges property: Blob ranges to restore.
     *
     * @return the blobRanges value.
     */
    public List<BlobRestoreRange> blobRanges() {
        return this.blobRanges;
    }

    /**
     * Set the blobRanges property: Blob ranges to restore.
     *
     * @param blobRanges the blobRanges value to set.
     * @return the BlobRestoreParameters object itself.
     */
    public BlobRestoreParameters withBlobRanges(List<BlobRestoreRange> blobRanges) {
        this.blobRanges = blobRanges;
        return this;
    }
}
