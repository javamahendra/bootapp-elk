package com.app.controller;

import com.app.model.Customer;
import com.app.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")

public class CustomerController {
    final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        log.info("START - getAllCustomers");
        var customers = customerService.listAllCustomers();

        for(Customer customer : customers){
            log.info("login user id {}", customer.getId());
            log.info("login user name {}", customer.getName());
            log.info("login user country {}", customer.getCountry());
            log.info("login user email {}", customer.getEmail());
        }


        log.info("END - getAllCustomers");

        return ResponseEntity.ok(customers);
    }

    @GetMapping
    public ResponseEntity<Customer> getCustomerById(@RequestParam("customerId") String id) {
        log.info("START - getCustomerById, id: {}", id);
        var customer = customerService.getCustomerById(id);
        log.info("login user id {}", customer.getId());
        log.info("login user name {}", customer.getName());
        log.info("login user country {}", customer.getCountry());
        log.info("login user email {}", customer.getEmail());
        log.info("END - getCustomerById");

        return ResponseEntity.ok(customer);
    }
}