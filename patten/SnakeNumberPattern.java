package com.jr.patten;

public class SnakeNumberPattern {

	public static void main(String[] args) {
		int n = 5;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				int k = (n*i)-(n-1);
				for(int j=1;j<=n;j++) {
					System.out.print(k+"\t");
					k++;
				}
			} else {
				int k =n*i;
				for(int j=1;j<=n;j++) {
					System.out.print(k+"\t");
					k--;
				}
			}
			System.out.println();
		}
	}

}
