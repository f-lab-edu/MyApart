package api.service;

import common.entity.User;
import common.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void singUp(String userName, String password) {
        User newUser = new User(userName,password);
        userRepository.save(newUser);
    }
}
