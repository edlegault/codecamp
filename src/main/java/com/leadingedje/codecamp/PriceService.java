package com.leadingedje.codecamp;

public class PriceService {

	/**
	 * Make the price 80% if the customer is under 18 and also give 50% employee discount
	 * @param customer
	 * @param basePrice
	 * @return the calculated price
	 */
	public double calculatePrice(Customer customer, double basePrice) {
		double price = basePrice;
		if (customer != null) {
			if (customer.getAge() < 18) {
				price = price * .8;
			}
			if (customer.isEmployee()) {
				price = price * .5;
			}
		}
		return price;
	}
}
