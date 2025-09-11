package SpringBoot5.RestApiStarter.Repository;

import SpringBoot5.RestApiStarter.CarModel.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;

@Repository
public interface CarRepository extends JpaRepository <Cars, Long> {
}
