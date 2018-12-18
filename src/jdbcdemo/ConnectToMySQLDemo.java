package jdbcdemo;

import java.sql.*;


public class ConnectToMySQLDemo {


    // for get the three parameters the getconnection() method use
    //   zaytuna's mysql info
    private static final String URL = "jdbc:mysql://localhost:3306/PNT";
    private static final String USER = "root";
    private static final String PASSWORD = "abcd";


    public static void main(String[] args) throws Exception{

        getConnection();

        createTable();

    }


    public static void createTable() throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS tablename(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id)) ");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Table created");
        }
    }

    public static Connection getConnection() throws Exception {

        try {// 1.get a connection to a database
            Connection myConn = DriverManager.getConnection(URL, USER, PASSWORD);// we have to use try catch block

            // 2.Create a statement

            Statement st = myConn.createStatement();


            //3.Execute  a SQL query
            ResultSet myRs = st.executeQuery("SELECT * FROM PNT");// this should be using for select the query
            // 4.Process a SQL Query
            while (myRs.next()) {
                System.out.println(myRs.getString("stID") + " " + myRs.getNString("stName") + " " + myRs.getNString("stDOB"));
            }  // getString () then we put the column we want to show . it will show the data

        } catch (Exception e) {
            e.printStackTrace();


        }
        return null;


    }

}