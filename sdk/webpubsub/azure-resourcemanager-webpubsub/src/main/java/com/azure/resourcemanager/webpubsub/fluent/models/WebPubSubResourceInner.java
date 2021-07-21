// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.models.DiagnosticConfiguration;
import com.azure.resourcemanager.webpubsub.models.EventHandlerSettings;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentity;
import com.azure.resourcemanager.webpubsub.models.ProvisioningState;
import com.azure.resourcemanager.webpubsub.models.ResourceSku;
import com.azure.resourcemanager.webpubsub.models.WebPubSubNetworkACLs;
import com.azure.resourcemanager.webpubsub.models.WebPubSubTlsSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A class represent a resource. */
@JsonFlatten
@Fluent
public class WebPubSubResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebPubSubResourceInner.class);

    /*
     * The billing information of the resource.(e.g. Free, Standard)
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /*
     * The managed identity response
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The publicly accessible IP of the resource.
     */
    @JsonProperty(value = "properties.externalIP", access = JsonProperty.Access.WRITE_ONLY)
    private String externalIp;

    /*
     * FQDN of the service instance.
     */
    @JsonProperty(value = "properties.hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * The publicly accessible port of the resource which is designed for
     * browser/client side usage.
     */
    @JsonProperty(value = "properties.publicPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer publicPort;

    /*
     * The publicly accessible port of the resource which is designed for
     * customer server side usage.
     */
    @JsonProperty(value = "properties.serverPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer serverPort;

    /*
     * Version of the resource. Probably you need the same or higher version of
     * client SDKs.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Private endpoint connections to the resource.
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The list of shared private link resources.
     */
    @JsonProperty(value = "properties.sharedPrivateLinkResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources;

    /*
     * TLS settings.
     */
    @JsonProperty(value = "properties.tls")
    private WebPubSubTlsSettings tls;

    /*
     * Diagnostic configuration of a Microsoft.SignalRService resource. Used
     * together with Azure monitor DiagnosticSettings.
     */
    @JsonProperty(value = "properties.diagnosticConfiguration")
    private DiagnosticConfiguration diagnosticConfiguration;

    /*
     * The settings for event handler in webpubsub service.
     */
    @JsonProperty(value = "properties.eventHandler")
    private EventHandlerSettings eventHandler;

    /*
     * Network ACLs
     */
    @JsonProperty(value = "properties.networkACLs")
    private WebPubSubNetworkACLs networkACLs;

    /*
     * Enable or disable public network access. Default to "Enabled".
     * When it's Enabled, network ACLs still apply.
     * When it's Disabled, public network access is always disabled no matter
     * what you set in network ACLs.
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private String publicNetworkAccess;

    /*
     * DisableLocalAuth
     * Enable or disable local auth with AccessKey
     * When set as true, connection with AccessKey=xxx won't work.
     */
    @JsonProperty(value = "properties.disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * DisableLocalAuth
     * Enable or disable aad auth
     * When set as true, connection with AuthType=aad won't work.
     */
    @JsonProperty(value = "properties.disableAadAuth")
    private Boolean disableAadAuth;

    /**
     * Get the sku property: The billing information of the resource.(e.g. Free, Standard).
     *
     * @return the sku value.
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The billing information of the resource.(e.g. Free, Standard).
     *
     * @param sku the sku value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: The managed identity response.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identity response.
     *
     * @param identity the identity value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the externalIp property: The publicly accessible IP of the resource.
     *
     * @return the externalIp value.
     */
    public String externalIp() {
        return this.externalIp;
    }

    /**
     * Get the hostname property: FQDN of the service instance.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the publicPort property: The publicly accessible port of the resource which is designed for browser/client
     * side usage.
     *
     * @return the publicPort value.
     */
    public Integer publicPort() {
        return this.publicPort;
    }

    /**
     * Get the serverPort property: The publicly accessible port of the resource which is designed for customer server
     * side usage.
     *
     * @return the serverPort value.
     */
    public Integer serverPort() {
        return this.serverPort;
    }

    /**
     * Get the version property: Version of the resource. Probably you need the same or higher version of client SDKs.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections to the resource.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the sharedPrivateLinkResources property: The list of shared private link resources.
     *
     * @return the sharedPrivateLinkResources value.
     */
    public List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }

    /**
     * Get the tls property: TLS settings.
     *
     * @return the tls value.
     */
    public WebPubSubTlsSettings tls() {
        return this.tls;
    }

    /**
     * Set the tls property: TLS settings.
     *
     * @param tls the tls value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withTls(WebPubSubTlsSettings tls) {
        this.tls = tls;
        return this;
    }

    /**
     * Get the diagnosticConfiguration property: Diagnostic configuration of a Microsoft.SignalRService resource. Used
     * together with Azure monitor DiagnosticSettings.
     *
     * @return the diagnosticConfiguration value.
     */
    public DiagnosticConfiguration diagnosticConfiguration() {
        return this.diagnosticConfiguration;
    }

    /**
     * Set the diagnosticConfiguration property: Diagnostic configuration of a Microsoft.SignalRService resource. Used
     * together with Azure monitor DiagnosticSettings.
     *
     * @param diagnosticConfiguration the diagnosticConfiguration value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withDiagnosticConfiguration(DiagnosticConfiguration diagnosticConfiguration) {
        this.diagnosticConfiguration = diagnosticConfiguration;
        return this;
    }

    /**
     * Get the eventHandler property: The settings for event handler in webpubsub service.
     *
     * @return the eventHandler value.
     */
    public EventHandlerSettings eventHandler() {
        return this.eventHandler;
    }

    /**
     * Set the eventHandler property: The settings for event handler in webpubsub service.
     *
     * @param eventHandler the eventHandler value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withEventHandler(EventHandlerSettings eventHandler) {
        this.eventHandler = eventHandler;
        return this;
    }

    /**
     * Get the networkACLs property: Network ACLs.
     *
     * @return the networkACLs value.
     */
    public WebPubSubNetworkACLs networkACLs() {
        return this.networkACLs;
    }

    /**
     * Set the networkACLs property: Network ACLs.
     *
     * @param networkACLs the networkACLs value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withNetworkACLs(WebPubSubNetworkACLs networkACLs) {
        this.networkACLs = networkACLs;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Enable or disable public network access. Default to "Enabled". When it's
     * Enabled, network ACLs still apply. When it's Disabled, public network access is always disabled no matter what
     * you set in network ACLs.
     *
     * @return the publicNetworkAccess value.
     */
    public String publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Enable or disable public network access. Default to "Enabled". When it's
     * Enabled, network ACLs still apply. When it's Disabled, public network access is always disabled no matter what
     * you set in network ACLs.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withPublicNetworkAccess(String publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the disableLocalAuth property: DisableLocalAuth Enable or disable local auth with AccessKey When set as true,
     * connection with AccessKey=xxx won't work.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: DisableLocalAuth Enable or disable local auth with AccessKey When set as true,
     * connection with AccessKey=xxx won't work.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the disableAadAuth property: DisableLocalAuth Enable or disable aad auth When set as true, connection with
     * AuthType=aad won't work.
     *
     * @return the disableAadAuth value.
     */
    public Boolean disableAadAuth() {
        return this.disableAadAuth;
    }

    /**
     * Set the disableAadAuth property: DisableLocalAuth Enable or disable aad auth When set as true, connection with
     * AuthType=aad won't work.
     *
     * @param disableAadAuth the disableAadAuth value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withDisableAadAuth(Boolean disableAadAuth) {
        this.disableAadAuth = disableAadAuth;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebPubSubResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebPubSubResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (sharedPrivateLinkResources() != null) {
            sharedPrivateLinkResources().forEach(e -> e.validate());
        }
        if (tls() != null) {
            tls().validate();
        }
        if (diagnosticConfiguration() != null) {
            diagnosticConfiguration().validate();
        }
        if (eventHandler() != null) {
            eventHandler().validate();
        }
        if (networkACLs() != null) {
            networkACLs().validate();
        }
    }
}
