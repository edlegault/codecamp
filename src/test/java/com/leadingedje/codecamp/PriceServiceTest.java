package com.leadingedje.codecamp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PriceServiceTest {

	PriceService service;

	@Before
	public void setUp() throws Exception {
		service = new PriceService();
	}

	@Test
	public void testNullCustomer() {
		assertEquals("a null employee should be the base price", 10, service.calculatePrice(null, 10), 0);
	}

	@Test
	public void testAdultNonEmployee() {
		Customer customer = new Customer();
		customer.setAge(20);
		assertEquals("an adult non employee should be the base price", 10, service.calculatePrice(customer, 10), 0);
	}

	@Test
	public void testAdultNonEmployeeEdgeCase() {
		Customer customer = new Customer();
		customer.setAge(18);
		assertEquals("an adult non employee should be the base price", 10, service.calculatePrice(customer, 10), 0);
	}

	@Test
	public void testAdultEmployee() {
		Customer customer = new Customer();
		customer.setAge(20);
		customer.setEmployee(true);
		assertEquals("an adult employee should be half the base price", 5, service.calculatePrice(customer, 10), 0);
	}

	@Test
	public void testChildNonEmployee() {
		Customer customer = new Customer();
		customer.setAge(10);
		assertEquals("an child non employee should be the base price", 8, service.calculatePrice(customer, 10), 0);
	}

	@Test
	public void testChildEmployee() {
		Customer customer = new Customer();
		customer.setAge(10);
		customer.setEmployee(true);
		assertEquals("an child employee should be the base price", 4, service.calculatePrice(customer, 10), 0);
	}

}
