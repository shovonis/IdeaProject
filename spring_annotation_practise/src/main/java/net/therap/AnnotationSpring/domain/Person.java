package net.therap.AnnotationSpring.domain;


import java.util.List;

/**
 * Created by rifatul.islam on 6/5/14.
 */


public class Person {
    private String name;
    private int age;

    private List<String> friendsName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriendsName() {
        return friendsName;
    }

    public void setFriendsName(List<String> friendsName) {
        this.friendsName = friendsName;
    }

}
