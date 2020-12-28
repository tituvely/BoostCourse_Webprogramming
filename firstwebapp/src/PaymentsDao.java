package org.example.firstwebapp.dao;
import org.example.firstwebapp.dto.Payments;

public class PaymentsDao {
    public Payments getPayments(Integer customerNumber){
        Payments payments = null;
        Connection conn = null;
        PreparedStatment ps = null;
        ResultSet rs = null;

        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e){

            }

        }

        return payments;
    }
}