package edu.aiub.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Events {
    public static int eventCount = 0;
    private MongoClient mongoClient;
    private MongoDatabase event_db;
    private MongoCollection<Document> event_collection;
    public Events() {
        try {
            mongoClient = MongoClients.create("mongodb://localhost:27017");
            event_db = mongoClient.getDatabase("nms_db");
            System.out.println("Connection created successfully");
            event_collection = event_db.getCollection("event_collection");
            eventCount = (int) event_collection.countDocuments();
//            System.out.println(eventCount);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addEvent(String event_title, String event_description, String location, Date date, Date time) {
        try {
            Document event = new Document("id", ++eventCount)
                    .append("event", event_title)
                    .append("description", event_description)
                    .append("location", location)
                    .append("start", date)
                    .append("end", time);

            event_collection.insertOne(event);
            System.out.println("Event Added successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateEvent(int id, String event_title, String event_description) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
        String date = dateFormatter.format(new Date());
        String time = timeFormatter.format(new Date());
        try {
            Document eventQuery = new Document("id", id);

            Document updatedNotice = new Document("$set", new Document("event", event_title))
                    .append("description", event_description)
                    .append("date", date)
                    .append("time", time);

            event_collection.updateOne(eventQuery, updatedNotice);
            System.out.println("Event Updated successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteEvent(int id) {
        try {
            Document eventQuery = new Document("id", id);
            event_collection.deleteOne(eventQuery);
            System.out.println("Event Deleted successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Document> getEvent() {
        try {
            ArrayList<Document> event = event_collection.find().sort(new Document("_id", -1)).into(new ArrayList<>());

            mongoClient.close();
            return event;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<Document> getEvent(int quantity) {
        try {
            ArrayList<Document> event = event_collection.find().sort(new Document("_id", -1)).limit(quantity).into(new ArrayList<Document>());

            mongoClient.close();
            return event;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
