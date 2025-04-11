package com.array;

public class AddOf2Matrices {

	public static void main(String[] args) {
		int arr[][]= {{1,3},{3,2},{4,8}};
		int arr1[][]= {{2,6},{7,1},{1,9}};
		int rows=arr.length;
		int col=arr1[0].length;
		int sum[][]=new int[rows][col];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				sum[i][j]=arr[i][j]+arr1[i][j];
		}
		}
		System.out.println("Resultant matrix is :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(sum[i][j]+ " ");
		}
			System.out.println();
		}
		
	}
	
}
