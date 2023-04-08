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

public class Notice {
    public static int noticeCount = 0;
    private MongoClient mongoClient;
    private MongoDatabase notice_db;
    private MongoCollection<Document> notice_collection;
    public Notice() {
        try {
            mongoClient = MongoClients.create("mongodb://localhost:27017");
            notice_db = mongoClient.getDatabase("nms_db");
            System.out.println("Connection created successfully");
            notice_collection = notice_db.getCollection("notice_collection");
            noticeCount = (int) notice_collection.countDocuments();
//            System.out.println(noticeCount);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addNotice(String notice_title, String notice_description) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
        String date = dateFormatter.format(new Date());
        String time = timeFormatter.format(new Date());
//        System.out.println(time);
        try {
            Document notice = new Document("id", ++noticeCount)
                    .append("notice", notice_title)
                    .append("description", notice_description)
                    .append("date", date)
                    .append("time", time);

            notice_collection.insertOne(notice);
            System.out.println("Notice Added successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateNotice(int id, String notice_title, String notice_description) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
        String date = dateFormatter.format(new Date());
        String time = timeFormatter.format(new Date());
        try {
            Document noticeQuery = new Document("id", id);

            Document updatedNotice = new Document("$set", new Document("notice", notice_title))
                    .append("description", notice_description)
                    .append("date", date)
                    .append("time", time);

            notice_collection.updateOne(noticeQuery, updatedNotice);
            System.out.println("Notice Updated successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteNotice(int id) {
        try {
            Document noticeQuery = new Document("id", id);
            notice_collection.deleteOne(noticeQuery);
            System.out.println("Notice Deleted successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Document> getNotice() {
        try {
            ArrayList<Document> notice = notice_collection.find().sort(new Document("_id", -1)).into(new ArrayList<>());

            mongoClient.close();
            return notice;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<Document> getNotice(int quantity) {
        try {
            ArrayList<Document> notice = notice_collection.find().sort(new Document("_id", -1)).limit(quantity).into(new ArrayList<Document>());

            mongoClient.close();
            return notice;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
