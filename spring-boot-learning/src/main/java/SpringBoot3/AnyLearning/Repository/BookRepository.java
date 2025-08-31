package SpringBoot3.AnyLearning.Repository;

import SpringBoot3.AnyLearning.Entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> { }
