package com.cg.labbook2.trainee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.labbook2.trainee.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{
	
	public User findByUsernameAndPassword(String username, String password);

}
