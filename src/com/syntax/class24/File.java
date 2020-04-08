package com.syntax.class24;

public abstract class File {
         //Create a class File that will have the following behaviors: open, edit, close.
	     //Edit and close are implemented method while open is an abstract. Create 3 subclasses:
	     //JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour: Example: to open .
	     //java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
	
	    public abstract void open ();
	    public  void edit () {
	    	System.out.println("Editing ...");
	    }
	    public void close() {
	    	System.out.println("Closing ...");
	    }
	    public static void main (String [] args) {
	    	File obj = new PDFFile ();
	    	File obj1= new JavaFile ();
	    	File obj2 = new WordFile ();
	    	File [] objects = {obj, obj1, obj2};
	    	for (File o : objects) {
	    		o.close();
	    		o.edit();
	    		o.open();
	    	}
	    	
	    }
}
class JavaFile extends File {
	
	public void open () {
		System.out.println("to open we need notepad++ or sublime text");
	}
	
}
class PDFFile extends File {
	public void open () {
		System.out.println("to open we need Microsoft word to be installed");
	} 
}
class WordFile extends File {
	public void open () {
		System.out.println("to open we need ...");
	}
}