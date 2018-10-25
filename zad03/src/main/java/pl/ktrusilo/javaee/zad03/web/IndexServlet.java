package pl.ktrusilo.javaee.zad03.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class IndexServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Witaj w krainie szaf!!!</h1> <br>" +
                "Menu: <br>" +
                "<ul>" +
                "<li><a href='add-wardrobe'>Add Wardrobe</a></li>" +
                "<li><a href='wardrobes'>All Wardrobes</a></li>" +
                "</ul>" +
                "</body></html>");
        out.close();
    }

}
