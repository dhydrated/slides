/*
 * Ext GWT 2.2.1 - Ext for GWT
 * Copyright(c) 2007-2010, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package org.dhydrated.app.slides.client;

import org.dhydrated.app.slides.client.icons.ExampleIcons;
import org.dhydrated.app.slides.client.images.ExampleImages;

import com.google.gwt.core.client.GWT;

public class Resources {

  public static final ExampleImages IMAGES = GWT.create(ExampleImages.class);
  public static final ExampleIcons ICONS = GWT.create(ExampleIcons.class);

}