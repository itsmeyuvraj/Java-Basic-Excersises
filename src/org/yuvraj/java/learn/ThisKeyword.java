package org.yuvraj.java.learn;

public class ThisKeyword {
	
	String name;
	
	ThisKeyword(String name)
	{
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword obj = new ThisKeyword("Name");
		obj.display();
		

	}

}
