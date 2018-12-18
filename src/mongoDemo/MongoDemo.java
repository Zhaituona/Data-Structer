package mongoDemo;
import com.mongodb.DB;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import java.util.List;

public class MongoDemo {
    public static void main(String[] args) throws Exception {

        try {
            MongoClient mongoClient = new MongoClient("localhost",27017);
            System.out.println("Server connection successfully");

            MongoDatabase dbs = mongoClient.getDatabase("test");
            System.out.println("Connection to Database");
            System.out.println("Database name" + dbs.getName());

            // To get all database names
            List<String>  dbName = mongoClient.getDatabaseNames();
            System.out.println(dbName);

            // to drop database
           // mongoClient.dropDatabase("admin");
           // System.out.println(dbName);
        } catch (Exception e) {
            System.out.println();
        }
    }
}