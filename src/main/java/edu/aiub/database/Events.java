package edu.aiub.database;

import org.bson.Document;

public class Events extends DatabaseConnectivity {
    public Events() {
        super("event");

    }

    @Override
    public void add(Object[] column) {
        try {
            Document event = new Document();
            event.append("id", Count);
            event.append("event", column[0]);
            event.append("description", column[1]);
            event.append("location", column[2]);
            event.append("start", column[3]);
            event.append("end", column[4]);

            collection.insertOne(event);
            Count++;
            System.out.println(collectionName + " Added successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update(int id, Object[] column) {
//        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
//        String date = dateFormatter.format(new Date());
//        String time = timeFormatter.format(new Date());
        try {
            Document eventQuery = new Document("id", id);

            Document updatedData = new Document();
            updatedData.append("event", column[0]);
            updatedData.append("description", column[1]);
            updatedData.append("location", column[2]);
            updatedData.append("start", column[3]);
            updatedData.append("end", column[4]);

            Document updatedInventory = new Document("$set", updatedData);

            collection.updateOne(eventQuery, updatedInventory);
            System.out.println(collectionName + " Updated successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
