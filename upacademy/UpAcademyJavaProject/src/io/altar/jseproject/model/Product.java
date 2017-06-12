package io.altar.jseproject.model;

public class Product extends Entity{
//	private int productId;
//	private String shelfList;
	private double discount;
	private int tax;
	private double sellPrice;
	
	
//	public int getProductId() {
//		return productId;
//	}
//
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
	

//	public String getShelfList() {
//		return shelfList;
//	}
//
//	public void setShelfList(String shelfList) {
//		this.shelfList = shelfList;
//	}
	

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}



	public Product(double discount, int tax, double sellPrice) {
		super();
//		this.productId = productId;
//		this.shelfList = shelfList;
		this.discount = discount;
		this.tax = tax;
		this.sellPrice = sellPrice;
	}
	
}


