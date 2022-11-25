package org.yuvraj.java.learn;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class Test{    
	 public static void main(String args[]){    
	  try{    
	  //Creating the object    
	  Persists s1 =new Persists(211,"ravi");    
	  //Creating stream and writing the object    
	  FileOutputStream fout=new FileOutputStream("f.txt");    
	  ObjectOutputStream out=new ObjectOutputStream(fout);    
	  out.writeObject(s1);    
	  out.flush();    
	  //closing the stream    
	  out.close();    
	  System.out.println("success");    
	  }catch(Exception e){System.out.println(e);}    
	 }    
	}    
