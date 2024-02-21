
package co.za.mecer.service;

import co.za.mecer.item.Item;
import java.util.List;


public interface ItemService {
    public boolean add(Item item);   
    //public boolean update();
    public List<Item> read();
    public Item getOneItem(int Item_Id);
    public int quantityOnHand(int Item_Id);
    public boolean delete(int Item_Id);
}
