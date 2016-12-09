package edu.orangecoastcollege.sbadajoz.ic27;

import java.util.ArrayList;

/*
Badajoz, Seve
CS A170
December 9, 2016

IC27
*/
public class VehicleDemo {
	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		Boat empacher = new Boat("Empacher", 2017, 0);
		vehicles.add(empacher);
		Boat uSP = new Boat("Hudson", 2017, 0);
		vehicles.add(uSP);
		
		Car e30 = new Car("BMW", 1991, 2);
		vehicles.add(e30);
		Car f1 = new Car("Mercedes", 2017, 0);
		vehicles.add(f1);
		
		
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
}
