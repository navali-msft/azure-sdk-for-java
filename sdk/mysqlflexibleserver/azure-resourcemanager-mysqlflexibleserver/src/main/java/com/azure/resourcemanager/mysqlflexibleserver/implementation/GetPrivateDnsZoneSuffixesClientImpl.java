// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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
import com.azure.resourcemanager.mysqlflexibleserver.fluent.GetPrivateDnsZoneSuffixesClient;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.GetPrivateDnsZoneSuffixResponseInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GetPrivateDnsZoneSuffixesClient. */
public final class GetPrivateDnsZoneSuffixesClientImpl implements GetPrivateDnsZoneSuffixesClient {
    private final ClientLogger logger = new ClientLogger(GetPrivateDnsZoneSuffixesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GetPrivateDnsZoneSuffixesService service;

    /** The service client containing this operation class. */
    private final MySqlManagementClientImpl client;

    /**
     * Initializes an instance of GetPrivateDnsZoneSuffixesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GetPrivateDnsZoneSuffixesClientImpl(MySqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    GetPrivateDnsZoneSuffixesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MySqlManagementClientGetPrivateDnsZoneSuffixes to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MySqlManagementClien")
    private interface GetPrivateDnsZoneSuffixesService {
        @Headers({"Content-Type: application/json"})
        @Post("/providers/Microsoft.DBforMySQL/getPrivateDnsZoneSuffix")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GetPrivateDnsZoneSuffixResponseInner>> execute(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get private DNS zone suffix in the cloud.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private DNS zone suffix in the cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GetPrivateDnsZoneSuffixResponseInner>> executeWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.execute(this.client.getEndpoint(), this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get private DNS zone suffix in the cloud.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private DNS zone suffix in the cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GetPrivateDnsZoneSuffixResponseInner>> executeWithResponseAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.execute(this.client.getEndpoint(), this.client.getApiVersion(), accept, context);
    }

    /**
     * Get private DNS zone suffix in the cloud.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private DNS zone suffix in the cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GetPrivateDnsZoneSuffixResponseInner> executeAsync() {
        return executeWithResponseAsync()
            .flatMap(
                (Response<GetPrivateDnsZoneSuffixResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get private DNS zone suffix in the cloud.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private DNS zone suffix in the cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GetPrivateDnsZoneSuffixResponseInner execute() {
        return executeAsync().block();
    }

    /**
     * Get private DNS zone suffix in the cloud.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private DNS zone suffix in the cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GetPrivateDnsZoneSuffixResponseInner> executeWithResponse(Context context) {
        return executeWithResponseAsync(context).block();
    }
}
