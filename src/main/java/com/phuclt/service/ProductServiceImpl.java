package com.phuclt.service;
import com.phuclt.model.Product;
import com.phuclt.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements BaseService<Product> {

    @Autowired
    public BaseRepository<Product> productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return this.productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }
}
