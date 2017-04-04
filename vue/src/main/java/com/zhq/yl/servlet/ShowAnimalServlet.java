package com.zhq.yl.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zhangqi on 2017/4/3.
 */
@WebServlet(name = "ShowAnimalServlet" ,urlPatterns = "/servlet/ShowAnimalServlet")
public class ShowAnimalServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        sayOther(printWriter);
        sayOther2(printWriter);
        printWriter.print("hello zhang qi!");
        say(printWriter);
        printWriter.close();
    }

    private void say(PrintWriter printWriter) {
        printWriter.print("I'm JRebel!");
    }

    private void sayOther2(PrintWriter printWriter) {
        printWriter.print("en say2...");
    }

    private void sayOther(PrintWriter printWriter) {
        printWriter.print("en say...");
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
