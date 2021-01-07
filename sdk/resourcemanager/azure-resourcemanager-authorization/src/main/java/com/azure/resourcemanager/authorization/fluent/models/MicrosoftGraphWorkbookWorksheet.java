// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** workbookWorksheet. */
@Fluent
public final class MicrosoftGraphWorkbookWorksheet extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphWorkbookWorksheet.class);

    /*
     * The display name of the worksheet.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The zero-based position of the worksheet within the workbook.
     */
    @JsonProperty(value = "position")
    private Integer position;

    /*
     * The Visibility of the worksheet. The possible values are: Visible,
     * Hidden, VeryHidden.
     */
    @JsonProperty(value = "visibility")
    private String visibility;

    /*
     * Returns collection of charts that are part of the worksheet. Read-only.
     */
    @JsonProperty(value = "charts")
    private List<MicrosoftGraphWorkbookChart> charts;

    /*
     * Returns collection of names that are associated with the worksheet.
     * Read-only.
     */
    @JsonProperty(value = "names")
    private List<MicrosoftGraphWorkbookNamedItem> names;

    /*
     * Collection of PivotTables that are part of the worksheet.
     */
    @JsonProperty(value = "pivotTables")
    private List<MicrosoftGraphWorkbookPivotTable> pivotTables;

    /*
     * workbookWorksheetProtection
     */
    @JsonProperty(value = "protection")
    private MicrosoftGraphWorkbookWorksheetProtection protection;

    /*
     * Collection of tables that are part of the worksheet. Read-only.
     */
    @JsonProperty(value = "tables")
    private List<MicrosoftGraphWorkbookTable> tables;

    /*
     * workbookWorksheet
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the name property: The display name of the worksheet.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The display name of the worksheet.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphWorkbookWorksheet object itself.
     */
    public MicrosoftGraphWorkbookWorksheet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the position property: The zero-based position of the worksheet within the workbook.
     *
     * @return the position value.
     */
    public Integer position() {
        return this.position;
    }

    /**
     * Set the position property: The zero-based position of the worksheet within the workbook.
     *
     * @param position the position value to set.
     * @return the MicrosoftGraphWorkbookWorksheet object itself.
     */
    public MicrosoftGraphWorkbookWorksheet withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * Get the visibility property: The Visibility of the worksheet. The possible values are: Visible, Hidden,
     * VeryHidden.
     *
     * @return the visibility value.
     */
    public String visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: The Visibility of the worksheet. The possible values are: Visible, Hidden,
     * VeryHidden.
     *
     * @param visibility the visibility value to set.
     * @return the MicrosoftGraphWorkbookWorksheet object itself.
     */
    public MicrosoftGraphWorkbookWorksheet withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the charts property: Returns collection of charts that are part of the worksheet. Read-only.
     *
     * @return the charts value.
     */
    public List<MicrosoftGraphWorkbookChart> charts() {
        return this.charts;
    }

    /**
     * Set the charts property: Returns collection of charts that are part of the worksheet. Read-only.
     *
     * @param charts the charts value to set.
     * @return the MicrosoftGraphWorkbookWorksheet object itself.
     */
    public MicrosoftGraphWorkbookWorksheet withCharts(List<MicrosoftGraphWorkbookChart> charts) {
        this.charts = charts;
        return this;
    }

    /**
     * Get the names property: Returns collection of names that are associated with the worksheet. Read-only.
     *
     * @return the names value.
     */
    public List<MicrosoftGraphWorkbookNamedItem> names() {
        return this.names;
    }

    /**
     * Set the names property: Returns collection of names that are associated with the worksheet. Read-only.
     *
     * @param names the names value to set.
     * @return the MicrosoftGraphWorkbookWorksheet object itself.
     */
    public MicrosoftGraphWorkbookWorksheet withNames(List<MicrosoftGraphWorkbookNamedItem> names) {
        this.names = names;
        return this;
    }

    /**
     * Get the pivotTables property: Collection of PivotTables that are part of the worksheet.
     *
     * @return the pivotTables value.
     */
    public List<MicrosoftGraphWorkbookPivotTable> pivotTables() {
        return this.pivotTables;
    }

    /**
     * Set the pivotTables property: Collection of PivotTables that are part of the worksheet.
     *
     * @param pivotTables the pivotTables value to set.
     * @return the MicrosoftGraphWorkbookWorksheet object itself.
     */
    public MicrosoftGraphWorkbookWorksheet withPivotTables(List<MicrosoftGraphWorkbookPivotTable> pivotTables) {
        this.pivotTables = pivotTables;
        return this;
    }

    /**
     * Get the protection property: workbookWorksheetProtection.
     *
     * @return the protection value.
     */
    public MicrosoftGraphWorkbookWorksheetProtection protection() {
        return this.protection;
    }

    /**
     * Set the protection property: workbookWorksheetProtection.
     *
     * @param protection the protection value to set.
     * @return the MicrosoftGraphWorkbookWorksheet object itself.
     */
    public MicrosoftGraphWorkbookWorksheet withProtection(MicrosoftGraphWorkbookWorksheetProtection protection) {
        this.protection = protection;
        return this;
    }

    /**
     * Get the tables property: Collection of tables that are part of the worksheet. Read-only.
     *
     * @return the tables value.
     */
    public List<MicrosoftGraphWorkbookTable> tables() {
        return this.tables;
    }

    /**
     * Set the tables property: Collection of tables that are part of the worksheet. Read-only.
     *
     * @param tables the tables value to set.
     * @return the MicrosoftGraphWorkbookWorksheet object itself.
     */
    public MicrosoftGraphWorkbookWorksheet withTables(List<MicrosoftGraphWorkbookTable> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookWorksheet.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookWorksheet.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookWorksheet object itself.
     */
    public MicrosoftGraphWorkbookWorksheet withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphWorkbookWorksheet withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (charts() != null) {
            charts().forEach(e -> e.validate());
        }
        if (names() != null) {
            names().forEach(e -> e.validate());
        }
        if (pivotTables() != null) {
            pivotTables().forEach(e -> e.validate());
        }
        if (protection() != null) {
            protection().validate();
        }
        if (tables() != null) {
            tables().forEach(e -> e.validate());
        }
    }
}