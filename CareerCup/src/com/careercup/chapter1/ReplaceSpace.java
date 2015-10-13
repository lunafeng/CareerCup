package com.careercup.chapter1;

public class ReplaceSpace {
	public ReplaceSpace() {
	}
	public String replace(String str){
		str = str.replaceAll(" ", "%20");
		return str;
	}
}
