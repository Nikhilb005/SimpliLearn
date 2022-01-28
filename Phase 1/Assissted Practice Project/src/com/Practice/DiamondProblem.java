package com.Practice;

interface Interface1  {  
	public default void display()   {  
		System.out.println("the display() method of Interface1 invoked");  
	}  
}  

interface Interface2  {  
	public default void display()   {  
		System.out.println("the display() method of Interface2 invoked");  
	}  
}  

public class DiamondProblem implements Interface1, Interface2  {
	public static void main(String args[])   
	{  
		DiamondProblem obj = new DiamondProblem();  
		obj.display();  
	} 
	public void display()   {  
		Interface1.super.display();  
		Interface2.super.display();  
		}  
}