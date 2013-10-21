package com.anirudh.practize.customImpl;

/**
 * 
 * @author Anirudh This class is a wrapper over int. As a practice assignment ,
 *         make a class to support the following functions 1.)Convert int to
 *         String 2.)Make an object which will have value of int 3.)Parse a
 *         string and make an int out of it. Hint :Mimic behavior of Integer
 *         *Implement Adapter pattern*
 */
public class CustomInteger {

	/**
	 * Make sure this remains immutable
	 */
	private int value;

	public CustomInteger() {
		this.value = 0;
	}

	public CustomInteger(int i) {
		this.value = i;
	}

	public int getIntValue() {
		return value;
	}

	public int getIntValueOf(String s) {

		boolean negative = false;
		int startIndex = 0;
		int result = 0;

		if (s == null) {
			throw new NumberFormatException("Empty String value");
		}

		char[] charArray = s.toCharArray();

		if (charArray[0] == '-') {
			negative = true;
			startIndex = 1;
		}
		int placingOfnumber = charArray.length - 1 - startIndex;

		for (int i = startIndex; i < charArray.length; i++) {
			int tempValue = charArray[i];
			tempValue = tempValue - 48;

			if (tempValue >= 0 && tempValue <= 9) {
				int placeMultiplier = (int) Math.pow(10d,
						Double.valueOf(placingOfnumber));
				result = result + (tempValue * placeMultiplier);
				placingOfnumber--;
			} else {
				throw new NumberFormatException(
						"This String can not be converted");
			}
		}
		if (negative) {
			return -result;
		} else {
			return result;
		}

	}
	
	public String getStringValue(int i){
		StringBuilder s = new StringBuilder();
		s.append(i);
		return s.toString();
		
	}
	
    public String getStringValue(){
		return null;
	}

}
