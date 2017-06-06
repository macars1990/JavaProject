package io.altar.jseproject.repository;

import java.util.LinkedHashMap;

import io.altar.jseproject.model.Entity;



public abstract class EntityRepository <E extends Entity> {
	private LinkedHashMap<Integer, Entity> produtos = new LinkedHashMap <Integer, Entity>();
	
	private static int Id = 0;
	
	
	
	
	
	
	
}
