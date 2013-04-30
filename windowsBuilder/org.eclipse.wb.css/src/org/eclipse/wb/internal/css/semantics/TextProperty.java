/*******************************************************************************
 * Copyright (c) 2011 Google, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Google, Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.wb.internal.css.semantics;

/**
 * Composite property for text.
 * 
 * @author scheglov_ke
 * @coverage CSS.semantics
 */
public class TextProperty extends AbstractSemanticsComposite {
  public static final String[] INDENT_VALUES = {"1", "2", "3", "4", "5"};
  public static final String[] WHITE_VALUES = {"", "normal", "pre", "nowrap"};
  public static final String[] LINE_VALUES = {"inherit", "normal"};
  public static final String[] DIRECTION_VALUES = {"", "ltr", "rtl"};
  public static final String[] TRANSFORM_VALUES = {
      "",
      "none",
      "capitalize",
      "uppercase",
      "lowercase"};
  public static final String[] SPACE_VALUES = {"normal", "1", "2", "3", "4", "5"};
  public static final String[] ALIGN_H_VALUES = {"", "left", "right", "center", "justify"};
  public static final String[] ALIGN_V_VALUES = {
      "baseline",
      "sub",
      "super",
      "top",
      "text-top",
      "middle",
      "bottom",
      "text-bottom"};
  public static final String[] DECORATION_VALUES = {
      "underline",
      "overline",
      "line-through",
      "blink"};
  public final LengthValue indent = mapLengthProperty(this, "text-indent");
  public final SimpleValue align = mapSimpleProperty(this, "text-align");
  public final SimpleValue decoration = mapSimpleProperty(this, "text-decoration");
  public final LengthValue letterSpacing = mapLengthProperty(this, "letter-spacing");
  public final LengthValue wordSpacing = mapLengthProperty(this, "word-spacing");
  public final SimpleValue transform = mapSimpleProperty(this, "text-transform");
  public final SimpleValue whiteSpace = mapSimpleProperty(this, "white-space");
  public final LengthValue verticalAlign = mapLengthProperty(this, "vertical-align");
  public final LengthValue lineHeight = mapLengthProperty(this, "line-height");
  public final SimpleValue direction = mapSimpleProperty(this, "direction");

  ////////////////////////////////////////////////////////////////////////////
  //
  // Constructor
  //
  ////////////////////////////////////////////////////////////////////////////
  public TextProperty(AbstractSemanticsComposite composite) {
    super(composite);
  }
}
