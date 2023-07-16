package com.js.BookMyShowClone.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.js.BookMyShowClone.entity.ProductionHouse;
import com.js.BookMyShowClone.repository.ProductionHouseRepo;

@Repository
public class ProductionHouseDao {

	@Autowired
	private ProductionHouseRepo repo;

	public ProductionHouse saveProductionHouse(ProductionHouse house) {
		return repo.save(house);
	}

	public ProductionHouse updateProductionHouse(long houseId, ProductionHouse house) {
		Optional<ProductionHouse> optional = repo.findById(houseId);
		if (optional.isPresent()) {
			// update the data
			house.setProductionId(houseId);
			house.setOwner(optional.get().getOwner());
			house.setMovies(optional.get().getMovies());
			repo.save(house);
			return house;
		}
		return null;

	}
}
