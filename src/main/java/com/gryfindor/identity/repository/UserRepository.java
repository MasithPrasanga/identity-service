package com.gryfindor.identity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gryfindor.identity.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);

	User findByUsername(String userName);

}
