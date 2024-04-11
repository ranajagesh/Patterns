package com.jr.patten;

public class SpecialPattern {

	public static void main(String[] args) {
		
	}
	
	public static int[][] special(int size) {
		int [][]a = new int [size][size];
		int row = -1;
		int col = 0;
		
		char dir = 'd';
		
		for(int i=1;i<=size*size;i++) {
			switch(dir) {
			case 'd':
				row++;
				a[col][row] = i;
				
			}
		}
		return a;
		
	}

}
