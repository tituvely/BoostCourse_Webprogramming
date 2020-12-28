package kr.or.connect;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class App 
{
    public static void main( String[] args )
    {
        RoleDao dao = new RoleDao();
        Role role = dao.getRole(141);
        System.out.println(role);
    }
}
