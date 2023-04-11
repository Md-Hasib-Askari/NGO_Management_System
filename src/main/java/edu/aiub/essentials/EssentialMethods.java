package edu.aiub.essentials;

import edu.aiub.database.DatabaseConnectivity;
import edu.aiub.database.Transaction;
import org.bson.Document;

import java.util.ArrayList;

public class EssentialMethods {
    public static String countPrinter(int count) {
        if (count < 10) {
            return "0" + count;
        } else {
            return "" + count;
        }
    }

    public static int totalBalance() {
        int totalBalance = 0;
        DatabaseConnectivity db = new Transaction();
        db.startDB();
        ArrayList<Document> tnxData = db.getAll();
        for (Document data : tnxData) {
            totalBalance += Integer.parseInt(data.get("amount").toString());
        }
        db.closeDB();
        return totalBalance;
    }
}
