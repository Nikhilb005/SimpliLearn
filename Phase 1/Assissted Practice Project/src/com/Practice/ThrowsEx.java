package com.Practice;

import java.io.IOException;

class Monitor{  
	 void method()throws IOException{  
	  System.out.println("device operation performed");  
	 }  
	}  
public	class ThrowsEx{  
	   public static void main(String args[])throws IOException{
		  Monitor m=new Monitor();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	}  