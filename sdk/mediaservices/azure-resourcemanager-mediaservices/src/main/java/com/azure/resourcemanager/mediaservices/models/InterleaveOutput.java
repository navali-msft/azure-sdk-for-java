// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InterleaveOutput. */
public final class InterleaveOutput extends ExpandableStringEnum<InterleaveOutput> {
    /** Static value NonInterleavedOutput for InterleaveOutput. */
    public static final InterleaveOutput NON_INTERLEAVED_OUTPUT = fromString("NonInterleavedOutput");

    /** Static value InterleavedOutput for InterleaveOutput. */
    public static final InterleaveOutput INTERLEAVED_OUTPUT = fromString("InterleavedOutput");

    /**
     * Creates or finds a InterleaveOutput from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InterleaveOutput.
     */
    @JsonCreator
    public static InterleaveOutput fromString(String name) {
        return fromString(name, InterleaveOutput.class);
    }

    /** @return known InterleaveOutput values. */
    public static Collection<InterleaveOutput> values() {
        return values(InterleaveOutput.class);
    }
}
