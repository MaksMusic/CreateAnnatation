package org.example.annotationAbsolutNum.test;

public class TestNameInt {
    public static void main(String[] args) {
        System.out.println(new H().getClass().getDeclaredFields()[0].getType().getName());
    }
}

class H{
    int s = 10;
}
