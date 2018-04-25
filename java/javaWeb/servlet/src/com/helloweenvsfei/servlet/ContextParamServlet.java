package com.helloweenvsfei.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author kouguangyuan
 * @Description
 * @Date Created in 2017/12/29 16:30
 * @Modified By
 */
public class ContextParamServlet extends HttpServlet {

    private static final long serialVersionUID = 3194071196406358461L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>读取文档参数</TITLE></HEAD>");
        out.println("  <link rel='stylesheet' type='text/css' href='../css/style.css'>");
        out.println("  <BODY>");
        out.println("<div align=center><br/>");
        out.println("<fieldset style='width:90%'><legend>所有的文档参数</legend><br/>");

        ServletContext servletContext = this.getServletConfig().getServletContext();

        String uploadFolder = servletContext.getInitParameter("upload folder");
        String allowedFileType = servletContext.getInitParameter("allowed file type");

        out.println("<div class='line'>");
        out.println("	<div align='left' class='leftDiv'>上传文件夹</div>");
        out.println("	<div align='left' class='rightDiv'>" + uploadFolder + "</div>");
        out.println("</div>");

        out.println("<div class='line'>");
        out.println("	<div align='left' class='leftDiv'>实际磁盘路径</div>");
        out.println("	<div align='left' class='rightDiv'>" + servletContext.getRealPath(uploadFolder) + "</div>");
        out.println("</div>");

        out.println("<div class='line'>");
        out.println("	<div align='left' class='leftDiv'>允许上传的类型</div>");
        out.println("	<div align='left' class='rightDiv'>" + allowedFileType + "</div>");
        out.println("</div>");

        out.println("</fieldset></div>");

        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }
}
