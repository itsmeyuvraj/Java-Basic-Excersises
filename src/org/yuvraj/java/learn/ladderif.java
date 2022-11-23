package org.yuvraj.java.learn;

import java.util.Scanner;

public class ladderif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the marks");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		if(a>=0 && a<40)
		{
			System.out.println("fail");
		}
		else if(a>=40 && a<55)
		{
			System.out.println("c");
		}
		else if(a>=55 && a<65)
		{
			System.out.println("B");
		}
		else if(a>=65 && a<75)
		{
			System.out.println("A");
		}

		else if(a>=75 && a<=100)
		{
			System.out.println("A+");
		}
		else 
		{
			System.out.println("marks invalid");
		}
	}

}
