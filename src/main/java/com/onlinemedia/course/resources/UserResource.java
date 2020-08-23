package com.onlinemedia.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinemedia.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> FindAll() {
	    User u = new User(1l, "Maria", "maria@gmail.com", "999999", "12346");
	    return ResponseEntity.ok().body(u);
	}

}
