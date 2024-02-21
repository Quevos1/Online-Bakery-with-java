package co.za.mecer.dao;

import co.za.mecer.item.Item;
import java.util.List;

public interface ItemDAO {

    public boolean add(Item item);

    public boolean updatePrice(int id, double Price);

    public boolean updateQuantity(int id, int quantity);

    public List<Item> read();

    public Item getOneItem(int Item_Id);

    public int quantityOnHand(int Item_Id);

    public boolean delete(int Item_Id);

}
