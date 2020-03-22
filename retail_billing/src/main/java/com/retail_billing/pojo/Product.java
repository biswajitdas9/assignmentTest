package com.retail_billing.pojo;

/**
 * A POJO class represent Product
 * @author Biswajit
 *
 */
public class Product {
	
	private String name;
	
	private String sku;
	
	private boolean isDiscountable;
	
	private double price;
	
	/** Retrieve the value of Name
	 * @return String
	 */
	public String getName() {
		return name;
	}
	
	/** Set the value of Name
	 * @return String
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/** Retrieve the value of Sku
	 * @return String
	 */
	public String getSku() {
		return sku;
	}
	
	/** Set the value of Sku
	 * @return String
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	/** Retrieve the Items is Discountable
	 * @return String
	 */
	public boolean isDiscountable() {
		return isDiscountable;
	}

	/** Set the value Discountble
	 * @return String
	 */
	public void setDiscountable(boolean isDiscountable) {
		this.isDiscountable = isDiscountable;
	}
	
	/** Retrieve the value of Price
	 * @return String
	 */
	public double getPrice() {
		return price;
	}
	
	/** Set the value of Price
	 * @return String
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}
