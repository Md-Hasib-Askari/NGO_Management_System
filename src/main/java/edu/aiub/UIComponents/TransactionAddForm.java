package edu.aiub.UIComponents;

import com.toedter.calendar.JDateChooser;
import edu.aiub.database.Transaction;

import javax.swing.*;
import java.awt.*;

public class TransactionAddForm extends JDialog {
    public TransactionAddForm() {
        setTitle("Add Transaction");
        setSize(400, 650);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel senderLabel = new JLabel("Sender");
        senderLabel.setBounds(40, 50, getWidth()-100, 50);

        JTextField senderField = new JTextField();
        senderField.setBounds(40, 90, ((getWidth()-100)), 50);

        JLabel paymentMethodLabel = new JLabel("Payment Method");
        paymentMethodLabel.setBounds(40, 150, (getWidth()-100), 50);

        JComboBox<String> paymentMethod = new JComboBox(new String[]{
                "bKash",
                "Nagad",
                "Rocket",
        });
        paymentMethod.setBounds(40, 190, ((getWidth()-100)), 50);

        JLabel fundLabel = new JLabel("Fund");
        fundLabel.setBounds(40, 250, (getWidth()-100), 50);

        JComboBox<String> fundList = new JComboBox(new String[]{
                "Food",
                "Clothing",
                "Forestation",
        });
        fundList.setBounds(40, 290, ((getWidth()-100)), 50);

        JLabel amountLabel = new JLabel("Amount");
        amountLabel.setBounds(40, 350, getWidth()-100, 50);

        JTextField amountField = new JTextField();
        amountField.setBounds(40, 390, ((getWidth()-100)), 50);

        JLabel paymentDateLabel = new JLabel("Payment Date");
        paymentDateLabel.setBounds(40, 450, (getWidth()-100), 50);

        UIManager.put("Button.background", new Color(46, 204, 113));
        UIManager.put("Button.foreground", new Color(255, 255, 255));
        JDateChooser paymentDateField = new JDateChooser();
        paymentDateField.setDateFormatString("dd-MM-yyyy");
        paymentDateField.setBounds(40, 490, (getWidth()-100), 50);

        JButton addTransactionBtn = new JButton("Add Transaction");
        addTransactionBtn.addActionListener(e -> {
            Transaction transaction = new Transaction();
            transaction.add(new Object[]{
                    senderField.getText(),
                    paymentMethod.getSelectedItem(),
                    fundList.getSelectedItem(),
                    amountField.getText(),
                    paymentDateField.getDate()
            });
            dispose();
        });
        addTransactionBtn.setBounds(40, 550, (getWidth()-100), 50);

        panel.add(Box.createVerticalStrut(50));
        panel.add(senderLabel);
        panel.add(senderField);
        panel.add(paymentMethodLabel);
        panel.add(fundLabel);
        panel.add(fundList);
        panel.add(paymentMethod);
        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(paymentDateLabel);
        panel.add(paymentDateField);
        panel.add(addTransactionBtn);
        panel.add(Box.createVerticalStrut(50));

        add(panel);
        setVisible(true);

    }
}
