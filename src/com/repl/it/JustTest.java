package com.repl.it;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
public class JustTest {
public static void main(String[] args) {

		

		Map<String, Object> appleMap = new LinkedHashMap<>();

		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10);

		

		Map<String, Object> orangeMap = new LinkedHashMap<>();

		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);
		
		List<Map<String, Object>> dataList = new ArrayList<>();
		dataList.add(appleMap);
		dataList.add(orangeMap);
		double sum = 0;
        double totalSum=0;
		for (Map<String, Object> elements : dataList) {

			Set<String> keys = elements.keySet();

			for (String key : keys) {
				System.out.print(key + ": " + elements.get(key) + " ");

				if (elements.get(key).equals("Apple")) {
					sum = 20.00 * 10;
				} else if (elements.get(key).equals("Orange")) {
					sum = 21.99 * 10;
				}
				
			}
			totalSum+=sum;
			System.out.println("SubTotal: " + sum);
           
		}
		System.out.println("Your Purchase total : "+totalSum);

	}

}
