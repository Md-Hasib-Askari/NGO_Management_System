package edu.aiub.database;

import org.bson.Document;

public class Users extends DatabaseConnectivity {
    public Users() {
        super("users");
    }

    @Override
    public void add(Object[] column) {
        try {
            Document document = new Document();
            document.append("id", Count);
            document.append("name", column[0]);
            document.append("email", column[1]);
            document.append("password", column[2]);
            document.append("phone", column[3]);
            document.append("role", column[4]);

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
            updatedData.append("email", column[1]);
            updatedData.append("password", column[2]);
            updatedData.append("phone", column[3]);
            updatedData.append("role", column[4]);

            Document updatedInventory = new Document("$set", updatedData);

            collection.updateOne(inventoryQuery, updatedInventory);
            System.out.println(collectionName + " Updated successfully");

            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}