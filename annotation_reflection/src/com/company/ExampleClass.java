package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/10/14
 * Time: 3:11 PM
 * To change this template use File | Settings | File Templates.
 */

@ClassDoc(author = "Rifatul", date = "02-2-14",
        currentVersion = 0, reviewers = {"Sanjay,Rashed"})
public class ExampleClass extends Thread implements SimpleInterface{

    public String string;
    private int a;

    @SafeVarargs
    public static <T> void methodWithVarargs(T... a) {
    }

    /**
     * @deprecated the method is deprecated for no good reason.
     */
    @Deprecated
    public void deprecatedMethod(int a) {
    }


}
