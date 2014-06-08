package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/13/14
 * Time: 9:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class RealNumber<T extends Number> {

    List<T> listOfNumber = new ArrayList<T>();

    public <U extends Number> void add(U number) {
        listOfNumber.add((T) number);
    }

    public <K> K  pick (K a, K b){
        return b;
    }

}
