package com.spring.intro.dao;

import com.spring.intro.model.User;
import com.spring.intro.model.UserResponseDto;
import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    UserResponseDto getUserResponseDto(Long id);
}
