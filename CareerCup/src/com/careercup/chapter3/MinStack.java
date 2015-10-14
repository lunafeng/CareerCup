package com.careercup.chapter3;

public class MinStack extends Stack{
	int min;
	public void push(Node d){
		if(top == null){
			min = d.value;
		}
		Node n = d;
		n.next = top;
		top = n;
		if(top.value < min){
			min = top.value;
		}
		
	}
	public int getMin(){
		return min;
	}
	
		
	
}
