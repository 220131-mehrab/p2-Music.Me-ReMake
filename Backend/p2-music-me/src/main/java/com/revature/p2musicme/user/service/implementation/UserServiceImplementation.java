package com.revature.p2musicme.user.service.implementation;

import com.revature.p2musicme.user.entity.User;
import com.revature.p2musicme.user.repository.UserRepo;
import com.revature.p2musicme.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.UUID;

@RequiredArgsConstructor
@Service("userServiceImpl")
@Transactional
@Slf4j
public class UserServiceImplementation implements UserService {
    private final UserRepo userRepo;

    @Override
    public User create(User user) {
        log.info("Creating new user: {}", user.getUserId());
        return userRepo.save(user);
    }

    @Override
    public Collection<User> list(int limit) {
        return null;
    }

    @Override
    public User get(UUID id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public Boolean delete(UUID id) {
        return null;
    }
}
