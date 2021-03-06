package com.google.gwt.maps.client.layers;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
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
 * #L%
 */

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#FusionTablesMarkerOptions">FusionTablesMarkerOptions API Doc</a>
 */
public class FusionTablesMarkerOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesMarkerOptions() {}
  
  /**
   * Options which control the appearance of point features in a FusionTablesLayer.
   */
  public static final FusionTablesMarkerOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets The name of a Fusion Tables supported icon.<br>
   * See <a href="http://www.google.com/fusiontables/DataSource?dsrcid=308519">list of map icons</a>.
   * @param iconName
   */
  public final native void setIconName(String iconName) /*-{
    this.iconName = iconName;
  }-*/;
  
  /**
   * gets The name of a Fusion Tables supported icon.
   * See <a href="http://www.google.com/fusiontables/DataSource?dsrcid=308519">list of map icons</a>.
   */
  public final native String getIconName() /*-{
    return this.iconName;
  }-*/;
  
}
