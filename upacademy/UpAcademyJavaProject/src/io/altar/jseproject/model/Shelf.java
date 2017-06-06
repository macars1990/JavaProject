package io.altar.jseproject.model;

public class Shelf extends Entity {
	private int shelfId;
	private int location;
	private int capacity;
	private double rentPrice;
	
	public int getShelfId() {
		return shelfId;
	}
	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}
	public Shelf(int shelfId, int location, int capacity, double rentPrice) {
		super();
		this.shelfId = shelfId;
		this.location = location;
		this.capacity = capacity;
		this.rentPrice = rentPrice;
	}
	
	
}
