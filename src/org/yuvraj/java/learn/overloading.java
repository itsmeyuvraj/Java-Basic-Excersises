package org.yuvraj.java.learn;

public class overloading {

	
	static int add(int x,int y){
		return x+y;
	}
	static double add(double x,double y)
	{
		return x+y;
	}
	
	static int add(int x,int y,int z){
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b=add(5,6);
		double v=add(56.89,23.89);
		int v1=add(7,9,6);
		System.out.println(b);
		System.out.println(v);
		System.out.println(v1);
	}

}
