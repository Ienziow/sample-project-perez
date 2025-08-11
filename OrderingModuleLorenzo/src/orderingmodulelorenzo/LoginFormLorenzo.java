/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderingmodulelorenzo;

/**
 *
 * @author Lorenzo Perez
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFormLorenzo extends JFrame {
    // Components
    private JLabel lblUsername = new JLabel("Username");
    private JLabel lblPassword = new JLabel("Password");
    private JTextField txtName = new JTextField();
    private JPasswordField txtPass = new JPasswordField();
    private JButton btnLogin = new JButton("Login");
    private JButton btnClear = new JButton("Clear");
    private JButton btnExit = new JButton("Exit");

    public LoginFormLorenzo() {
     
        setTitle("My Login Form");
        setSize(300, 200);
        setLayout(null); // Absolute positioning
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        lblUsername.setBounds(20, 20, 80, 30);
        txtName.setBounds(100, 20, 150, 30);
        lblPassword.setBounds(20, 60, 80, 30);
        txtPass.setBounds(100, 60, 150, 30);
        btnLogin.setBounds(20, 100, 80, 30);
        btnClear.setBounds(110, 100, 80, 30);
        btnExit.setBounds(200, 100, 80, 30);

        
        add(lblUsername);
        add(txtName);
        add(lblPassword);
        add(txtPass);
        add(btnLogin);
        add(btnClear);
        add(btnExit);

    
        btnLogin.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = txtName.getText();
        String password = new String(txtPass.getPassword());
        if (username.equals("bpsuccst") && password.equals("12345")) {
            JOptionPane.showMessageDialog(null, "Login Successful! Opening PizzaOrder Form...");
            dispose(); // Close the Login Form
            // Open the Pizza Order Form
            PizzaOrderFormLorenzo pizzaOrderForm = new PizzaOrderFormLorenzo();
            pizzaOrderForm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid login details. Please try again.");
            txtName.setText("");
            txtPass.setText("");
        }
    }
});

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                txtPass.setText("");
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}