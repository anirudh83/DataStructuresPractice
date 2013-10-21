package com.anirudh.practise.customImpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.anirudh.practize.customImpl.CustomInteger;

public class TestCustom {
	
	private CustomInteger ci;
	
	@Before
	public void init(){
		ci = new CustomInteger();
	}

	@Test
	public void test2digitNegativeToInt() {
		assertEquals(-55,ci.getIntValueOf("-55"));
	}
	
	@Test
	public void test3digitPositiveToInt(){
		assertEquals(120,ci.getIntValueOf("120"));
	}

	@Test(expected=NumberFormatException.class)
	public void testNonNumber(){
		ci.getIntValueOf("tunna");
	}
	
	@Test
	public void testToStringPositiveInt(){
		assertEquals("1102",ci.getStringValue(1102));
	}
	
	@Test
	public void testToStringNegativeInt(){
		assertEquals("-120",ci.getStringValue(-120));
	}
	
}
