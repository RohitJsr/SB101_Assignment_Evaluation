package com.masaiQ4;

import java.util.ArrayList;

public class Genric {
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * 
		 Generics in Java
		The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects.
		 It makes the code stable by detecting the bugs at compile time.

		Before generics, we can store any type of objects in the collection, i.e.,
		 non-generic. Now generics force the java programmer to store a specific type of objects.

		Advantage of Java Generics
		There are mainly 3 advantages of generics. They are as follows:

		1) Type-safety: We can hold only a single type of objects in generics. 
		It doesn?t allow to store
		
		Without Generics, we can store any type of objects.
		
		List list = new ArrayList();    
		list.add(10);  
		list.add("10");  
		With Generics, it is required to specify the type of object we need to store.  
		List<Integer> list = new ArrayList<Integer>();    
		list.add(10);  
		list.add("10");// compile-time error  
		
		
		2) Type casting is not required: There is no need to typecast the object.

		Before Generics, we need to type cast.
		
		List list = new ArrayList();    
		list.add("hello");    
		String s = (String) list.get(0);//typecasting    
		After Generics, we don't need to typecast the object.  
		List<String> list = new ArrayList<String>();    
		list.add("hello");    
		String s = list.get(0);    
		
		
		3) Compile-Time Checking: It is checked at compile time so problem will not occur at runtime. The good programming strategy says it is far better to handle the problem at compile time than runtime.
		
		List<String> list = new ArrayList<String>();    
		list.add("hello");    
		list.add(32);//Compile Time Error    


		 */
	
	
	// initialize generic class
    // with Integer data
    GenericsClass<Integer> intObj = new GenericsClass<>(5);
    System.out.println("Generic Class returns: " + intObj.getData());

    // initialize generic class
    // with String data
    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
    System.out.println("Generic Class returns: " + stringObj.getData());
  }
}

// create a generics class
class GenericsClass<T> {

  // variable of T type
  private T data;

  public GenericsClass(T data) {
    this.data = data;
  }

  // method that return T type variable
  public T getData() {
    return this.data;
		
	
	

	}

}
