package com.revature.p2musicme.user.repository;

import com.revature.p2musicme.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
    User findByUserId(UUID id);
}
