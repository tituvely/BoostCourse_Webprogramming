import org.example.todolist.dao.TodoDao;
import org.example.todolist.dto.TodoDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/todotype")
public class TodoTypeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TodoDao todo = new TodoDao();
        TodoDto t = new TodoDto();

        String id = req.getParameter("id");
        String type = req.getParameter("type");

        t.setId(Long.valueOf(id).longValue());

        if (type.equals("TODO")) {
            t.setType("DOING");
        } else if (type.equals("DOING")) {
            t.setType("DONE");
        }

        todo.updateTodo(t);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("./main");
        requestDispatcher.forward(req, resp);
    }
}
