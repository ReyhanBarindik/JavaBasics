package com.syntax.class23;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle obj = new SchoolBus ("x","y","z");
        Vehicle obj1= new Toyota ("x", "y","z");
        Vehicle obj2 =new Teslaa ("x","y","z");
        
        Vehicle [] vehicles= {obj,obj1,obj2};
        for (Vehicle v :vehicles) {
        	v.drive();
        	v.stop();
        	v.start();
        	v.brake();
        	Vehicle.total();
        }
	}

}
