package SpringBoot3.AnyLearning.Repository;

import SpringBoot3.AnyLearning.Entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.function.LongToIntFunction;

public interface AuthorRepository extends JpaRepository <AuthorEntity, Long> {
}
