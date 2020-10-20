package com.spring.intro.service;

import com.spring.intro.model.User;
import com.spring.intro.model.UserResponseDto;
import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    UserResponseDto getUserResponseDto(Long id);
}
