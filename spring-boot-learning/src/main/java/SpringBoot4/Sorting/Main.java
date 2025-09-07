package SpringBoot4.Sorting;

import SpringBoot2.PaginationRepeat.User;
import SpringBoot4.Sorting.AppRepository.UserRepository;
import SpringBoot4.Sorting.Users.AppUser;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        AppUser user1 = new AppUser("Maks", 16);
        AppUser user2 = new AppUser("Artem", 17);
        AppUser user3 = new AppUser("aef;he", 18);
        AppUser user4 = new AppUser("eflhg", 19);
        AppUser user5 = new AppUser("wghergh", 122);
        AppUser user6 = new AppUser("dsbpihds", 23);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);
        userRepository.save(user6);


        Sort sortByName = Sort.by("username").descending();
        Sort sortByAge = Sort.by("age").descending();

        PageRequest simplePage = PageRequest.of(0, 5);
        PageRequest sortedPage = PageRequest.of(0, 5, sortByName);
        PageRequest sortedAgePage = PageRequest.of(0, 5, sortByAge);


        System.out.println("\nall users, first 5 (within sorting): \n");
        userRepository.findAll(simplePage)
                .getContent().forEach(System.out::println);

        System.out.println("\nall users, first 5 (with sorting {name}): \n");
        userRepository.findAll(sortedPage).getContent().forEach(System.out::println);


    }

}
