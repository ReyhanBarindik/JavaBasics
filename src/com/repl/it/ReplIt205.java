package com.repl.it;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReplIt205 {

	public static void main(String[] args) {
		
	ArrayList <Map<String,Object>> dataList= new ArrayList <>();
		
	Map <String,Object> appleMap =new HashMap<>();
		
	appleMap.put("Items", "Apple");
	appleMap.put("Price", 20.00);
	appleMap.put("Quantity", 10);
		
		
	dataList.add(appleMap);
	
	Map <String,Object> orangeMap = new LinkedHashMap<>();
	
	orangeMap.put("Items", "Orange");
	orangeMap.put("Price", 21.99);
	orangeMap.put("Quantity", 10);
		
	dataList.add(orangeMap);
	Object sum1 = null;
	for ( String key :appleMap.keySet() ) {
	      Object k =appleMap.get(key);
	      sum1=20.00 *10;
	}
	Object sum2=null;
	for (String k : orangeMap.keySet()) {
		Object z=orangeMap.get(k);
		sum2=21.99*10;
		
	}
	
	
	Iterator <Map<String,Object>> it= dataList.iterator();
	while (it.hasNext()) {
		Entry<String,Object> x= (Entry<String, Object>) it.next();
		System.out.println(x.getKey()+":"+x.getValue()+" SubTotal: "+sum1);
	}
	
	
	
	
	System.out.println("Your Purchase total : "+sum1+sum2);
	
		
		
		

	}

}
