package com.leadingedje.codecamp.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberStuffTest {
	
	NumberStuff stuff;

	@Before
	public void setUp() throws Exception {
		stuff = new NumberStuff();
	}

	@Test
	public void testCheckPositiveNumberPositiveAndTrue() {
		assertTrue(stuff.checkPositiveNumber(1, true));
	}
	
	@Test
	public void testCheckPositiveNumberPositiveAndFalse() {
		assertTrue(stuff.checkPositiveNumber(1, false));
	}
	
	@Test
	public void testCheckPositiveNumberZeroAndFalse() {
		assertFalse(stuff.checkPositiveNumber(0, false));
	}
	
	@Test
	public void testCheckPositiveNumberZeroAndTrue() {
		assertTrue(stuff.checkPositiveNumber(0, true));
	}

}
