# IC27_AbstractVehicleInheritance
## In this assignment, you will be creating an application for Vehicle Inventory, which will keep track of a company’s collection of “Vehicles”, which include “Boats” and “Cars”.  You will be creating 3 classes to represent this data: Vehicle.java, Boat.java and Car.java.  For our purposes, “Vehicle” will be the abstract base (parent) class and “Boat” and “Car” will be the concrete derived (child) classes.


**_Vehicle:_** This is the abstract parent (base) class of the other two.  Here are the specifications:

1. Make Vehicle an abstract class (cannot be instantiated).
2. Create instance variables for *manufacturer* (String) and *year* (int).   **Be sure that all instance variables can be inherited by the two child classes**
3. Create accessors/mutators for all instance variables.

**_Boat:_** This one of the concrete child (derived) classes.  Here are the specifications:

1. Create instance variable for *numberOfCabins* (int).
2. Create accessor/mutator for *numberOfCabins*.
3. Create a constructor with 3 parameters (manufacturer, year, numberOfCabins).  Initialize all instance variables.
4. Override the equals() method to compare all instance variables for equality.
5. Override the toString() method that displays all fields in the following format:
“Boat:  manufacturer, year, numberOfCabins”  For example:

`[Boat: Chris Craft, 1959, 3 cabins]`

**_Car:_** This is the other concrete child (derived) class.  Here are the specifications:

1. Create instance variable for numberOfDoors (int).
2. Create accessor/mutator for numberOfDoors.
3. Create a constructor with 3 parameters (manufacturer, year, numberOfDoors).  Initialize all instance variables.
4. Override the equals() method to compare all instance variables for equality.
5. Override the toString() method that displays all fields in the following format:
“Car:  manufacturer, year, numberOfDoors”  For example:

`[Car: Tesla, 2017, 2 doors]`

**_VehicleDemo:_** in this demo, write a public static void main(String[ ] args) method that performs the following:

1. Maintains an ArrayList<Vehicle>
2. Creates 2 Boat objects (you provide the data for each object) and adds them to the ArrayList
3. Creates 2 Car objects (you provide the data for each object) and adds them to the ArrayList
4. Loop through the ArrayList and print each of the objects to the console.

Below is a UML diagram showing the class inheritance:

![abstract vehicle](https://github.com/S33V/IC27_AbstractVehicleInheritance/tree/master/images/AbstractVehicleInheritance.png "AbstractVehicleInheritance")
