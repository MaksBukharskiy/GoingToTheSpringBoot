package SpringBoot.RestApi.GoingDeeper.User.Repository;

import SpringBoot.RestApi.GoingDeeper.User.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserData extends JpaRepository<MyUser, Long> {
    Optional<MyUser> findUserById(Long id);
}