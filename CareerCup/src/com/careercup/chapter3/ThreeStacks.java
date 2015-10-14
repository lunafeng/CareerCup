package com.careercup.chapter3;

import java.util.ArrayList;

/*
 *  Describe how you could use a single array to implement three stacks
 */
public class ThreeStacks {
	int[] stackTop = {0,0,0};
	int length;
	ArrayList aList;
	ThreeStacks(ArrayList a){
		aList = a;
		length = a.size();
		stackTop[0] = 0 * (length/3);
		stackTop[1] = 1 * (length/3);
		stackTop[2] = 2 * (length/3);

	}
	public void push(int stackNum, int data){
		aList.set(stackTop[stackNum-1], data);
		stackTop[stackNum-1]++;
	}
	public int pop(int stackNum){
		if(stackTop[stackNum-1] > 0){
			int dataOut = (int) aList.get(stackTop[stackNum-1]);
			stackTop[stackNum-1] = stackTop[stackNum-1] - 1;
			return dataOut;
		}else{
			System.out.println("The stack is empty");
			return 0;
		}
	}
	
	public void printStack(int stackNum){
		int topIndex = stackTop[stackNum-1];
		int k = (stackNum - 1) * (length/3);
		if(aList.get(k) != null){
			for(int i = k; i < topIndex; i++){
				System.out.println(aList.get(i));
			}
		}
	}
}
