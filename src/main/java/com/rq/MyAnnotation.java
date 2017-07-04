package com.rq;

import java.lang.annotation.*;

/**
 * Created by RQ on 2017/6/29.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyAnnotation {
    EumTrafficLamp lamp() default EumTrafficLamp.RED;
    int[] array() default {1,2,3};
    String getColor() default "";
    String value();
}
