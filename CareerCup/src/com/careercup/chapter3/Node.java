package com.careercup.chapter3;

public class Node {
	Node next = null;
	int value;
	Node(int d){
		this.value = d;
	}
	public void add(int d){
		Node n = this;
		Node end = new Node(d);
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	public Node delete(Node head, int d){
		Node point = head;
		if(head.value == d){
			head = head.next;
			point = head;
		}
		while(point.next != null){
			if(point.next.value == d){
				point.next = point.next.next;
				continue;
			}else{
				point = point.next;
			}
		}
		
		return head;
	}
	
	public void printList(Node head){
		while(head != null){
			System.out.print(head.value + "->");
			head = head.next;
		}
	}
}
