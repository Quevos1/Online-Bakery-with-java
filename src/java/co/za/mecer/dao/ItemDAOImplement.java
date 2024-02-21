package co.za.mecer.dao;

import co.za.mecer.connection.DBConnection;
import co.za.mecer.item.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
;

public class ItemDAOImplement implements ItemDAO {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public ItemDAOImplement() {
         con = DBConnection.getInstance();
    }

    
    @Override
    public boolean add(Item item) {
        boolean returnValue = false;
        try {
            if (con != null) {
                ps = con.prepareStatement("INSERT INTO item(ItemDiscount_Id, Category_Id,"
                        + " Recipe_Id,"
                        + "Item_Name,"
                        + "Price,"
                        + "Allegens,"
                        + "Description) VALUES ((SELECT ItemDiscount_Id FROM item_discount WHERE ItemDiscount_Id=?), (SELECT Category_Id FROM category WHERE Category_Id=?),"
                        + "(SELECT Recipe_Id FROM recipe WHERE Recipe_Id=?),?,?,?,?)");
                ps.setInt(1, item.getItemDiscount_Id());
                ps.setInt(2, item.getCategory_Id());
                ps.setInt(3, item.getRecipe_Id());
                ps.setString(4, item.getItem_Name());
                ps.setDouble(5, item.getPrice());
                ps.setString(6, item.getAllegens());
                ps.setString(7, item.getDesription());
                //ps.setString(8, item.getInfo());
               
                returnValue = ps.executeUpdate() > 0;
                ps = con.prepareStatement("SELECT LAST_INSERT_ID() as id");
                rs = ps.executeQuery();
                int last_Id = 0;
                if (rs.next()) {
                    last_Id = rs.getInt("id");
                }
                System.out.println("The last ID: " + last_Id);
            }
        } catch (SQLException e) {
            System.out.println("THERE IS AN ERROR " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("OOPS ERROR: " + ex.getMessage());
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("OOPS ERROR: " + ex.getMessage());
                }
            }
        }
        return returnValue;
    }


    @Override
    public List<Item> read() {
        List<Item> allItems = new ArrayList<>();
        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM cakes");
                rs = ps.executeQuery();
                while (rs.next()) {
                    Item item = new Item();
                    item.setItemDiscount_Id(rs.getInt("ItemDiscount_Id"));
                    item.setCategory_Id(rs.getInt("Category_Id"));
                    item.setRecipe_Id(rs.getInt("Recipe_Id"));
                    item.setItem_Name(rs.getString("Item_Name"));
                    item.setPrice(rs.getDouble("Price"));
                    item.setAllegens(rs.getString("Allegens"));
                    item.setDesription(rs.getString("Description"));
                    allItems.add(item);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                }
            }
        }
        return allItems;
    }

public boolean updatePrice(int id, double price) {
        boolean returnValue = false;
        try {
            if (con != null) {
                ps = con.prepareStatement("UPDATE item SET Price=? WHERE Item_Id=?");
                ps.setDouble(1, price);
                ps.setInt(2, id);
                returnValue = ps.executeUpdate() > 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error! Price not updated" + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error! Closing: " + ex.getMessage());
                }
            }
        }
        return returnValue;
    }
    public boolean updateQuantity(int id, int quantity){
        boolean returnValue = false;
        try {
            if (con != null) {
                ps = con.prepareStatement("UPDATE item SET Quantity=? WHERE Item_Id=?");
                ps.setDouble(1, quantity);
                ps.setInt(2, id);
                returnValue = ps.executeUpdate() > 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error! Quantity not updated" + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error! Closing: " + ex.getMessage());
                }
            }
        }
        return returnValue;
    }
    @Override
    public Item getOneItem(int Item_Id) {
        Item item = new Item();
        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM item WHERE Item_Id = ?");
                ps.setInt(1, Item_Id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    item.setItemDiscount_Id(rs.getInt("ItemDiscount_Id"));
                    item.setCategory_Id(rs.getInt("Category_Id"));
                    item.setRecipe_Id(rs.getInt("Recipe_Id"));
                    item.setItem_Name(rs.getString("Item_Name"));
                    item.setPrice(rs.getDouble("Price"));
                    item.setAllegens(rs.getString("Allegens"));
                    item.setDesription(rs.getString("Description"));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                }
            }
        }
        return item;
    }
    @Override
    public int quantityOnHand(int Item_Id){
    int quantity =0;
        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT Quantity FROM item WHERE Item_Id = ?");
                ps.setInt(1, Item_Id);
               
                rs = ps.executeQuery();
                if(rs.next()) {
                    quantity=rs.getInt("Quantity");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                }
            }
        }
        return quantity;
    }

    public boolean delete(int Item_Id) {
        boolean resultValue = false;
        try {
            if (con != null) {
                ps = con.prepareStatement("DELETE from item WHERE Item_Id=?");
                ps.setInt(1, Item_Id);
                resultValue = ps.executeUpdate() > 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error Recipe not deleted: " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error! Closing: " + ex.getMessage());
                }
            }
        }
        return resultValue;
    }
}
