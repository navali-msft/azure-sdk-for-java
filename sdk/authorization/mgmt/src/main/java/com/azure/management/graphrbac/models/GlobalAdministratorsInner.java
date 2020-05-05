// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GlobalAdministrators. */
public final class GlobalAdministratorsInner {
    /** The proxy service used to perform REST calls. */
    private final GlobalAdministratorsService service;

    /** The service client containing this operation class. */
    private final AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of GlobalAdministratorsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GlobalAdministratorsInner(AuthorizationManagementClientImpl client) {
        this.service =
            RestProxy
                .create(GlobalAdministratorsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AuthorizationManagementClientGlobalAdministrators to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagem")
    private interface GlobalAdministratorsService {
        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post("/providers/Microsoft.Authorization/elevateAccess")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> elevateAccess(
            @HostParam("$host") String host, @QueryParam("api-version") String apiVersion, Context context);
    }

    /**
     * Elevates access for a Global Administrator.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> elevateAccessWithResponseAsync() {
        final String apiVersion = "2015-07-01";
        return FluxUtil
            .withContext(context -> service.elevateAccess(this.client.getHost(), apiVersion, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Elevates access for a Global Administrator.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> elevateAccessAsync() {
        return elevateAccessWithResponseAsync().flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Elevates access for a Global Administrator.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void elevateAccess() {
        elevateAccessAsync().block();
    }
}
