package com.org.supriti;

import java.util.Arrays;

//my first junit test class
public class MyFirstJunit {
	public String checkString(String requestString){
		if(requestString == null || requestString.isEmpty()){
			return null;
		}else{
			return requestString + "super";
		}
	}
	
	public boolean checkAnagram(String firstString, String secondString){
		if (firstString == null || secondString == null){
			return false;
		}
		if(firstString.length() != secondString.length()){
			return false;
		}
		boolean result = false;

		  final String one = firstString.replaceAll("[\\s+\\W+]", "").toLowerCase();

		  final String two = secondString.replaceAll("[\\s+\\W+]", "").toLowerCase();

		  if (one.length() == two.length()) {

		      final char[] oneArray =  one.toCharArray();

		      final char[] twoArray =  two.toCharArray(); 

		      Arrays.sort(oneArray);

		      Arrays.sort(twoArray);

		      result = Arrays.equals(oneArray, twoArray);

		    }

		  return result; 
	}
}
