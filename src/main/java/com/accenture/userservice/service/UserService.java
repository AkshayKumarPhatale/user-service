package com.accenture.userservice.service;

import com.accenture.userservice.dao.UserRepository;
import com.accenture.userservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public Mono<User> createUser(User user) {
		return userRepository.save(user);
	}

	public Flux<User> createUsers(List<User> users) {
		return userRepository.saveAll(users);
	}

	public Mono<User> getUserById(int id) {
		return userRepository.findById(id);
	}

	public Flux<User> getUsers() {
		return userRepository.findAll();
	}
	
	public Mono<User> updateUser(User user) {

		return userRepository.save(user);

	}
	
	public Mono<String> deleteUserById(int id) {
		userRepository.deleteById(id);
		return Mono.just("User got deleted");
	}
	
	public Mono<User> getUserByEmail(String email) {
		return userRepository.findByEmail(email);
		
	}

}
