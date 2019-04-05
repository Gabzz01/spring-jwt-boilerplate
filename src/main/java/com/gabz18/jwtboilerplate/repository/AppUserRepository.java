package com.gabz18.jwtboilerplate.repository;

import com.gabz18.jwtboilerplate.model.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AppUserRepository extends MongoRepository<AppUser, String> {

    Optional<AppUser> findByUsername(String username);
}
