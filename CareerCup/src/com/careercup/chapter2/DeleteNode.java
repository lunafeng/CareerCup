package com.careercup.chapter2;

public class DeleteNode {
	DeleteNode(){
	}
	public boolean deleteNode(Node middle){
		if(middle == null | middle.next == null){
			return false; 
		}else{
			Node next = middle.next;
			middle.data = next.data;
			middle.next = next.next;
			return true;
		}
	}
}
