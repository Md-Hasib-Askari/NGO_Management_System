package edu.aiub;

import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Date;

public class Test {
    public Test() {
        try {
            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
            MongoDatabase database = mongoClient.getDatabase("nms_db");
            MongoCollection<Document> collection = database.getCollection("notice_collection");
            System.out.println("Connection created successfully");
            insertData(collection, "Notice 1", "This is notice 1");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insertData(MongoCollection<Document> document, String notice_title, String notice_description) {
        Document notice = new Document("notice", notice_title)
                .append("description", notice_description)
                .append("date", new Date());
        document.insertOne(notice);
        System.out.println("Collection created successfully");
    }

    public static void main(String[] args) {
        new Test();
    }
}
