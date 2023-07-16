package com.js.BookMyShowClone.service;

import java.util.ArrayList;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.js.BookMyShowClone.dao.OwnerDao;
import com.js.BookMyShowClone.dao.ProductionHouseDao;
import com.js.BookMyShowClone.dto.ProductionHouseDto;
import com.js.BookMyShowClone.entity.Owner;
import com.js.BookMyShowClone.entity.ProductionHouse;
import com.js.BookMyShowClone.exception.OwnerIdNotFoundException;
import com.js.BookMyShowClone.exception.ProductionHouseIdNotFoundException;
import com.js.BookMyShowClone.util.ResponseStructure;

@Service
public class ProductionHouseService {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private ProductionHouseDao houseDao;
	@Autowired
	private OwnerDao ownerDao;

	public ResponseEntity<ResponseStructure<ProductionHouse>> saveProductionHouse(long ownerId,
			ProductionHouseDto houseDto) {
		Owner dbOwner = ownerDao.findOwnerById(ownerId);
		if (dbOwner != null) {
			ProductionHouse house = this.modelMapper.map(houseDto, ProductionHouse.class);
			if (dbOwner.getProductionHouse().isEmpty()) {
				List<ProductionHouse> list = new ArrayList<ProductionHouse>();
				list.add(house);
				dbOwner.setProductionHouse(list);
			}
			house.setOwner(dbOwner);
			ProductionHouse dbProductionHouse = houseDao.saveProductionHouse(house);
			ResponseStructure<ProductionHouse> structure = new ResponseStructure<ProductionHouse>();
			structure.setMessage("ProductionHouse Added Successfully");
			structure.setStatus(HttpStatus.CREATED.value());
			structure.setData(dbProductionHouse);
			return new ResponseEntity<ResponseStructure<ProductionHouse>>(structure, HttpStatus.CREATED);
		} else {
			// Raise one exception ownerIdIsNotPresent
			throw new OwnerIdNotFoundException("Sorry failed to add productionHouse");
		}
	}

	public ResponseEntity<ResponseStructure<ProductionHouse>> updateProductionHouse(long houseId,
			ProductionHouseDto houseDto) {
		ProductionHouse house = this.modelMapper.map(houseDto, ProductionHouse.class);

		ProductionHouse dbHouse = houseDao.updateProductionHouse(houseId, house);
		if (dbHouse != null) {
			ResponseStructure<ProductionHouse> structure = new ResponseStructure<ProductionHouse>();
			structure.setMessage("ProductionHouse Update successfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(dbHouse);
			return new ResponseEntity<ResponseStructure<ProductionHouse>>(structure, HttpStatus.OK);
		} else {
			throw new ProductionHouseIdNotFoundException("Sorry failed to update ProductionHouse");
		}
	}
}
