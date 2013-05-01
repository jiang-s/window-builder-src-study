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
package org.eclipse.wb.internal.core.editor.structure;

import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Adapter for {@link IPartListener}.
 * IPartListener
 * 这样的需求，需要判断当前用户的焦点切换到了哪个视图，这时只要使用IPartListener来监听即可。
 * 示例在 http://blog.csdn.net/kdevn/article/details/5702827
 * 主要监听的行为有打开 关闭 置顶 激活 去激活
 * 
 * <b>wb中这个listenerAdapter 貌似和IPartListener接口完全一致</b>
 * <b>但是wb用一个抽象类adapter了接口，技巧就在这。后来的实现者，只要重写自己感兴趣的行为就可以了。无需所有方法都实现。</b>
 * http://help.eclipse.org/indigo/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fapi%2Forg%2Feclipse%2Fui%2FIPartListener.html
 * 
 * @author scheglov_ke
 * @coverage core.editor
 */
public abstract class PartListenerAdapter implements IPartListener {
  public void partActivated(IWorkbenchPart part) {
  }

  public void partBroughtToTop(IWorkbenchPart part) {
  }

  public void partClosed(IWorkbenchPart part) {
  }

  public void partDeactivated(IWorkbenchPart part) {
  }

  public void partOpened(IWorkbenchPart part) {
  }
}
