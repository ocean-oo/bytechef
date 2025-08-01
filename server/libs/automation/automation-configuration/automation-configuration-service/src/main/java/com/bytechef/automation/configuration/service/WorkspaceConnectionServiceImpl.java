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

package com.bytechef.automation.configuration.service;

import com.bytechef.automation.configuration.domain.WorkspaceConnection;
import com.bytechef.automation.configuration.repository.WorkspaceConnectionRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Ivica Cardic
 */
@Service
@Transactional
public class WorkspaceConnectionServiceImpl implements WorkspaceConnectionService {

    private final WorkspaceConnectionRepository workspaceConnectionRepository;

    public WorkspaceConnectionServiceImpl(WorkspaceConnectionRepository workspaceConnectionRepository) {
        this.workspaceConnectionRepository = workspaceConnectionRepository;
    }

    @Override
    public WorkspaceConnection create(long connectionId, long workspaceId) {
        return workspaceConnectionRepository.save(new WorkspaceConnection(connectionId, workspaceId));
    }

    @Override
    public void delete(long id) {
        workspaceConnectionRepository.deleteById(id);
    }

    @Override
    public List<WorkspaceConnection> getWorkspaceConnections(long workspaceId) {
        return workspaceConnectionRepository.findAllByWorkspaceId(workspaceId);
    }

    @Override
    public void deleteWorkspaceConnection(long connectionId) {
        workspaceConnectionRepository.findByConnectionId(connectionId)
            .ifPresent(workspaceConnection -> workspaceConnectionRepository.deleteById(workspaceConnection.getId()));
    }
}
