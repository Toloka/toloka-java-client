/*
 * Copyright 2021 YANDEX LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ai.toloka.client.v1.metadata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserMetadata {
    private String id;

    private String country;

    private List<String> languages;

    private UserMetadataAttributes attributes;

    @JsonProperty("adult_allowed")
    private Boolean adultAllowed;

    @JsonCreator
    public UserMetadata(@JsonProperty("country") String country,
                        @JsonProperty("languages") List<String> languages,
                        @JsonProperty("attributes") UserMetadataAttributes attributes,
                        @JsonProperty("adult_allowed") Boolean adultAllowed) {
        this.country = country;
        this.languages = languages;
        this.attributes = attributes;
        this.adultAllowed = adultAllowed;

    }

    public String getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Boolean getAdultAllowed() {
        return adultAllowed;
    }

    public void setAdultAllowed(Boolean adultAllowed) {
        this.adultAllowed = adultAllowed;
    }

    public UserMetadataAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(UserMetadataAttributes attributes) {
        this.attributes = attributes;
    }
}
