package org.yuvraj.java.learn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Set<String> l= new LinkedHashSet<>(); 
		//Set<String> l= new LinkedHashSet<>();
		Set<String> l= new HashSet<>();
		
		l.add("Yuvraj");
		l.add("Sharma");
		
		
		for(String a:l)
		{
			System.out.println(a);
		}
		
		

	}

}
