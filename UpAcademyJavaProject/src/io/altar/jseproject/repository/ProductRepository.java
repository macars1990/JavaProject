package io.altar.jseproject.repository;

import io.altar.jseproject.model.Product;

public class ProductRepository extends EntityRepository<Product> {
	
	private static final ProductRepository INSTANCE = new ProductRepository();
	
	private ProductRepository(){}
	
	public static ProductRepository getInstance(){
		return INSTANCE;
	}
	
public static void editProduct (int Id, double discount, int tax, double salePrice){
		
		((Product)ProductRepository.getInstance().get(Id)).setDiscount(discount);
		((Product)ProductRepository.getInstance().get(Id)).setTax(tax);
		((Product)ProductRepository.getInstance().get(Id)).setSalePrice(salePrice);
	}

	public static void editProductDiscount (int Id,double discount){
		
		((Product)ProductRepository.getInstance().get(Id)).setDiscount(discount);

	}
	
	public static void editProductIVA (int Id, int tax){
		
		((Product)ProductRepository.getInstance().get(Id)).setTax(tax);

	}

	public static void editProductSalePrice (int Id, double salePrice){
		
		((Product)ProductRepository.getInstance().get(Id)).setSalePrice(salePrice);

	}
}