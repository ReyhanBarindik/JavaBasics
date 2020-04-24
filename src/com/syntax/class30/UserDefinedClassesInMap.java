package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store {
	String type, name;
	
	public Store (String type, String name) {
		this.name= name;
		this.type=type;
	}
	
	public void display() {
		System.out.println("This is store "+name);
	}
	public abstract void workingHours ();
}
class Nike extends Store {
	
	public Nike (String type, String name) {
		super(type,name);
	}
	public void workingHours () {
		System.out.println(name+" works from 10 am till 6 pm");
	}
}
class Costco extends Store {

	public Costco(String type, String name) {
		super(type, name);
		
	}

	@Override
	public void workingHours() {
		System.out.println(name+ " works from 8 am until 8 pm");
	}
	
}
class Amazon extends Store {

	public Amazon(String type, String name) {
		super(type, name);
		
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works 24/7");
		
	}
	
}

public class UserDefinedClassesInMap {

	public static void main(String[] args) {
		// we want to store stores in form 1 --> Amazon, 2 -->Costco, 3 --> Nike
		Map <Integer, Store>storeMap= new LinkedHashMap<>();
		storeMap.put(1, new Amazon("online","Amazon"));
		storeMap.put(2, new Costco("wholesale", "Costco"));
		storeMap.put(3, new Nike("retail", "Nike"));
		
		
		//to get an access to all methods of our Store Objects : .values();  .entrySet();  .keySet();
		//1.Way -->get all Value Objects
		System.out.println("________with values()_________");
		Collection <Store> col= storeMap.values();
		for (Store c : col) {
			c.workingHours();
			c.display();
		}
		
		System.out.println("________with entrySet()_________");
		//2.Way ---> get all Entry Objects --> getValue
		Set<Entry<Integer,Store>>storeSet=storeMap.entrySet();
		for (Entry<Integer, Store> element : storeSet) {
			element.getValue().display();     //---> I am just interesting value in here because i will acsess methods
			element.getValue().workingHours();
		}
		System.out.println("________with keySet()_________");
		//3.Way ---> get all Keys --> get value of specified key
		for (Integer key : storeMap.keySet()) {
			storeMap.get(key).display();
			storeMap.get(key).workingHours();
		}
		System.out.println("________with Iterator_________");
		Iterator<Entry<Integer, Store>> it= storeSet.iterator();   
		while (it.hasNext()) {
			Entry <Integer, Store> entry= it.next();
			entry.getValue().display();
			entry.getValue().workingHours();
		}
		
		
		
		
		
		

	}

}
