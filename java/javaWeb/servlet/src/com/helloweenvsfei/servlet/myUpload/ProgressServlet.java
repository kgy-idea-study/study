package com.helloweenvsfei.servlet.myUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author kouguangyuan
 * @Description
 * @Date Created in 2018/1/2 15:45
 * @Modified By
 */

//http://www.jb51.net/article/111037.htm

public class ProgressServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public ProgressServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getSession().getId();
        String filename = request.getParameter("filename");
        //使用sessionid + 文件名生成文件号，与上传的文件保持一致
        id = id + filename;
       /* System.out.println("44444444444");
        System.out.println(id);
        System.out.println("444444444444");*/
        Long size = (Long) ProgressSingleton.get(id + "Size");
        size = size == null ? 100 : size;
        Long progress = (Long)ProgressSingleton.get(id + "Progress");
        progress = progress == null ? 0 : progress;

//        JSONObject json = new JSONObject();
//        json.put("size", size);
//        json.put("progress", progress);
//        response.getWriter().print(json.toString());

        System.out.println("******************");
        System.out.println(size.toString());
        System.out.println(progress.toString());
        System.out.println("******************");
        response.getWriter().print(size.toString()+","+progress.toString());

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
