package com.jr.patten;

public class ReverseRightHalfPyramid {

	public static void main(String[] args) {
		int k = 5;
		int n=5;
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=k;j++) {
				System.out.print("*");
			}k--;
			System.out.println();
		}
	}

}
