package edu.aiub.UIComponents;

import edu.aiub.database.Users;

import javax.swing.*;
import java.awt.*;

public class UserAddForm extends JDialog {
    public UserAddForm() {
        setTitle("Add User");
        setSize(400, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel usernameLabel = new JLabel("Name");
        usernameLabel.setBounds(40, 50, getWidth()-100, 50);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(40, 90, ((getWidth()-100)), 50);

        JLabel userEmailLabel = new JLabel("Email");
        userEmailLabel.setBounds(40, 150, (getWidth()-100), 50);

        JTextField userEmailField = new JTextField();
        userEmailField.setBounds(40, 190, ((getWidth()-100)), 50);

        JLabel userPasswordLabel = new JLabel("Password");
        userPasswordLabel.setBounds(40, 250, (getWidth()-100), 50);

        JTextField userPasswordField = new JTextField();
        userPasswordField.setBounds(40, 290, ((getWidth()-100)), 50);

        JLabel userPhoneLabel = new JLabel("Phone");
        userPhoneLabel.setBounds(40, 350, (getWidth()-100), 50);

        JTextField userPhoneField = new JTextField();
        userPhoneField.setBounds(40, 390, ((getWidth()-100)), 50);

        JLabel userRole = new JLabel("Role");
        userRole.setBounds(40, 450, (getWidth()-100), 50);

        JComboBox<String> userRoleField = new JComboBox(new String[]{
                "Admin",
                "Staff",
                "User",
                "Volunteer"
        });
        userRoleField.setBounds(40, 490, ((getWidth()-100)), 50);

        JButton addUserBtn = new JButton("Add User");
        addUserBtn.addActionListener(e -> {
            Users user = new Users();
            user.add(new Object[] {
                    usernameField.getText(),
                    userEmailField.getText(),
                    userPasswordField.getText(),
                    userPhoneField.getText(),
                    userRoleField.getSelectedItem()
            });
            dispose();
        });
        addUserBtn.setBounds(40, 550, (getWidth()-100), 50);

        panel.add(Box.createVerticalStrut(50));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(userEmailLabel);
        panel.add(userEmailField);
        panel.add(userPasswordLabel);
        panel.add(userPasswordField);
        panel.add(userPhoneLabel);
        panel.add(userPhoneField);
        panel.add(userRole);
        panel.add(userRoleField);
        panel.add(addUserBtn);
        panel.add(Box.createVerticalStrut(50));

        add(panel);
        setVisible(true);

    }
}
