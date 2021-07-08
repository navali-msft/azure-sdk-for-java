// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elastic.fluent.DeploymentInfoesClient;
import com.azure.resourcemanager.elastic.fluent.models.DeploymentInfoResponseInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DeploymentInfoesClient. */
public final class DeploymentInfoesClientImpl implements DeploymentInfoesClient {
    private final ClientLogger logger = new ClientLogger(DeploymentInfoesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DeploymentInfoesService service;

    /** The service client containing this operation class. */
    private final MicrosoftElasticImpl client;

    /**
     * Initializes an instance of DeploymentInfoesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DeploymentInfoesClientImpl(MicrosoftElasticImpl client) {
        this.service =
            RestProxy.create(DeploymentInfoesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftElasticDeploymentInfoes to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftElasticDepl")
    private interface DeploymentInfoesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Elastic/monitors"
                + "/{monitorName}/listDeploymentInfo")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DeploymentInfoResponseInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("monitorName") String monitorName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Fetch information regarding Elastic cloud deployment corresponding to the Elastic monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of deployment in Elastic cloud corresponding to the Elastic monitor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DeploymentInfoResponseInner>> listWithResponseAsync(
        String resourceGroupName, String monitorName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (monitorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter monitorName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            monitorName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Fetch information regarding Elastic cloud deployment corresponding to the Elastic monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of deployment in Elastic cloud corresponding to the Elastic monitor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DeploymentInfoResponseInner>> listWithResponseAsync(
        String resourceGroupName, String monitorName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (monitorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter monitorName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                monitorName,
                accept,
                context);
    }

    /**
     * Fetch information regarding Elastic cloud deployment corresponding to the Elastic monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of deployment in Elastic cloud corresponding to the Elastic monitor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DeploymentInfoResponseInner> listAsync(String resourceGroupName, String monitorName) {
        return listWithResponseAsync(resourceGroupName, monitorName)
            .flatMap(
                (Response<DeploymentInfoResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Fetch information regarding Elastic cloud deployment corresponding to the Elastic monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of deployment in Elastic cloud corresponding to the Elastic monitor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeploymentInfoResponseInner list(String resourceGroupName, String monitorName) {
        return listAsync(resourceGroupName, monitorName).block();
    }

    /**
     * Fetch information regarding Elastic cloud deployment corresponding to the Elastic monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of deployment in Elastic cloud corresponding to the Elastic monitor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DeploymentInfoResponseInner> listWithResponse(
        String resourceGroupName, String monitorName, Context context) {
        return listWithResponseAsync(resourceGroupName, monitorName, context).block();
    }
}
