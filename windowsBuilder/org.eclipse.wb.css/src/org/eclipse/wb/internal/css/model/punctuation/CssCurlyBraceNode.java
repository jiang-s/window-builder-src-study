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
package org.eclipse.wb.internal.css.model.punctuation;

import org.eclipse.wb.internal.css.model.CssVisitor;

/**
 * Mode for '{' or '}' character.
 * 
 * @author scheglov_ke
 * @coverage CSS.model
 */
public final class CssCurlyBraceNode extends AbstractCssPunctuationNode {
  private final boolean m_left;

  ////////////////////////////////////////////////////////////////////////////
  //
  // Constructors
  //
  ////////////////////////////////////////////////////////////////////////////
  public CssCurlyBraceNode(int offset, boolean left) {
    setOffset(offset);
    m_left = left;
  }

  ////////////////////////////////////////////////////////////////////////////
  //
  // Right/left
  //
  ////////////////////////////////////////////////////////////////////////////
  /**
   * @return <code>true</code> if this is "{".
   */
  public boolean isLeft() {
    return m_left;
  }

  /**
   * @return <code>true</code> if this is "}".
   */
  public boolean isRight() {
    return !m_left;
  }

  ////////////////////////////////////////////////////////////////////////////
  //
  // Visiting
  //
  ////////////////////////////////////////////////////////////////////////////
  @Override
  public void accept(CssVisitor visitor) {
    visitor.preVisit(this);
    if (visitor.visit(this)) {
      visitor.endVisit(this);
    }
    visitor.postVisit(this);
  }
}
