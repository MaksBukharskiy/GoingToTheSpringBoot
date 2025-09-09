package SpringBoot5.RestApiStarter.UserModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String car;
    private Integer age;

    public User() {
    }

    public User(String car, Integer age) {
        this.car = car;
        this.age = age;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCar() {
        return car;
    }
    public void setCar(String car) {
        this.car = car;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User {" +
                "id=" + id +
                ", car='" + car + '\'' +
                ", age=" + age +
                '}';
    }

}

