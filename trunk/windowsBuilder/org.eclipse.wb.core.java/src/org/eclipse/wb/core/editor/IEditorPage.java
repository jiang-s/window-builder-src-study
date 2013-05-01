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
package org.eclipse.wb.core.editor;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * Any page for {@link IDesignerEditor}.
 * 用于IDesignerEditor的编辑器页面
 * 定义的行为有：
 *     用一个现有的IDesignerEditor的来初始化这个编辑器页面
 *     dispose
 *     处理页面激活，去激活状态
 *     创建页面控件
 *     获得这个页面对应的控件
 *     获得编辑器名称
 *     获得编辑器图像
 *     设置编辑器聚焦
 *  下有DesignPage DataBindPage SourcePage
 *  
 * 
 * 
 * @author scheglov_ke
 * @coverage core.editor
 */
public interface IEditorPage {
  ////////////////////////////////////////////////////////////////////////////
  //
  // Life cycle
  //
  ////////////////////////////////////////////////////////////////////////////
  /**
   * Initialize this page for given {@link IDesignerEditor} editor.
   */
  void initialize(IDesignerEditor designerEditor);

  /**
   * Disposes this page.
   */
  void dispose();

  ////////////////////////////////////////////////////////////////////////////
  //
  // Activation
  //
  ////////////////////////////////////////////////////////////////////////////
  /**
   * Handles activation/deactivation this page.
   */
  void handleActiveState(boolean activate);

  ////////////////////////////////////////////////////////////////////////////
  //
  // GUI
  //
  ////////////////////////////////////////////////////////////////////////////
  /**
   * Creates the SWT control(s) for this page.
   */
  Control createControl(Composite parent);

  /**
   * @return the SWT {@link Control} of this page.
   */
  Control getControl();

  /**
   * Asks this page to take focus.
   */
  void setFocus();

  ////////////////////////////////////////////////////////////////////////////
  //
  // Presentation
  //
  ////////////////////////////////////////////////////////////////////////////
  /**
   * @return the display name for this page.
   */
  String getName();

  /**
   * @return the display {@link Image} image for this page.
   */
  Image getImage();
}