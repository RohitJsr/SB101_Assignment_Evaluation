package com.masaiQ5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		Address a1=new Address();
		a1=new Address("Punjab","Chandigarh","543260"); //change the state of a1 object
		FileOutputStream fos=new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.writeObject("Welcome");//String class object
		oos.writeObject(10); //autoboxing
		oos.close();
		System.out.println("a1 object is serailized");

	}


}
