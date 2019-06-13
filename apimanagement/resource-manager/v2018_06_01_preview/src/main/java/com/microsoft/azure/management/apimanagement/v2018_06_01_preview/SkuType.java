/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuType.
 */
public final class SkuType extends ExpandableStringEnum<SkuType> {
    /** Static value Developer for SkuType. */
    public static final SkuType DEVELOPER = fromString("Developer");

    /** Static value Standard for SkuType. */
    public static final SkuType STANDARD = fromString("Standard");

    /** Static value Premium for SkuType. */
    public static final SkuType PREMIUM = fromString("Premium");

    /** Static value Basic for SkuType. */
    public static final SkuType BASIC = fromString("Basic");

    /** Static value Consumption for SkuType. */
    public static final SkuType CONSUMPTION = fromString("Consumption");

    /**
     * Creates or finds a SkuType from its string representation.
     * @param name a name to look for
     * @return the corresponding SkuType
     */
    @JsonCreator
    public static SkuType fromString(String name) {
        return fromString(name, SkuType.class);
    }

    /**
     * @return known SkuType values
     */
    public static Collection<SkuType> values() {
        return values(SkuType.class);
    }
}
