// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphDeviceManagementExchangeAccessState. */
public final class MicrosoftGraphDeviceManagementExchangeAccessState
    extends ExpandableStringEnum<MicrosoftGraphDeviceManagementExchangeAccessState> {
    /** Static value none for MicrosoftGraphDeviceManagementExchangeAccessState. */
    public static final MicrosoftGraphDeviceManagementExchangeAccessState NONE = fromString("none");

    /** Static value unknown for MicrosoftGraphDeviceManagementExchangeAccessState. */
    public static final MicrosoftGraphDeviceManagementExchangeAccessState UNKNOWN = fromString("unknown");

    /** Static value allowed for MicrosoftGraphDeviceManagementExchangeAccessState. */
    public static final MicrosoftGraphDeviceManagementExchangeAccessState ALLOWED = fromString("allowed");

    /** Static value blocked for MicrosoftGraphDeviceManagementExchangeAccessState. */
    public static final MicrosoftGraphDeviceManagementExchangeAccessState BLOCKED = fromString("blocked");

    /** Static value quarantined for MicrosoftGraphDeviceManagementExchangeAccessState. */
    public static final MicrosoftGraphDeviceManagementExchangeAccessState QUARANTINED = fromString("quarantined");

    /**
     * Creates or finds a MicrosoftGraphDeviceManagementExchangeAccessState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphDeviceManagementExchangeAccessState.
     */
    @JsonCreator
    public static MicrosoftGraphDeviceManagementExchangeAccessState fromString(String name) {
        return fromString(name, MicrosoftGraphDeviceManagementExchangeAccessState.class);
    }

    /** @return known MicrosoftGraphDeviceManagementExchangeAccessState values. */
    public static Collection<MicrosoftGraphDeviceManagementExchangeAccessState> values() {
        return values(MicrosoftGraphDeviceManagementExchangeAccessState.class);
    }
}