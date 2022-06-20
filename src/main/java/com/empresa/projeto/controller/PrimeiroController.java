package com.empresa.projeto.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.projeto.model.PrimeiraModel;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = "*", value = "*")
public class PrimeiroController {
	
	@GetMapping()
	public ResponseEntity<String> helloWorld(){
		/**
		 * @author Marcelo Barboza
		 * use the class ResponseEntity to return a object with HTTP pattern  
		 * */
		return ResponseEntity.status(HttpStatus.OK).body("Hello World");
	}
	
	@GetMapping("/object")
	public ResponseEntity<PrimeiraModel> objectReturn(){
		
		/**
		 * @author Marcelo Barboza		  
		 * Jackson is an api responsible for convert an object to json and vice versa; 
		 * */
		PrimeiraModel resp = new PrimeiraModel("Information", "Jackson Working");
		
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}
	

}
