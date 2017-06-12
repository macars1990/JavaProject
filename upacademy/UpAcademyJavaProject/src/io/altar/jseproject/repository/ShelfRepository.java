package io.altar.jseproject.repository;

import io.altar.jseproject.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf> {
	
	private static final ShelfRepository INSTANCE = new ShelfRepository();
	
	private ShelfRepository(){}
	
	public static ShelfRepository getInstance(){
		return INSTANCE;
	}

}
