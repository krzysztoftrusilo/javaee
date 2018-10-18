package com.ktrusilo.krzysztof.zad02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class MenuServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>" +
                        "<h2>Witaj!</h2>" +
                        " <p><a href=\"about\">O mnie:</a></p>\n" +
                        " <p><a href=\"date\">Data:</a></p>"+
                "</body></html>");
        out.close();
    }

}
