package com.spring.graphql.api;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graphql.entity.ProductMaster;
import com.spring.graphql.service.ProductService;

import lombok.RequiredArgsConstructor;

// For Graph QL we don't need These two annotations 
//@RestController
//@RequestMapping("/api/v1/product")
@Controller
@RequiredArgsConstructor
public class ProductApi {

	private final ProductService service;

//	@GetMapping // Insted of get mapping use Query Mapping.
	@QueryMapping
	public List<ProductMaster> getAllProducts() {
		return service.getAll();
	}

//	@GetMapping("/category/{category}")  // Insted of get mapping use @PathVariable use @Argument
	@QueryMapping
	public List<ProductMaster> getAllProductsByCategory(@Argument String category) {
		return service.getByCategory(category);
	}

	// to update the product
	@MutationMapping // For create , update and delete we use @MutationMapping
	public ProductMaster updateStock(@Argument Integer productId, @Argument Integer stock) {
		return service.updateStock(productId, stock);
	}

	@MutationMapping // For create , update and delete we use @MutationMapping
	public ProductMaster receiveNewShipment(@Argument Integer productId, @Argument Integer stock) {
		return service.receiveNewShipment(productId, stock);
	}

}
