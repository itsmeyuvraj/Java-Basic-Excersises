package org.yuvraj.java.learn;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("enter the number");
	System.out.println("enetr the second number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();	
		int b=s.nextInt();

		//int a=3;
		for(int i=1;i<=b;i++)
		{
			int res=a*i;
			System.out.println(a+"*"+i+"="+res);
		}
	}

}
