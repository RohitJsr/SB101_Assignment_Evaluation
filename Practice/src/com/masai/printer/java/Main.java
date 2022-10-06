package com.masai.printer.java;

public class Main {
   public static void main(String[] args) {
	   ConsolePrinter cp= new ConsolePrinter();
	   Printer p1=new ConsolePrinter();
	   Printer p2= new FilePrinter();
	   cp.print();
	   p1.print();
	   p2.print();
   }
}

/*
Printing on the console
Printing on the console
fileprinter in java void method
*/