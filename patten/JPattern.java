package com.jr.patten;

public class JPattern {

	public static void main(String[] args) {
		int size = 9;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            	if (i==0  || j==size/2 || (i>=size/2 && j==0)||j <=size/2 && i==size-1) {    
            	System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
	}

}
