package com.company;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/10/14
 * Time: 3:07 PM
 * To change this template use File | Settings | File Templates.
 */


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassDoc {
    String author() default "N/A";

    String date() default "";

    int currentVersion() default 1;

    String[] reviewers();

}
