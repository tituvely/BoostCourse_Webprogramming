import org.example.todolist.dao.TodoDao;
import org.example.todolist.dto.TodoDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@WebServlet("/todoAdd")
public class TodoAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        TodoDao todo = new TodoDao();
        TodoDto t = new TodoDto();

        String title= request.getParameter("what");
        String name= request.getParameter("who");
        String sequence= request.getParameter("priority");

        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String regDate = df.format(today);

        t.setTitle(title);
        t.setName(name);
        t.setSequence(Integer.valueOf(sequence));
        t.setRegDate(regDate);

        todo.addTodo(t);

        response.sendRedirect("./main");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
