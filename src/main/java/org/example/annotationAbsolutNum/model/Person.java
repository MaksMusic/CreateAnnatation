package org.example.annotationAbsolutNum.model;

import lombok.*;


@Data
@Setter

public class Person {
    private String name;
    private int age;
    private double balance;
    private float ball;

    public Person(String name, int age, double balance, float ball) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.ball = ball;
    }
}


