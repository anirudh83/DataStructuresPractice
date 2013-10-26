package com.anirudh.practise.progressions;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.anirudh.practise.progressions.ArithmeticProgression;
import com.anirudh.practise.progressions.FibonacciProgression;
import com.anirudh.practise.progressions.GeoProgression;

public class TestProgresion {

	@Test
	public void testAP() {
		ArithmeticProgression ap = new ArithmeticProgression(5);
		assertEquals(0,ap.firstValue());
		assertEquals(5, ap.nextValue());
		}

	@Test
	public void TestGP(){
		GeoProgression gp = new GeoProgression(2,5);
		assertEquals(2, gp.firstValue());
		assertEquals(10, gp.nextValue());
		assertEquals(50, gp.nextValue());
	}
	
	@Test
	public void TestFibo(){
		FibonacciProgression fp = new FibonacciProgression();
		assertEquals(0,fp.firstValue());
		assertEquals(1,fp.nextValue());
		assertEquals(1,fp.nextValue());
		assertEquals(2,fp.nextValue());
		assertEquals(3,fp.nextValue());
		assertEquals(5,fp.nextValue());
		assertEquals(8,fp.nextValue());
		
	}

}
