package dev.codenation.Central.de.Erros.controller;

import dev.codenation.Central.de.Erros.model.User;
import dev.codenation.Central.de.Erros.service.Impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Api(value="API User Rotas")
@CrossOrigin(origins ="*" )
@RequestMapping("/users")
public class UserController {

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    private final UserServiceImpl userService;

    @GetMapping
    @ApiOperation("Procura por Email")
    public Optional<User> FindByEmail(@RequestBody User user) {
        return userService.FindByEmail(user.getEmail());
    }

    @PostMapping
    @ApiOperation("Cria o Nando")
    public User CreateUser(@RequestBody User user) {
        return userService.SaveUser(user);
    }
}