package org.example.annotationAbsolutNum.work;

import org.example.annotationAbsolutNum.annotation.AbsolutNum;

import java.lang.reflect.Field;

public class PersonServicesImpl<T> {
    private T t;

    public PersonServicesImpl(T t) {
        this.t = t;
    }

    public void processing() {
        Field [] fields = t.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(AbsolutNum.class)&field.getType().getName().equals("int")){
                //Дописать
            }
        }

    }
}
