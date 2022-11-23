package org.yuvraj.java.learn;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Environment ");
		Scanner s = new Scanner(System.in);
		
		//String env = s.next();
		int env = s.nextInt();
		
		switch(env)
		{
		case 1:
			System.out.println("Codes for production");
			break;
		case 2:
			System.out.println("Codes for pre-production");
			break;
		case 3:
			System.out.println("Codes for QA");
			break;
		default :
			System.out.println("Invalid");
			break;
		}
		

	}

}
