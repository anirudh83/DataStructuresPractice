package com.anirudh.practise.algorithms;

import java.util.Arrays;


/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 */
public class StringAlgorithms {

    /*
    1.Implement an algorithm to determine if a string has all unique characters.
    Solution : Keep an array with position int value of char and value as binary
     */

    public boolean hasUniqueChars(String s) {
        boolean[] bolean_array = new boolean[256];
        for (char c : s.toCharArray()) {
            if (bolean_array[c] == true) {
                return false;
            }
            bolean_array[c] = true;
        }
        return true;
    }

    /*
     * Append string to string buffer in reverse order
     */
    public String reverseString(String str) {
        StringBuffer reverseStr = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            reverseStr.append(str.charAt(str.length() - i - 1));
        }
        return reverseStr.toString();
    }

    public String removeDuplicates(String str) {
        StringBuilder uniqueCharString = new StringBuilder();
        boolean char_arr[] = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (char_arr[charAt] == false) {
                uniqueCharString.append(charAt);
                char_arr[charAt] = true;
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
    public boolean checkIfAnagramUsingSort(String s1, String s2) {
        //Remove empty spaces
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");
        if (s1.length() != s2.length()) {
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
    public boolean checkIfAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        int[] letters = new int[256];

        for (char c : s1.toCharArray()) {
            letters[c]++;
        }

        for (char c : s2.toCharArray()) {
            if (--letters[c] < 0) return false;
        }
        return true;
    }


    public void ValidateStringPool(String s) {

        String s1 = s;
        System.out.println("s1 == s" + s1 == s);
        System.out.println("s1.equals(s)" + s1.equals(s));
        String s2 = new String(s);
        System.out.println("s2 == s" + s2 == s);
        System.out.println("s2.equals(s)" + s2.equals(s));
        String s3 = "HelloJi";
        String s4 = "HelloJi";
        System.out.println("s3 == s4" + s3 == s4);
        String s5 = s3;
        System.out.println("s5 == s3" + s5 == s3);
    }

//	public boolean checkIfIdentical(List<String> s1, List<String> s2){
//		if(s1.size()!=s2.size()){
//			return false;
//		}else{
//				Iterator<String> iterator = s1.iterator();
//				while(iterator.hasNext()){
//					
//					
//			}
//		}
//		
//	}

}
