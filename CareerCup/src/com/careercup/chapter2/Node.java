package com.careercup.chapter2;

public class Node {
	public Node next = null;
	public int data;
	public Node(int d){
		this.data = d;
	}
	public void add(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
		
	}
	public Node delete(Node head, int data){
		Node n = head;
		if(n.data == data){
			head = n.next;
			n = head;
		}
		while(n.next != null){
			if(n.next.data == data){
				n.next = n.next.next;
				continue;
			}else{
				n = n.next;
			}
		}
		return head;
	}
	public void printList(Node head){
		while(head.next != null){
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println(head.data);
	}
}
