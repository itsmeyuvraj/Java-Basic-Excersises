package org.yuvraj.java.learn;

class animal{
	void eat(){
		System.out.println("eating");
	}
}
class dog extends animal{
	void bark(){
		System.out.println("barking");
	}
}
class puppy extends dog{
	void weep(){
		System.out.println("weeping");
	}
}
public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal g=new animal();
		g.eat();
		puppy b=new puppy();
		b.weep();
		b.bark();
		b.eat();
		dog f=new dog();
		f.bark();
		f.eat();
		dog b1=new puppy();
		b1.bark();
		b1.eat();
		
		
		

	}

}
