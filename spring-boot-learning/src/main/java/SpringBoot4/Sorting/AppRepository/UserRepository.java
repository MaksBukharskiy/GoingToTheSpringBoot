package SpringBoot4.Sorting.AppRepository;

import SpringBoot4.Sorting.Users.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
}
