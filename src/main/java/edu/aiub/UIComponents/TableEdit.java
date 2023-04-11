package edu.aiub.UIComponents;

import edu.aiub.database.DatabaseConnectivity;
import org.bson.Document;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TableEdit {
    public TableEdit(JTable table, DatabaseConnectivity db) {
        // Add a ListSelectionListener to the table's selection model
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                // Get the index of the selected row
                int selectedRow = table.getSelectedRow();
                int columCount = table.getColumnCount();
                ArrayList<String> data = new ArrayList<>();

                if (selectedRow != -1) {
                    // Retrieve the data from the table model
                    for (int i = 0; i < columCount; i++) {
                        data.add(table.getValueAt(selectedRow, i).toString());
                    }

                    // Show a dialog box asking the user what they want to do
                    int option = JOptionPane.showOptionDialog(
                            null,
                            "What do you want to do?",
                            "Select an option",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            new Object[]{"Update", "Delete"},
                            null
                    );

                    // Handle the user's selection
                    switch (option) {
                        case 0: // Update
                            // Show a dialog box allowing the user to update the data
                            ArrayList<String> newData = new ArrayList<>();
                            for (int i = 0; i < columCount; i++) {
                                newData.add(JOptionPane.showInputDialog(null, "Enter a new " + table.getColumnName(i) + ":", data.get(i)));
                            }

                            // Update the data in the table model
                            for (int i = 0; i < columCount; i++) {
                                table.setValueAt(newData.get(i), selectedRow, i);
                            }
                            break;

                        case 1: // Delete
                            // Remove the selected row from the table model
                            db.startDB();
                            db.collection.deleteOne(new Document("id", table.getModel().getValueAt(selectedRow, 0).toString()));
                            db.closeDB();

                            ((DefaultTableModel)table.getModel()).removeRow(selectedRow);
                            break;
                    }
                }
            }
        });
    }
}
