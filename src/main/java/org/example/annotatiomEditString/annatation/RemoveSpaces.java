package org.example.annotatiomEditString.annatation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.FIELD) //аннатация применяется только к свойствам
@Retention(RetentionPolicy.RUNTIME)

public @interface RemoveSpaces {
    char sim () default '_';
}
