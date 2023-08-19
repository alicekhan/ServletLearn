package com.maven.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext object = new ClassPathXmlApplicationContext("config.xml");	
        Student student1 = (Student) object.getBean("student1");
        Student student2 = (Student) object.getBean("student2");
        
        // primitive type injection
        System.out.println("object-1: "+student1);
        System.out.println("object-2: "+student2);
    }
}

/* create maven project
 * add dependency - spring core and spring context
 * creating beans - java pojo class
 * creating configuration file -> config.java
 * setter injection
 * main class which can create the injection and pull
 * */