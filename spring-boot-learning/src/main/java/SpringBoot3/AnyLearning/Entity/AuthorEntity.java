package SpringBoot3.AnyLearning.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AuthorEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String nickname;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BookEntity> books = new ArrayList<>();

    public AuthorEntity() {}
    public AuthorEntity(String nickname) {
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }
    public String getNickname() {
        return nickname;
    }

    public void addBook(BookEntity book) {
        books.add(book);
        book.setAuthor(this);
    }

    @Override
    public String toString() {
        return "\nAuthor{" + "id=" + id + ", nickname=" + nickname + ", books=" + books + "}";
    }

}
