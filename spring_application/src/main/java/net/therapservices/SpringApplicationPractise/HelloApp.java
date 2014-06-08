package net.therapservices.SpringApplicationPractise;

import net.therapservices.SpringApplicationPractise.domain.BraveKnights;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        BraveKnights braveKnight = context.getBean(BraveKnights.class);
        braveKnight.sayGreetings();
    }
}


