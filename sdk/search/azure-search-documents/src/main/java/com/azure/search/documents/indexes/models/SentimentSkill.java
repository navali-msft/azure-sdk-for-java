// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

/**
 * Text analytics positive-negative sentiment analysis, scored as a floating point value in a range of zero to 1.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "@odata.type",
    visible = true)
@JsonTypeName("#Microsoft.Skills.Text.SentimentSkill")
@Fluent
public final class SentimentSkill extends SearchIndexerSkill {
    /*
     * A value indicating which language code to use. Default is en.
     */
    @JsonProperty(value = "defaultLanguageCode")
    private SentimentSkillLanguage defaultLanguageCode;

    /*
     * If set to true, the skill output will include information from Text
     * Analytics for opinion mining, namely targets (nouns or verbs) and their
     * associated assessment (adjective) in the text. Default is false.
     */
    @JsonProperty(value = "includeOpinionMining")
    private Boolean includeOpinionMining;

    /*
     * The version of the model to use when calling the Text Analytics service.
     * It will default to the latest available when not specified. We recommend
     * you do not specify this value unless absolutely necessary.
     */
    @JsonProperty(value = "modelVersion")
    private String modelVersion;

    @JsonTypeId
    @JsonProperty(value = "@odata.type", access = JsonProperty.Access.WRITE_ONLY)
    private SentimentSkillVersion version;

    /**
     * Creates an instance of SentimentSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    @JsonCreator
    public SentimentSkill(
        @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
        @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs) {
        this(inputs, outputs, SentimentSkillVersion.V1);
    }

    /**
     * Creates an instance of SentimentSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     * @param version the SentimentSkillVersion value to set.
     */
    public SentimentSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs,
        SentimentSkillVersion version) {
        super(inputs, outputs);
        this.version = version;
    }

    /**
     * Gets the version of the {@link SentimentSkill}.
     *
     * @return The version of the {@link SentimentSkill}.
     */
    public SentimentSkillVersion getSkillVersion() {
        return this.version;
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public SentimentSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the SentimentSkill object itself.
     */
    public SentimentSkill setDefaultLanguageCode(SentimentSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the includeOpinionMining property: If set to true, the skill output will include information from Text
     * Analytics for opinion mining, namely targets (nouns or verbs) and their associated assessment (adjective) in the
     * text. Default is false.
     *
     * @return the includeOpinionMining value.
     */
    public Boolean isIncludeOpinionMining() {
        return this.includeOpinionMining;
    }

    /**
     * Set the includeOpinionMining property: If set to true, the skill output will include information from Text
     * Analytics for opinion mining, namely targets (nouns or verbs) and their associated assessment (adjective) in the
     * text. Default is false.
     *
     * @param includeOpinionMining the includeOpinionMining value to set.
     * @return the SentimentSkill object itself.
     */
    public SentimentSkill setIncludeOpinionMining(Boolean includeOpinionMining) {
        this.includeOpinionMining = includeOpinionMining;
        return this;
    }

    /**
     * Get the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @param modelVersion the modelVersion value to set.
     * @return the SentimentSkill object itself.
     */
    public SentimentSkill setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
}
