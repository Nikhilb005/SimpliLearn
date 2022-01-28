package com.Practice;

class privateccessspecifier { 
   private void display() { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class AccessSpecifiers2 {

	public static void main(String[] args) {
		
		System.out.println("Private Access Specifier");
		privateccessspecifier  obj = new privateccessspecifier(); 
              //obj.display();

	}
}
