package com.retail_billing.pojo;

import org.joda.time.DateTime;

/**
 * A POJO class represent retail Customer
 * @author Biswajit
 *
 */
public class RetailCustomer {
	
	private RetailCustomerType customerType;
	
	private String customerID;
	
	private String customerName;
	
	private DateTime registrationDate;
	
	public RetailCustomer(RetailCustomerType customerType, String customerID, String customerName, DateTime registrationDate) {
		super();
		this.customerType = customerType;
		this.customerID = customerID;
		this.customerName = customerName;
		this.registrationDate = registrationDate;
	}

	public RetailCustomerType getCustomerType() {
		return customerType;
	}
	
	/** Retrieve the value of Customer ID
	 * @return String
	 */
	public String getCustomerID() {
		return customerID;
	}
	
	/** Retrieve the value of Customer Name
	 * @return String
	 */
	public String getCustomerName() {
		return customerName;
	}
	
	/** Retrieve the value of Registration Date
	 * @return String
	 */
	public DateTime getRegistrationDate() {
		return registrationDate;
	}
	
	/**
	 * @return
	 */
	public boolean isAvailableForLoyaltyDiscount() {
		DateTime dateToCompare = DateTime.now().minusYears(DiscountCustomer.CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS);
		return registrationDate.isBefore(dateToCompare) && (RetailCustomerType.CUSTOMER == customerType);
	}
}
