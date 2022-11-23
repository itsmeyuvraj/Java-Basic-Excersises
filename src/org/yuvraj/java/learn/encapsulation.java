package org.yuvraj.java.learn;
class encap{

	private String name="kiran";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int age;
	public void display(){
		System.out.println(name);
	}
}


public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		encap g=new encap();
		g.display();
		g.setName("smriti");
		System.out.println("name="+g.getName());
		

		
	}

}
