package edu.aiub.database;

import org.bson.Document;

public class Inventory extends DatabaseConnectivity {
    public Inventory() {
        super("inventory");
    }

    @Override
    public void add(Object[] column) {
        try {
            Document document = new Document();
            document.append("id", Count);
            document.append("commodity", column[0]);
            document.append("type", column[1]);
            document.append("quantity", column[2]);
            document.append("price", column[3]);

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
            updatedData.append("commodity", column[0]);
            updatedData.append("type", column[1]);
            updatedData.append("quantity", column[2]);
            updatedData.append("price", column[3]);

            Document updatedInventory = new Document("$set", updatedData);

            collection.updateOne(inventoryQuery, updatedInventory);
            System.out.println(collectionName + " Updated successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}