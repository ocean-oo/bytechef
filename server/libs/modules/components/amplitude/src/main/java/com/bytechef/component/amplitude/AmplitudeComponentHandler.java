/*
 * Copyright 2025 ByteChef
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bytechef.component.amplitude;

import static com.bytechef.component.definition.ComponentDsl.component;
import static com.bytechef.component.definition.ComponentDsl.tool;

import com.bytechef.component.ComponentHandler;
import com.bytechef.component.amplitude.action.AmplitudeCreateAttributionEventAction;
import com.bytechef.component.amplitude.action.AmplitudeCreateOrUpdateUserAction;
import com.bytechef.component.amplitude.connection.AmplitudeConnection;
import com.bytechef.component.definition.ComponentCategory;
import com.bytechef.component.definition.ComponentDefinition;
import com.google.auto.service.AutoService;

/**
 * @author Nikolina Spehar
 */
@AutoService(ComponentHandler.class)
public class AmplitudeComponentHandler implements ComponentHandler {

    private static final ComponentDefinition COMPONENT_DEFINITION = component("amplitude")
        .title("Amplitude")
        .description(
            "Build better products by turning your user data into meaningful insights, using Amplitude's digital " +
                "analytics platform and experimentation tools.")
        .icon("path:assets/amplitude.svg")
        .categories(ComponentCategory.ANALYTICS)
        .connection(AmplitudeConnection.CONNECTION_DEFINITION)
        .actions(
            AmplitudeCreateAttributionEventAction.ACTION_DEFINITION,
            AmplitudeCreateOrUpdateUserAction.ACTION_DEFINITION)
        .clusterElements(
            tool(AmplitudeCreateAttributionEventAction.ACTION_DEFINITION),
            tool(AmplitudeCreateOrUpdateUserAction.ACTION_DEFINITION));

    @Override
    public ComponentDefinition getDefinition() {
        return COMPONENT_DEFINITION;
    }
}
