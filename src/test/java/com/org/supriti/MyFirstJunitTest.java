package com.org.supriti;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyFirstJunitTest {
	
	MyFirstJunit myFirstJunit = new MyFirstJunit();
	
	@Before
	public void setup(){
		System.out.println("Before test");
	}

	@Test
	public void testCheckString_ShouldReturnProperStringWhenGivenStringNotNull() {
		assertEquals("abcdsuper", myFirstJunit.checkString("abcd"));
	}
	@Test
	public void testCheckStringShouldReturnNullWhenGivenStringIsNull() {
		assertEquals(null, myFirstJunit.checkString(null));
	}
	@Test
	public void testCheckStringShouldReturnNullWhenGivenStringIsEmpty() {
		assertEquals(null, myFirstJunit.checkString(""));
	}
	
	@Test
	public void testCheckAnagram_ShouldReturnTrueWhenBothStringAreAnagram(){
		assertEquals(true, myFirstJunit.checkAnagram("keep", "peek"));
	}
	
	@Test
	public void testCheckAnagram_ShouldReturnFalseWhenBothStringAreNotAnagram(){
		assertFalse(myFirstJunit.checkAnagram("kepu", "peek"));
	}
	
	@Test
	public void testCheckAnagram_ShouldReturnFalseWhenStringAreNull(){
		assertFalse(myFirstJunit.checkAnagram(null, "peek"));
	}
	
	@Test
	public void testCheckAnagram_ShouldReturnFalseWhenStringAreEmpty(){
		assertFalse(myFirstJunit.checkAnagram("", "peek"));
	}
	
	@After
	public void teardown(){
		System.out.println("After test");
	}
}
