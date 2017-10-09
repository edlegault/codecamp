package com.leadingedje.codecamp;

public class PriceService {

	public double calculatePrice(Customer customer, double basePrice) {
		double price = basePrice;
		if (customer != null) {
			if (customer.getAge() < 18) {
				price = basePrice * .8;
			}
			if (customer.isEmployee()) {
				price = price * .5;
			}
		}
		return price;
	}
}
