package dev.codenation.Central.de.Erros.controller;

import dev.codenation.Central.de.Erros.model.User;
import dev.codenation.Central.de.Erros.service.Impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    private final UserServiceImpl userService;

    @GetMapping
    public Optional<User> FindByEmail(@RequestBody User user) {
        return userService.FindByEmail(user.getEmail());
    }

    @PostMapping
    public User CreateUser(@RequestBody User user) {
        return userService.SaveUser(user);
    }
}