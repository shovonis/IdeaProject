package net.therapservices.SpringApplicationPractise.domain;

/**
 * Created by rifatul.islam on 6/4/14.
 */
public class ExampleBeanWithStaticFactoryMethod {
    public ExampleBeanWithStaticFactoryMethod(AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {

    }

    public static ExampleBeanWithStaticFactoryMethod createInstance(
            AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        ExampleBeanWithStaticFactoryMethod eb = new ExampleBeanWithStaticFactoryMethod(anotherBean, yetAnotherBean, i);
        return eb;
    }
}
