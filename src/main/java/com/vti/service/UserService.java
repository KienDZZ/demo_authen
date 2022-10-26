package com.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vti.entity.Users;
import com.vti.repository.UserRepository;


@Service
public class UserService implements IUserService{
	
	@Autowired UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = repository.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException(username);
		}

		return new User(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList("user"));
	}

		

	@Override
	public Users getUserByUsername(String username) {
	  return repository.findByUsername(username);
	}
}
