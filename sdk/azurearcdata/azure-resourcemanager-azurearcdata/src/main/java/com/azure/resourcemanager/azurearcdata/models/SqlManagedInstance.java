// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurearcdata.fluent.models.SqlManagedInstanceInner;
import java.util.Map;

/** An immutable client-side representation of SqlManagedInstance. */
public interface SqlManagedInstance {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: null.
     *
     * @return the properties value.
     */
    SqlManagedInstanceProperties properties();

    /**
     * Gets the extendedLocation property: The extendedLocation of the resource.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the sku property: Resource sku.
     *
     * @return the sku value.
     */
    SqlManagedInstanceSku sku();

    /**
     * Gets the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.azurearcdata.fluent.models.SqlManagedInstanceInner object.
     *
     * @return the inner object.
     */
    SqlManagedInstanceInner innerModel();

    /** The entirety of the SqlManagedInstance definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The SqlManagedInstance definition stages. */
    interface DefinitionStages {
        /** The first stage of the SqlManagedInstance definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the SqlManagedInstance definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the SqlManagedInstance definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the Azure resource group.
             * @return the next definition stage.
             */
            WithProperties withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the SqlManagedInstance definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: null.
             *
             * @param properties null.
             * @return the next definition stage.
             */
            WithCreate withProperties(SqlManagedInstanceProperties properties);
        }
        /**
         * The stage of the SqlManagedInstance definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithExtendedLocation, DefinitionStages.WithSku {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SqlManagedInstance create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SqlManagedInstance create(Context context);
        }
        /** The stage of the SqlManagedInstance definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the SqlManagedInstance definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extendedLocation of the resource..
             *
             * @param extendedLocation The extendedLocation of the resource.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the SqlManagedInstance definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Resource sku..
             *
             * @param sku Resource sku.
             * @return the next definition stage.
             */
            WithCreate withSku(SqlManagedInstanceSku sku);
        }
    }
    /**
     * Begins update for the SqlManagedInstance resource.
     *
     * @return the stage of resource update.
     */
    SqlManagedInstance.Update update();

    /** The template for SqlManagedInstance update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SqlManagedInstance apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SqlManagedInstance apply(Context context);
    }
    /** The SqlManagedInstance update stages. */
    interface UpdateStages {
        /** The stage of the SqlManagedInstance update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SqlManagedInstance refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SqlManagedInstance refresh(Context context);
}
