package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		
	  ArrayList<Food> foods= new ArrayList<>();
	  
	  foods.add(new Hamburger());
	  foods.add(new Pizza());
	  foods.add(new Kebab());
	  
	  System.out.println("_________Advanced For Loop_______");
	  
	  for (Food food: foods) {
		  food.taste();
		  food.taste();
		  food.serve();
	  }
	  System.out.println("___________For Loop_________");
	  
	  for (int i=0; i<foods.size(); i++) {
		  foods.get(i).taste();
		  foods.get(i).cuisine();
		  foods.get(i).serve();
	  }
	  System.out.println("___________Iterator_________");
	  
	  Iterator <Food>it= foods.iterator();
	  while (it.hasNext()) {
		  Food f= it.next();
		  f.taste();
		  f.cuisine();
		  f.serve();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
