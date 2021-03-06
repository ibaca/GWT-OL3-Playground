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
package ol.interaction;

import ol.GwtOL3BaseTestCase;
import ol.OLFactory;
import ol.Observable;

/**
 * 
 * @author Tino Desjardins
 *
 */
public class TranslateTest extends GwtOL3BaseTestCase {

    public void testTranslate() {

        injectUrlAndTest(new TestWithInjection() {
            
            @Override
            public void test() {
                
                TranslateOptions translateOptions = OLFactory.createOptions();
                Translate translate = new Translate(translateOptions);
                
                assertNotNull(translate);
                assertTrue(translate instanceof Observable);
                assertTrue(translate instanceof Interaction);
            }
            
        });
 
    }

}
