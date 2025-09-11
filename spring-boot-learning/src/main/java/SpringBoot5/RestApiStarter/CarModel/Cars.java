package SpringBoot5.RestApiStarter.CarModel;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

@Entity
@Table(name = "userCars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carName;

    public Cars() {}

    public Cars(String carName) {
        this.carName = carName;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car ID: " + id + " Name: " + carName;
    }

}
