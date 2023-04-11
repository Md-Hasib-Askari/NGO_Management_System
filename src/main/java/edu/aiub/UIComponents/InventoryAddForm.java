package edu.aiub.UIComponents;

import edu.aiub.database.Inventory;

import javax.swing.*;
import java.awt.*;

public class InventoryAddForm extends JDialog {
    public InventoryAddForm() {
        setTitle("Add Commodity");
        setSize(400, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel commodityLabel = new JLabel("Commodity");
        commodityLabel.setBounds(40, 50, getWidth()-100, 50);

        JTextField commodityField = new JTextField();
        commodityField.setBounds(40, 90, ((getWidth()-100)), 50);

        JLabel commodityTypeLabel = new JLabel("Type");
        commodityTypeLabel.setBounds(40, 150, (getWidth()-100), 50);

        JComboBox<String> commodityTypeList = new JComboBox(new String[]{
                "Food",
                "Clothing",
                "Forestation",
        });
        commodityTypeList.setBounds(40, 190, ((getWidth()-100)), 50);

        JLabel quantityLabel = new JLabel("Quantity");
        quantityLabel.setBounds(40, 250, (getWidth()-100), 50);

        JTextField quantityField = new JTextField();
        quantityField.setBounds(40, 290, ((getWidth()-100)), 50);

        JLabel amountLabel = new JLabel("Quantity");
        amountLabel.setBounds(40, 350, (getWidth()-100), 50);

        JTextField amountField = new JTextField();
        amountField.setBounds(40, 390, ((getWidth()-100)), 50);

        JButton addUserBtn = new JButton("Add Commodity");
        addUserBtn.addActionListener(e -> {
            Inventory inventory = new Inventory();
            inventory.add(new Object[]{
                commodityField.getText(),
                commodityTypeList.getSelectedItem(),
                quantityField.getText(),
                amountField.getText()
            });
            dispose();
        });
        addUserBtn.setBounds(40, 450, (getWidth()-100), 50);

        panel.add(Box.createVerticalStrut(50));
        panel.add(commodityLabel);
        panel.add(commodityField);
        panel.add(commodityTypeLabel);
        panel.add(quantityLabel);
        panel.add(quantityField);
        panel.add(commodityTypeList);
        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(addUserBtn);
        panel.add(Box.createVerticalStrut(50));

        add(panel);
        setVisible(true);

    }
}
