package org.yuvraj.java.learn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<Integer,String> m=new HashMap<>();
		//Map<Integer,String> m=new LinkedHashMap<>();
		Map<Integer,String> m=new TreeMap<>();
		Map<String,Integer> m2= new TreeMap<>();
		m.put(1, "abc");
		m2.put("Hi", 1);
		
		m.put(2,"jkn");
		m.put(2,"xyz");
		for(Map.Entry v:m2.entrySet()){
			System.out.println(v.getKey()+" "+v.getValue());
		}

	}

}
