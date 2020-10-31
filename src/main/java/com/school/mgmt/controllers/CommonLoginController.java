package com.school.mgmt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.mgmt.exceptions.SchoolMgmtGenericException;
import com.school.mgmt.model.UserAuthenticationRequest;

/**
 * @author Marappan Sampath
 * Centralized controller to create and fetch users
 */
@RestController
@RequestMapping(path = "/api/v1")
public class CommonLoginController {
	
	/**
	 * @param user
	 * @return total number of users created
	 * @throws GenericException
	 */
	@PostMapping(path = "/school/login", consumes = "application/json")
	public ResponseEntity<String> schoolLogin(@RequestBody UserAuthenticationRequest userRequest) throws SchoolMgmtGenericException {

		return new ResponseEntity<String>("Hey There - you are logged in to your school: " + userRequest.getUserName(), HttpStatus.OK);
	}

}
