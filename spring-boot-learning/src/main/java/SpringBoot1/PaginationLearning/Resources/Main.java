package SpringBoot1.PaginationLearning.Resources;

import SpringBoot1.PaginationLearning.Repository.NewUser;
import SpringBoot1.PaginationLearning.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.data.domain.Pageable;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "SpringBoot1.PaginationLearning.Repository")
@EntityScan(basePackages = "SpringBoot1.PaginationLearning.Repository")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return args -> {

            NewUser user1 = new NewUser("freedom_lovver", 16);
            NewUser user2 = new NewUser("mike666", 46);
            NewUser user3 = new NewUser("frver", 23);
            NewUser user4 = new NewUser("miles", 54);
            NewUser user5 = new NewUser("nelly", 12);
            NewUser user6 = new NewUser("felian111", 54);

            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
            userRepository.save(user4);
            userRepository.save(user5);
            userRepository.save(user6);

            System.out.println("✅ 6 Users had created\n");

            int pageSize = 3;

            for (int page = 0; ; page++) {

                Pageable pageable = PageRequest.of(page, pageSize);
                Page<NewUser> userPage = userRepository.findAll(pageable);

                System.out.println("--- Страница " + page + " ---");

                userPage.getContent().forEach(System.out::println);

                if (userPage.hasNext()) {
                    System.out.println("Есть следующая страница...\n");
                } else {
                    System.out.println("\n🔚 Больше нет страниц.");
                    break;
                }
            }
        };
    }
}
