package org.yuvraj.java.learn;



class Dog {
	
	void exist()
	{
	  System.out.println("Has a tail and not wild");
	}
	
	
}

public class Allsision extends Dog{
	
	public void exist()
	{
		 System.out.println("Has a tail and wild");
	}
	

	public static void main(String[] args) {
		
		
		//Allsision alsision = new Allsision();
		Dog alsision = new Dog();
		alsision.exist();
		
		

	}

}
