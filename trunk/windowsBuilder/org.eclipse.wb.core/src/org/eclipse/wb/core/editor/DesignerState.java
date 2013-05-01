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

/**
 * Designer parsing state.
 * 设计编辑器的解析状态  有正在解析 失败 未定义 成功等等
 * 
 * @author lobas_av
 * @coverage core.editor
 */
public enum DesignerState {
  /**
   * State is undefined.
   */
  Undefined,
  /**
   * Parsing time.
   */
  Parsing,
  /**
   * Parsing completed successfully.
   */
  Successful,
  /**
   * Parsing completed with error.
   */
  Error
}