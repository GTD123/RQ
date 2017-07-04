package com.rq;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by RQ on 2017/6/29.
 */
@MyAnnotation(value = "赵雅琪",getColor = "red",array = {2,2,2},lamp = EumTrafficLamp.BLACK)
public class AnnotationTest {
    public static void main(String[] args){
        MyAnnotation annotation = AnnotationTest.class.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
        System.out.println(annotation.getColor());
        System.out.println(Array.get(annotation.array(),2));
        System.out.println(annotation.lamp());


    }
}
