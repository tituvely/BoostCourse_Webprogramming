import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

//@WebServlet(name = "TodayServlet")
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>form</title></head>");
        out.println("<body>");

        out.println("<a href" +
                "='index.html'>" +
                "메인화면</a>");

        out.println("<br>");

        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int date=c.get(Calendar.DATE);

        int hour=c.get(Calendar.HOUR_OF_DAY);
        int minute=c.get(Calendar.MINUTE);
        int second=c.get(Calendar.SECOND);

        out.println("<div style='text-align: center; margin-top: 100px;'>");

        out.println("현재시간은 ");

        out.println(Integer.toString(year));
        out.println("/ ");
        out.println(Integer.toString(month));
        out.println("/ ");
        out.println(Integer.toString(date));
        out.println("<br>");

        out.println(Integer.toString(hour));
        out.println("시 ");
        out.println(Integer.toString(minute));
        out.println("분 ");
        out.println(Integer.toString(second));
        out.println("초입니다.");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}
