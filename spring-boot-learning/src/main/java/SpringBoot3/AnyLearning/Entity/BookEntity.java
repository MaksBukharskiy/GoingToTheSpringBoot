package SpringBoot3.AnyLearning.Entity;

import jakarta.persistence.*;

@Entity
public class BookEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorEntity author;

    public BookEntity() {}
    public BookEntity(String name) {
        this.name = name;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "\nBook {" + "id = " + id + ", name = " + name + "}";
    }

}
