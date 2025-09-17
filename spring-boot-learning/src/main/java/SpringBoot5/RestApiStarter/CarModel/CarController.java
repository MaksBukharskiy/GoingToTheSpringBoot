package SpringBoot5.RestApiStarter.CarModel;

import SpringBoot2.PaginationRepeat.User;
import SpringBoot5.RestApiStarter.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/old")
    public Page<Cars> findAllPage() {
        PageRequest pagereq = PageRequest.of(
                0,4, Sort.by("carName")
                .descending());

        return carRepository.findAll(pagereq);
    };

    @PostMapping("/postmapping/car")
    public Cars saveCar(@RequestBody Cars car) {
        return carRepository.save(car);
    }



}

