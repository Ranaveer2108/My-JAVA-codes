package com.array;

public class MultiDimArray {

	public static void main(String[] args) {
	 int array[][]= {{1,2},{2,3},{3,4}};
	 for(int i=0;i<array.length;i++) {
		 for(int j=0;j<array[0].length;j++)
			 System.out.print(array[i][j]+" ");
		 System.out.println();
	 }
	}

}
