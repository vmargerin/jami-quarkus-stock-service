package org.jami.stock.model;

public class ProductStock {

	private final String sku;

	private final int quantity;

	public ProductStock(String sku, int quantity) {
		this.sku = sku;
		this.quantity = quantity;
	}

	public String getSku() {
		return sku;
	}

	public int getQuantity() {
		return quantity;
	}

}
