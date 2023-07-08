package org.example.annotatiomEditString.work;


import org.example.annotatiomEditString.RemoveSpaces;

import java.lang.reflect.Field;

public class UserServicesImpl {
    private Object object;

    public UserServicesImpl(Object object) {
        this.object = object;
    }


    public void processing() throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(RemoveSpaces.class) & field.getType().getName().equals("java.lang.String")) {
                char ch = field.getAnnotation(RemoveSpaces.class).sim();
                field.setAccessible(true);
                field.set(object, field.get(object).toString().replace(' ',ch));
            }

        }
    }
}
