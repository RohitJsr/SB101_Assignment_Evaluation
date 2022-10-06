package com.masaiQ3;

public class SerialiazationAndDeSerialiazation {
/*
 We use Java to create objects. These objects are stored in memory and removed by the garbage collector once they’re no longer being used. If we want to transfer an object and, for instance, store it on a disk or send it over a network, we need to transform it into a byte stream. To do this, the class of that object needs to implement the Serializable interface. As we discussed earlier, serialization allows us to convert the state of an object into a byte stream. This byte stream does not contain the actual code.
 
 What is deserialization in Java?
Deserialization is precisely the opposite of serialization. With deserialization, you start with a byte stream and re-create the object you previously serialized in its original state. However, you must have the definition of the object to successfully re-create it.

public class ValueObject implements Serializable {

   private String value;
   private String sideEffect;

   public ValueObject() {
       this("empty");
   }

   public ValueObject(String value) {
       this.value = value;
       this.sideEffect = java.time.LocalTime.now().toString();
   }
}


ValueObject vo1 = new ValueObject("Hi");
FileOutputStream fileOut = new FileOutputStream("ValueObject.ser");
ObjectOutputStream out = new ObjectOutputStream(fileOut);
out.writeObject(vo1);
out.close();
fileOut.close();
 */
}
