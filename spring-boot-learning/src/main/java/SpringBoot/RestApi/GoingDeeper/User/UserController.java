package SpringBoot.RestApi.GoingDeeper.User;

import SpringBoot.RestApi.GoingDeeper.User.MyUser;
import SpringBoot.RestApi.GoingDeeper.User.Repository.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserData userData;

    @GetMapping("/{id}")
    public ResponseEntity<MyUser> getUser(@PathVariable("id") Long id) {
        return userData.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public MyUser createUser(@RequestBody MyUser user) {
        return userData.save(user);
    }
}