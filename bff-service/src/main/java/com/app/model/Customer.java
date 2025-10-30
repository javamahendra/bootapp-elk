package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("customer")
public class Customer {
  @Id
  private String id;
  private String name;
  private String email;
  private String phone;
  private String address;
  private String city;
  private String state;
  private String country;
}