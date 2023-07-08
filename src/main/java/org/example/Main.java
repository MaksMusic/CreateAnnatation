package org.example;


import org.example.annotatiomEditString.User;
import org.example.annotatiomEditString.work.UserServicesImpl;

import java.lang.reflect.Field;
import java.nio.file.Files;

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