/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.engine.common.impl.event;

import org.flowable.engine.common.api.FlowableIllegalArgumentException;
import org.flowable.engine.common.api.delegate.event.FlowableEngineEvent;
import org.flowable.engine.common.api.delegate.event.FlowableEngineEventType;
import org.flowable.engine.common.api.delegate.event.FlowableEvent;

/**
 * Base class for all {@link FlowableEvent} implementations.
 * 
 * @author Frederik Heremans
 */
public class FlowableEventImpl implements FlowableEngineEvent {

    protected FlowableEngineEventType type;
    protected String executionId;
    protected String processInstanceId;
    protected String processDefinitionId;

    /**
     * Creates a new event implementation, not part of an execution context.
     */
    public FlowableEventImpl(FlowableEngineEventType type) {
        this(type, null, null, null);
    }

    /**
     * Creates a new event implementation, part of an execution context.
     */
    public FlowableEventImpl(FlowableEngineEventType type, String executionId, String processInstanceId, String processDefinitionId) {
        if (type == null) {
            throw new FlowableIllegalArgumentException("type is null");
        }
        this.type = type;
        this.executionId = executionId;
        this.processInstanceId = processInstanceId;
        this.processDefinitionId = processDefinitionId;
    }

    @Override
    public FlowableEngineEventType getType() {
        return type;
    }

    public void setType(FlowableEngineEventType type) {
        this.type = type;
    }

    @Override
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    @Override
    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    @Override
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    @Override
    public String toString() {
        return getClass() + " - " + type;
    }

}
