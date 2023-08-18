package org.example.MyAnnotation;

import jdk.jfr.ContentType;

import java.lang.annotation.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("org.example.MyAnnotation.Xiaomi");
        Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println("информация о классе Xiaomi " + smartPhone.OS() );
        System.out.println("год создания компании " + smartPhone.yearOfCompanyCreation() );

        System.out.println("");

        Class samsungiClass = Class.forName("org.example.MyAnnotation.Xiaomi");
        Annotation annotationSamsung = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone2 = (SmartPhone) annotationSamsung;
        System.out.println("информация о классе Xiaomi " + smartPhone2.OS() );
        System.out.println("год создания компании " + smartPhone2.yearOfCompanyCreation() );
    }
}

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone(OS = "Android",yearOfCompanyCreation = 2010)
class Xiaomi{
    private String model;
    private double price;

    public Xiaomi(String model, double price) {
        this.model = model;
        this.price = price;
    }
}

@SmartPhone(yearOfCompanyCreation = 1938)
class Samsung{
    private String model;
    private double price;

    public Samsung(String model, double price) {
        this.model = model;
        this.price = price;
    }

}