package com.learning02.array;

public class Person 
{
	int pId;
	String pName;
	String pLocation;
	
	public Person(int pId, String pName, String pLocation) 
	{
		this.pId = pId;
		this.pName = pName;
		this.pLocation = pLocation;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpLocation() {
		return pLocation;
	}

	public void setpLocation(String pLocation) {
		this.pLocation = pLocation;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pLocation=" + pLocation + "]";
	}
}
