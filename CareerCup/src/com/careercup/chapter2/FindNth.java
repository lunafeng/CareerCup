package com.careercup.chapter2;

import java.util.ArrayList;

public class FindNth {
	public FindNth() {
	}
	public int find(Node head, int n){	
		ArrayList elements = new ArrayList();
		while(head.next != null){
			elements.add(head.data);
			head = head.next;
		}
		elements.add(head.data);
		int e;
		e = (int) elements.get(elements.size() -1);
		Node newHead = new Node(e);
		for(int i = 1; i < elements.size(); i++){
			e = (int) elements.get(elements.size() - i -1);
			newHead.add(e);
		}
		int count = 0;
		while(newHead.next != null){
			count += 1;
			if(count == n){
				break;
			}else{
				newHead = newHead.next;
			}
		}
		
		return newHead.data;
	}
	
}
