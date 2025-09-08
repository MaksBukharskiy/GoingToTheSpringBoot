package SpringBoot5.RestApiStarter.AppUsers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return List.of(
            new User("BMW", 17),
            new User("Posrche", 18),
            new User("Ferarri", 19)
        );
    }
}
