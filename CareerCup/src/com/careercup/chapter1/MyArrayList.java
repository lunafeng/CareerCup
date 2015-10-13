package com.careercup.chapter1;

import java.util.Arrays;

import javax.xml.transform.Templates;

public class MyArrayList {
	private Object[] myStore;
	private int actSize = 0;
	
	MyArrayList(){
		myStore = new Object[10];
	}
	public void add(Object obj){
		if(myStore.length - actSize <= 5){
			increaseListSize();
		}else{
			myStore[actSize++] = obj;
		}
	}
	public Object get(int index){
		if(index < actSize){
			return myStore[index];
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public Object remove(int index){
		if(index < actSize){
			Object obj = myStore[index];
			myStore[index] = null;
			int tmp = index;
			while(tmp < actSize){
				myStore[tmp] = myStore[tmp + 1];
				tmp = tmp + 1;
			}
			actSize--;
			return obj;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public int size(){
		return actSize;
	}
	private void increaseListSize(){
		myStore = Arrays.copyOf(myStore, myStore.length*2);
		System.out.println("\nNew length: " + myStore.length);
	}
}
