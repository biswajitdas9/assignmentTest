package com.retail_billing.retail_billing;

import junit.framework.Assert;

import org.junit.Test;

import com.retail_billing.pojo.RetailCustomer;
import com.retail_billing.retail_billing.databuiilder.RetailBillingDataBuilder;

/**This is the test class for Customer
 * @author Biswajit
 *
 */
public class CustomerTest {
	
	@Test
	public void returnTrueForMoreThanTwoYearOldRegistration() {
		RetailCustomer customer = RetailBillingDataBuilder.getRetailCusWithMoreThanTwoYearRegistration();
		Assert.assertTrue(customer.isAvailableForLoyaltyDiscount());
	}
	
	@Test
	public void returnFalseForNonEmployee() {
		RetailCustomer customer = RetailBillingDataBuilder.getAffiliateRetailCustomer();
		Assert.assertFalse(customer.isAvailableForLoyaltyDiscount());
	}
	
	@Test
	public void returnFalseForLessThanTwoYearOldRegistration() {
		RetailCustomer customer = RetailBillingDataBuilder.getRetailCusWithLessThanTwoYearRegistration();
		Assert.assertFalse(customer.isAvailableForLoyaltyDiscount());
	}
}
