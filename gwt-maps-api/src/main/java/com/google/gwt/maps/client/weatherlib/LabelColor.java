package com.google.gwt.maps.client.weatherlib;

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


/**
 * The color of the labels displayed on the weather layer. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#LabelColor"
 * >LabelColor API Doc</a>
 */
public enum LabelColor {

	/**
	 * Weather labels will be displayed as black text with a white border.
	 */
	BLACK,

	/**
	 * Weather labels will be displayed as white text with a black border.
	 */
	WHITE;

	public String value() {
		return name().toLowerCase();
	}

	public static LabelColor fromValue(String type) {
		return valueOf(type.toUpperCase());
	}

	@Override
	public String toString() {
		return name();
	}

}
