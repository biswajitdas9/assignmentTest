package com.retail_billing.service;

import java.util.List;

import com.retail_billing.pojo.CartItem;
import com.retail_billing.pojo.DiscountCustomer;
import com.retail_billing.pojo.RetailCustomer;
import com.retail_billing.pojo.RetailCustomerType;

/**
 * This class use for calculate the net payable amount for the retail customer
 * @author Biswajit
 *
 */
public class BillCalculatorServiceImpl implements BillCalculatorService {
	
	/* (non-Javadoc)
	 * @see com.retail_billing.service.BillCalculatorService#calculateTotalPayableAmount(com.retail_billing.pojo.RetailCustomer, java.util.List)
	 */
	public double calculateTotalPayableAmount(RetailCustomer customer, List<CartItem> items) {
		double totalDiscountedPrice = 0;
		double discountPercentage = getDiscountPercentageForCustomer(customer);
		for(CartItem item:items) {
			totalDiscountedPrice = totalDiscountedPrice + item.getDiscountedPrice(discountPercentage);
		}
		 
		return Math.round(totalDiscountedPrice - getDiscountBasedOnTotalAmount(totalDiscountedPrice));
	}


	/**
	 * Return the discounted percentage for the retail customer based on customer type
	 * @param customer
	 * @return Double
	 */
	private double getDiscountPercentageForCustomer(RetailCustomer customer) {
		RetailCustomerType customerType = customer.getCustomerType();
		if(customerType == RetailCustomerType.AFFILIATE || customerType == RetailCustomerType.EMPLOYEE || customer.isAvailableForLoyaltyDiscount()) {
			return customerType.getDiscountPercentage();
		}
		return 0;
	}
	
	
	/**
	 * Return the discounted amount for the retail customer based on Total amount
	 * @param double
	 * @return Double
	 */
	private double getDiscountBasedOnTotalAmount(double totalDiscountedPrice) {
		return Math.floor(totalDiscountedPrice / 100) * DiscountCustomer.DISCOUNTED_PER_HUNDRED;
	}
}
