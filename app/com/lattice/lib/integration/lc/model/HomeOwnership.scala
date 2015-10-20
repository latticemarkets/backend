/**
 * Copyright (c) 2015 Lattice Markets, All rights reserved.
 *
 * Unpublished copyright. All rights reserved. This material contains
 * proprietary information that shall be used or copied only with
 * Lattice Markets, except with written permission of Lattice Markets.
 */
package com.lattice.lib.integration.lc.model

/**
 * @author ze97286
 */
object HomeOwnership extends Enumeration {
  type homeOwnership=Value
  val RENT, OWN, MORTGAGE, OTHER=Value
}