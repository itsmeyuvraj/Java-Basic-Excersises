package org.yuvraj.java.learn;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the marks : ");
		
		int marks = 99;
		
		if (marks > 0 && marks <40)
		{
			System.out.println("Fail");
		}
		
		else if (marks > 40 && marks <55)
		{
			System.out.println("C");
		}
		
		else if (marks >= 55 && marks <60)
		{
			System.out.println("B");
		}
		
		else if (marks >= 60 && marks <75)
		{
			System.out.println("A");
		}
		
		else if (marks >= 75 && marks <100)
		{
			System.out.println("A+");
		}
		
		else {
			
			System.out.println("Invalid marks");
		}
		

	}

}
