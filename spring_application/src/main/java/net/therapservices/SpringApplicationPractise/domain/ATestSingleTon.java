package net.therapservices.SpringApplicationPractise.domain;

/**
 * Created by rifatul.islam on 6/3/14.
 */
public class ATestSingleTon {
    private static ATestSingleTon aTestSingleTon = null;

    private ATestSingleTon() {

    }

    public static ATestSingleTon getInstance() {
        if (aTestSingleTon != null) {
            return new ATestSingleTon();
        }
        return aTestSingleTon;
    }
}
