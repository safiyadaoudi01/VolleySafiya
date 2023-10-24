package com.example.projetws.dao;

import java.util.List;

public interface IDao<T> {
    List<T> getAll();
    T getById(int id);
    void insert(T entity);
    void update(T entity);
    void delete(T entity);
}

