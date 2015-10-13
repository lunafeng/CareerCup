package com.careercup.chapter1;

import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;
import javax.swing.text.StyledEditorKit.BoldAction;

/* Implement an algorithm to determine if a string has all unique characters. What if you
   can not use additional data structures?
*/
public class CheckUnique {
	private ArrayList cache = new ArrayList<>();
	private String checkString = new String();
	
	CheckUnique(){
		
	}
	
	public boolean unique(String str){
		for(int i = 0 ; i < str.length(); i++){
			if(!this.cache.contains(str.charAt(i))){
				this.cache.add(str.charAt(i));
			}else{
				System.out.println("The string has duplicate characters" + str.charAt(i));
				return false;
			}
		}
		return true;
	}
}

