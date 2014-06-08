package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/15/14
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Inc {
    public static void main(String argv[]){
        Inc inc = new Inc();
        int i =0;
        inc.fermin(i);
        i = i++;
        System.out.println(i);
    }
    void fermin(int i){
        i++;
    }
}
