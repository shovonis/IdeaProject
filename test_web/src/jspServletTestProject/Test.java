package jspServletTestProject;

import jspServletTestProject.domain.Person;
import jspServletTestProject.domain.Student;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 5/18/14
 * Time: 10:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Person person = new Student();
        person.setName("shovon");
        person.setAge(24);
        request.setAttribute("person", person);
        RequestDispatcher view = request.getRequestDispatcher("test.jsp");
        view.forward(request, response);
    }
}
