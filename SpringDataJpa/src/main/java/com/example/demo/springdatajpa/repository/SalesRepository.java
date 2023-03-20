package com.example.demo.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.springdatajpa.data.entity.Sales;

public interface SalesRepository  extends CrudRepository<Sales,Long>{

}