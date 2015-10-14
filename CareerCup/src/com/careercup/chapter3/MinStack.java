package com.careercup.chapter3;
/* How would you design a stack which, in addition to push and pop, also has a function min
 * which returns the minimum element? Push, pop and min should all operate in O(1) time
 * */
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
	public int min(){
		return min;
	}
	
		
	
}
