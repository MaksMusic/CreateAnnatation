package org.example.annotationEditString.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.annotationEditString.annatation.RemoveSpaces;

import java.util.Objects;



@Data
@Setter
@Getter

public class User {
    @RemoveSpaces(sim = '-')// annotation with parameter
    private String login;
    @RemoveSpaces // annotation without parameter
    private String password;
    @RemoveSpaces
    private int age;

    public User(String login, String password, int age) {
        this.login = login;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + login +
                ","+password +
                ", age=" + age +
                '}';
    }

}
