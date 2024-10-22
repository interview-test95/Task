package com.task.service;

import com.task.entity.ProductEntity;
import com.task.repository.implementation.ProductRepositoryImpl;
import com.task.repository.ProductRepository;
import java.util.List;

public class ProductService {

  private final ProductRepository productRepository = new ProductRepositoryImpl();

  public List<String> getAllProductNames() {

    return null;
  }

  public List<ProductEntity> saveOrUpdateAll(List<ProductEntity> productEntities) {

    return null;
  }
}
