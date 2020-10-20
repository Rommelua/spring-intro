package com.spring.intro.service;

import com.spring.intro.dao.UserDao;
import com.spring.intro.model.User;
import com.spring.intro.model.UserResponseDto;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public UserResponseDto getUserResponseDto(Long id) {
        return userDao.getUserResponseDto(id);
    }
}
