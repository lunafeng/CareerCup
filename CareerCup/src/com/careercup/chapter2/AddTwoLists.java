package com.careercup.chapter2;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;

public class AddTwoLists {
	AddTwoLists(){}
	public Node addTwo(Node head1, Node head2){
		Node newHead1 = reverseLinkedList(head1);
		int num1 = integer(newHead1);
		Node newHead2 = reverseLinkedList(head2);
		int num2 = integer(newHead2);
		int sum = num1 + num2;
		String sumStr = String.valueOf(sum);
		int value;
		value = Character.getNumericValue(sumStr.charAt(0));
		Node sumNode = new Node(value);
		for(int i = 1; i < sumStr.length(); i++){
			value = Character.getNumericValue(sumStr.charAt(i));
			System.out.println(value);
			sumNode.add(value);
		}
		sumNode.printList(sumNode);
		
		return sumNode;
	}
	public Node reverseLinkedList(Node head){
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
		return newHead;
	}
	public int integer(Node head){
		String s = "";
		while(head != null){
			String value = String.valueOf(head.data);
			s += value;
			head = head.next;
		}
		
		return Integer.parseInt(s);
	}
	

}
