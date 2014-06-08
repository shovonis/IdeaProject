package net.therap.AnnotationSpring;

import net.therap.AnnotationSpring.domain.Person;
import net.therap.AnnotationSpring.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person.getFriendsName());
    }
}
