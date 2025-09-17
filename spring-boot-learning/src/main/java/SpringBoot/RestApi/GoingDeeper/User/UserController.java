package SpringBoot.RestApi.GoingDeeper.User;

import SpringBoot.RestApi.GoingDeeper.User.MyUser;
import SpringBoot.RestApi.GoingDeeper.User.Repository.UserData;
import SpringBoot.RestApi.GoingDeeper.User.Service.UserPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserPostService userService;

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
        return userService.userData.save(user);
    }

    @PutMapping("{id}")
    public ResponseEntity<MyUser> updateMyUser(@PathVariable("id") Long id, @RequestBody MyUser userUpdate) {
        return userService.updateUser(id, userUpdate)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }



}