// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.models.AccountEncryption;
import com.azure.resourcemanager.videoanalyzer.models.Endpoint;
import com.azure.resourcemanager.videoanalyzer.models.IotHub;
import com.azure.resourcemanager.videoanalyzer.models.NetworkAccessControl;
import com.azure.resourcemanager.videoanalyzer.models.ProvisioningState;
import com.azure.resourcemanager.videoanalyzer.models.PublicNetworkAccess;
import com.azure.resourcemanager.videoanalyzer.models.StorageAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of the Video Analyzer account. */
@Fluent
public final class VideoAnalyzerPropertiesUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoAnalyzerPropertiesUpdate.class);

    /*
     * The storage accounts for this resource.
     */
    @JsonProperty(value = "storageAccounts")
    private List<StorageAccount> storageAccounts;

    /*
     * The endpoints associated with this resource.
     */
    @JsonProperty(value = "endpoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<Endpoint> endpoints;

    /*
     * The account encryption properties.
     */
    @JsonProperty(value = "encryption")
    private AccountEncryption encryption;

    /*
     * The IoT Hubs for this resource.
     */
    @JsonProperty(value = "iotHubs")
    private List<IotHub> iotHubs;

    /*
     * Whether or not public network access is allowed for resources under the
     * Video Analyzer account.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Network access control for Video Analyzer.
     */
    @JsonProperty(value = "networkAccessControl")
    private NetworkAccessControl networkAccessControl;

    /*
     * Provisioning state of the Video Analyzer account.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Private Endpoint Connections created under Video Analyzer account.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /**
     * Get the storageAccounts property: The storage accounts for this resource.
     *
     * @return the storageAccounts value.
     */
    public List<StorageAccount> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storageAccounts property: The storage accounts for this resource.
     *
     * @param storageAccounts the storageAccounts value to set.
     * @return the VideoAnalyzerPropertiesUpdate object itself.
     */
    public VideoAnalyzerPropertiesUpdate withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints associated with this resource.
     *
     * @return the endpoints value.
     */
    public List<Endpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Get the encryption property: The account encryption properties.
     *
     * @return the encryption value.
     */
    public AccountEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The account encryption properties.
     *
     * @param encryption the encryption value to set.
     * @return the VideoAnalyzerPropertiesUpdate object itself.
     */
    public VideoAnalyzerPropertiesUpdate withEncryption(AccountEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the iotHubs property: The IoT Hubs for this resource.
     *
     * @return the iotHubs value.
     */
    public List<IotHub> iotHubs() {
        return this.iotHubs;
    }

    /**
     * Set the iotHubs property: The IoT Hubs for this resource.
     *
     * @param iotHubs the iotHubs value to set.
     * @return the VideoAnalyzerPropertiesUpdate object itself.
     */
    public VideoAnalyzerPropertiesUpdate withIotHubs(List<IotHub> iotHubs) {
        this.iotHubs = iotHubs;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for resources under the
     * Video Analyzer account.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for resources under the
     * Video Analyzer account.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the VideoAnalyzerPropertiesUpdate object itself.
     */
    public VideoAnalyzerPropertiesUpdate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the networkAccessControl property: Network access control for Video Analyzer.
     *
     * @return the networkAccessControl value.
     */
    public NetworkAccessControl networkAccessControl() {
        return this.networkAccessControl;
    }

    /**
     * Set the networkAccessControl property: Network access control for Video Analyzer.
     *
     * @param networkAccessControl the networkAccessControl value to set.
     * @return the VideoAnalyzerPropertiesUpdate object itself.
     */
    public VideoAnalyzerPropertiesUpdate withNetworkAccessControl(NetworkAccessControl networkAccessControl) {
        this.networkAccessControl = networkAccessControl;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Video Analyzer account.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpointConnections property: Private Endpoint Connections created under Video Analyzer account.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageAccounts() != null) {
            storageAccounts().forEach(e -> e.validate());
        }
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (iotHubs() != null) {
            iotHubs().forEach(e -> e.validate());
        }
        if (networkAccessControl() != null) {
            networkAccessControl().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
