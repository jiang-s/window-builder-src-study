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

import org.eclipse.jdt.core.ICompilationUnit;

/**
 * "Design" page of {@link IDesignerEditor}.
 * 编辑器中设计器编辑器页的接口
 * 定义行为
 *     设置代码与model的同步模式
 *     获得设计编辑器的解析状态  有正在解析 失败 未定义 成功等等
 *     刷新GEF
 * 
 * @author scheglov_ke
 * @coverage core.editor
 */
public interface IDesignPage extends IEditorPage {
  /**
   * Specifies if synchronization of source code and model should be active or not.
   */
  void setSourceModelSynchronizationEnabled(boolean active);

  /**
   * @return the {@link DesignerState} of parsing.
   */
  DesignerState getDesignerState();

  /**
   * Parses {@link ICompilationUnit} and displays it in GEF.
   */
  void refreshGEF();
}