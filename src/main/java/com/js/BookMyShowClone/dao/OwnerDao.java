package com.js.BookMyShowClone.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.js.BookMyShowClone.entity.Owner;
import com.js.BookMyShowClone.repository.OwnerRepo;

@Repository
public class OwnerDao {

	@Autowired
	private OwnerRepo repo;
	
	public Owner saveOwner(Owner owner) {
		return repo.save(owner);
	}
	
	public Owner findOwnerById(long ownerId) {
	Optional<Owner> optional = repo.findById(ownerId);
	if(optional.isPresent()) {
		return optional.get();
	}
	return null;
	}
	
	public Owner deleteOwnerById(long ownerId) {
		Optional<Owner> optional = repo.findById(ownerId);
		if(optional.isPresent()) {
			repo.deleteById(ownerId);
			return optional.get();
		}
		return null;
		}
	
	public Owner updateOwner(long ownerId, Owner owner) {
		Optional<Owner> optional = repo.findById(ownerId);
		if(optional.isPresent()) {
			owner.setOwnerId(ownerId);
			repo.save(owner);
			return owner;
		}
		return null;
		}
}
