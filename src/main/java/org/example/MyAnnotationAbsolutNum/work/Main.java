package org.example.MyAnnotationAbsolutNum.work;

import org.example.MyAnnotationAbsolutNum.model.Person;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
      //  Person person = new Person("tom",22,250.54,35.765f);
        Person person = new Person("wverv",-55,77.6,6.6f);
        PersonServicesImpl<Person> personServices = new PersonServicesImpl(person);
        personServices.processing();
        System.out.println(person);


    }
}
