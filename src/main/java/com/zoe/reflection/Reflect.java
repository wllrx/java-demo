package com.zoe.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Zoe
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Reflect {

    int max() default 1000;

    int min() default 10;

    String name();
}
