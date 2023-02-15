package it.develhope.annotations;

/**
 * This is a custom annotation
 * @author alessiolimina
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * creating values for the custom annotation;
 * string DevName is the first value;
 * string DevSurname is the second value;
 * adding a runtime retention policy using the appropriate annotation @Retention(RetentionPolicy.RUNTIME);
 * adding target elements of type method using the appropriate annotation @Target(ElementType.METHOD);
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface DevAnnotation {
    String DevName();
    String DevSurname();

}
