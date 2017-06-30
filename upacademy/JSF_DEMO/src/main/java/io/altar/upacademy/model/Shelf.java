package io.altar.upacademy.model;

public class Shelf extends Entity {
	private int code;
	private int capacity;
	private double price;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Shelf() {

	}	
	
	@Override
	public String toString(){
		return "|Id: " + getId() + "|Código: " + code + "|Capacidade: " + capacity + "|Preço: " + price + "|";             
	}

}
