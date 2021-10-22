// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.OperationContractInner;
import java.util.List;

/** An immutable client-side representation of OperationContract. */
public interface OperationContract {
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
     * Gets the displayName property: Operation Name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the method property: A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited
     * by only them.
     *
     * @return the method value.
     */
    String method();

    /**
     * Gets the urlTemplate property: Relative URL template identifying the target resource for this operation. May
     * include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}.
     *
     * @return the urlTemplate value.
     */
    String urlTemplate();

    /**
     * Gets the templateParameters property: Collection of URL template parameters.
     *
     * @return the templateParameters value.
     */
    List<ParameterContract> templateParameters();

    /**
     * Gets the description property: Description of the operation. May include HTML formatting tags.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the request property: An entity containing request details.
     *
     * @return the request value.
     */
    RequestContract request();

    /**
     * Gets the responses property: Array of Operation responses.
     *
     * @return the responses value.
     */
    List<ResponseContract> responses();

    /**
     * Gets the policies property: Operation Policies.
     *
     * @return the policies value.
     */
    String policies();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.OperationContractInner object.
     *
     * @return the inner object.
     */
    OperationContractInner innerModel();

    /** The entirety of the OperationContract definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The OperationContract definition stages. */
    interface DefinitionStages {
        /** The first stage of the OperationContract definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the OperationContract definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName, apiId.
             *
             * @param resourceGroupName The name of the resource group.
             * @param serviceName The name of the API Management service.
             * @param apiId API revision identifier. Must be unique in the current API Management service instance.
             *     Non-current revision has ;rev=n as a suffix where n is the revision number.
             * @return the next definition stage.
             */
            WithCreate withExistingApi(String resourceGroupName, String serviceName, String apiId);
        }
        /**
         * The stage of the OperationContract definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDisplayName,
                DefinitionStages.WithMethod,
                DefinitionStages.WithUrlTemplate,
                DefinitionStages.WithTemplateParameters,
                DefinitionStages.WithDescription,
                DefinitionStages.WithRequest,
                DefinitionStages.WithResponses,
                DefinitionStages.WithPolicies,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            OperationContract create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            OperationContract create(Context context);
        }
        /** The stage of the OperationContract definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Operation Name..
             *
             * @param displayName Operation Name.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the OperationContract definition allowing to specify method. */
        interface WithMethod {
            /**
             * Specifies the method property: A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST
             * but not limited by only them..
             *
             * @param method A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited by
             *     only them.
             * @return the next definition stage.
             */
            WithCreate withMethod(String method);
        }
        /** The stage of the OperationContract definition allowing to specify urlTemplate. */
        interface WithUrlTemplate {
            /**
             * Specifies the urlTemplate property: Relative URL template identifying the target resource for this
             * operation. May include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}.
             *
             * @param urlTemplate Relative URL template identifying the target resource for this operation. May include
             *     parameters. Example: /customers/{cid}/orders/{oid}/?date={date}.
             * @return the next definition stage.
             */
            WithCreate withUrlTemplate(String urlTemplate);
        }
        /** The stage of the OperationContract definition allowing to specify templateParameters. */
        interface WithTemplateParameters {
            /**
             * Specifies the templateParameters property: Collection of URL template parameters..
             *
             * @param templateParameters Collection of URL template parameters.
             * @return the next definition stage.
             */
            WithCreate withTemplateParameters(List<ParameterContract> templateParameters);
        }
        /** The stage of the OperationContract definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of the operation. May include HTML formatting tags..
             *
             * @param description Description of the operation. May include HTML formatting tags.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the OperationContract definition allowing to specify request. */
        interface WithRequest {
            /**
             * Specifies the request property: An entity containing request details..
             *
             * @param request An entity containing request details.
             * @return the next definition stage.
             */
            WithCreate withRequest(RequestContract request);
        }
        /** The stage of the OperationContract definition allowing to specify responses. */
        interface WithResponses {
            /**
             * Specifies the responses property: Array of Operation responses..
             *
             * @param responses Array of Operation responses.
             * @return the next definition stage.
             */
            WithCreate withResponses(List<ResponseContract> responses);
        }
        /** The stage of the OperationContract definition allowing to specify policies. */
        interface WithPolicies {
            /**
             * Specifies the policies property: Operation Policies.
             *
             * @param policies Operation Policies.
             * @return the next definition stage.
             */
            WithCreate withPolicies(String policies);
        }
        /** The stage of the OperationContract definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             *
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             *     entity.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the OperationContract resource.
     *
     * @return the stage of resource update.
     */
    OperationContract.Update update();

    /** The template for OperationContract update. */
    interface Update
        extends UpdateStages.WithDisplayName,
            UpdateStages.WithMethod,
            UpdateStages.WithUrlTemplate,
            UpdateStages.WithTemplateParameters,
            UpdateStages.WithDescription,
            UpdateStages.WithRequest,
            UpdateStages.WithResponses,
            UpdateStages.WithPolicies,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        OperationContract apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        OperationContract apply(Context context);
    }
    /** The OperationContract update stages. */
    interface UpdateStages {
        /** The stage of the OperationContract update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Operation Name..
             *
             * @param displayName Operation Name.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }
        /** The stage of the OperationContract update allowing to specify method. */
        interface WithMethod {
            /**
             * Specifies the method property: A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST
             * but not limited by only them..
             *
             * @param method A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited by
             *     only them.
             * @return the next definition stage.
             */
            Update withMethod(String method);
        }
        /** The stage of the OperationContract update allowing to specify urlTemplate. */
        interface WithUrlTemplate {
            /**
             * Specifies the urlTemplate property: Relative URL template identifying the target resource for this
             * operation. May include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}.
             *
             * @param urlTemplate Relative URL template identifying the target resource for this operation. May include
             *     parameters. Example: /customers/{cid}/orders/{oid}/?date={date}.
             * @return the next definition stage.
             */
            Update withUrlTemplate(String urlTemplate);
        }
        /** The stage of the OperationContract update allowing to specify templateParameters. */
        interface WithTemplateParameters {
            /**
             * Specifies the templateParameters property: Collection of URL template parameters..
             *
             * @param templateParameters Collection of URL template parameters.
             * @return the next definition stage.
             */
            Update withTemplateParameters(List<ParameterContract> templateParameters);
        }
        /** The stage of the OperationContract update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of the operation. May include HTML formatting tags..
             *
             * @param description Description of the operation. May include HTML formatting tags.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the OperationContract update allowing to specify request. */
        interface WithRequest {
            /**
             * Specifies the request property: An entity containing request details..
             *
             * @param request An entity containing request details.
             * @return the next definition stage.
             */
            Update withRequest(RequestContract request);
        }
        /** The stage of the OperationContract update allowing to specify responses. */
        interface WithResponses {
            /**
             * Specifies the responses property: Array of Operation responses..
             *
             * @param responses Array of Operation responses.
             * @return the next definition stage.
             */
            Update withResponses(List<ResponseContract> responses);
        }
        /** The stage of the OperationContract update allowing to specify policies. */
        interface WithPolicies {
            /**
             * Specifies the policies property: Operation Policies.
             *
             * @param policies Operation Policies.
             * @return the next definition stage.
             */
            Update withPolicies(String policies);
        }
        /** The stage of the OperationContract update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             *
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             *     the GET request or it should be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    OperationContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    OperationContract refresh(Context context);
}
