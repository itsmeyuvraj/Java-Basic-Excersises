package org.yuvraj.java.learn;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the environment");
		Scanner s=new Scanner(System.in);
		String env=s.next();
		switch(env)
		{
		case "production":
			System.out.println("codes of Production");
			break;
		case "QA":
			System.out.println("codes of qa");
			break;
		default :
			System.out.println("invalid");
		}
		

	}

}
