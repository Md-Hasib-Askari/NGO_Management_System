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

public class Notice extends DatabaseConnectivity {

    public Notice() {
        super("notice");
    }

    @Override
    public void add(Object[] column) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
        String date = dateFormatter.format(new Date());
        String time = timeFormatter.format(new Date());
        try {
            Document notice = new Document("id", Count)
                    .append("notice", column[0])
                    .append("description", column[1])
                    .append("date", date)
                    .append("time", time);

            collection.insertOne(notice);
            System.out.println(collectionName + " Added successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update(int id, Object[] column) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
        String date = dateFormatter.format(new Date());
        String time = timeFormatter.format(new Date());
        try {
            Document noticeQuery = new Document("id", id);

            Document updatedNotice = new Document("$set", new Document("notice", column[0]))
                    .append("description", column[1])
                    .append("date", date)
                    .append("time", time);

            collection.updateOne(noticeQuery, updatedNotice);
            System.out.println(collectionName + " Updated successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
