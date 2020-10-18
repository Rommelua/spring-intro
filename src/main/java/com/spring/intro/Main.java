package com.spring.intro;

import com.spring.intro.config.AppConfig;
import com.spring.intro.model.User;
import com.spring.intro.service.UserService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(new User("Bob", "1111"));
        userService.add(new User("Alisa", "2222"));
        List<User> users = userService.listUsers();
        users.forEach(System.out::println);
    }
}
