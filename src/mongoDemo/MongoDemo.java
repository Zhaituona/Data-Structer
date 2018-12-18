package mongoDemo;
import com.mongodb.*;

import com.mongodb.bulk.BulkWriteResult;
import com.mongodb.client.*;
import com.mongodb.client.model.*;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;
import org.bson.Document;


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