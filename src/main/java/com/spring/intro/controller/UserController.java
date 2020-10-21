package com.spring.intro.controller;

import com.spring.intro.dto.UserResponseDto;
import com.spring.intro.model.User;
import com.spring.intro.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/inject")
    public String inject() {
        userService.add(new User("Bob@gmail.com", "1111"));
        userService.add(new User("Alisa@gmail.com", "2222"));
        userService.add(new User("Trump@gmail.com", "3333"));
        userService.add(new User("Merkel@gmail.com", "4444"));
        return "Users added";
    }

    @GetMapping("/{userId}")
    public UserResponseDto get(@PathVariable Long userId) {
        User user = userService.getById(userId);
        return convertUserToDto(user);
    }

    @GetMapping
    public List<UserResponseDto> getAll() {
        return userService.listUsers().stream()
                .map(this::convertUserToDto)
                .collect(Collectors.toList());
    }

    private UserResponseDto convertUserToDto(User user) {
        return new UserResponseDto(user.getId(), user.getEmail());
    }
}
