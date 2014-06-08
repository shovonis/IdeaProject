package net.therap.AnnotationSpring;

import net.therap.AnnotationSpring.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rifatul.islam on 6/5/14.
 */

@Configuration
public class BeanConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
