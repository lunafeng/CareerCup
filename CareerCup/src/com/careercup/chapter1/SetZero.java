package com.careercup.chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class SetZero {
	public ArrayList x = new ArrayList<>();
	public ArrayList y = new ArrayList<>();
	
	public SetZero() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList set(ArrayList matrix, int M, int N){
		for(int i = 0; i < M; i++){
			ArrayList raw = new ArrayList<>();
			raw = (ArrayList) matrix.get(i);
			for(int j = 0; j < N; j++){
				int e = (int) raw.get(j);
				if(e == 0){
					x.add(i);
					y.add(j);
				}
			}
		}
		
		for(int i = 0; i < x.size(); i++){
			ArrayList raw = (ArrayList) matrix.get((int) x.get(i));
			for(int j = 0; j < N; j++){
				raw.set(j, 0);
			}	
		}
		for(int i = 0; i < y.size(); i++){
			for(int j = 0; j < M; j++){
				ArrayList raw = (ArrayList) matrix.get(j);
				for(int k = 0; k < N; k++){
					if(k == (int)y.get(i)){
						raw.set(k, 0);
					}
				}
			}
		}
		System.out.println("The new matrix is:\n");
		for(int i = 0; i < M; i++){
			System.out.println(matrix.get(i));
		}
		return matrix;
	}
}
