/*

(C) Copyright 2017 Alberto Fernández <infjaf@gmail.com>

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 3.0 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library.  If not, see <http://www.gnu.org/licenses/>.

*/
package com.dk.javadbfparser;

import org.junit.Assert;
import org.junit.Test;


public class DBFAligmentTest {
	
	@Test
	public void testValues() {
		Assert.assertEquals(2,DBFAlignment.values().length);
	}
	
	@Test
	public void testValueOf() {
		Assert.assertEquals(DBFAlignment.LEFT,DBFAlignment.valueOf("LEFT"));
	}

}
