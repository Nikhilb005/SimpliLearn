package com.Practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class Queue1{
    
    public static void main(String[] args) throws IOException {
    	Queue<String> locationsQueue = new LinkedList<String>();
    					locationsQueue.add("Kolkata");
    	        		locationsQueue.add("Patna");
    	        		locationsQueue.add("Delhi");
    	        		locationsQueue.add("Gurgaon");
    	        		locationsQueue.add("Noida");
    	System.out.println("Queue is : " + locationsQueue);
    	 
    	        		System.out.println("Head of Queue : " + locationsQueue.peek());
    	        		locationsQueue.remove();
    	        		System.out.println("After removing Head of Queue : " + locationsQueue);
    	        		System.out.println("Size of Queue : " + locationsQueue.size());
    	    	}
    	}
