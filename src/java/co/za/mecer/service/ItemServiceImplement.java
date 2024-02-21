
package co.za.mecer.service;

import co.za.mecer.service.ItemService;
import co.za.mecer.dao.ItemDAO;
import co.za.mecer.dao.ItemDAOImplement;
import co.za.mecer.item.Item;
import java.util.List;


public class ItemServiceImplement implements ItemService{
     public static void main(String[] args) {
//        new ItemDAOImplement().calculateDiscount();
          ItemService is =  new ItemServiceImplement();
         
          System.out.println(is.quantityOnHand(1));

    }
    
    private ItemDAO idi;

    public ItemServiceImplement() {
        idi = new ItemDAOImplement();
    }
    
    @Override
    public boolean add(Item item) {
        if(item==null){
           return false; 
        }
        return idi.add(item);
    }

    @Override
    public List<Item> read() {
        return idi.read();
    }

    @Override
    public Item getOneItem(int Item_Id) {
        return idi.getOneItem(Item_Id);
    }

    @Override
    public boolean delete(int Item_Id) {
        return idi.delete(Item_Id);
    }

    @Override
    public int quantityOnHand(int Item_Id) {
        return idi.quantityOnHand(Item_Id);
    }
}
