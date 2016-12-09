package edu.orangecoastcollege.sbadajoz.ic27;
/*
Badajoz, Seve
CS A170
December 9, 2016

IC27
*/
public class Boat extends Vehicle {
	private int mNumCabins;
	
	public  Boat(String manufacturer, int year, int numberOfCabins) {
		mManufacturer = manufacturer;
		mYear = year;
		mNumCabins = numberOfCabins;
	}

	public int getNumberofCabins() {
		return mNumCabins;
	}

	public void setNumberOfCabins(int numberOfCabins) {
		this.mNumCabins = numberOfCabins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + mNumCabins;
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
		Boat other = (Boat) obj;
		if (mNumCabins != other.mNumCabins)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Boat: " + mManufacturer + ", " + mYear
				+ ", " + mNumCabins + " cabin" + ((mNumCabins > 1 || mNumCabins == 0)?"s":"") + "]";
	}
	
	
}
