package com.phuclt.repository;

import com.phuclt.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    Product findById(int id);

    void save(Product object);
}
