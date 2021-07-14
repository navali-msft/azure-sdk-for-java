// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Fluent;

/**
 *
 */
@Fluent
public final class ExtractKeySentencesAction {
    private String modelVersion;
    private int maxSentenceCount;
    private KeySentencesOrder sentencesOrder;
    private boolean disableServiceLogs;


    /**
     * Gets the version of the text analytics model used by this operation.
     *
     * @return The model version.
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Set the model version. This value indicates which model will be used for scoring, e.g. "latest", "2019-10-01".
     * If a model-version is not specified, the API will default to the latest, non-preview version.
     *
     * @param modelVersion The model version.
     *
     * @return The {@link ExtractKeySentencesAction} object itself.
     */
    public ExtractKeySentencesAction setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * Gets the value of {@code disableServiceLogs}.
     *
     * @return The value of {@code disableServiceLogs}. The default value of this property is 'false'. This means,
     * Text Analytics service logs your input text for 48 hours, solely to allow for troubleshooting issues. Setting
     * this property to true, disables input logging and may limit our ability to investigate issues that occur.
     */
    public boolean isServiceLogsDisabled() {
        return disableServiceLogs;
    }

    /**
     * Sets the value of {@code disableServiceLogs}.
     *
     * @param disableServiceLogs The default value of this property is 'false'. This means, Text Analytics service logs
     * your input text for 48 hours, solely to allow for troubleshooting issues. Setting this property to true,
     * disables input logging and may limit our ability to investigate issues that occur.
     *
     * @return The {@link ExtractKeySentencesAction} object itself.
     */
    public ExtractKeySentencesAction setServiceLogsDisabled(boolean disableServiceLogs) {
        this.disableServiceLogs = disableServiceLogs;
        return this;
    }

    /**
     *
     * @return
     */
    public int getMaxSentenceCount() {
        return this.maxSentenceCount;
    }

    /**
     *
     * @param maxSentenceCount
     * @return
     */
    public ExtractKeySentencesAction setMaxSentenceCount(int maxSentenceCount) {
        this.maxSentenceCount = maxSentenceCount;
        return this;
    }

    /**
     *
     * @return
     */
    public KeySentencesOrder getSentencesOrder() {
        return sentencesOrder;
    }

    /**
     *
     * @param sentencesOrder
     * @return
     */
    public ExtractKeySentencesAction setSentencesOrder(KeySentencesOrder sentencesOrder) {
        this.sentencesOrder = sentencesOrder;
        return this;
    }
}
