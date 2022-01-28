package com.Practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("a.txt");
		int ch = 0;
		while((ch =fr.read())!=-1){
			System.out.print((char)ch);
		}
		fr.close();
		System.out.println();
		System.out.println("file read successfully");
		
		FileWriter fw = new FileWriter("a.txt");
		fw.write("OK Google");
		System.out.println("file write successfully");
		fw.close();


	}

}
