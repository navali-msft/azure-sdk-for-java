/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation.NotebookWorkspacesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing NotebookWorkspaces.
 */
public interface NotebookWorkspaces extends SupportsCreating<NotebookWorkspace.DefinitionStages.Blank>, HasInner<NotebookWorkspacesInner> {
    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NotebookWorkspaceConnectionInfoResult> listConnectionInfoAsync(String resourceGroupName, String accountName);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable regenerateAuthTokenAsync(String resourceGroupName, String accountName);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String resourceGroupName, String accountName);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NotebookWorkspace> getAsync(String resourceGroupName, String accountName);

    /**
     * Gets the notebook workspace resources of an existing Cosmos DB account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NotebookWorkspace> listByDatabaseAccountAsync(String resourceGroupName, String accountName);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName);

}
