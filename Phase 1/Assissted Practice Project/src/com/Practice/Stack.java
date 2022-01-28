package com.Practice;

import java.io.IOException;
import java.util.Scanner;
public class Stack{
    
    public static void main(String[] args) throws IOException {
   	 Scanner sc=new Scanner(System.in);
   	 System.out.println("eneter the size of the stack");
   	 int sizeOfStack=sc.nextInt();
   	 int stack[]=new int[sizeOfStack];
   	 int top=-1;
   	 System.out.println("stack operation");
   	 while(true) {
   	 System.out.println("enter your choice of stack 1.push 2.pop 3.display 4.exit");
   	 int choice=sc.nextInt();
   	 switch(choice) {
   	 case 1:if(top==sizeOfStack-1) {
   		 System.out.println("stack is full no more insertion");
   	 }
   	 else {
   		 System.out.println("eneter the value into the stack");
   		 int key=sc.nextInt();
   		 top=top+1;
   		 stack[top]=key;
   	 }
   		 break;
   	 case 2:if(top==-1)
		System.out.println("stack cannot be deleted further");
		else
top=top-1;
   		 break;
   	 case 3:
if(top==-1){
System.out.println("stack is empty");

}
 for(int i=top;i>=0;i--) {
   		 System.out.println(stack[i]);
   	 }
   		 break;
   	 case 4: System.exit(0);
   		 break;
   	 default: System.out.println("check the option and retry");
   		 break;
   	 }
   	 }  	 
}
}

