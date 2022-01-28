package com.Practice;

class DefaultAcc{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

public class AccessSpecifier1 {

	public static void main(String[] args) {
			System.out.println("Dafault Access Specifier");
			DefaultAcc obj = new DefaultAcc(); 		  
        obj.display(); 

	}
}