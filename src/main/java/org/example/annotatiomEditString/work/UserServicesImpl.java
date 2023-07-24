package org.example.annotatiomEditString.work;

import org.example.annotatiomEditString.annatation.RemoveSpaces;
import java.lang.reflect.Field;

public class UserServicesImpl {
    private Object object;

    public UserServicesImpl(Object object) {
        this.object = object;
    }

    public void processing() throws IllegalAccessException {
        //�������� ���� �������
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            //��������� ����� �� ��� ����� ��������� RemoveSpaces � �������� �� ���� String
            if (field.isAnnotationPresent(RemoveSpaces.class) & field.getType().getName().equals("java.lang.String")) {
                //�������� ������ �� ��������� �� ������ sim
                char ch = field.getAnnotation(RemoveSpaces.class).sim();
                //��������� ������ ��� �������������� ����
                field.setAccessible(true);
                //����������� ���� �������� � ������ ������� � ����� ��������
                field.set(object, field.get(object).toString().replace(' ',ch));
            }

        }
    }
}
