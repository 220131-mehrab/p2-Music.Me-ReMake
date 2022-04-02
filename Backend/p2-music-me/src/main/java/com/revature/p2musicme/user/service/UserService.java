package com.revature.p2musicme.user.service;

import com.revature.p2musicme.user.entity.User;

import java.util.Collection;
import java.util.UUID;

public interface UserService {
    User create(User user);
    Collection<User> list(int limit);
    User get(UUID id);
    User update(User user);
    Boolean delete(UUID id);
}
