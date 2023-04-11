package edu.aiub.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;

public abstract class DatabaseConnectivity {
    protected int Count = 0;
    protected MongoClient mongoClient;
    protected MongoDatabase db;
    public MongoCollection<Document> collection;
    public String collectionName;

    protected DatabaseConnectivity(String collectionName) {
        this.collectionName = collectionName;
        try {
            mongoClient = MongoClients.create("mongodb://localhost:27017");
            db = mongoClient.getDatabase("nms_db");
            System.out.println("Connection created successfully");
            collection = db.getCollection(collectionName+"_collection");
            Count = (int) collection.countDocuments();
//            System.out.println(eventCount);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void startDB() {
        try {
            mongoClient = MongoClients.create("mongodb://localhost:27017");
            db = mongoClient.getDatabase("nms_db");
            System.out.println("Connection created successfully");
            collection = db.getCollection(collectionName+"_collection");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void closeDB() {
        try {
            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Document> getAll() {
        try {
            ArrayList<Document> event = collection.find().sort(new Document("_id", -1)).into(new ArrayList<>());

            mongoClient.close();
            return event;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<Document> get(int quantity) {
        try {
            ArrayList<Document> event = collection.find().sort(new Document("_id", -1)).limit(quantity).into(new ArrayList<Document>());

            mongoClient.close();
            return event;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void delete(int id) {
        try {
            Document eventQuery = new Document("id", id);
            collection.deleteOne(eventQuery);
            System.out.println(collectionName + " Deleted successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public abstract void add(Object[] column);
    public abstract void update(int id, Object[] column);

}
