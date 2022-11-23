package org.yuvraj.java.learn;
//parent class
abstract class aircraft{
	
	public void engine()
	{
		System.out.println("follow engine guidelines");
	}
	
	public void safetyguidelines(){
		System.out.println("guidelines");
	}
	//abstract methods
	abstract void bodycolour();
}


public class Abstraction extends childemirites{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction a=new Abstraction();
		a.engineoil();
		//a.bodycolour();
//		a.safetyguidelines();
//		a.engine();
//		

	}

//	@Override
//	void bodycolour() {
//		// TODO Auto-generated method stub
//		System.out.println("bodycolour");
//	}

	@Override
	void engineoil() {
		// TODO Auto-generated method stub
		System.out.println("engine code");
	}

}
