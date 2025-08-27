package SpringBoot1.PaginationLearning.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<NewUser, Long> {
    Page<NewUser> findAll(Pageable pageable);
}