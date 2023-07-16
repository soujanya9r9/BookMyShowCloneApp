package com.js.BookMyShowClone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.js.BookMyShowClone.dto.ProductionHouseDto;
import com.js.BookMyShowClone.entity.ProductionHouse;
import com.js.BookMyShowClone.service.ProductionHouseService;
import com.js.BookMyShowClone.util.ResponseStructure;

@RestController
@RequestMapping("/house")
public class productionHouseController {

	@Autowired
	private ProductionHouseService service;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<ProductionHouse>> saveProductionHouse(@RequestParam long ownerId,@RequestBody ProductionHouseDto houseDto){
		return service.saveProductionHouse(ownerId, houseDto);
	}

	@PutMapping
	public ResponseEntity<ResponseStructure<ProductionHouse>> updateProductionHouse(@RequestParam long houseId, @RequestBody ProductionHouseDto houseDto){
		return service.updateProductionHouse(houseId, houseDto);
	}
}
