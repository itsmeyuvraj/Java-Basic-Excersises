package org.yuvraj.java.learn;



class parents{
	
public void colour()
{
	System.out.println("colour");
}
}

class child{
	
	public void behaviour(){
		System.out.println("same as parent");
	}
}

public class inheritance extends parents{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parents b=new parents();
b.colour();


	}

}
