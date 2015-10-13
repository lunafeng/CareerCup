package com.careercup.chapter1;

import javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler;

public class HashEntry {
	private int key;
	private int value;
	HashEntry(int key, int value){
		this.key = key;
		this.value = value;
	}
	
	public int getKey(){
		return this.key;
	}
	
	public int getValue(){
		return this.value;
	}
	
}
