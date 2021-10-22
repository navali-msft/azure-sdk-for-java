// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;

/** Samples for PipelineJobs Get. */
public final class PipelineJobsGetSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/pipeline-job-get-by-name.json
     */
    /**
     * Sample code: Get a pipeline job by name.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void getAPipelineJobByName(com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager.pipelineJobs().getWithResponse("testrg", "testaccount2", "pipelineJob1", Context.NONE);
    }
}
