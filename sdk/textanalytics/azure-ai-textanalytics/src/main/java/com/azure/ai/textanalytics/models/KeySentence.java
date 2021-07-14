// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Immutable;

/**
 *
 */
@Immutable
public final class KeySentence {
    private String text;
    private double importanceScore;
    private int length;
    private int offset;

    /**
     *
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @return
     */
    public double getImportanceScore() {
        return importanceScore;
    }

    /**
     *
     * @return
     */
    public int getLength() {
        return length;
    }

    /**
     *
     * @return
     */
    public int getOffset() {
        return offset;
    }
}
