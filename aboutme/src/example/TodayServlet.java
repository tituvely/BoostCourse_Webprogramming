package example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;
import java.time.*;

@WebServlet(name = "TodayServlet", urlPatterns = "/today")
public class TodayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<meta charset='utf-8'>");
        out.println("<head><title>today</title></head>");
        out.println("<body>");
        out.println("<a href='index.html'>메인화면</a></br>");
        out.println("<span> 현재시간 : ");

        LocalDateTime currentDateTime = LocalDateTime.now();
        out.println(currentDateTime.getYear());
        out.println("/");
        out.println(currentDateTime.getMonthValue());
        out.println("/");
        out.println(currentDateTime.getDayOfMonth());
        out.println(" ");
        out.println(currentDateTime.getHour());
        out.println(":");
        out.println(currentDateTime.getMinute());
        out.println("</body>");
        out.println("</html>");
    }
}
