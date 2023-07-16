package com.js.BookMyShowClone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.js.BookMyShowClone.dto.OwnerDto;
import com.js.BookMyShowClone.entity.Owner;
import com.js.BookMyShowClone.service.OwnerService;
import com.js.BookMyShowClone.util.ResponseStructure;

@RestController
@RequestMapping("/owner")
public class OwnerController {

	@Autowired
	private OwnerService service;

	@PostMapping
	public ResponseEntity<ResponseStructure<OwnerDto>> saveOwner(@RequestBody Owner owner){
		return service.saveOwner(owner);

	}
	@GetMapping
	public ResponseEntity<ResponseStructure<OwnerDto>> findOwnerById(@RequestParam long ownerId) {
		return service.findOwnerById(ownerId);

	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<OwnerDto>> deleteOwnerById(@RequestParam long ownerId) {
		return service.deleteOwnerById(ownerId);

	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<OwnerDto>> updateOwnerById(@RequestParam long ownerId, @RequestBody Owner owner) {
		return service.updateOwner(ownerId, owner);

	}

}
