package com.careercup.chapter1;

import java.util.ArrayList;

public class RotateImage {
	public RotateImage() {
	}
	public ArrayList rotate(ArrayList image, int N){
		ArrayList newImage = new ArrayList();	
		for(int j = 0; j < N; j++){
			ArrayList newRaw = new ArrayList();
			for(int i = 0; i < N; i++){
				ArrayList al = (ArrayList) image.get(i);
				int e = (int) al.get(j);
				newRaw.add(e);
			}
			newImage.add(newRaw);
		}	
		return newImage;
	}
}
