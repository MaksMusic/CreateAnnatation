package org.example.annotationEditString.work;

import org.example.annotationEditString.annatation.RemoveSpaces;

import java.lang.reflect.Field;

public class UserServicesImpl {
    private Object object;

    public UserServicesImpl(Object object) {
        this.object = object;
    }

    public void processing() throws IllegalAccessException {
        //получаем поля объекта
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            //проверяем стоит ли над полем аннотация RemoveSpaces и является ли поле String
            if (field.isAnnotationPresent(RemoveSpaces.class) & field.getType().getName().equals("java.lang.String")) {
                //получаем символ из аннотации из метода sim
                char ch = field.getAnnotation(RemoveSpaces.class).sim();
                //открывает доступ для редактирования поля
                field.setAccessible(true);
                //редактируем поле указывая у какого объекта и новое значение
                field.set(object, field.get(object).toString().replace(' ',ch));
            }

        }
    }
}
