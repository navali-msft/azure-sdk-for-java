// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic;

import com.azure.core.util.Context;

/** Samples for TagRules Delete. */
public final class TagRulesDeleteSamples {
    /**
     * Sample code: TagRules_Delete.
     *
     * @param elasticManager Entry point to ElasticManager.
     */
    public static void tagRulesDelete(com.azure.resourcemanager.elastic.ElasticManager elasticManager) {
        elasticManager.tagRules().delete("myResourceGroup", "myMonitor", "default", Context.NONE);
    }
}
