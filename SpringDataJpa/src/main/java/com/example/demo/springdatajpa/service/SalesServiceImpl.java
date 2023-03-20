package com.example.demo.springdatajpa.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.springdatajpa.data.entity.Sales;
import com.example.demo.springdatajpa.repository.SalesRepository;

@Service
public class SalesServiceImpl implements SalesService {


private final SalesRepository salesRepository;
	

	public SalesServiceImpl(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}

	@Override
	public Sales getSale(int id) {
		Optional<Sales> sale = salesRepository.findById((long) id);
		return sale.orElse(null);
	}
}