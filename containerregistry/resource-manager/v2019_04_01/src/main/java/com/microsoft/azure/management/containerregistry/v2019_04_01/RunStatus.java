/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RunStatus.
 */
public final class RunStatus extends ExpandableStringEnum<RunStatus> {
    /** Static value Queued for RunStatus. */
    public static final RunStatus QUEUED = fromString("Queued");

    /** Static value Started for RunStatus. */
    public static final RunStatus STARTED = fromString("Started");

    /** Static value Running for RunStatus. */
    public static final RunStatus RUNNING = fromString("Running");

    /** Static value Succeeded for RunStatus. */
    public static final RunStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for RunStatus. */
    public static final RunStatus FAILED = fromString("Failed");

    /** Static value Canceled for RunStatus. */
    public static final RunStatus CANCELED = fromString("Canceled");

    /** Static value Error for RunStatus. */
    public static final RunStatus ERROR = fromString("Error");

    /** Static value Timeout for RunStatus. */
    public static final RunStatus TIMEOUT = fromString("Timeout");

    /**
     * Creates or finds a RunStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding RunStatus
     */
    @JsonCreator
    public static RunStatus fromString(String name) {
        return fromString(name, RunStatus.class);
    }

    /**
     * @return known RunStatus values
     */
    public static Collection<RunStatus> values() {
        return values(RunStatus.class);
    }
}
