package org.example.annotationAbsolutNum.annotation;

import java.lang.annotation.*;

@Documented// в документации javaDoc
@Inherited // данная аннотации будет унаследована потомками класса

//@Target(ElementType.TYPE) // данная аннотация будет применяться над классами и над интерфейсами
//@Target(ElementType.CONSTRUCTOR)// аннотация будет применяться к конструктору
//@Target(ElementType.FIELD) // данная аннотация будет применяться к полям
//@Target({ElementType.ANNOTATION_TYPE}) // данная аннотация будет применяться к полям
//@Target(ElementType.LOCAL_VARIABLE) // данная аннотация будет применяться к локальной переменной то-есть в методе
//@Target(ElementType.METHOD) // данная аннотация будет применяться к методам
//@Target(ElementType.PACKAGE) // данная аннотация будет применяться к пакетам то-есть все классы в пакете
//@Target(ElementType.PARAMETER) // данная аннотация будет применяться к аргументам методам


@Retention(RetentionPolicy.RUNTIME) // время нахождения в runtime
//@Retention(RetentionPolicy.SOURCE) // только в исходном коде используется в основном для документации
//@Retention(RetentionPolicy.CLASS) // видно только во время компиляции
public @interface AbsolutNum {
    int num () default 1;
}
