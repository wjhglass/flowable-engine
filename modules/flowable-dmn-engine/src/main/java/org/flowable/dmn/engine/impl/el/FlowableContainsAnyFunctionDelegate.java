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

package org.flowable.dmn.engine.impl.el;

import org.flowable.dmn.engine.impl.el.util.CollectionUtil;
import org.flowable.engine.common.impl.el.AbstractFlowableFunctionDelegate;

import java.lang.reflect.Method;

/**
 * A collection function mapper that can be used in EL expressions
 * 
 * @author Yvo Swillens
 */
public class FlowableContainsAnyFunctionDelegate extends AbstractFlowableFunctionDelegate {

    @Override
    public String prefix() {
        return "collection";
    }

    @Override
    public String localName() {
        return "containsAny";
    }

    @Override
    public Class<?> functionClass() {
        return CollectionUtil.class;
    }

    @Override
    public Method functionMethod() {
        return getTwoObjectParameterMethod();
    }

}
