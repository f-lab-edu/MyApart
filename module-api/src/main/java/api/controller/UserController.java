package api.controller;

import api.service.UserService;
import common.entity.User;
import common.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/sign-up")
    public void signUp(@RequestParam String userName, @RequestParam String password) {
        userService.singUp(userName,password);
    }
}
