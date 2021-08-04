// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.fluent.models.ApplicationInner;

/** An immutable client-side representation of Application. */
public interface Application {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: The ETag of the resource, used for concurrency statements.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the displayName property: The display name for the application.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the allowUpdates property: A value indicating whether packages within the application may be overwritten
     * using the same version string.
     *
     * @return the allowUpdates value.
     */
    Boolean allowUpdates();

    /**
     * Gets the defaultVersion property: The package to use if a client requests the application but does not specify a
     * version. This property can only be set to the name of an existing package.
     *
     * @return the defaultVersion value.
     */
    String defaultVersion();

    /**
     * Gets the inner com.azure.resourcemanager.batch.fluent.models.ApplicationInner object.
     *
     * @return the inner object.
     */
    ApplicationInner innerModel();

    /** The entirety of the Application definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Application definition stages. */
    interface DefinitionStages {
        /** The first stage of the Application definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Application definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group that contains the Batch account.
             * @param accountName The name of the Batch account.
             * @return the next definition stage.
             */
            WithCreate withExistingBatchAccount(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the Application definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDisplayName,
                DefinitionStages.WithAllowUpdates,
                DefinitionStages.WithDefaultVersion {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Application create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Application create(Context context);
        }
        /** The stage of the Application definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name for the application..
             *
             * @param displayName The display name for the application.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the Application definition allowing to specify allowUpdates. */
        interface WithAllowUpdates {
            /**
             * Specifies the allowUpdates property: A value indicating whether packages within the application may be
             * overwritten using the same version string..
             *
             * @param allowUpdates A value indicating whether packages within the application may be overwritten using
             *     the same version string.
             * @return the next definition stage.
             */
            WithCreate withAllowUpdates(Boolean allowUpdates);
        }
        /** The stage of the Application definition allowing to specify defaultVersion. */
        interface WithDefaultVersion {
            /**
             * Specifies the defaultVersion property: The package to use if a client requests the application but does
             * not specify a version. This property can only be set to the name of an existing package..
             *
             * @param defaultVersion The package to use if a client requests the application but does not specify a
             *     version. This property can only be set to the name of an existing package.
             * @return the next definition stage.
             */
            WithCreate withDefaultVersion(String defaultVersion);
        }
    }
    /**
     * Begins update for the Application resource.
     *
     * @return the stage of resource update.
     */
    Application.Update update();

    /** The template for Application update. */
    interface Update
        extends UpdateStages.WithDisplayName, UpdateStages.WithAllowUpdates, UpdateStages.WithDefaultVersion {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Application apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Application apply(Context context);
    }
    /** The Application update stages. */
    interface UpdateStages {
        /** The stage of the Application update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name for the application..
             *
             * @param displayName The display name for the application.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }
        /** The stage of the Application update allowing to specify allowUpdates. */
        interface WithAllowUpdates {
            /**
             * Specifies the allowUpdates property: A value indicating whether packages within the application may be
             * overwritten using the same version string..
             *
             * @param allowUpdates A value indicating whether packages within the application may be overwritten using
             *     the same version string.
             * @return the next definition stage.
             */
            Update withAllowUpdates(Boolean allowUpdates);
        }
        /** The stage of the Application update allowing to specify defaultVersion. */
        interface WithDefaultVersion {
            /**
             * Specifies the defaultVersion property: The package to use if a client requests the application but does
             * not specify a version. This property can only be set to the name of an existing package..
             *
             * @param defaultVersion The package to use if a client requests the application but does not specify a
             *     version. This property can only be set to the name of an existing package.
             * @return the next definition stage.
             */
            Update withDefaultVersion(String defaultVersion);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Application refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Application refresh(Context context);
}
