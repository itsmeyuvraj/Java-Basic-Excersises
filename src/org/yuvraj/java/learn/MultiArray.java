package org.yuvraj.java.learn;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= new int [2][2];
		
		a[0][0]=2;
		a[0][1]=3;
		a[1][0]=4;
		a[1][1]=5;
		
		
		  for(int row[]:a) { for (int col:row) { System.out.println(col); } }
		 
		
	}

}
