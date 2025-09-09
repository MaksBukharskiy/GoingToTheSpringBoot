package SpringBoot5.RestApiStarter;

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

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Porsche 911", 14);
        User user2 = new User("Ferrari Roma", 16);
        User user3 = new User("BMW M4", 23);
        User user4 = new User("Bentley Bentayga", 11);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);

        System.out.println("✅ 7 users are uploaded");

    }
}
