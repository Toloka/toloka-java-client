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

package ai.toloka.client.v1.task;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskPatch {

    private Integer overlap;

    @JsonProperty("baseline_solutions")
    private List<BaselineSolution> baselineSolutions;

    @JsonProperty("known_solutions")
    private List<KnownSolution> knownSolutions;

    @JsonProperty("message_on_unknown_solution")
    private String messageOnUnknownSolution;

    public Integer getOverlap() {
        return overlap;
    }

    public void setOverlap(Integer overlap) {
        this.overlap = overlap;
    }

    public List<BaselineSolution> getBaselineSolutions() {
        return baselineSolutions;
    }

    public void setBaselineSolutions(List<BaselineSolution> baselineSolutions) {
        this.baselineSolutions = baselineSolutions;
    }

    public String getMessageOnUnknownSolution() {
        return messageOnUnknownSolution;
    }

    public void setMessageOnUnknownSolution(String messageOnUnknownSolution) {
        this.messageOnUnknownSolution = messageOnUnknownSolution;
    }

    public List<KnownSolution> getKnownSolutions() {
        return knownSolutions;
    }

    public void setKnownSolutions(List<KnownSolution> knownSolutions) {
        this.knownSolutions = knownSolutions;
    }
}
