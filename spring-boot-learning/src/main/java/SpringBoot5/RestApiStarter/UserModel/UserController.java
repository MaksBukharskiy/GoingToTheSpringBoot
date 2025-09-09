package SpringBoot5.RestApiStarter.UserModel;

import SpringBoot5.RestApiStarter.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public Page<User> getPageOfUsers() {
        PageRequest pageable = PageRequest.of
                (0, 2, Sort.by("age")
                        .descending());

        return userRepository.findAll(pageable);
    }
}
