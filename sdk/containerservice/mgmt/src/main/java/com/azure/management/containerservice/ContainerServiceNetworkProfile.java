// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerServiceNetworkProfile model. */
@Fluent
public final class ContainerServiceNetworkProfile {
    /*
     * Network plugin used for building Kubernetes network.
     */
    @JsonProperty(value = "networkPlugin")
    private NetworkPlugin networkPlugin;

    /*
     * Network policy used for building Kubernetes network.
     */
    @JsonProperty(value = "networkPolicy")
    private NetworkPolicy networkPolicy;

    /*
     * A CIDR notation IP range from which to assign pod IPs when kubenet is
     * used.
     */
    @JsonProperty(value = "podCidr")
    private String podCidr;

    /*
     * A CIDR notation IP range from which to assign service cluster IPs. It
     * must not overlap with any Subnet IP ranges.
     */
    @JsonProperty(value = "serviceCidr")
    private String serviceCidr;

    /*
     * An IP address assigned to the Kubernetes DNS service. It must be within
     * the Kubernetes service address range specified in serviceCidr.
     */
    @JsonProperty(value = "dnsServiceIP")
    private String dnsServiceIP;

    /*
     * A CIDR notation IP range assigned to the Docker bridge network. It must
     * not overlap with any Subnet IP ranges or the Kubernetes service address
     * range.
     */
    @JsonProperty(value = "dockerBridgeCidr")
    private String dockerBridgeCidr;

    /*
     * The load balancer sku for the managed cluster.
     */
    @JsonProperty(value = "loadBalancerSku")
    private LoadBalancerSku loadBalancerSku;

    /*
     * Profile of the cluster load balancer.
     */
    @JsonProperty(value = "loadBalancerProfile")
    private ManagedClusterLoadBalancerProfile loadBalancerProfile;

    /**
     * Get the networkPlugin property: Network plugin used for building Kubernetes network.
     *
     * @return the networkPlugin value.
     */
    public NetworkPlugin networkPlugin() {
        return this.networkPlugin;
    }

    /**
     * Set the networkPlugin property: Network plugin used for building Kubernetes network.
     *
     * @param networkPlugin the networkPlugin value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNetworkPlugin(NetworkPlugin networkPlugin) {
        this.networkPlugin = networkPlugin;
        return this;
    }

    /**
     * Get the networkPolicy property: Network policy used for building Kubernetes network.
     *
     * @return the networkPolicy value.
     */
    public NetworkPolicy networkPolicy() {
        return this.networkPolicy;
    }

    /**
     * Set the networkPolicy property: Network policy used for building Kubernetes network.
     *
     * @param networkPolicy the networkPolicy value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNetworkPolicy(NetworkPolicy networkPolicy) {
        this.networkPolicy = networkPolicy;
        return this;
    }

    /**
     * Get the podCidr property: A CIDR notation IP range from which to assign pod IPs when kubenet is used.
     *
     * @return the podCidr value.
     */
    public String podCidr() {
        return this.podCidr;
    }

    /**
     * Set the podCidr property: A CIDR notation IP range from which to assign pod IPs when kubenet is used.
     *
     * @param podCidr the podCidr value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withPodCidr(String podCidr) {
        this.podCidr = podCidr;
        return this;
    }

    /**
     * Get the serviceCidr property: A CIDR notation IP range from which to assign service cluster IPs. It must not
     * overlap with any Subnet IP ranges.
     *
     * @return the serviceCidr value.
     */
    public String serviceCidr() {
        return this.serviceCidr;
    }

    /**
     * Set the serviceCidr property: A CIDR notation IP range from which to assign service cluster IPs. It must not
     * overlap with any Subnet IP ranges.
     *
     * @param serviceCidr the serviceCidr value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }

    /**
     * Get the dnsServiceIP property: An IP address assigned to the Kubernetes DNS service. It must be within the
     * Kubernetes service address range specified in serviceCidr.
     *
     * @return the dnsServiceIP value.
     */
    public String dnsServiceIP() {
        return this.dnsServiceIP;
    }

    /**
     * Set the dnsServiceIP property: An IP address assigned to the Kubernetes DNS service. It must be within the
     * Kubernetes service address range specified in serviceCidr.
     *
     * @param dnsServiceIP the dnsServiceIP value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withDnsServiceIP(String dnsServiceIP) {
        this.dnsServiceIP = dnsServiceIP;
        return this;
    }

    /**
     * Get the dockerBridgeCidr property: A CIDR notation IP range assigned to the Docker bridge network. It must not
     * overlap with any Subnet IP ranges or the Kubernetes service address range.
     *
     * @return the dockerBridgeCidr value.
     */
    public String dockerBridgeCidr() {
        return this.dockerBridgeCidr;
    }

    /**
     * Set the dockerBridgeCidr property: A CIDR notation IP range assigned to the Docker bridge network. It must not
     * overlap with any Subnet IP ranges or the Kubernetes service address range.
     *
     * @param dockerBridgeCidr the dockerBridgeCidr value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withDockerBridgeCidr(String dockerBridgeCidr) {
        this.dockerBridgeCidr = dockerBridgeCidr;
        return this;
    }

    /**
     * Get the loadBalancerSku property: The load balancer sku for the managed cluster.
     *
     * @return the loadBalancerSku value.
     */
    public LoadBalancerSku loadBalancerSku() {
        return this.loadBalancerSku;
    }

    /**
     * Set the loadBalancerSku property: The load balancer sku for the managed cluster.
     *
     * @param loadBalancerSku the loadBalancerSku value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withLoadBalancerSku(LoadBalancerSku loadBalancerSku) {
        this.loadBalancerSku = loadBalancerSku;
        return this;
    }

    /**
     * Get the loadBalancerProfile property: Profile of the cluster load balancer.
     *
     * @return the loadBalancerProfile value.
     */
    public ManagedClusterLoadBalancerProfile loadBalancerProfile() {
        return this.loadBalancerProfile;
    }

    /**
     * Set the loadBalancerProfile property: Profile of the cluster load balancer.
     *
     * @param loadBalancerProfile the loadBalancerProfile value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withLoadBalancerProfile(
        ManagedClusterLoadBalancerProfile loadBalancerProfile) {
        this.loadBalancerProfile = loadBalancerProfile;
        return this;
    }
}
