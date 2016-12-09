package edu.orangecoastcollege.sbadajoz.ic27;
/*
Badajoz, Seve
CS A170
December 9, 2016

IC27
*/
public class Car extends Vehicle{
	private int mNumDoors;
	
	public Car(String manufacturer, int year, int numberOfDoors) {
		mManufacturer = manufacturer;
		mYear = year;
		mNumDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return mNumDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.mNumDoors = numberOfDoors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + mNumDoors;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (mNumDoors != other.mNumDoors)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Car: " + mManufacturer + ", " + mYear
				+ ", " + mNumDoors + " door" + ((mNumDoors > 1 || mNumDoors == 0)?"s":"") + "]";
	}
	
	
}
