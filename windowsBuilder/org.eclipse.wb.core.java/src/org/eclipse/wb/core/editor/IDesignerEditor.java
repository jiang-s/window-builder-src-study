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

import org.eclipse.wb.internal.core.views.IDesignCompositeProvider;

import org.eclipse.jdt.core.ICompilationUnit;

/**
 * Interface for multi-page GUI editor, where one of the pages in Java source editor.
 * 多页签的图像编辑器的接口  含有一个java source编辑器
 * 定义的行为与属性
 *     编辑器的id
 *     获得编辑器的multiMode
 *     获得java source编辑器
 *     增加/移除编辑器的监听器
 *     
 * 
 * @author scheglov_ke
 * @author mitin_aa
 * @coverage core.editor
 */
public interface IDesignerEditor extends IDesignCompositeProvider {
  String ID = "org.eclipse.wb.core.guiEditor";

  ////////////////////////////////////////////////////////////////////////////
  //
  // Access
  //
  ////////////////////////////////////////////////////////////////////////////
  /**
   * @return the {@link IMultiMode}.
   */
  IMultiMode getMultiMode();

  /**
   * @return the {@link ICompilationUnit} opened in this editor.
   */
  ICompilationUnit getCompilationUnit();

  ////////////////////////////////////////////////////////////////////////////
  //
  // Listeners
  //
  ////////////////////////////////////////////////////////////////////////////
  /**
   * Adds {@link DesignerEditorListener} for this editor.
   */
  void addDesignPageListener(DesignerEditorListener listener);

  /**
   * Removes {@link DesignerEditorListener} for this editor.
   */
  void removeDesignPageListener(DesignerEditorListener listener);
}