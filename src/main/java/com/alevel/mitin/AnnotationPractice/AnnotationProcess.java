package com.alevel.mitin.AnnotationPractice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class AnnotationProcess {
    public static void main(String[] args) {
        Class<RandomClass> randomClassClass = RandomClass.class;
        for (Method method : randomClassClass.getDeclaredMethods()) {
            Annotation methodAnnotation = method.getAnnotation(Documentation.class);
            System.out.println(String.format("Method %s witch documentation %s since %s",
                    method.getName(),
                    ((Documentation) methodAnnotation).text(),
                    ((Documentation) methodAnnotation).since()));

            for (Parameter parameter : method.getParameters()) {
                Documentation paprameterAnnotation = parameter.getAnnotation(Documentation.class);
                System.out.println(String.format("Parameter %s witch documentation %s",
                        parameter.getName(),
                        paprameterAnnotation.text()));
            }


        }
    }
}
