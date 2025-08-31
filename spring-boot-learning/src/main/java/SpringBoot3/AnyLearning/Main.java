package SpringBoot3.AnyLearning;

import SpringBoot3.AnyLearning.Entity.AuthorEntity;
import SpringBoot3.AnyLearning.Entity.BookEntity;
import SpringBoot3.AnyLearning.Repository.AuthorRepository;
import SpringBoot3.AnyLearning.Repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(AuthorRepository authorRepository, BookRepository bookRepository) {
        return args -> {

            AuthorEntity author = new AuthorEntity("frlvvr");

            BookEntity book1 = new BookEntity("The Godfather 1");
            BookEntity book2 = new BookEntity("The Godfather 2");

            author.addBook(book1);
            author.addBook(book2);

            authorRepository.save(author);

            System.out.println("\nАвтор и его книги: \n" + author);
        };
    }



}
