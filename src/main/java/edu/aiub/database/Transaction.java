package edu.aiub.database;

import org.bson.Document;

import java.util.Date;

public class Transaction extends DatabaseConnectivity {
    public Transaction() {
        super("transaction");
    }

    @Override
    public void add(Object[] column) {
        try {
            Document document = new Document();
            document.append("id", Count);
            document.append("sender", column[0]);
            document.append("method", column[1]);
            document.append("fund", column[2]);
            document.append("amount", column[3]);
            document.append("date", new Date());

            collection.insertOne(document);
            Count++;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update(int id, Object[] column) {
        try {
            Document inventoryQuery = new Document("id", id);

            Document updatedData = new Document();
            updatedData.append("sender", column[0]);
            updatedData.append("method", column[1]);
            updatedData.append("fund", column[2]);
            updatedData.append("amount", column[3]);
            updatedData.append("date", new Date());

            Document updatedInventory = new Document("$set", updatedData);

            collection.updateOne(inventoryQuery, updatedInventory);
            System.out.println(collectionName + " Updated successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
