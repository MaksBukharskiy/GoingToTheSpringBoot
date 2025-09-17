package SpringBoot.RestApi.GoingDeeper.User.Service;

import SpringBoot.RestApi.GoingDeeper.User.MyUser;
import SpringBoot.RestApi.GoingDeeper.User.Repository.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UserPostService {

    @Autowired
    public UserData userData;

    public Optional<MyUser> findUserDataById(Long id){
        return userData.findUserById(id);
    }

    public Optional<MyUser> updateUser(Long id, MyUser user){
        return userData.findUserById(id)
                .map(existingUser -> {

                    existingUser.setFirstName(user.getFirstName());
                    existingUser.setLastName(user.getLastName());

                    MyUser saved = userData.save(existingUser);
                    return saved;
                });
    }

}
