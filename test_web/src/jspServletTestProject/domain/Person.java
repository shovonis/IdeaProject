package jspServletTestProject.domain;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 5/19/14
 * Time: 10:44 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Person {
    private String name;
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
