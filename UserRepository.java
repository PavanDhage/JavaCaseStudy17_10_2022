package com.gl.JavaCaseStudy17102022.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.JavaCaseStudy17102022.bean.MyUsers;


@Repository
public interface UserRepository extends JpaRepository<MyUsers, String> {
	
	Optional<MyUsers> findUserByUsername(String username);
}

