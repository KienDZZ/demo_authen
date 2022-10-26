package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.vti.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>, JpaSpecificationExecutor<Users>{

	public Users findByUsername(String username);
}
