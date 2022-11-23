package org.yuvraj.java.learn;

class flower{
	//default method
	public void smell(){
		System.out.println("Its smelling good");
	}
	
	//parametrized method
	public void add(int a,int b)
	{
		int res=a+b;
		System.out.println("addition is="+res);
	}
	
	public void multi(int f,int h)
	{
		int d=f*h;
		System.out.println(d);
	}
}

public class methodstypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flower f=new flower();
		f.smell();
		f.add(5, 6);
		f.add(74, 96);
		f.multi(89, 6);
		f.multi(58, 25);
		

	}

}
