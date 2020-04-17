package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
		
	Flower [] flowerarray= {new Tulip("Tulip"),
				            new Rose("Rose"),
				            new Sunflower ("Sunflower")};
		
		
	ArrayList <Flower>flowers=new ArrayList<>();
	flowers.add(new Tulip("Tulip"));
	flowers.add(new Rose("Rose"));
	flowers.add(new Sunflower("Sunflower"));
	
	// 1. hw to call available methods using: 
	//for loop, advanced for loop, iterator
	System.out.println("_______Advanced Loop_______");
	for (Flower flower: flowers) {
		flower.bloom();
	}
	System.out.println("_______For Loop_______");
	for (int i=0; i<flowers.size(); i++) {
		 flowers.get(i).bloom();
	}
	System.out.println("_______Iterator_______");	
	Iterator <Flower>it=flowers.iterator();
	
	while (it.hasNext()) {
		Flower f= it.next();
		f.bloom();
	}
		
		
		
		
		
		
		

	}

}
