package SpringBoot1.PaginationLearning.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class NewUser {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private int age;

    public NewUser() {}

    public NewUser(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                 "id=" + id +
                ", username=" + username +
                ", age=" + age +
                '}';
    }

}
