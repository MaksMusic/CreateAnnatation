package org.example.annotationDeprecated;

import lombok.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tom",22);
        person.hello();
        person.hi();

    }
}



@Setter
@Getter
@Data
class Person {
    private String name;
    private int age;


    @Deprecated(since = "18.08.2023")
    public void hello(){
        System.out.println("Hello my name is" + name);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Рекомендуемый метод для замены hello().
     */
    public void hi(){
        System.out.println("Hi my name is "+name + " my age "+ age);
    }

}
