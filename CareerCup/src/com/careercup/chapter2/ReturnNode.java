package com.careercup.chapter2;

import java.util.ArrayList;

public class ReturnNode {
	ReturnNode(){}
	public Node getReturnNode(Node head){
		ArrayList cache = new ArrayList();
		while(head != null){
			if(cache.contains(head.data)){
				return head;
			}else{
				cache.add(head.data);
				head = head.next;
			}
		}
		return head;
	}
}
