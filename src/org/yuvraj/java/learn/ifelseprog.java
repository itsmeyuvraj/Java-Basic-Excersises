package org.yuvraj.java.learn;

import java.util.Scanner;

public class ifelseprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("eneter the age");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		
		if (age>18)
		{
			System.out.println(" you are eligible");
		}

		else
		{
			System.out.println("you are nt eligible");
		}
	}

}
