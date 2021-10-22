// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.models.Backup;
import com.azure.resourcemanager.mysqlflexibleserver.models.CreateMode;
import com.azure.resourcemanager.mysqlflexibleserver.models.HighAvailability;
import com.azure.resourcemanager.mysqlflexibleserver.models.MaintenanceWindow;
import com.azure.resourcemanager.mysqlflexibleserver.models.Network;
import com.azure.resourcemanager.mysqlflexibleserver.models.ReplicationRole;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerState;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerVersion;
import com.azure.resourcemanager.mysqlflexibleserver.models.Storage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of a server. */
@Fluent
public final class ServerProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerProperties.class);

    /*
     * The administrator's login name of a server. Can only be specified when
     * the server is being created (and is required for creation).
     */
    @JsonProperty(value = "administratorLogin")
    private String administratorLogin;

    /*
     * The password of the administrator login (required for server creation).
     */
    @JsonProperty(value = "administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * Server version.
     */
    @JsonProperty(value = "version")
    private ServerVersion version;

    /*
     * availability Zone information of the server.
     */
    @JsonProperty(value = "availabilityZone")
    private String availabilityZone;

    /*
     * The mode to create a new MySQL server.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /*
     * The source MySQL server id.
     */
    @JsonProperty(value = "sourceServerResourceId")
    private String sourceServerResourceId;

    /*
     * Restore point creation time (ISO8601 format), specifying the time to
     * restore from.
     */
    @JsonProperty(value = "restorePointInTime")
    private OffsetDateTime restorePointInTime;

    /*
     * The replication role.
     */
    @JsonProperty(value = "replicationRole")
    private ReplicationRole replicationRole;

    /*
     * The maximum number of replicas that a primary server can have.
     */
    @JsonProperty(value = "replicaCapacity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer replicaCapacity;

    /*
     * The state of a server.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private ServerState state;

    /*
     * The fully qualified domain name of a server.
     */
    @JsonProperty(value = "fullyQualifiedDomainName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullyQualifiedDomainName;

    /*
     * Storage related properties of a server.
     */
    @JsonProperty(value = "storage")
    private Storage storage;

    /*
     * Backup related properties of a server.
     */
    @JsonProperty(value = "backup")
    private Backup backup;

    /*
     * High availability related properties of a server.
     */
    @JsonProperty(value = "highAvailability")
    private HighAvailability highAvailability;

    /*
     * Network related properties of a server.
     */
    @JsonProperty(value = "network")
    private Network network;

    /*
     * Maintenance window of a server.
     */
    @JsonProperty(value = "maintenanceWindow")
    private MaintenanceWindow maintenanceWindow;

    /**
     * Get the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The password of the administrator login (required for server
     * creation).
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login (required for server
     * creation).
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the version property: Server version.
     *
     * @return the version value.
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version property: Server version.
     *
     * @param version the version value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get the availabilityZone property: availability Zone information of the server.
     *
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Set the availabilityZone property: availability Zone information of the server.
     *
     * @param availabilityZone the availabilityZone value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get the createMode property: The mode to create a new MySQL server.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The mode to create a new MySQL server.
     *
     * @param createMode the createMode value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the sourceServerResourceId property: The source MySQL server id.
     *
     * @return the sourceServerResourceId value.
     */
    public String sourceServerResourceId() {
        return this.sourceServerResourceId;
    }

    /**
     * Set the sourceServerResourceId property: The source MySQL server id.
     *
     * @param sourceServerResourceId the sourceServerResourceId value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withSourceServerResourceId(String sourceServerResourceId) {
        this.sourceServerResourceId = sourceServerResourceId;
        return this;
    }

    /**
     * Get the restorePointInTime property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from.
     *
     * @return the restorePointInTime value.
     */
    public OffsetDateTime restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set the restorePointInTime property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from.
     *
     * @param restorePointInTime the restorePointInTime value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withRestorePointInTime(OffsetDateTime restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

    /**
     * Get the replicationRole property: The replication role.
     *
     * @return the replicationRole value.
     */
    public ReplicationRole replicationRole() {
        return this.replicationRole;
    }

    /**
     * Set the replicationRole property: The replication role.
     *
     * @param replicationRole the replicationRole value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withReplicationRole(ReplicationRole replicationRole) {
        this.replicationRole = replicationRole;
        return this;
    }

    /**
     * Get the replicaCapacity property: The maximum number of replicas that a primary server can have.
     *
     * @return the replicaCapacity value.
     */
    public Integer replicaCapacity() {
        return this.replicaCapacity;
    }

    /**
     * Get the state property: The state of a server.
     *
     * @return the state value.
     */
    public ServerState state() {
        return this.state;
    }

    /**
     * Get the fullyQualifiedDomainName property: The fully qualified domain name of a server.
     *
     * @return the fullyQualifiedDomainName value.
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Get the storage property: Storage related properties of a server.
     *
     * @return the storage value.
     */
    public Storage storage() {
        return this.storage;
    }

    /**
     * Set the storage property: Storage related properties of a server.
     *
     * @param storage the storage value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get the backup property: Backup related properties of a server.
     *
     * @return the backup value.
     */
    public Backup backup() {
        return this.backup;
    }

    /**
     * Set the backup property: Backup related properties of a server.
     *
     * @param backup the backup value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withBackup(Backup backup) {
        this.backup = backup;
        return this;
    }

    /**
     * Get the highAvailability property: High availability related properties of a server.
     *
     * @return the highAvailability value.
     */
    public HighAvailability highAvailability() {
        return this.highAvailability;
    }

    /**
     * Set the highAvailability property: High availability related properties of a server.
     *
     * @param highAvailability the highAvailability value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withHighAvailability(HighAvailability highAvailability) {
        this.highAvailability = highAvailability;
        return this;
    }

    /**
     * Get the network property: Network related properties of a server.
     *
     * @return the network value.
     */
    public Network network() {
        return this.network;
    }

    /**
     * Set the network property: Network related properties of a server.
     *
     * @param network the network value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withNetwork(Network network) {
        this.network = network;
        return this;
    }

    /**
     * Get the maintenanceWindow property: Maintenance window of a server.
     *
     * @return the maintenanceWindow value.
     */
    public MaintenanceWindow maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: Maintenance window of a server.
     *
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storage() != null) {
            storage().validate();
        }
        if (backup() != null) {
            backup().validate();
        }
        if (highAvailability() != null) {
            highAvailability().validate();
        }
        if (network() != null) {
            network().validate();
        }
        if (maintenanceWindow() != null) {
            maintenanceWindow().validate();
        }
    }
}
