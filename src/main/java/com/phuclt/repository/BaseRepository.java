package com.phuclt.repository;

import com.phuclt.model.Product;

import java.util.List;

public interface BaseRepository<T> {
    List<T> findAll();

    T findById(int id);

    void save(T object);
}
