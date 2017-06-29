package io.altar.jseproject.model;

import io.altar.jseproject.repository.*;

public class Shelf extends Entity {
//	private int shelfId;
	private int productID;
	private int location;
	private int capacity;
	private double rentPrice;
	
//	public int getShelfId() {
//		return shelfId;
//	}
//	public void setShelfId(int shelfId) {
//		this.shelfId = shelfId;
//	}
	
	public int getProductID(){
		return productID;
	}
	public void setProductID(int productID){
		this.productID = productID;

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
	public Shelf(int location, int capacity, double rentPrice) {
		super();
//		this.shelfId = shelfId;
		this.location = location;
		this.capacity = capacity;
		this.rentPrice = rentPrice;
		ShelfRepository.getInstance().PutOnListShelf(this);
	}
	
	
}
