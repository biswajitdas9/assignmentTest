package com.retail_billing.service;

import java.util.List;

import com.retail_billing.pojo.CartItem;
import com.retail_billing.pojo.RetailCustomer;

public interface BillCalculatorService {
	
	double calculateTotalPayableAmount(RetailCustomer customer, List<CartItem> items);

}
