package org.yuvraj.java.learn;

public class examplestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sample book";
		System.out.println(s.toUpperCase());
		String a="this";
		a=a.concat(" is ").concat(" mindscript").concat(" class");
		System.out.println(a);
		String r=a.replace('t','T');
		System.out.println(r);
		System.out.println(s.length());

	}

}
