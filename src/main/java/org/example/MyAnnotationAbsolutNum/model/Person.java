package org.example.MyAnnotationAbsolutNum.model;

import lombok.Data;
import lombok.Setter;
import org.example.MyAnnotationAbsolutNum.annotation.AbsolutNum;


@Data
@Setter

public class Person {
    private String name;
    @AbsolutNum
    private int age;
    private double balance;
    private float ball;

    public Person(String name, int age, double balance, float ball) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                ", ball=" + ball +
                '}';
    }
}


