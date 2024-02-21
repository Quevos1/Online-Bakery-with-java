/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.dao;

import co.za.mecer.client.Customer;
import java.util.List;

/**
 *
 * @author PULE
 */
public interface CustomerDAO {
    public List<Customer> ReadAllCustomers();
    public boolean delete(int id);
    //public Customer ReadOneCustomer();
    
}
