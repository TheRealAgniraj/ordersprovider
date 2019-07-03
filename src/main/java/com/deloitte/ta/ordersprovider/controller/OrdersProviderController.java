package com.deloitte.ta.ordersprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.ta.ordersprovider.model.Orders;
import com.deloitte.ta.ordersprovider.service.OrdersProviderService;

@RestController
public class OrdersProviderController {

	@Autowired
	OrdersProviderService service;

	@GetMapping("/getorders")
	public Orders getOrders() {
		return service.getOrderIDs();
	}
}
