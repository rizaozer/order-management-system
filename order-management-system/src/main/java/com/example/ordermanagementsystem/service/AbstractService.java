package com.example.ordermanagementsystem.service;

import org.springframework.data.jpa.repository.JpaRepository;


public abstract class AbstractService<ENTITY, ID, T extends JpaRepository<ENTITY, ID>> {
    protected final T repository;

    public AbstractService(T repository) {
        this.repository = repository;
    }

    public void insert(ENTITY entity) {
        repository.save(entity);
    }
}
