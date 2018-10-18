package com.ktrusilo.krzysztof.zad02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/about")
public class AboutServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>"
				+ "<h1>Krzysztof Trusi³o</h1>"
				+ "<p>Student kierunku Informatyka na Uniwersytecie Gdañskim</p>"
				+ "<h2>Hobby</h2>"
				+ "<ul>"
				+ "<li>Analiza danych</li>"
				+ "<li>Projektowanie gier komputerowych</li>"
				+ "<li>Gry strategiczne</li>"
				+ "</ul>"
				+ "</body></html>");
        out.close();
    }

}
