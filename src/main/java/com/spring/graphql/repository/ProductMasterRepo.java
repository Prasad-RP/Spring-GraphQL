package com.spring.graphql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.graphql.entity.ProductMaster;

@Repository
public interface ProductMasterRepo extends JpaRepository<ProductMaster, Integer>{

	List<ProductMaster> findAllByCategoryMasterCategoryName(String category);

}
