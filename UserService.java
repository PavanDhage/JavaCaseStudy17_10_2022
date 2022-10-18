package com.gl.JavaCaseStudy17102022.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gl.JavaCaseStudy17102022.Repository.UserRepository;
import com.gl.JavaCaseStudy17102022.bean.MyUsers;



@Service
public class UserService implements UserDetailsService  {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		return repository.findById(username).get();
	}
	public void save(MyUsers users) {
		repository.save(users);
	}
}