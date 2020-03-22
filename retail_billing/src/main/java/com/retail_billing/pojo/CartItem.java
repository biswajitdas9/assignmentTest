package com.retail_billing.pojo;


/**
 * A POJO class represent items of a CART
 * @author Biswajit
 *
 */
public class CartItem {
	
	private Product product;
	
	private int quantity;
	
	private double totalCost;
	
	public CartItem(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.totalCost = product.getPrice() * quantity;
	}
	
	
	 
	/** Retrieve the value of Product
	 * @return Product
	 */
	public Product getProduct() {
		return product;
	}
	
	/** Retrieve the value of Quantity
	 * @return int
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/** Retrieve the value of Total cost
	 * @return Double
	 */
	public double getTotalCost(){
		return totalCost; 
	}

	public double getDiscountedPrice(double discountPercentage) {
		if(product.isDiscountable() && discountPercentage != 0 ) {
			return (totalCost - totalCost * discountPercentage/100);
		}
		return totalCost;
	}

}
