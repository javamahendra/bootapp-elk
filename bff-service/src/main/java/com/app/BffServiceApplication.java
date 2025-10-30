package com.app;

import com.app.model.Customer;
import com.app.repo.CustomerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BffServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BffServiceApplication.class, args);
    }

    @Autowired
    private CustomerRepository customerRepository;

    @PostConstruct
    public void init(){

        for(int i =1; i<=1000; i++){
            Customer customer = Customer.builder()
                    .name("Daniel "+i)
                    .city("Berlin "+i)
                    .state("Norway "+i).country("India")
                    .email("Daniel"+i+"@gmail.com")
                    .phone("123456789"+i)
                    .address("1234 srta 12 sl"+i)
                    .build();


            String id = customerRepository.save(customer).getId();
            System.out.println(i+" :"+id);
        }






    }



}
