package com.kasidev.users.api;

import com.kasidev.users.model.User;

import java.util.Optional;

public interface UserService {

    User createUser(User user);

    Optional<User> findUserById(Long id);

    User changeUserName(Long id, String newName);
}
