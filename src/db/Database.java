/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package db;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author TUSHAR
 */
public class Database {
    static Connection cn = null;
    static PreparedStatement pst = null;
    static Statement stm = null;
    static ResultSet rst = null;
    public static void dataConnection(String name,int  ItemId,Float Rate)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill","root","sql");
        pst = cn.prepareStatement("insert into item(name,ItemId,Rate) values(?,?,?)");
        pst.setString(1,name);
        pst.setInt(2,ItemId);
        pst.setFloat(3,Rate);
        int x = pst.executeUpdate();
        if(x>0)
            {
                 JOptionPane.showMessageDialog(null, "record stored");
                 cn.close();

            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Sorry");
            }
        }
        catch(Exception ob)
        {
            JOptionPane.showMessageDialog(null,"error: "+ob.getMessage());
        }
        }
    public static void delete_item(int ItemId)
    {
            try
            {
            Class.forName("com.mysql.jdbc.Driver");
             cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill","root","sql");
             pst = cn.prepareStatement("delete from item where ItemId='"+ItemId+"'");
             int x = pst.executeUpdate();
              if(x>0)
            {
                 JOptionPane.showMessageDialog(null,"Deleted");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry ItemId NOT FOUND");
            }
        }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"error:"+ex.getMessage());
            }
    }
    public static void search_item(String name)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill","root","sql");
            stm = cn.createStatement();
            rst = stm.executeQuery("select *from item where name='"+name+"'");
             if(rst.next())
            {
                   Database.setItemId(rst.getInt(2));

                }

        } catch (Exception ex)
        {
             JOptionPane.showMessageDialog(null, "Error : "+ex.getMessage());
        }

    }
    public static void setItemId(int ItemId)
    {
        Database.ItemId = ItemId;
    }
    public static int getItemId()
    {
        return Database.ItemId;
    }
    private static int ItemId;

}
