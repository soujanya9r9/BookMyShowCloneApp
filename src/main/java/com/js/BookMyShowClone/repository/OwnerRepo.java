package com.js.BookMyShowClone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.js.BookMyShowClone.entity.Owner;

public interface OwnerRepo extends JpaRepository<Owner, Long> {
	

}
