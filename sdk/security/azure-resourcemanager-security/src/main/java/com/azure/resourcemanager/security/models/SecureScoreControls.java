// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of SecureScoreControls. */
public interface SecureScoreControls {
    /**
     * Get all security controls for a specific initiative within a scope.
     *
     * @param secureScoreName The initiative name. For the ASC Default initiative, use 'ascScore' as in the sample
     *     request below.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all security controls for a specific initiative within a scope.
     */
    PagedIterable<SecureScoreControlDetails> listBySecureScore(String secureScoreName);

    /**
     * Get all security controls for a specific initiative within a scope.
     *
     * @param secureScoreName The initiative name. For the ASC Default initiative, use 'ascScore' as in the sample
     *     request below.
     * @param expand OData expand. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all security controls for a specific initiative within a scope.
     */
    PagedIterable<SecureScoreControlDetails> listBySecureScore(
        String secureScoreName, ExpandControlsEnum expand, Context context);

    /**
     * Get all security controls within a scope.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all security controls within a scope.
     */
    PagedIterable<SecureScoreControlDetails> list();

    /**
     * Get all security controls within a scope.
     *
     * @param expand OData expand. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all security controls within a scope.
     */
    PagedIterable<SecureScoreControlDetails> list(ExpandControlsEnum expand, Context context);
}
