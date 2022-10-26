package com.vti.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.LoginDto;
import com.vti.entity.Users;
import com.vti.service.IUserService;


@RestController
@RequestMapping(value = "api/v1/login")
@CrossOrigin("*")
public class LoginController {

	@Autowired
	private IUserService service;

	@GetMapping()
	public ResponseEntity<?> login(Principal principal) {

		String username = principal.getName();
		Users entity = service.getUserByUsername(username);

		// convert entity --> dto
		LoginDto dto = new LoginDto(entity.getId(), entity.getEmail());

		return new ResponseEntity<>(dto, HttpStatus.OK);
}

}



