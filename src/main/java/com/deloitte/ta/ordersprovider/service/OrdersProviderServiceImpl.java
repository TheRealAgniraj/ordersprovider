package com.deloitte.ta.ordersprovider.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.deloitte.ta.ordersprovider.model.Orders;

@Service
public class OrdersProviderServiceImpl implements OrdersProviderService {

	@Override
	public Orders getOrderIDs() {

		Set<String> orderIDs = new HashSet<>();
		orderIDs.add("111");
		orderIDs.add("222");
		orderIDs.add("333");
		orderIDs.add("444");
		orderIDs.add("555");

		Orders orders = new Orders();
		orders.setOrderIDs(orderIDs);
		return orders;
	}

}
