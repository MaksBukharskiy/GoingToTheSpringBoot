package SpringBoot2.PaginationRepeat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return args -> {

            for (int i = 1; i <= 15; i++) {
                userRepository.save(new User("user" + i));
            }

            Pageable page = PageRequest.of(0, 3);
            Page<User> finalPage = userRepository.findAll(page);

            System.out.println(finalPage.getContent());
            System.out.println("Total Users: " + finalPage.getTotalElements());

        };
    }

}
