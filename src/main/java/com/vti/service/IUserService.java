package com.vti.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.vti.entity.Users;

public interface IUserService extends UserDetailsService  {

	Users getUserByUsername(String username);

}
