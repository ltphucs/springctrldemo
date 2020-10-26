package com.phuclt.service;

import com.phuclt.model.Product;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();

    T findById(int id);

    void save(T object);
    //add
    //featyure 2 code heere
}
