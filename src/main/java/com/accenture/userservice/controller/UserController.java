package com.accenture.userservice.controller;

import com.accenture.userservice.entity.User;
import com.accenture.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public Mono<User> createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@PostMapping("/createBatch")
	public Flux<User> createUsers(@RequestBody List<User> users) {
		return userService.createUsers(users);
	}

	@GetMapping("/{id}")
	public Mono<ResponseEntity<User>> getUserById(@PathVariable int id) {
		return userService.getUserById(id)
				.map(user -> ResponseEntity.ok(user))
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}

	@GetMapping("/all")
	public Flux<User> getUsers() {
		return userService.getUsers();
	}

	@PutMapping("/update")
	public Mono<User> updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/{id}")
	public Mono<String> deleteUserById(@PathVariable int id) {
		return userService.deleteUserById(id);
	}

	@GetMapping("/email/{email}")
	public Mono<ResponseEntity<User>> getUserByEmail(@PathVariable String email) {
		return userService.getUserByEmail(email)
				.map(user -> ResponseEntity.ok(user))
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}
}
