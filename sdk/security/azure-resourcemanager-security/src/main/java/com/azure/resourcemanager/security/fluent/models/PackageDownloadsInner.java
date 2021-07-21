// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.PackageDownloadInfo;
import com.azure.resourcemanager.security.models.PackageDownloadsCentralManager;
import com.azure.resourcemanager.security.models.PackageDownloadsSensor;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about package downloads. */
@Immutable
public final class PackageDownloadsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PackageDownloadsInner.class);

    /*
     * Contains all Sensor binary downloads
     */
    @JsonProperty(value = "sensor", access = JsonProperty.Access.WRITE_ONLY)
    private PackageDownloadsSensor sensor;

    /*
     * All downloads for Central Manager
     */
    @JsonProperty(value = "centralManager", access = JsonProperty.Access.WRITE_ONLY)
    private PackageDownloadsCentralManager centralManager;

    /*
     * All downloads for threat intelligence
     */
    @JsonProperty(value = "threatIntelligence", access = JsonProperty.Access.WRITE_ONLY)
    private List<PackageDownloadInfo> threatIntelligence;

    /*
     * SNMP Server file
     */
    @JsonProperty(value = "snmp", access = JsonProperty.Access.WRITE_ONLY)
    private List<PackageDownloadInfo> snmp;

    /*
     * Used for local configuration export
     */
    @JsonProperty(value = "wmiTool", access = JsonProperty.Access.WRITE_ONLY)
    private List<PackageDownloadInfo> wmiTool;

    /*
     * Authorized devices import template
     */
    @JsonProperty(value = "authorizedDevicesImportTemplate", access = JsonProperty.Access.WRITE_ONLY)
    private List<PackageDownloadInfo> authorizedDevicesImportTemplate;

    /*
     * Authorized devices import template
     */
    @JsonProperty(value = "deviceInformationUpdateImportTemplate", access = JsonProperty.Access.WRITE_ONLY)
    private List<PackageDownloadInfo> deviceInformationUpdateImportTemplate;

    /**
     * Get the sensor property: Contains all Sensor binary downloads.
     *
     * @return the sensor value.
     */
    public PackageDownloadsSensor sensor() {
        return this.sensor;
    }

    /**
     * Get the centralManager property: All downloads for Central Manager.
     *
     * @return the centralManager value.
     */
    public PackageDownloadsCentralManager centralManager() {
        return this.centralManager;
    }

    /**
     * Get the threatIntelligence property: All downloads for threat intelligence.
     *
     * @return the threatIntelligence value.
     */
    public List<PackageDownloadInfo> threatIntelligence() {
        return this.threatIntelligence;
    }

    /**
     * Get the snmp property: SNMP Server file.
     *
     * @return the snmp value.
     */
    public List<PackageDownloadInfo> snmp() {
        return this.snmp;
    }

    /**
     * Get the wmiTool property: Used for local configuration export.
     *
     * @return the wmiTool value.
     */
    public List<PackageDownloadInfo> wmiTool() {
        return this.wmiTool;
    }

    /**
     * Get the authorizedDevicesImportTemplate property: Authorized devices import template.
     *
     * @return the authorizedDevicesImportTemplate value.
     */
    public List<PackageDownloadInfo> authorizedDevicesImportTemplate() {
        return this.authorizedDevicesImportTemplate;
    }

    /**
     * Get the deviceInformationUpdateImportTemplate property: Authorized devices import template.
     *
     * @return the deviceInformationUpdateImportTemplate value.
     */
    public List<PackageDownloadInfo> deviceInformationUpdateImportTemplate() {
        return this.deviceInformationUpdateImportTemplate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sensor() != null) {
            sensor().validate();
        }
        if (centralManager() != null) {
            centralManager().validate();
        }
        if (threatIntelligence() != null) {
            threatIntelligence().forEach(e -> e.validate());
        }
        if (snmp() != null) {
            snmp().forEach(e -> e.validate());
        }
        if (wmiTool() != null) {
            wmiTool().forEach(e -> e.validate());
        }
        if (authorizedDevicesImportTemplate() != null) {
            authorizedDevicesImportTemplate().forEach(e -> e.validate());
        }
        if (deviceInformationUpdateImportTemplate() != null) {
            deviceInformationUpdateImportTemplate().forEach(e -> e.validate());
        }
    }
}
