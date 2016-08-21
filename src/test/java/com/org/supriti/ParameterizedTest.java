package com.org.supriti;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	TestHelper testHelper = new TestHelper();
	// Parameterized Testcase
	
	private String input;
	private String expectedOutput;
	
	public ParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions(){
		String expectedOutputs[][] = {
				{"AACD","CD"},
				{"ACD","CD"},
				{"CDEF","CDEF"},
				{"CDAA","CDAA"},
				{"ACD","CD"},
		};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expectedOutput, testHelper.truncateAInFirst2Positions(input));
	}
	
	// Individual Testcase
	/**
	@Test
	public void testTruncateAInFirst2Positions_withStringHavingTwoAABegining() {
		assertEquals("CD", testHelper.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions_withStringHavingOneABegining() {
		assertEquals("CD", testHelper.truncateAInFirst2Positions("ACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions_withStringHavingNoAatBegining() {
		assertEquals("CDEF", testHelper.truncateAInFirst2Positions("CDEF"));
	}	
	
	@Test
	public void testTruncateAInFirst2Positions_withStringHavingTwoAATEnd() {
		assertEquals("CDAA", testHelper.truncateAInFirst2Positions("CDAA"));
	}
	@Test
	public void testTruncateAInFirst2Positions_withStringHavingOneABeinging() {
		assertEquals("CD", testHelper.truncateAInFirst2Positions("ACD"));
	}
	**/
	

}
