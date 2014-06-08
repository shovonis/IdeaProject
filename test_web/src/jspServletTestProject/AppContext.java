package jspServletTestProject;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 5/18/14
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class AppContext implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    // Database connection and save to an attribute

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //close Database connection
    }
}
