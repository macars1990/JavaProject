package io.altar.upacademy.view;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.service.ProductService;

@Named("productView")
@RequestScoped 

public class ProductView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	
	private ProductService productService;
	
	private Product product = new Product();
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void addProduct() {
		productService.createProducts(product);
	}
	
	public void removeProduct() {
		productService.removeProducts(product);
	}
	
	public Collection<Product> getProducts(){
		return productService.getProducts();
	}
}




