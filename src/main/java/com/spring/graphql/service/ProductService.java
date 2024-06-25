package com.spring.graphql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.graphql.entity.ProductMaster;
import com.spring.graphql.repository.ProductMasterRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductMasterRepo productMasterRepo;

	public List<ProductMaster> getAll() {
		return productMasterRepo.findAll();
	}

	public List<ProductMaster> getByCategory(String category) {
		return productMasterRepo.findAllByCategory(category);
	}

	public ProductMaster updateStock(Integer id, Integer stock) {
		ProductMaster productMaster = productMasterRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found."));
		productMaster.setStock(stock);
		return productMasterRepo.save(productMaster);
	}

	public ProductMaster receiveNewShipment(Integer id, Integer stock) {
		ProductMaster productMaster = productMasterRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found."));
		productMaster.setStock(productMaster.getStock() + stock);
		return productMasterRepo.save(productMaster);
	}
}
