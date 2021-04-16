// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for MaintenanceClient class. */
public interface MaintenanceClient {
    /**
     * Gets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ApplyUpdatesClient object to access its operations.
     *
     * @return the ApplyUpdatesClient object.
     */
    ApplyUpdatesClient getApplyUpdates();

    /**
     * Gets the ConfigurationAssignmentsClient object to access its operations.
     *
     * @return the ConfigurationAssignmentsClient object.
     */
    ConfigurationAssignmentsClient getConfigurationAssignments();

    /**
     * Gets the MaintenanceConfigurationsClient object to access its operations.
     *
     * @return the MaintenanceConfigurationsClient object.
     */
    MaintenanceConfigurationsClient getMaintenanceConfigurations();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the UpdatesClient object to access its operations.
     *
     * @return the UpdatesClient object.
     */
    UpdatesClient getUpdates();
}
