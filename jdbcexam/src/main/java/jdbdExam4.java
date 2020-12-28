package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

import java.util.List;

public class jdbdExam4 {
    public static void main(String[] args) {
        int roleId = 496;

        RoleDao dao = new RoleDao();
        int deleteCount = dao.deleteRole(roleId);

        System.out.println(deleteCount);
    }
}
