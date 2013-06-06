/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package db;
import java.sql.*;
/**
 *
 * @author TUSHAR
 */
public class Database2
{
   private static Statement stmt=null;
   private static ResultSet rst=null;
   private static Connection cn=null;
   public Database2()
    {

    }
   public static void readingData(int ItemId)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill", "root", "sql");
            stmt = cn.createStatement();
            rst= stmt.executeQuery("select *from item where ItemId='"+ItemId+"'");
            if(rst.next())
            {
                        set_Data(rst.getString(1),rst.getInt(2),rst.getFloat(3));

            }
        }
        catch(Exception ex)
        {

        }
    }
   public static void set_Data(String name,int ItemId,float Rate)
    {
       Database2.name = name;
       Database2.ItemId = ItemId;
       Database2.Rate = Rate;
   }
   public static String get_name()
    {
       return Database2.name;
   }
   public static int get_ItemId()
    {
       return Database2.ItemId;
   }
   public  static float get_Rate()
    {
       return Database2.Rate;
   }
 private static String name;
 private static int ItemId;
 private static float Rate;
}
