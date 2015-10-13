package com.careercup.chapter3;

import java.util.prefs.BackingStoreException;

import com.careercup.chapter2.Node;

public class Queue {
	Node first, last;
	public void enqueue(int d){
		Node back = new Node(d);
		if(first != null){
			back.next = last;
			last = back;
		}else{
			first = back;
			last = back;
		}
	}
	public void dequeue(){
		Node tmp = last;
		while(tmp.next != first){
			tmp = tmp.next;
		}
		first = tmp;
	}
	
	public void print(){
		Node tmp = last;
		while(tmp != first){
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
		System.out.println(tmp.data);
	}
}
