package io.altar.upacademy.model;

public class Product extends Entity {
	private double discount;
	private int tax;
	private double salePrice;
	
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
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public Product() {
	}
	
	@Override
	public String toString(){
		return "|Id: " + getId() + "|Desconto: " + discount + " €" + "|IVA: " + tax + " %" + "|Preço de Venda: " + salePrice + " €" + "|";             
	}
}
