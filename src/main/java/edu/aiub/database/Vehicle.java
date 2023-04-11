package edu.aiub.database;

import org.bson.Document;

public class Vehicle extends DatabaseConnectivity {
    public Vehicle() {
        super("vehicle");
    }

    @Override
    public void add(Object[] column) {
        try {
            Document document = new Document();
            document.append("id", Count);
            document.append("name", column[0]);
            document.append("model", column[1]);
            document.append("status", column[2]);

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
            updatedData.append("name", column[0]);
            updatedData.append("model", column[1]);
            updatedData.append("status", column[2]);

            Document updatedInventory = new Document("$set", updatedData);

            collection.updateOne(inventoryQuery, updatedInventory);
            System.out.println(collectionName + " Updated successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
