package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        RealNumber<Integer> arealIntegerRealNumber = new RealNumber<Integer>();
        Serializable a = arealIntegerRealNumber.pick("a", new ArrayList<String>());
    }
}
