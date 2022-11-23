package org.yuvraj.java.learn;

import java.util.Scanner;

public class indiantraffic implements Centraltrafic,continentaltraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//here indiantraffic is child and rest are parent 
		//child refernce = child class
		indiantraffic h=new indiantraffic();
		System.out.println("child refernce child class");
		h.green();
		h.yellow();
		h.traintraffic();
		//parent refernce =new child class
		System.out.println("parent reference child class");
		Centraltrafic g=new indiantraffic();
		g.green();
		g.yellow();
		
		
		 //child refrence =new parent class is not possible
		//indiantraffic j=new continentaltraffic();
		
		
	}

@Override
public void green() {
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

@Override
public void yellow() {
	// TODO Auto-generated method stub
	
	System.out.println("yellow");
}

@Override
public void traintraffic() {
	// TODO Auto-generated method stub
	
	System.out.println("train traffic");
	
}

	}


