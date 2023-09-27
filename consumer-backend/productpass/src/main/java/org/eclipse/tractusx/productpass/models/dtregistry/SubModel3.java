/*********************************************************************************
 *
 * Catena-X - Product Passport Consumer Backend
 *
 * Copyright (c) 2022, 2023 BASF SE, BMW AG, Henkel AG & Co. KGaA
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the
 * License for the specific language govern in permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ********************************************************************************/

package org.eclipse.tractusx.productpass.models.dtregistry;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubModel3 {
    @JsonProperty("description")
    ArrayList<JsonNode> description;
    @JsonProperty("idShort")
    String idShort;

    @JsonProperty("supplementalSemanticId")
    Object supplementalSemanticId;

    @JsonProperty("id")
    String identification;
    @JsonProperty("semanticId")
    SemanticId semanticId;

    @JsonProperty("endpoints")
    ArrayList<EndPoint3> endpoints;

    public SubModel3(ArrayList<JsonNode> description, String idShort, String identification, SemanticId semanticId, ArrayList<EndPoint3> endpoints) {
        this.description = description;
        this.idShort = idShort;
        this.identification = identification;
        this.semanticId = semanticId;
        this.endpoints = endpoints;
    }

    public SubModel3() {
    }

    public SubModel3(ArrayList<JsonNode> description, String idShort, Object supplementalSemanticId, String identification, SemanticId semanticId, ArrayList<EndPoint3> endpoints) {
        this.description = description;
        this.idShort = idShort;
        this.supplementalSemanticId = supplementalSemanticId;
        this.identification = identification;
        this.semanticId = semanticId;
        this.endpoints = endpoints;
    }

    public ArrayList<JsonNode> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<JsonNode> description) {
        this.description = description;
    }

    public String getIdShort() {
        return idShort;
    }

    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public SemanticId getSemanticId() {
        return semanticId;
    }

    public void setSemanticId(SemanticId semanticId) {
        this.semanticId = semanticId;
    }

    public ArrayList<EndPoint3> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(ArrayList<EndPoint3> endpoints) {
        this.endpoints = endpoints;
    }

    public static class SemanticId {
        @JsonProperty("type")
        String type;
        @JsonProperty("keys")
        Map<String, String> keys;

        public SemanticId(String type, Map<String, String> keys) {
            this.type = type;
            this.keys = keys;
        }

        public SemanticId() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Map<String, String> getKeys() {
            return keys;
        }

        public void setKeys(Map<String, String> keys) {
            this.keys = keys;
        }
    }
    public Object getSupplementalSemanticId() {
        return supplementalSemanticId;
    }

    public void setSupplementalSemanticId(Object supplementalSemanticId) {
        this.supplementalSemanticId = supplementalSemanticId;
    }
}
