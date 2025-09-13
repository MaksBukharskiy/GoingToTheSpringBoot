package SpringBoot5.RestApiStarter;

import SpringBoot5.RestApiStarter.CarModel.Cars;
import SpringBoot5.RestApiStarter.EchoMode.Echo;
import SpringBoot5.RestApiStarter.EchoMode.EchoRepository;
import SpringBoot5.RestApiStarter.Repository.CarRepository;
import SpringBoot5.RestApiStarter.Repository.UserRepository;
import SpringBoot5.RestApiStarter.UserModel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private EchoRepository echoRepository;


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        carRepository.deleteAll();

        User user1 = new User("Peter", 14);
        User user2 = new User("Roma", 16);
        User user3 = new User("Ben", 23);
        User user4 = new User("Maks", 11);
        User user5 = new User("Dani", 22);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);


        Cars car1 = new Cars("Ferarri Roma");
        Cars car2 = new Cars("Bentley Bentayga");
        Cars car3 = new Cars("Porsche 911 Turbo");

        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);

        Echo echo1 = new Echo("Echo 1");
        Echo echo2 = new Echo("Echo 2");
        Echo echo3 = new Echo("Echo 3");

        echoRepository.save(echo1);
        echoRepository.save(echo2);
        echoRepository.save(echo3);

        System.out.println("✅ 7 users are uploaded");
        System.out.println("✅ 3 Cars are uploaded");

    }
}
