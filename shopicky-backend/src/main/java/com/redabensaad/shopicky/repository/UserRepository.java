package com.redabensaad.shopicky.repository;

import com.redabensaad.shopicky.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByLogin(String login);
    boolean existsByLogin(String login);
    Optional<User> findByEmail(String email);
} 