package com.helloweenvsfei.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author kouguangyuan
 * @Description
 * @Date Created in 2018/1/3 11:43
 * @Modified By
 */
public class ThreadSafetyServlet extends HttpServlet{
    private static final long serialVersionUID = 2957055449370562943L;

    private String name;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        name = request.getParameter("name");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        response.getWriter().println("您好, " + name + ". 您使用了 GET 方式提交数据");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        name = request.getParameter("name");

        response.getWriter().println("您好, " + name + ". 您使用了 POST 方式提交数据");
    }
}
