package com.accenture.userservice.dao;


import com.accenture.userservice.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Integer> {
	
	public Mono<User> findByEmail(String email);

}
