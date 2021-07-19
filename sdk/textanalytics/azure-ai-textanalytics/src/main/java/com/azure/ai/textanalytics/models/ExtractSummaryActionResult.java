// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.ai.textanalytics.implementation.ExtractSummaryActionResultPropertiesHelper;
import com.azure.ai.textanalytics.util.ExtractSummaryResultCollection;
import com.azure.core.annotation.Immutable;

/**
 *
 */
@Immutable
public final class ExtractSummaryActionResult extends TextAnalyticsActionResult {
    private ExtractSummaryResultCollection documentsResults;

    static {
        ExtractSummaryActionResultPropertiesHelper.setAccessor(
            (actionResult, documentsResults) -> actionResult.setDocumentsResults(documentsResults));
    }

    /**
     * Gets the key sentences extraction action result.
     *
     * @return the key sentences extraction action result.
     *
     * @throws TextAnalyticsException if result has {@code isError} equals to true and when a non-error property
     * was accessed.
     */
    public ExtractSummaryResultCollection getDocumentsResults() {
        throwExceptionIfError();
        return documentsResults;
    }

    private void setDocumentsResults(ExtractSummaryResultCollection documentsResults) {
        this.documentsResults = documentsResults;
    }
}
