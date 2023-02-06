package com.codeusingjava.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeusingjava.model.UserPojo;

@Repository
public interface UserRepository extends JpaRepository<UserPojo, Integer>{

	UserPojo findByUsername(String username);

} 

