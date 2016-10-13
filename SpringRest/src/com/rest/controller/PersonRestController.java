package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.dao.PersonDAO;

@RestController
public class PersonRestController {

	
	@Autowired
	private PersonDAO personDAO;

	
	@GetMapping("/person/all")
	public List getAllPersons() {
		return personDAO.getAll();
	}
}