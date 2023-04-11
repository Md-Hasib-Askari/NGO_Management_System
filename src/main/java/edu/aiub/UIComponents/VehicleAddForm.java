package edu.aiub.UIComponents;

import edu.aiub.database.Vehicle;

import javax.swing.*;
import java.awt.*;

public class VehicleAddForm extends JDialog {
    public VehicleAddForm() {
        setTitle("Add Vehicle");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel vehicleNameLabel = new JLabel("Vehicle Name");
        vehicleNameLabel.setBounds(40, 50, getWidth()-100, 50);

        JTextField vehicleNameField = new JTextField();
        vehicleNameField.setBounds(40, 90, ((getWidth()-100)), 50);

        JLabel vehicleModelLabel = new JLabel("Vehicle Model");
        vehicleModelLabel.setBounds(40, 150, (getWidth()-100), 50);

        JTextField vehicleModelField = new JTextField();
        vehicleModelField.setBounds(40, 190, ((getWidth()-100)), 50);

        JLabel vehicleStatusLabel = new JLabel("Status");
        vehicleStatusLabel.setBounds(40, 250, (getWidth()-100), 50);

        JComboBox<String> vehicleStatusList = new JComboBox(new String[]{
                "Available",
                "Onsite",
                "Not Available",
        });
        vehicleStatusList.setBounds(40, 290, ((getWidth()-100)), 50);


        JButton addVehicleBtn = new JButton("Add Vehicle");
        addVehicleBtn.addActionListener(e -> {
            Vehicle vehicle = new Vehicle();
            vehicle.add(new Object[]{
                    vehicleNameField.getText(),
                    vehicleModelField.getText(),
                    vehicleStatusList.getSelectedItem()
            });
            dispose();
        });
        addVehicleBtn.setBounds(40, 350, (getWidth()-100), 50);

        panel.add(Box.createVerticalStrut(50));
        panel.add(vehicleNameLabel);
        panel.add(vehicleNameField);
        panel.add(vehicleStatusLabel);
        panel.add(vehicleModelLabel);
        panel.add(vehicleModelField);
        panel.add(vehicleStatusList);
        panel.add(addVehicleBtn);
        panel.add(Box.createVerticalStrut(50));

        add(panel);
        setVisible(true);

    }
}
