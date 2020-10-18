package com.spring.intro.service;

import java.util.List;
import com.spring.intro.model.User;

public interface UserService {
    void add(User user);

    List<User> listUsers();
}
