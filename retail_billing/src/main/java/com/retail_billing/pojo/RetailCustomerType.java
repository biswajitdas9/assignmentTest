package com.retail_billing.pojo;

/**
 * A ENUM represent retail Customer Type
 * @author Biswajit
 *
 */
public enum RetailCustomerType {
	
	AFFILIATE(10),EMPLOYEE(30),CUSTOMER(5);
	
	private double discountPercentage;
	
	RetailCustomerType(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	/**
	 * Returns discounted percentage
	 * @return Double
	 */
	public double getDiscountPercentage() {
		return discountPercentage;
	}

}
