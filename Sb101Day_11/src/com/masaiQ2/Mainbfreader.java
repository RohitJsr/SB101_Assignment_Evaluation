package com.masaiQ2;
import java.io.*;  

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Mainbfreader {
	    
	public static void main(String[] args) {
		
	   File f=new File("name.text");
	   
	   try {
		FileWriter wr=new FileWriter(f);
		BufferedWriter bwr=new BufferedWriter(wr);
		bwr.write("a");
		bwr.newLine();
		bwr.write(100);
		bwr.newLine();
		bwr.write("rum to dhokhebaj ho");
		bwr.flush();
		bwr.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
	   
	   
	  try {
		FileReader fr=new FileReader(f);
		BufferedReader bred=new BufferedReader(fr);
		try {
			String name=bred.readLine();
			while(name!=null) {
				System.out.println(name);
				name=bred.readLine();
			}
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	}
	  

	}

}