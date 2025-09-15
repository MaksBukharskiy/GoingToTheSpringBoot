package SpringBoot.RestApi.GoingDeeper;

import SpringBoot.RestApi.GoingDeeper.User.MyUser;
import SpringBoot.RestApi.GoingDeeper.User.Repository.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private UserData userData;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        MyUser user1 = new MyUser("Maks", "Bukharskiy");
        MyUser user2 = new MyUser("David", "Goggins");
        MyUser user3 = new MyUser("Eric", "Robinson");
        MyUser user4 = new MyUser("Many", "Paquao");

        userData.save(user1);
        userData.save(user2);
        userData.save(user3);
        userData.save(user4);

        System.out.println("\n✅ 4 users created");

    }

}
