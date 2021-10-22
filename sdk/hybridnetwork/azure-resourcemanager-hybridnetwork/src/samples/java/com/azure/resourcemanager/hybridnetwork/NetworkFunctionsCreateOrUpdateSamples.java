// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork;

import com.azure.core.management.SubResource;
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.hybridnetwork.models.IpAllocationMethod;
import com.azure.resourcemanager.hybridnetwork.models.IpVersion;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionUserConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.NetworkInterface;
import com.azure.resourcemanager.hybridnetwork.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.VMSwitchType;
import java.io.IOException;
import java.util.Arrays;

/** Samples for NetworkFunctions CreateOrUpdate. */
public final class NetworkFunctionsCreateOrUpdateSamples {
    /**
     * Sample code: Create network function resource.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void createNetworkFunctionResource(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) throws IOException {
        manager
            .networkFunctions()
            .define("testNf")
            .withRegion("eastus")
            .withExistingResourceGroup("rg")
            .withDevice(
                new SubResource()
                    .withId(
                        "/subscriptions/subid/resourcegroups/rg/providers/Microsoft.HybridNetwork/devices/testDevice"))
            .withSkuName("testSku")
            .withVendorName("testVendor")
            .withManagedApplicationParameters(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
            .withNetworkFunctionUserConfigurations(
                Arrays
                    .asList(
                        new NetworkFunctionUserConfiguration()
                            .withRoleName("testRole")
                            .withUserDataParameters(
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                            .withNetworkInterfaces(
                                Arrays
                                    .asList(
                                        new NetworkInterface()
                                            .withNetworkInterfaceName("nic1")
                                            .withMacAddress("")
                                            .withIpConfigurations(
                                                Arrays
                                                    .asList(
                                                        new NetworkInterfaceIpConfiguration()
                                                            .withIpAllocationMethod(IpAllocationMethod.DYNAMIC)
                                                            .withIpAddress("")
                                                            .withSubnet("")
                                                            .withGateway("")
                                                            .withIpVersion(IpVersion.IPV4)))
                                            .withVmSwitchType(VMSwitchType.MANAGEMENT),
                                        new NetworkInterface()
                                            .withNetworkInterfaceName("nic2")
                                            .withMacAddress("DC-97-F8-79-16-7D")
                                            .withIpConfigurations(
                                                Arrays
                                                    .asList(
                                                        new NetworkInterfaceIpConfiguration()
                                                            .withIpAllocationMethod(IpAllocationMethod.DYNAMIC)
                                                            .withIpAddress("")
                                                            .withSubnet("")
                                                            .withGateway("")
                                                            .withIpVersion(IpVersion.IPV4)))
                                            .withVmSwitchType(VMSwitchType.WAN)))))
            .create();
    }
}
