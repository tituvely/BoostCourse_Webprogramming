package example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/info")
public class InfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>info</title></head>");
        out.println("<body>");

        String uri = request.getRequestURI();
        StringBuffer url = request.getRequestURL();
        String contextPath = request.getContextPath();
        String remoteAddr = request.getRemoteAddr();


        out.println("uri : " + uri + "<br>");
        out.println("url : " + url + "<br>");
        out.println("contentPath : " + contextPath + "<br>");
        out.println("remoteAddr : " + remoteAddr + "<br>");

        out.println("</body>");
        out.println("</html>");
    }
}
