package com.spring.intro.dao;

import java.util.List;
import com.spring.intro.model.User;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
