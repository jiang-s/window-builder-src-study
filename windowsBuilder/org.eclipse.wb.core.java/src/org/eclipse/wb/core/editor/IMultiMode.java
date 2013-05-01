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

import org.eclipse.wb.internal.core.editor.multi.DesignerEditor;

/**
 * The mode for presentation source/design parts of {@link DesignerEditor}.
 * 编辑器展示模式行为
 * 有设计页 源码页
 * 该接口定义行为：
 *     获得设计页面
 *     展示soure页面
 *     展示设计页面
 *     切换source和design页面
 * 
 * 设计编辑器页的控件创建是在
 *    1.MultiSplitMode 类的create方法中触发的
 *    2. MultiPagesMode类中也会触发createTab(m_designPage);
 *    一个是split模式 一个是多页签模式
 * 
 * @author scheglov_ke
 * @coverage core.editor
 */
public interface IMultiMode {
  /**
   * @return the {@link IDesignPage}.
   */
  IDesignPage getDesignPage();

  /**
   * Activates "Source" page of editor.
   */
  void showSource();

  /**
   * Activates "Design" page of editor.
   */
  void showDesign();

  /**
   * Switches between "Source" and "Design" pages.
   */
  void switchSourceDesign();
}