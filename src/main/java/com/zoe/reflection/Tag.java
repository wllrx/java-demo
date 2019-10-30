package com.zoe.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zoe
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Tag {
    int limit() default 10;
    TagType TYPE() default TagType.ONE;
}
/**
 * TagType
 */
enum TagType{
    ONE,TWO,THREE,FORE,FIVE,SEX,SERVER;
}