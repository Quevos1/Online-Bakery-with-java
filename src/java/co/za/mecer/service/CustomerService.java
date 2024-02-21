package co.za.mecer.service;

import co.za.mecer.client.Customer;
import java.util.List;


public interface CustomerService {
    public boolean add(Customer customer);
    
    public boolean delete(int id);
}
