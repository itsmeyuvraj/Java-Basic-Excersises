package org.yuvraj.java.learn;

import java.util.Scanner;

public class EvenOddScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		
		int number = s.nextInt();
		
		if(number==0)
			
			System.out.println("Enter a non zero integer");
			
			else if (number%2==0)
			
				System.out.println("Even");
		
				else 
					
					System.out.println("Odd");
			

	}

}
