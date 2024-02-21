package co.za.mecer.dao;

import co.za.mecer.client.Customer;
import co.za.mecer.dao.CustomerDAO;
import co.za.mecer.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PULE
 */
public class CustomerDAOImpl implements CustomerDAO {
    private Connection con = null;
    private PreparedStatement psmt;
    private ResultSet rs;
    
    
//    public static void main(String[] args) {
//        new CustomerDAOImpl().run();
//    }
//    
//    public void run(){
//        
//        Customer cust = new Customer();
//        
//        List<Customer> custList = new ArrayList<>();
//        for(Customer customer : ReadAllCustomers() ){
//            System.out.println(customer);
//        }
//        
//    }
    
    @Override
    public List<Customer> ReadAllCustomers() {
        con = DBConnection.getInstance();
        List<Customer> allCustomers = new ArrayList<>();

        try {
            if (con != null) {
                psmt = con.prepareStatement("SELECT * FROM client");
                rs = psmt.executeQuery();

                while (rs.next()) {
                    Customer customer = new Customer();
                    //customer.getClient_Id(rs.getInt());
                    customer.setTitle(rs.getString("Title"));
                    customer.setFirst_Name(rs.getString("First_Name"));
                    customer.setSurname(rs.getString("Surname"));
                    customer.setId_Number(rs.getString("Id_Number"));
                    customer.setEmail_Address(rs.getString("Email_Address"));
                    customer.setPassword(rs.getString("User_Password"));
                    customer.setPhone(rs.getString("Phone"));
                    allCustomers.add(customer);
                }
            }
        } catch (Exception ex) {
            ex.getMessage();
          } finally {
            if (psmt != null) {
                try {
                    psmt.close();
                } catch (SQLException ex) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                }
            }
            con = null;
        }
        return allCustomers;
    }

    @Override
    public boolean delete(int client_id) {
        boolean resultValue = false;
        try {
            if (con != null) {
                psmt = con.prepareStatement("DELETE FROM client WHERE Client_Id=?");
                psmt.setInt(1, client_id);
                resultValue = psmt.executeUpdate() > 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error Recipe not deleted: " + ex.getMessage());
        } finally {
            if (psmt != null) {
                try {
                    psmt.close();
                } catch (SQLException ex) {
                    System.out.println("Error! Closing: " + ex.getMessage());
                }
            }
        }
        return resultValue;
    }

}
