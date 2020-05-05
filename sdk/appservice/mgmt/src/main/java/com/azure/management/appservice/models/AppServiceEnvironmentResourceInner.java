// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.appservice.HostingEnvironmentStatus;
import com.azure.management.appservice.InternalLoadBalancingMode;
import com.azure.management.appservice.NameValuePair;
import com.azure.management.appservice.NetworkAccessControlEntry;
import com.azure.management.appservice.ProvisioningState;
import com.azure.management.appservice.VirtualIPMapping;
import com.azure.management.appservice.VirtualNetworkProfile;
import com.azure.management.appservice.WorkerPool;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppServiceEnvironmentResource model. */
@JsonFlatten
@Fluent
public class AppServiceEnvironmentResourceInner extends Resource {
    /*
     * Name of the App Service Environment.
     */
    @JsonProperty(value = "properties.name")
    private String namePropertiesName;

    /*
     * Location of the App Service Environment, e.g. "West US".
     */
    @JsonProperty(value = "properties.location")
    private String locationPropertiesLocation;

    /*
     * Provisioning state of the App Service Environment.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Current status of the App Service Environment.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private HostingEnvironmentStatus status;

    /*
     * Name of the Virtual Network for the App Service Environment.
     */
    @JsonProperty(value = "properties.vnetName")
    private String vnetName;

    /*
     * Resource group of the Virtual Network.
     */
    @JsonProperty(value = "properties.vnetResourceGroupName")
    private String vnetResourceGroupName;

    /*
     * Subnet of the Virtual Network.
     */
    @JsonProperty(value = "properties.vnetSubnetName")
    private String vnetSubnetName;

    /*
     * Description of the Virtual Network.
     */
    @JsonProperty(value = "properties.virtualNetwork")
    private VirtualNetworkProfile virtualNetwork;

    /*
     * Specifies which endpoints to serve internally in the Virtual Network for
     * the App Service Environment.
     */
    @JsonProperty(value = "properties.internalLoadBalancingMode")
    private InternalLoadBalancingMode internalLoadBalancingMode;

    /*
     * Front-end VM size, e.g. "Medium", "Large".
     */
    @JsonProperty(value = "properties.multiSize")
    private String multiSize;

    /*
     * Number of front-end instances.
     */
    @JsonProperty(value = "properties.multiRoleCount")
    private Integer multiRoleCount;

    /*
     * Description of worker pools with worker size IDs, VM sizes, and number
     * of workers in each pool.
     */
    @JsonProperty(value = "properties.workerPools")
    private List<WorkerPool> workerPools;

    /*
     * Number of IP SSL addresses reserved for the App Service Environment.
     */
    @JsonProperty(value = "properties.ipsslAddressCount")
    private Integer ipsslAddressCount;

    /*
     * Edition of the metadata database for the App Service Environment, e.g.
     * "Standard".
     */
    @JsonProperty(value = "properties.databaseEdition", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseEdition;

    /*
     * Service objective of the metadata database for the App Service
     * Environment, e.g. "S0".
     */
    @JsonProperty(value = "properties.databaseServiceObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseServiceObjective;

    /*
     * Number of upgrade domains of the App Service Environment.
     */
    @JsonProperty(value = "properties.upgradeDomains", access = JsonProperty.Access.WRITE_ONLY)
    private Integer upgradeDomains;

    /*
     * Subscription of the App Service Environment.
     */
    @JsonProperty(value = "properties.subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * DNS suffix of the App Service Environment.
     */
    @JsonProperty(value = "properties.dnsSuffix")
    private String dnsSuffix;

    /*
     * Last deployment action on the App Service Environment.
     */
    @JsonProperty(value = "properties.lastAction", access = JsonProperty.Access.WRITE_ONLY)
    private String lastAction;

    /*
     * Result of the last deployment action on the App Service Environment.
     */
    @JsonProperty(value = "properties.lastActionResult", access = JsonProperty.Access.WRITE_ONLY)
    private String lastActionResult;

    /*
     * List of comma separated strings describing which VM sizes are allowed
     * for front-ends.
     */
    @JsonProperty(value = "properties.allowedMultiSizes", access = JsonProperty.Access.WRITE_ONLY)
    private String allowedMultiSizes;

    /*
     * List of comma separated strings describing which VM sizes are allowed
     * for workers.
     */
    @JsonProperty(value = "properties.allowedWorkerSizes", access = JsonProperty.Access.WRITE_ONLY)
    private String allowedWorkerSizes;

    /*
     * Maximum number of VMs in the App Service Environment.
     */
    @JsonProperty(value = "properties.maximumNumberOfMachines", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maximumNumberOfMachines;

    /*
     * Description of IP SSL mapping for the App Service Environment.
     */
    @JsonProperty(value = "properties.vipMappings", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualIPMapping> vipMappings;

    /*
     * Current total, used, and available worker capacities.
     */
    @JsonProperty(value = "properties.environmentCapacities", access = JsonProperty.Access.WRITE_ONLY)
    private List<StampCapacityInner> environmentCapacities;

    /*
     * Access control list for controlling traffic to the App Service
     * Environment.
     */
    @JsonProperty(value = "properties.networkAccessControlList")
    private List<NetworkAccessControlEntry> networkAccessControlList;

    /*
     * True/false indicating whether the App Service Environment is healthy.
     */
    @JsonProperty(value = "properties.environmentIsHealthy", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean environmentIsHealthy;

    /*
     * Detailed message about with results of the last check of the App Service
     * Environment.
     */
    @JsonProperty(value = "properties.environmentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String environmentStatus;

    /*
     * Resource group of the App Service Environment.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * Scale factor for front-ends.
     */
    @JsonProperty(value = "properties.frontEndScaleFactor")
    private Integer frontEndScaleFactor;

    /*
     * Default Scale Factor for FrontEnds.
     */
    @JsonProperty(value = "properties.defaultFrontEndScaleFactor", access = JsonProperty.Access.WRITE_ONLY)
    private Integer defaultFrontEndScaleFactor;

    /*
     * API Management Account associated with the App Service Environment.
     */
    @JsonProperty(value = "properties.apiManagementAccountId")
    private String apiManagementAccountId;

    /*
     * <code>true</code> if the App Service Environment is suspended;
     * otherwise, <code>false</code>. The environment can be suspended, e.g.
     * when the management endpoint is no longer available
     * (most likely because NSG blocked the incoming traffic).
     */
    @JsonProperty(value = "properties.suspended")
    private Boolean suspended;

    /*
     * True/false indicating whether the App Service Environment is suspended.
     * The environment can be suspended e.g. when the management endpoint is no
     * longer available
     * (most likely because NSG blocked the incoming traffic).
     */
    @JsonProperty(value = "properties.dynamicCacheEnabled")
    private Boolean dynamicCacheEnabled;

    /*
     * Custom settings for changing the behavior of the App Service
     * Environment.
     */
    @JsonProperty(value = "properties.clusterSettings")
    private List<NameValuePair> clusterSettings;

    /*
     * User added ip ranges to whitelist on ASE db
     */
    @JsonProperty(value = "properties.userWhitelistedIpRanges")
    private List<String> userWhitelistedIpRanges;

    /*
     * Flag that displays whether an ASE has linux workers or not
     */
    @JsonProperty(value = "properties.hasLinuxWorkers")
    private Boolean hasLinuxWorkers;

    /*
     * Key Vault ID for ILB App Service Environment default SSL certificate
     */
    @JsonProperty(value = "properties.sslCertKeyVaultId")
    private String sslCertKeyVaultId;

    /*
     * Key Vault Secret Name for ILB App Service Environment default SSL
     * certificate
     */
    @JsonProperty(value = "properties.sslCertKeyVaultSecretName")
    private String sslCertKeyVaultSecretName;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the namePropertiesName property: Name of the App Service Environment.
     *
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Set the namePropertiesName property: Name of the App Service Environment.
     *
     * @param namePropertiesName the namePropertiesName value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withNamePropertiesName(String namePropertiesName) {
        this.namePropertiesName = namePropertiesName;
        return this;
    }

    /**
     * Get the locationPropertiesLocation property: Location of the App Service Environment, e.g. "West US".
     *
     * @return the locationPropertiesLocation value.
     */
    public String locationPropertiesLocation() {
        return this.locationPropertiesLocation;
    }

    /**
     * Set the locationPropertiesLocation property: Location of the App Service Environment, e.g. "West US".
     *
     * @param locationPropertiesLocation the locationPropertiesLocation value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withLocationPropertiesLocation(String locationPropertiesLocation) {
        this.locationPropertiesLocation = locationPropertiesLocation;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the App Service Environment.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Current status of the App Service Environment.
     *
     * @return the status value.
     */
    public HostingEnvironmentStatus status() {
        return this.status;
    }

    /**
     * Get the vnetName property: Name of the Virtual Network for the App Service Environment.
     *
     * @return the vnetName value.
     */
    public String vnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName property: Name of the Virtual Network for the App Service Environment.
     *
     * @param vnetName the vnetName value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withVnetName(String vnetName) {
        this.vnetName = vnetName;
        return this;
    }

    /**
     * Get the vnetResourceGroupName property: Resource group of the Virtual Network.
     *
     * @return the vnetResourceGroupName value.
     */
    public String vnetResourceGroupName() {
        return this.vnetResourceGroupName;
    }

    /**
     * Set the vnetResourceGroupName property: Resource group of the Virtual Network.
     *
     * @param vnetResourceGroupName the vnetResourceGroupName value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withVnetResourceGroupName(String vnetResourceGroupName) {
        this.vnetResourceGroupName = vnetResourceGroupName;
        return this;
    }

    /**
     * Get the vnetSubnetName property: Subnet of the Virtual Network.
     *
     * @return the vnetSubnetName value.
     */
    public String vnetSubnetName() {
        return this.vnetSubnetName;
    }

    /**
     * Set the vnetSubnetName property: Subnet of the Virtual Network.
     *
     * @param vnetSubnetName the vnetSubnetName value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withVnetSubnetName(String vnetSubnetName) {
        this.vnetSubnetName = vnetSubnetName;
        return this;
    }

    /**
     * Get the virtualNetwork property: Description of the Virtual Network.
     *
     * @return the virtualNetwork value.
     */
    public VirtualNetworkProfile virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork property: Description of the Virtual Network.
     *
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withVirtualNetwork(VirtualNetworkProfile virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Get the internalLoadBalancingMode property: Specifies which endpoints to serve internally in the Virtual Network
     * for the App Service Environment.
     *
     * @return the internalLoadBalancingMode value.
     */
    public InternalLoadBalancingMode internalLoadBalancingMode() {
        return this.internalLoadBalancingMode;
    }

    /**
     * Set the internalLoadBalancingMode property: Specifies which endpoints to serve internally in the Virtual Network
     * for the App Service Environment.
     *
     * @param internalLoadBalancingMode the internalLoadBalancingMode value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withInternalLoadBalancingMode(
        InternalLoadBalancingMode internalLoadBalancingMode) {
        this.internalLoadBalancingMode = internalLoadBalancingMode;
        return this;
    }

    /**
     * Get the multiSize property: Front-end VM size, e.g. "Medium", "Large".
     *
     * @return the multiSize value.
     */
    public String multiSize() {
        return this.multiSize;
    }

    /**
     * Set the multiSize property: Front-end VM size, e.g. "Medium", "Large".
     *
     * @param multiSize the multiSize value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withMultiSize(String multiSize) {
        this.multiSize = multiSize;
        return this;
    }

    /**
     * Get the multiRoleCount property: Number of front-end instances.
     *
     * @return the multiRoleCount value.
     */
    public Integer multiRoleCount() {
        return this.multiRoleCount;
    }

    /**
     * Set the multiRoleCount property: Number of front-end instances.
     *
     * @param multiRoleCount the multiRoleCount value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withMultiRoleCount(Integer multiRoleCount) {
        this.multiRoleCount = multiRoleCount;
        return this;
    }

    /**
     * Get the workerPools property: Description of worker pools with worker size IDs, VM sizes, and number of workers
     * in each pool.
     *
     * @return the workerPools value.
     */
    public List<WorkerPool> workerPools() {
        return this.workerPools;
    }

    /**
     * Set the workerPools property: Description of worker pools with worker size IDs, VM sizes, and number of workers
     * in each pool.
     *
     * @param workerPools the workerPools value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withWorkerPools(List<WorkerPool> workerPools) {
        this.workerPools = workerPools;
        return this;
    }

    /**
     * Get the ipsslAddressCount property: Number of IP SSL addresses reserved for the App Service Environment.
     *
     * @return the ipsslAddressCount value.
     */
    public Integer ipsslAddressCount() {
        return this.ipsslAddressCount;
    }

    /**
     * Set the ipsslAddressCount property: Number of IP SSL addresses reserved for the App Service Environment.
     *
     * @param ipsslAddressCount the ipsslAddressCount value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withIpsslAddressCount(Integer ipsslAddressCount) {
        this.ipsslAddressCount = ipsslAddressCount;
        return this;
    }

    /**
     * Get the databaseEdition property: Edition of the metadata database for the App Service Environment, e.g.
     * "Standard".
     *
     * @return the databaseEdition value.
     */
    public String databaseEdition() {
        return this.databaseEdition;
    }

    /**
     * Get the databaseServiceObjective property: Service objective of the metadata database for the App Service
     * Environment, e.g. "S0".
     *
     * @return the databaseServiceObjective value.
     */
    public String databaseServiceObjective() {
        return this.databaseServiceObjective;
    }

    /**
     * Get the upgradeDomains property: Number of upgrade domains of the App Service Environment.
     *
     * @return the upgradeDomains value.
     */
    public Integer upgradeDomains() {
        return this.upgradeDomains;
    }

    /**
     * Get the subscriptionId property: Subscription of the App Service Environment.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the dnsSuffix property: DNS suffix of the App Service Environment.
     *
     * @return the dnsSuffix value.
     */
    public String dnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Set the dnsSuffix property: DNS suffix of the App Service Environment.
     *
     * @param dnsSuffix the dnsSuffix value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withDnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
        return this;
    }

    /**
     * Get the lastAction property: Last deployment action on the App Service Environment.
     *
     * @return the lastAction value.
     */
    public String lastAction() {
        return this.lastAction;
    }

    /**
     * Get the lastActionResult property: Result of the last deployment action on the App Service Environment.
     *
     * @return the lastActionResult value.
     */
    public String lastActionResult() {
        return this.lastActionResult;
    }

    /**
     * Get the allowedMultiSizes property: List of comma separated strings describing which VM sizes are allowed for
     * front-ends.
     *
     * @return the allowedMultiSizes value.
     */
    public String allowedMultiSizes() {
        return this.allowedMultiSizes;
    }

    /**
     * Get the allowedWorkerSizes property: List of comma separated strings describing which VM sizes are allowed for
     * workers.
     *
     * @return the allowedWorkerSizes value.
     */
    public String allowedWorkerSizes() {
        return this.allowedWorkerSizes;
    }

    /**
     * Get the maximumNumberOfMachines property: Maximum number of VMs in the App Service Environment.
     *
     * @return the maximumNumberOfMachines value.
     */
    public Integer maximumNumberOfMachines() {
        return this.maximumNumberOfMachines;
    }

    /**
     * Get the vipMappings property: Description of IP SSL mapping for the App Service Environment.
     *
     * @return the vipMappings value.
     */
    public List<VirtualIPMapping> vipMappings() {
        return this.vipMappings;
    }

    /**
     * Get the environmentCapacities property: Current total, used, and available worker capacities.
     *
     * @return the environmentCapacities value.
     */
    public List<StampCapacityInner> environmentCapacities() {
        return this.environmentCapacities;
    }

    /**
     * Get the networkAccessControlList property: Access control list for controlling traffic to the App Service
     * Environment.
     *
     * @return the networkAccessControlList value.
     */
    public List<NetworkAccessControlEntry> networkAccessControlList() {
        return this.networkAccessControlList;
    }

    /**
     * Set the networkAccessControlList property: Access control list for controlling traffic to the App Service
     * Environment.
     *
     * @param networkAccessControlList the networkAccessControlList value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withNetworkAccessControlList(
        List<NetworkAccessControlEntry> networkAccessControlList) {
        this.networkAccessControlList = networkAccessControlList;
        return this;
    }

    /**
     * Get the environmentIsHealthy property: True/false indicating whether the App Service Environment is healthy.
     *
     * @return the environmentIsHealthy value.
     */
    public Boolean environmentIsHealthy() {
        return this.environmentIsHealthy;
    }

    /**
     * Get the environmentStatus property: Detailed message about with results of the last check of the App Service
     * Environment.
     *
     * @return the environmentStatus value.
     */
    public String environmentStatus() {
        return this.environmentStatus;
    }

    /**
     * Get the resourceGroup property: Resource group of the App Service Environment.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the frontEndScaleFactor property: Scale factor for front-ends.
     *
     * @return the frontEndScaleFactor value.
     */
    public Integer frontEndScaleFactor() {
        return this.frontEndScaleFactor;
    }

    /**
     * Set the frontEndScaleFactor property: Scale factor for front-ends.
     *
     * @param frontEndScaleFactor the frontEndScaleFactor value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withFrontEndScaleFactor(Integer frontEndScaleFactor) {
        this.frontEndScaleFactor = frontEndScaleFactor;
        return this;
    }

    /**
     * Get the defaultFrontEndScaleFactor property: Default Scale Factor for FrontEnds.
     *
     * @return the defaultFrontEndScaleFactor value.
     */
    public Integer defaultFrontEndScaleFactor() {
        return this.defaultFrontEndScaleFactor;
    }

    /**
     * Get the apiManagementAccountId property: API Management Account associated with the App Service Environment.
     *
     * @return the apiManagementAccountId value.
     */
    public String apiManagementAccountId() {
        return this.apiManagementAccountId;
    }

    /**
     * Set the apiManagementAccountId property: API Management Account associated with the App Service Environment.
     *
     * @param apiManagementAccountId the apiManagementAccountId value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withApiManagementAccountId(String apiManagementAccountId) {
        this.apiManagementAccountId = apiManagementAccountId;
        return this;
    }

    /**
     * Get the suspended property: &lt;code&gt;true&lt;/code&gt; if the App Service Environment is suspended; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. The environment can be suspended, e.g. when the management endpoint is no longer
     * available (most likely because NSG blocked the incoming traffic).
     *
     * @return the suspended value.
     */
    public Boolean suspended() {
        return this.suspended;
    }

    /**
     * Set the suspended property: &lt;code&gt;true&lt;/code&gt; if the App Service Environment is suspended; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. The environment can be suspended, e.g. when the management endpoint is no longer
     * available (most likely because NSG blocked the incoming traffic).
     *
     * @param suspended the suspended value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withSuspended(Boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    /**
     * Get the dynamicCacheEnabled property: True/false indicating whether the App Service Environment is suspended. The
     * environment can be suspended e.g. when the management endpoint is no longer available (most likely because NSG
     * blocked the incoming traffic).
     *
     * @return the dynamicCacheEnabled value.
     */
    public Boolean dynamicCacheEnabled() {
        return this.dynamicCacheEnabled;
    }

    /**
     * Set the dynamicCacheEnabled property: True/false indicating whether the App Service Environment is suspended. The
     * environment can be suspended e.g. when the management endpoint is no longer available (most likely because NSG
     * blocked the incoming traffic).
     *
     * @param dynamicCacheEnabled the dynamicCacheEnabled value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withDynamicCacheEnabled(Boolean dynamicCacheEnabled) {
        this.dynamicCacheEnabled = dynamicCacheEnabled;
        return this;
    }

    /**
     * Get the clusterSettings property: Custom settings for changing the behavior of the App Service Environment.
     *
     * @return the clusterSettings value.
     */
    public List<NameValuePair> clusterSettings() {
        return this.clusterSettings;
    }

    /**
     * Set the clusterSettings property: Custom settings for changing the behavior of the App Service Environment.
     *
     * @param clusterSettings the clusterSettings value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withClusterSettings(List<NameValuePair> clusterSettings) {
        this.clusterSettings = clusterSettings;
        return this;
    }

    /**
     * Get the userWhitelistedIpRanges property: User added ip ranges to whitelist on ASE db.
     *
     * @return the userWhitelistedIpRanges value.
     */
    public List<String> userWhitelistedIpRanges() {
        return this.userWhitelistedIpRanges;
    }

    /**
     * Set the userWhitelistedIpRanges property: User added ip ranges to whitelist on ASE db.
     *
     * @param userWhitelistedIpRanges the userWhitelistedIpRanges value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withUserWhitelistedIpRanges(List<String> userWhitelistedIpRanges) {
        this.userWhitelistedIpRanges = userWhitelistedIpRanges;
        return this;
    }

    /**
     * Get the hasLinuxWorkers property: Flag that displays whether an ASE has linux workers or not.
     *
     * @return the hasLinuxWorkers value.
     */
    public Boolean hasLinuxWorkers() {
        return this.hasLinuxWorkers;
    }

    /**
     * Set the hasLinuxWorkers property: Flag that displays whether an ASE has linux workers or not.
     *
     * @param hasLinuxWorkers the hasLinuxWorkers value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withHasLinuxWorkers(Boolean hasLinuxWorkers) {
        this.hasLinuxWorkers = hasLinuxWorkers;
        return this;
    }

    /**
     * Get the sslCertKeyVaultId property: Key Vault ID for ILB App Service Environment default SSL certificate.
     *
     * @return the sslCertKeyVaultId value.
     */
    public String sslCertKeyVaultId() {
        return this.sslCertKeyVaultId;
    }

    /**
     * Set the sslCertKeyVaultId property: Key Vault ID for ILB App Service Environment default SSL certificate.
     *
     * @param sslCertKeyVaultId the sslCertKeyVaultId value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withSslCertKeyVaultId(String sslCertKeyVaultId) {
        this.sslCertKeyVaultId = sslCertKeyVaultId;
        return this;
    }

    /**
     * Get the sslCertKeyVaultSecretName property: Key Vault Secret Name for ILB App Service Environment default SSL
     * certificate.
     *
     * @return the sslCertKeyVaultSecretName value.
     */
    public String sslCertKeyVaultSecretName() {
        return this.sslCertKeyVaultSecretName;
    }

    /**
     * Set the sslCertKeyVaultSecretName property: Key Vault Secret Name for ILB App Service Environment default SSL
     * certificate.
     *
     * @param sslCertKeyVaultSecretName the sslCertKeyVaultSecretName value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withSslCertKeyVaultSecretName(String sslCertKeyVaultSecretName) {
        this.sslCertKeyVaultSecretName = sslCertKeyVaultSecretName;
        return this;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the AppServiceEnvironmentResourceInner object itself.
     */
    public AppServiceEnvironmentResourceInner withKind(String kind) {
        this.kind = kind;
        return this;
    }
}
