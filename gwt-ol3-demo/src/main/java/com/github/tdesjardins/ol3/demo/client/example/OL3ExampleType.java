/*******************************************************************************
 * Copyright 2014, 2017 gwt-ol3
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
package com.github.tdesjardins.ol3.demo.client.example;

/**
 * Provided example types.
 *
 * @author Tino Desjardins
 *
 */
public enum OL3ExampleType {

    AnimationExample(new AnimationExample()),
    ArcGISExample(new ArcGISExample()),
    GeoJSONExample(new GeoJSONExample()),
    GraticuleExample(new GraticuleExample()),
    ImageExample(new StaticImageExample()),
    MapBoxExample(new MapboxExample()),
    MapEventsExample(new MapEventsExample()),
    MapGuideExample(new MapGuideExample()),
    MarkerExample(new MarkerExample()),
    MeasureExample(new MeasureExample()),
    OsmExample(new OsmExample()),
    OverlayExample(new OverlayExample()),
    SelectFeatureExample(new SelectFeaturesExample()),
    TileExample(new TileExample()),
    TileWmsExample(new TileWmsExample()),
    WmsExample(new WmsExample()),
    WmtsExample(new WmtsExample()),
    XyzExample(new XyzExample());

    private transient Example example;

    OL3ExampleType(Example example) {
        this.example = example;
    }

    public Example getExample() {
        return this.example;
    }

}

