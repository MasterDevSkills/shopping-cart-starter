package com.bazlur.shoppingcart.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(value = "/server-time", name = "Server Time")
public class ServerTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.print("<p> Server Time: ");
        writer.print(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME));
        writer.print("</p>\n");
        writer.println("</body>");
        writer.println("</html>");
    }
}
