package com.anirudh.practise.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringAlgo {

	StringAlgorithms sa = new StringAlgorithms();
	
	@Test
	public void testUniqueChar() {
		assertEquals(true,sa.isUnique("anirudh"));
		assertEquals(false,sa.isUnique("abcdb"));
	}
	
	@Test
	public void testReverse(){
		assertEquals("dcba",sa.reverseString("abcd"));
		assertNotEquals("dcba",sa.reverseString("abcde"));
		assertEquals("dcbai1",sa.reverseString("1iabcd"));
	}
	
	@Test
	public void testUniqueCharString(){
		assertEquals("abcde",sa.removeDuplicates("abacdabce"));
		assertNotEquals("abacdabce",sa.removeDuplicates("abacdabce"));
	}
	
	@Test
	public void testIfReverseOfEachOther(){
		assertTrue(sa.checkReverseOfEachOther("abcde","edcba"));
		assertFalse(sa.checkReverseOfEachOther("test", "test"));
		assertTrue(sa.checkReverseOfEachOther("my name is Ab", "bA si eman ym"));
	}
	
	@Test
	public void testAnagramUsingSort(){
		assertTrue(sa.checkIfAnagramUsingSort("Leonardo Da Vinci","Leo Vin Daci nardo"));
		assertFalse(sa.checkIfAnagramUsingSort("test12 you mane", "test is my name"));
	}
	
	@Test
	public void testCheckIfAnagram(){
		assertTrue(sa.checkIfAnagramUsingSort("Leonardo Da Vinci","Leo Vin Daci nardo"));
		assertFalse(sa.checkIfAnagramUsingSort("test12 you mane", "test is my name"));
	}
	@Test
	public void testValidateStringPool(){
		sa.ValidateStringPool("Anirudh");
	}

}
