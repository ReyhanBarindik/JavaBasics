package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIntro {

	public static void main(String[] args) {

		// Map map= new HashMap();

		// Map <String key, String value> map= new HashMap<>();

		Map<String, String> map = new HashMap<>();

		// map.put(key, value);

		map.put("myName", "Reyhan");
		map.put("myAddress", "Jacksonville");
		map.put("myNumber", "987654321");

		System.out.println(map);
        System.out.println(map.get("myName"));
        System.out.println(map.get("myName5")); //null
		map.put("myAddress", "Florida"); // you cannot repeat keys, it will print only last one value
		System.out.println(map);  //{myName=Reyhan, myAddress=Florida, myNumber=987654321}
		map.put("myLastname", "Reyhan"); // you can repeat value
		System.out.println(map);//{myName=Reyhan, myAddress=Florida, myNumber=987654321, myLastname=Reyhan}
		
		//How can I print 1 by 1 
		//First Way
		System.out.println("_______Advanced For Loop_______");
		
		//for (map.keySet()) {} if you want to get all keys use ---> keySet(); method 
		
		Set <String> keys = map.keySet();
		
		for (String key : keys) {
			System.out.println(key +" "+map.get(key));
		}                    //key        //value
		
		//Second Way for print 1 by 1
		//Set <Map.Entry<K, V>>       --->Entry is an Interface --> Interface inside Interface 
		Map <String, String> newMap = new HashMap<>();
		newMap.put("name", "Gulsum");
		newMap.put("lastName", "Ince");
		newMap.put("grade", "100");
		System.out.println("_________With Entry________");
		Set <Map.Entry<String, String>> values= newMap.entrySet();
		for (Map.Entry<String, String> value : values ) {
			System.out.println(value.getKey() +"  "+value.getValue());
			
		}
		
		
		
		
		
	}

}
