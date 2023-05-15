package edu.aiub.UI.volunteer;

import edu.aiub.UI.volunteer.essentials.EventApplyForm;
import edu.aiub.database.DatabaseConnectivity;
import edu.aiub.database.Events;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VolunteerRightSidebarScrollPane {

    public static void add(JPanel panel, String title) {


        JPanel componentPanel = new JPanel();
        componentPanel.setLayout(new BoxLayout(componentPanel, BoxLayout.Y_AXIS));
        componentPanel.setBackground(new Color(255, 255, 255));

        JPanel components = new JPanel();
        components.setBackground(new Color(255, 255, 255));
        components.setLayout(new BorderLayout());
        components.add(new JLabel(title), BorderLayout.WEST);

        JButton viewBtn = new JButton("Apply");
        viewBtn.setBackground(new Color(30, 165, 236));
        viewBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DatabaseConnectivity db = new DatabaseConnectivity("event") {
                    @Override
                    public void add(Object[] column) {

                    }

                    @Override
                    public void update(int id, Object[] column) {

                    }
                };
                Document doc = db.collection.find(new Document("event", title)).first();
                new EventApplyForm(doc);
            }
        });
        components.add(viewBtn, BorderLayout.EAST);

        componentPanel.add(components);
        componentPanel.add(Box.createVerticalStrut(10));
        componentPanel.add(new JSeparator());
        componentPanel.add(Box.createVerticalStrut(10));
        panel.add(componentPanel);
    }

}
