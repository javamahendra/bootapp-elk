package com.app.service;

import com.app.model.Customer;

import java.util.List;

public interface CustomerService {
  List<Customer> listAllCustomers();
  Customer getCustomerById(String id);
}