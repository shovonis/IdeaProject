package net.therap.AnnotationSpring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello() {
        return "Hello world!";
    }
}
