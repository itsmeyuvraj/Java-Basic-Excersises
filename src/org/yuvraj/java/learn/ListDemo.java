package org.yuvraj.java.learn;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l= new LinkedList<>();
		
		l.add("Yuvraj");
		l.add("Sharma");
		
		
		
		for(String a:l)
		{
			System.out.println(a);
		}
		
		l.remove(1);
		
		
		System.out.println("After removing");
		
		for(String b:l)
		{
			System.out.println(b);
		}
		
		

	}

}
