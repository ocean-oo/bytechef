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

package com.bytechef.platform.configuration.facade;

import com.bytechef.platform.configuration.dto.ClusterElementOutputDTO;
import com.bytechef.platform.configuration.dto.WorkflowNodeOutputDTO;
import java.util.List;
import java.util.Map;

/**
 * @author Ivica Cardic
 */
public interface WorkflowNodeOutputFacade {

    String PREVIOUS_WORKFLOW_NODE_OUTPUTS_CACHE = "WorkflowNodeOutputFacade.previousWorkflowNodeOutputs";
    String PREVIOUS_WORKFLOW_NODE_SAMPLE_OUTPUTS_CACHE = "WorkflowNodeOutputFacade.previousWorkflowNodeSampleOutputs";

    ClusterElementOutputDTO getClusterElementOutput(
        String workflowId, String workflowNodeName, String clusterElementType, String clusterElementWorkflowNodeName);

    WorkflowNodeOutputDTO getWorkflowNodeOutput(String workflowId, String workflowNodeName);

    List<WorkflowNodeOutputDTO> getPreviousWorkflowNodeOutputs(String workflowId, String lastWorkflowNodeName);

    Map<String, ?> getPreviousWorkflowNodeSampleOutputs(String workflowId, String lastWorkflowNodeName);

    void checkWorkflowCache(String workflowId, String lastWorkflowNodeName);
}
