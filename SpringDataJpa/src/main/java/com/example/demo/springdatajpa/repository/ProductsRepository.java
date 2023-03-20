package com.example.demo.springdatajpa.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.springdatajpa.data.entity.Products;

public interface ProductsRepository extends CrudRepository<Products,Long>{

}