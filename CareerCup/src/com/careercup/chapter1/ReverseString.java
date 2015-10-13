package com.careercup.chapter1;
/* Write code to reverse a C-Style String. (C-String means that "abcd" is represented as
 * five characters, including the null character)
 */
public class ReverseString {
	private String origin = new String();
	
	ReverseString(){
		
	}
	public String reverse(String str){
		String newStr = new String();
		for(int i = 0; i < str.length(); i++){
			newStr += str.charAt(str.length() - i - 1);
		}
		return newStr;
	}
}
