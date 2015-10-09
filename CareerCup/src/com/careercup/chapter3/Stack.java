package com.careercup.chapter3;

public class Stack {
	Node top;
	public Node pop(){
		if(top == null){
			return null;
		}else{
			Node out = top;
			top = out.next;
			return top;
		}
	}
	public void push(Node d){
		Node n = d;
		n.next = top;
		top = n;
	}
	public void printStack(Node top){
		while(top != null){
			System.out.println(top.value);
			top = top.next;
		}
	}
}
