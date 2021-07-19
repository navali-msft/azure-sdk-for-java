// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IotSecuritySolutions. */
public interface IotSecuritySolutions {
    /**
     * Use this method to get the list of IoT Security solutions by subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT Security solutions.
     */
    PagedIterable<IoTSecuritySolutionModel> list();

    /**
     * Use this method to get the list of IoT Security solutions by subscription.
     *
     * @param filter Filter the IoT Security solution with OData syntax. Supports filtering by iotHubs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT Security solutions.
     */
    PagedIterable<IoTSecuritySolutionModel> list(String filter, Context context);

    /**
     * Use this method to get the list IoT Security solutions organized by resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT Security solutions.
     */
    PagedIterable<IoTSecuritySolutionModel> listByResourceGroup(String resourceGroupName);

    /**
     * Use this method to get the list IoT Security solutions organized by resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param filter Filter the IoT Security solution with OData syntax. Supports filtering by iotHubs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT Security solutions.
     */
    PagedIterable<IoTSecuritySolutionModel> listByResourceGroup(
        String resourceGroupName, String filter, Context context);

    /**
     * User this method to get details of a specific IoT Security solution based on solution name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Security solution configuration and resource information.
     */
    IoTSecuritySolutionModel getByResourceGroup(String resourceGroupName, String solutionName);

    /**
     * User this method to get details of a specific IoT Security solution based on solution name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Security solution configuration and resource information.
     */
    Response<IoTSecuritySolutionModel> getByResourceGroupWithResponse(
        String resourceGroupName, String solutionName, Context context);

    /**
     * Use this method to delete yours IoT Security solution.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String solutionName);

    /**
     * Use this method to delete yours IoT Security solution.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String solutionName, Context context);

    /**
     * User this method to get details of a specific IoT Security solution based on solution name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Security solution configuration and resource information.
     */
    IoTSecuritySolutionModel getById(String id);

    /**
     * User this method to get details of a specific IoT Security solution based on solution name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Security solution configuration and resource information.
     */
    Response<IoTSecuritySolutionModel> getByIdWithResponse(String id, Context context);

    /**
     * Use this method to delete yours IoT Security solution.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Use this method to delete yours IoT Security solution.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IoTSecuritySolutionModel resource.
     *
     * @param name resource name.
     * @return the first stage of the new IoTSecuritySolutionModel definition.
     */
    IoTSecuritySolutionModel.DefinitionStages.Blank define(String name);
}
