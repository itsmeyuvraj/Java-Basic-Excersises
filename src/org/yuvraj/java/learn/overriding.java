package org.yuvraj.java.learn;

class human{
	public void eat(){
		System.out.println("parent eating");
	}
}
public class overriding extends human{
	
	public void eat(){
		
		super.eat();
		System.out.println("child is eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding b=new overriding();
		b.eat();

	}

}
