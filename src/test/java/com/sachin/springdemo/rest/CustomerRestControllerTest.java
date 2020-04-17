package com.sachin.springdemo.rest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sachin.springdemo.entity.Customer;

class CustomerRestControllerTest {

	@Test
	void getCustomersTest() {
		CustomerRestController restController = new CustomerRestController();
		List<Customer> customers = restController.getCustomers();
		System.out.println("Test For GET Request Completed");
	}

}
