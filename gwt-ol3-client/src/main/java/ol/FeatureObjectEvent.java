/*******************************************************************************
 * Copyright 2014, 2016 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Object parameter of the {@link ol.Collection} features event listener.
 *
 * e.g.
 * Select select = ...
 * select.getFeatures().on("<event_name>"), function (SelectObjectEvent){...});
 * 
 * @author mribeiro
 * 
 */
@JsType(isNative = true)
public interface FeatureObjectEvent extends ObjectEvent{

    /**
     * The name feature involved in the event.
     *
     * @return {@link Feature}
     *          feature.
     */
    @JsProperty
    Feature getElement();
}