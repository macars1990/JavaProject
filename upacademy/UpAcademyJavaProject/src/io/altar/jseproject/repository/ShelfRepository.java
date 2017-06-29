package io.altar.jseproject.repository;

import io.altar.jseproject.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf> {
	
	private static final ShelfRepository INSTANCE = new ShelfRepository();
	
	private ShelfRepository(){}
	
	public static ShelfRepository getInstance(){
		return INSTANCE;
	}
	
public static void editShelf (int Id, int code, int capacity, double price){
		
		((Shelf)ShelfRepository.getInstance().get(Id)).setLocation(code);
		((Shelf)ShelfRepository.getInstance().get(Id)).setCapacity(capacity);
		((Shelf)ShelfRepository.getInstance().get(Id)).setRentPrice(price);
	}
	
	public static void editShelfCode (int Id, int code){
		
		((Shelf)ShelfRepository.getInstance().get(Id)).setLocation(code);
	}
	
	public static void editShelfCapacity (int Id, int capacity){
		
		((Shelf)ShelfRepository.getInstance().get(Id)).setCapacity(capacity);
	}
	
	public static void editShelfPrice (int Id, double price){
		
		((Shelf)ShelfRepository.getInstance().get(Id)).setRentPrice(price);
	}

}
