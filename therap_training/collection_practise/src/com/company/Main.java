package com.company;

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<Integer, String>(1, "apple");
        Pair<Integer, String> p2 = new Pair<Integer, String>(2, "pear");

        boolean isPairEqual = Util.compare(p1, p2);

        System.out.println(isPairEqual);


    }
}