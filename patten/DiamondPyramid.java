package com.jr.patten;

public class DiamondPyramid {
public static void main(String[] args) {
	int n = 7;
	int st =1;
	int sp = n/2;
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=sp;j++) {
			System.out.print(" ");
			}
			for(int k=1;k<=st;k++) {
				System.out.print("*");
			}
		System.out.println();
				if(i<=n/2) {
					sp--;
					st+=2;
				} 
				else {
					sp++;
					st-=2;
				}
			}		
	}
}

