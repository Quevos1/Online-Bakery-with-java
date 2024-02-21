/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.client;

import co.za.mecer.connection.DBConnection;
import co.za.mecer.item.Item;
import co.za.mecer.service.ItemService;
import co.za.mecer.service.ItemServiceImplement;
import co.za.mecer.service.RegisterImpl;
import co.za.mecer.service.RegisterService;
import java.sql.Connection;
import java.time.LocalDateTime;

/**
 *
 * @author PULE
 */
public class test {
    public static void main(String[] args) {
        new test().run();
    }
    
    public void run(){
       Item item = new Item("Bread", 250, 10, "Allegens", "Desription","");
        
        ItemService itemserv = new ItemServiceImplement();
        
        itemserv.add(item);
    }
    
    public static Connection getConnection(){
        return DBConnection.getInstance();
    }
}
