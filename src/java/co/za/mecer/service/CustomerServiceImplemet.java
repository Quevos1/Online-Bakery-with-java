package co.za.mecer.service;

import co.za.mecer.client.Customer;
import co.za.mecer.dao.CustomerDAO;

import co.za.mecer.service.CustomerService;
import com.sun.glass.ui.swt.CustomTransfer;
import java.util.List;


public class CustomerServiceImplemet implements CustomerService{
//    
    private CustomerDAO customerDao;

    public CustomerServiceImplemet() {
//        customerDao =  new CustomerDAOImplement();
    }
    
   // @Override
//    public boolean add(Customer customer) {
//        if(customer == null){
//           return false; 
//        }
//        return customerDao
//    }

//    @Override
//    public boolean updateDeliverAddress(int client_id, int deliveryAddress_id) {
//        if(deliveryAddress_id == 0){
//           return false; 
//        }
//        return customerDao.updateDeliverAddress(client_id, deliveryAddress_id);
//    }
//
//    @Override
//    public boolean updatePaymentType_id(int client_id, int paymentType_id) {
//         if(paymentType_id == 0){
//           return false; 
//        }
//        return customerDao.updatePaymentType_id(client_id, paymentType_id);
//    }
//
//    @Override
//    public boolean updateTitle(int client_id, String title) {
//         if(title == null){
//           return false; 
//        }
//        return customerDao.updateTitle(client_id, title);
//    }
//
//    @Override
//    public boolean updateFName(int client_id, String firstName) {
//         if(firstName == null){
//           return false; 
//        }
//        return customerDao.updateFName(client_id, firstName);
//    }
//
//    @Override
//    public boolean updateEmail(int client_id, String email_Address)  {
//         if(email_Address == null){
//           return false; 
//        }
//        return customerDao.updateEmail(client_id, email_Address);
//    }
//
//    @Override
//    public boolean updatePassword(int client_id, String password) {
//        if(password == null){
//           return false; 
//        }
//        return customerDao.updateEmail(client_id, password);
//    }
//
//    @Override
//    public boolean updatePhone(int client_id, String phone) {
//          if(phone == null){
//           return false; 
//        }
//        return customerDao.updateEmail(client_id, phone);
//    }
//
//    @Override
//    public List<Customer> readAll() {
//        return customerDao.readAll();
//    }
//
//    @Override
//    public Customer readOne(int client_Id) {
//       return customerDao.readOne(client_Id);
//    }

    @Override
    public boolean delete(int id) {
        return customerDao.delete(id);
    }

    @Override
    public boolean add(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
