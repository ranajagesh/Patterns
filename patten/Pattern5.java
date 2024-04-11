package com.jr.patten;

public class Pattern5 {
	    public static void main(String[] args) {
	        int size = 4; // Half of the original size

	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                if (j < size / 2 && i == size-1 ) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    
	}

}
//j == size / 2 || (i < size / 2 && j == 0) || (i >= size / 2 && i == j)
