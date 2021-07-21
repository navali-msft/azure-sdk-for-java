// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.SensorStatus;
import com.azure.resourcemanager.security.models.SensorType;
import com.azure.resourcemanager.security.models.TiStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IoT sensor model. */
@JsonFlatten
@Fluent
public class IotSensorsModelInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotSensorsModelInner.class);

    /*
     * Last connectivity time of the IoT sensor
     */
    @JsonProperty(value = "properties.connectivityTime", access = JsonProperty.Access.WRITE_ONLY)
    private String connectivityTime;

    /*
     * Creation time of the IoT sensor
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private String creationTime;

    /*
     * Dynamic mode status of the IoT sensor
     */
    @JsonProperty(value = "properties.dynamicLearning", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean dynamicLearning;

    /*
     * Learning mode status of the IoT sensor
     */
    @JsonProperty(value = "properties.learningMode", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean learningMode;

    /*
     * Status of the IoT sensor
     */
    @JsonProperty(value = "properties.sensorStatus", access = JsonProperty.Access.WRITE_ONLY)
    private SensorStatus sensorStatus;

    /*
     * Version of the IoT sensor
     */
    @JsonProperty(value = "properties.sensorVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sensorVersion;

    /*
     * TI Automatic mode status of the IoT sensor
     */
    @JsonProperty(value = "properties.tiAutomaticUpdates")
    private Boolean tiAutomaticUpdates;

    /*
     * TI Status of the IoT sensor
     */
    @JsonProperty(value = "properties.tiStatus", access = JsonProperty.Access.WRITE_ONLY)
    private TiStatus tiStatus;

    /*
     * TI Version of the IoT sensor
     */
    @JsonProperty(value = "properties.tiVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String tiVersion;

    /*
     * Zone of the IoT sensor
     */
    @JsonProperty(value = "properties.zone")
    private String zone;

    /*
     * Type of sensor
     */
    @JsonProperty(value = "properties.sensorType")
    private SensorType sensorType;

    /**
     * Get the connectivityTime property: Last connectivity time of the IoT sensor.
     *
     * @return the connectivityTime value.
     */
    public String connectivityTime() {
        return this.connectivityTime;
    }

    /**
     * Get the creationTime property: Creation time of the IoT sensor.
     *
     * @return the creationTime value.
     */
    public String creationTime() {
        return this.creationTime;
    }

    /**
     * Get the dynamicLearning property: Dynamic mode status of the IoT sensor.
     *
     * @return the dynamicLearning value.
     */
    public Boolean dynamicLearning() {
        return this.dynamicLearning;
    }

    /**
     * Get the learningMode property: Learning mode status of the IoT sensor.
     *
     * @return the learningMode value.
     */
    public Boolean learningMode() {
        return this.learningMode;
    }

    /**
     * Get the sensorStatus property: Status of the IoT sensor.
     *
     * @return the sensorStatus value.
     */
    public SensorStatus sensorStatus() {
        return this.sensorStatus;
    }

    /**
     * Get the sensorVersion property: Version of the IoT sensor.
     *
     * @return the sensorVersion value.
     */
    public String sensorVersion() {
        return this.sensorVersion;
    }

    /**
     * Get the tiAutomaticUpdates property: TI Automatic mode status of the IoT sensor.
     *
     * @return the tiAutomaticUpdates value.
     */
    public Boolean tiAutomaticUpdates() {
        return this.tiAutomaticUpdates;
    }

    /**
     * Set the tiAutomaticUpdates property: TI Automatic mode status of the IoT sensor.
     *
     * @param tiAutomaticUpdates the tiAutomaticUpdates value to set.
     * @return the IotSensorsModelInner object itself.
     */
    public IotSensorsModelInner withTiAutomaticUpdates(Boolean tiAutomaticUpdates) {
        this.tiAutomaticUpdates = tiAutomaticUpdates;
        return this;
    }

    /**
     * Get the tiStatus property: TI Status of the IoT sensor.
     *
     * @return the tiStatus value.
     */
    public TiStatus tiStatus() {
        return this.tiStatus;
    }

    /**
     * Get the tiVersion property: TI Version of the IoT sensor.
     *
     * @return the tiVersion value.
     */
    public String tiVersion() {
        return this.tiVersion;
    }

    /**
     * Get the zone property: Zone of the IoT sensor.
     *
     * @return the zone value.
     */
    public String zone() {
        return this.zone;
    }

    /**
     * Set the zone property: Zone of the IoT sensor.
     *
     * @param zone the zone value to set.
     * @return the IotSensorsModelInner object itself.
     */
    public IotSensorsModelInner withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * Get the sensorType property: Type of sensor.
     *
     * @return the sensorType value.
     */
    public SensorType sensorType() {
        return this.sensorType;
    }

    /**
     * Set the sensorType property: Type of sensor.
     *
     * @param sensorType the sensorType value to set.
     * @return the IotSensorsModelInner object itself.
     */
    public IotSensorsModelInner withSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
