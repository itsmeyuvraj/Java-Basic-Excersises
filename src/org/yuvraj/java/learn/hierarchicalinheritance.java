package org.yuvraj.java.learn;

class animal1{
	void eat(){
		System.out.println("eating");
	}
}
class dog1 extends animal1{
	void bark(){
		System.out.println("barking");
	}
}
class cat extends animal1{
	void weep(){
		System.out.println("weeping");
	}
}

public class hierarchicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cat d=new cat();
d.eat();
d.weep();

dog n=new dog();
n.bark();
n.eat();
	}

}
