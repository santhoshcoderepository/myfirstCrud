package com.example.Crud.Crud.ControllerLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Crud.Crud.Person.Person;
import com.example.Crud.Crud.ServiceLayer.ServiceLayer;

@RestController
@RequestMapping
public class ControllerLayer {

	@Autowired
	ServiceLayer s ;
	
	@PostMapping("/post")
	public ResponseEntity<Person> post(@RequestBody Person p)
	{
		 return  s.postMethod(p);
	}
}
