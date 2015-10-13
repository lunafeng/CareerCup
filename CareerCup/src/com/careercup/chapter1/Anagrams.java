package com.careercup.chapter1;

public class Anagrams {
	public Anagrams() {
	}
	public boolean check(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}else{
			int l = str1.length();
			for(int i = 0; i < l; i++){
				char c1 = str1.charAt(i);
				char c2 = str2.charAt(l - i - 1);
				if(c1 != c2){
					return false;
				}
			}
			return true;
		}
	}
}
