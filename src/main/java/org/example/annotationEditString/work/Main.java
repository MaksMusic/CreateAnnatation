package org.example.annotationEditString.work;


import org.example.annotationEditString.model.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("Logins user","qwerty 123",22);
        UserServicesImpl userServices = new UserServicesImpl(user);
        try {
            userServices.processing();
            System.err.print("ok");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(user);
    }
}