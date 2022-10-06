package com.masaiQ5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo2 {
	
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("file1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Student a1=(Student)obj;
		
		String ss=(String)ois.readObject();
		System.out.println(ss);
		int z=(Integer)ois.readObject();
		System.out.println(z);
		ois.close();
		}

}
