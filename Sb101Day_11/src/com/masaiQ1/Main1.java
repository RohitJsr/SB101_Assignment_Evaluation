package com.masaiQ1;

import java.io.File;
import java.io.FileWriter;



	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class Main1 {
		
		public static void main(String[] args) {
			
			File f=new File("abc.text");
			
			try {
				FileWriter fr=new FileWriter(f);
				
				fr.write("abcdef");
				fr.flush();
				fr.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			try {
				FileReader	fred = new FileReader(f);
				try {
					int i=fred.read();
					while(i!=-1) {
						System.out.println((char)i);
						i=fred.read();
						}
					
				} catch (IOException e) {
				
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}}		
			
	
