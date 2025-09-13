package SpringBoot5.RestApiStarter.EchoMode;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EchoRepository extends JpaRepository<Echo, Long> {
}
