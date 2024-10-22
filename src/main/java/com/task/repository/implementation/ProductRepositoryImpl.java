package com.task.repository.implementation;

import com.task.entity.ProductEntity;
import com.task.repository.ProductRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductRepositoryImpl implements ProductRepository {

  private Map<String, ProductEntity> products = Map.of("1", new ProductEntity("1", "Laptop"), //
      "2", new ProductEntity("2", "PC"), //
      "3", new ProductEntity("3", "Smartphone") //
  );

  @Override
  public List<ProductEntity> findAll() {

    return new ArrayList<>(products.values());
  }

  @Override
  public ProductEntity saveOrUpdate(String id, ProductEntity entity) {

    return products.put(id, entity);
  }

  @Override
  public ProductEntity findById(String id) {

    return products.get(id);
  }
}
