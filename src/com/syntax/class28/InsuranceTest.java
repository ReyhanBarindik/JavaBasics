package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		
	ArrayList <Insurance> insurances=new ArrayList<>();
	
	insurances.add(new Car("BMW","xyz"));
	insurances.add(new Pet("Husky", "PetCare"));
	insurances.add(new Health("Blue"));
	
	System.out.println("_____Advanced For Loop_______");
	for (Insurance i: insurances) {
		i.getQuote();
		i.cancelInsurance();
	}
	System.out.println("_________For Loop_________");	
	for (int i=0; i<insurances.size(); i++)	{
		insurances.get(i).getQuote();
		insurances.get(i).cancelInsurance();
	}
	System.out.println("_________Iterator_________");		
	
	Iterator <Insurance> it = insurances.iterator();
	while (it.hasNext()) {
		Insurance x=it.next();
		x.getQuote();
		x.cancelInsurance();
	}
		

	}

}
