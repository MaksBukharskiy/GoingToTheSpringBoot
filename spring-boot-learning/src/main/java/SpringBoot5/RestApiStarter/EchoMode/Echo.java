package SpringBoot5.RestApiStarter.EchoMode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Echo {

    @Id
    @GeneratedValue
    private Long id;
    private String message;

    public Echo() {
    }

    public Echo(String message) {
        this.message = message;
    }

    public Echo(Long id,  String message) {
        this.id = id;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EchoMessage [" + "id=" + id + ", message=" + message + ']';
    }

}
