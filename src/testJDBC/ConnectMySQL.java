package testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectMySQL {

    public static void main(String[] args) throws Exception{
        getConnection();
        createTable();
        post();
    }

    private static final String URL = "jdbc:mysql://localhost:3306/PNT";
    private static final String USER = "root";
    private static final String PASSWORD = "abcd";

    // method for insert information

    public static void post()  throws  Exception{
       // final String var1 = "Zana";
       // final String var2 = "Mirat";
        final String var1 = "Seemal";
        final String var2 = "Adam";
       // final int var3 = 2;

        try{
            Connection con = getConnection();
            PreparedStatement post = con.prepareStatement("INSERT INTO mytable(first, last ) VALUES (' " +var1+" ', ' "+var2 + "')");
            post.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Insert completed");
        }
    }

    public static void createTable() throws Exception {  // for create table in the database
        try {
            Connection con = getConnection();
            PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS mytable(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id)) ");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Table created");
        }
    }

    public static Connection getConnection() throws Exception{ // get the connection for database
        try{
            Connection  con = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connected");
            return con;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
