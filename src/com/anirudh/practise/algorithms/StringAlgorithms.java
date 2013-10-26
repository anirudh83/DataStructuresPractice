package com.anirudh.practise.algorithms;

import java.util.Arrays;


/**
 * 
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 */
public class StringAlgorithms {
	
	/*
	 * Make an array with index as the int value of char, if char exists make it 1 or true
	 * check if it already exists.
	 */
	public boolean isUnique(String str){
		boolean[] char_array = new boolean[256];
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(char_array[val]==true){
				return false;
			}
			char_array[val]=true;
		}
		return true;
	}
	
	/*
	 * Append string to string buffer in reverse order
	 */
	public String reverseString(String str){
		StringBuffer reverseStr = new StringBuffer();
		for(int i=0;i<str.length();i++){
			reverseStr.append(str.charAt(str.length()-i-1));
		}
		return reverseStr.toString();
	}
	
	public String removeDuplicates(String str){
		StringBuilder uniqueCharString = new StringBuilder();
		boolean char_arr[] = new boolean[256];
		for(int i=0;i<str.length();i++){
			char charAt = str.charAt(i);
			if(char_arr[charAt]==false){
				uniqueCharString.append(charAt);
				char_arr[charAt]=true;
			}
		}
		return uniqueCharString.toString();
	}
	
	/*
	 * Comparison starts from start of one string with end of other string.
	 */
	public boolean checkReverseOfEachOther(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(str1.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * First solution to check anagraom using sort
	 */
	public boolean checkIfAnagramUsingSort(String s1,String s2){
		//Remove empty spaces
		s1 = s1.replaceAll(" ", "");
		s2= s2.replaceAll(" ", "");
		if(s1.length()!=s2.length()){
			return false;
		}
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		s1 = new String(charArray1);
		s2 = new String(charArray2);
		return s1.equals(s2);
	}
	
	/*
	 * Take 2 char arrays with index as int value of each char, 
	 * increment value for each occurence
	 * 
	 */
	public boolean checkIfAnagram(String s1,String s2){
		
		int[] arr1 = new int[256];
		int[] arr2 = new int[256];
		
		s1=s1.replaceAll(" ","");
		s2=s2.replaceAll(" ","");
		
		if(s1.length()!=s2.length()) return false;
		
		for(int i=0;i<s1.length();i++){
			arr1[s1.charAt(i)]++;
			arr2[s2.charAt(i)]++;
		}
		
		for(int i=0;i<s1.length();i++){
			if(arr1[s1.charAt(i)]!=arr2[s2.charAt(i)]) return false;
		}
		return true;
	}
	
	
	public void ValidateStringPool(String s){
		
		String s1 = s;
		System.out.println("s1 == s"+s1==s);
		System.out.println("s1.equals(s)"+s1.equals(s));
		String s2 = new String(s);
		System.out.println("s2 == s"+s2==s);
		System.out.println("s2.equals(s)"+s2.equals(s));
		String s3 = "HelloJi";
		String s4 ="HelloJi";
		System.out.println("s3 == s4"+s3==s4);
		String s5=s3;
		System.out.println("s5 == s3"+s5==s3);
	}
	
	

}
