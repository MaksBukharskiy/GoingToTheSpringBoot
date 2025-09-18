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


        System.out.println("\n✅ 4 users created");

    }

}
