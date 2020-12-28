package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class jdbcExam5 {
    public static void main(String[] args) {
        int roleId = 450;
        String description = "CEO";

        Role role = new Role(roleId, description);

        RoleDao dao = new RoleDao();
        int updateCount = dao.updateRole(role);

        System.out.println(updateCount);
    }
}
