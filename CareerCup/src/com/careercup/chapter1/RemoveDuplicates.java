package com.careercup.chapter1;
/* Design an algorithm and write code to remove the duplicate characters in a string
 * without using any additional buffer. NOTE: One or two additional variables are fine.
 * An extra copy of the array is not.
 */

import javax.sql.rowset.CachedRowSet;

public class RemoveDuplicates {
	
	public RemoveDuplicates() {
		// TODO Auto-generated constructor stub
	}
	
	public String remove(String str){
		char c1;
		char c2;
		for(int i = 0; i < str.length(); i++){
			c1 = str.charAt(i);
			for(int j = 0; j < str.length() - i - 1; j++){
				c2 = str.charAt(j + i + 1);
				if(c1 == c2){
					str = str.replaceAll(Character.toString(c1),"");
				}
			}
		}
		
		return str;
	}
}
