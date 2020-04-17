package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {

	public static void main(String[] args) {
		
	LinkedList <Card> cars= new LinkedList<>();
	cars.add(new AE("American Express"));
	cars.add(new Visa("Visa"));
	cars.add(new Discover("Discover"));
	
	System.out.println("_____Advanced For Loop_______");
	for (Card card :cars)	{
		card.balance();
		System.out.println(card.getScores(2000));
	}
	System.out.println("__________For Loop__________");	
	for (int i=0; i<cars.size(); i++) {
		cars.get(i).balance();
		System.out.println(cars.get(i).getScores(3000));
	}
	System.out.println("__________Iterator__________");
	Iterator <Card>it= cars.iterator();
	while (it.hasNext()) {
		Card c=it.next();
		c.balance();
		System.out.println(c.getScores(4000));
	}
	

	}

}
