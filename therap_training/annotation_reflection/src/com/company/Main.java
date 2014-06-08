package com.company;


import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        try {

            Class c = Class.forName("com.company.ExampleClass");
            int modifierOfTheClass = c.getModifiers();
            Package pack = c.getPackage();
            Class superClass = c.getSuperclass();
            Class[] interfaces = c.getInterfaces();
            Constructor[] constructors = c.getConstructors();

            Field[] fields = c.getFields();
            Annotation[] annotation = c.getAnnotations();
            Method[] method = c.getMethods();
//            for(Annotation annotation1 : annotation)
            System.out.println();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
