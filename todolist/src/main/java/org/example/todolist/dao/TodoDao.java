package org.example.todolist.dao;

import org.example.todolist.dto.TodoDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TodoDao {
    private static String dburl = "jdbc:mysql://localhost:3306/todo?useSSL=false";
    private static String dbUser = "todouser";
    private static String dbpasswd = "todo";

    public Integer addTodo(TodoDto todo) {
        int insertCount = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
            String sql = "insert into todo(title, name, sequence) values(?, ?, ?)";
//            insert into todo(title, name, sequence) values('리포트 제출하기', '홍길동', 1);
            ps = conn.prepareStatement(sql);

            ps.setString(1, todo.getTitle());
            ps.setString(2, todo.getName());
            ps.setInt(3, todo.getSequence());

            insertCount = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return insertCount;
    }

    public List<TodoDto> getTodos() {
        List<TodoDto> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "select id, title, name, sequence, type, regdate from todo order by regdate desc";
//        "select id, title, name, sequence, type, regdate from todo where type = 'TODO' order by regdate desc\n"

        try (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    Long id = rs.getLong("id");
                    String name = rs.getString("name");
                    String regDate = rs.getString("regdate");
                    Integer sequence = rs.getInt("sequence");
                    String title = rs.getString("title");
                    String type = rs.getString("type");

                    TodoDto todo = new TodoDto(id, name, regDate, sequence, title, type);
                    list.add(todo);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Integer updateTodo(TodoDto todo) {
        int updateCount = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "update todo set type = ? where id = ?;";

        try (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1,todo.getType());
            ps.setLong(2, todo.getId());

            updateCount = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return updateCount;
    }

}
