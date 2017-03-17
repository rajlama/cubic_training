package com.dipu.company;

public class RepeatedClass1 {

int i = 10; // instant variable
static int k = 20; // static variable

void read(){
	System.out.println("read the value"+i);
	
}

 public static void main(String[] args){
	 RepeatedClass1 a = new RepeatedClass1(); // creating an object of variable
	
	  int j = 30; //local veriable
	System.out.println("value of a j is "+j);
	
	System.out.println("value of i is "+a.i);
	 
	System.out.println("value of "+k);
	a.read();
	 
	 
	 
	 
 }
}
