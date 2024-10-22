package com.task.service;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductServiceTest {

  @Test
  void getAllProductNames_correctNamesReturned() {

    //given
    ProductService productService = new ProductService();

    //when
    List<String> foundProductNames = productService.getAllProductNames();

    //then
    Assertions.assertLinesMatch(List.of("Laptop", "PC", "Smartphone"), foundProductNames);
  }

  @Test
  void saveOrUpdateAll() {

  }
}