package com.springmicro.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springmicro.auth.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select p from User p where p.userName =:userName")
	User findByUserName(@Param("userName") String userName);
	
}
