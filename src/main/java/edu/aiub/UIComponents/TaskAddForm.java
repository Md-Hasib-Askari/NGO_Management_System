package edu.aiub.UIComponents;

import com.toedter.calendar.JDateChooser;
import edu.aiub.database.Events;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class TaskAddForm extends JDialog {
    public TaskAddForm() {
        setTitle("Add Task");
        setSize(500, 700);
        setLocationRelativeTo(null);
        setModal(true);

        JPanel panel = new JPanel();
//        panel.setBorder(new EmptyBorder(50, 50, 50, 50));
        panel.setLayout(null);

        JLabel taskTitleLabel = new JLabel("Event Title");
        taskTitleLabel.setBounds(40, 50, getWidth()-100, 50);

        JTextField taskTitleField = new JTextField();
        taskTitleField.setBounds(40, 90, ((getWidth()-100)), 50);

        JLabel taskDescriptionLabel = new JLabel("Event Description");
        taskDescriptionLabel.setBounds(40, 150, (getWidth()-100), 50);

        JTextArea taskDescriptionArea = new JTextArea();
        taskDescriptionArea.setBounds(40, 190, (getWidth()-100), 70);

        JLabel eventLocation = new JLabel("Event Location");
        eventLocation.setBounds(40, 270, (getWidth()-100), 50);

        JTextArea eventLocationField = new JTextArea();
        eventLocationField.setBounds(40, 310, (getWidth()-100), 50);

        JLabel startDate = new JLabel("Start Date");
        startDate.setBounds(40, 370, (getWidth()-100), 50);


        UIManager.put("Button.background", new Color(46, 204, 113));
        UIManager.put("Button.foreground", new Color(255, 255, 255));
        JDateChooser startDateField = new JDateChooser();
        startDateField.setDateFormatString("dd-MM-yyyy");
        startDateField.setBounds(40, 410, (getWidth()-100), 50);

        JLabel endDate = new JLabel("End Date");
        endDate.setBounds(40, 470, (getWidth()-100), 50);

        JDateChooser endDateField = new JDateChooser();
        endDateField.setDateFormatString("dd-MM-yyyy");
        endDateField.setBounds(40, 510, (getWidth()-100), 50);

        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.addActionListener(e -> {
            Events task = new Events();
            task.add(new Object[]{
                    taskTitleField.getText(),
                    taskDescriptionArea.getText(),
                    eventLocationField.getText(),
                    startDateField.getDate(),
                    endDateField.getDate()
            });
            dispose();
        });
        addTaskButton.setBounds(40, 570, (getWidth()-100), 50);

        panel.add(Box.createVerticalStrut(50));
        panel.add(taskTitleLabel);
        panel.add(taskTitleField);
        panel.add(taskDescriptionLabel);
        panel.add(taskDescriptionArea);
        panel.add(eventLocation);
        panel.add(eventLocationField);
        panel.add(startDate);
        panel.add(startDateField);
        panel.add(endDate);
        panel.add(endDateField);
        panel.add(addTaskButton);
        panel.add(Box.createVerticalStrut(50));

        add(panel);
        setResizable(false);
        setVisible(true);
    }
}
