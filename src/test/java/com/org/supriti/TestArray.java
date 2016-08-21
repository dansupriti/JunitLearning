package com.org.supriti;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestArray {

	@Test
	public void test_Array() {
		int[] actualArray = {12,6,14,1};
		int[] expectedArray = {1,6,12,14};
		Arrays.sort(actualArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	//test for exception
	@Test(expected = NullPointerException.class)
	public void test_exception(){
		int[] actualArray = null;
		Arrays.sort(actualArray);
	}
	
	//test Junit performance
	@Test(timeout=1)
	public void test_JunitPerformance() {
		int[] actualArray = {12,6,14,1};
		for (int i = 0; i < 10000000; i++) {
			actualArray[0] = i;
			Arrays.sort(actualArray);
		}
	}
}
