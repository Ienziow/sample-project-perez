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
import java.awt.event.*;

public class PizzaOrderFormLorenzo extends JFrame {
    // Components
    private JLabel lblName = new JLabel("Customer Name");
    private JTextField txtName = new JTextField();
    private JLabel lblAddress = new JLabel("Address");
    private JTextField txtAddress = new JTextField();
    private JLabel lblFlavor = new JLabel("Flavor");
    private JList<String> listFlavor = new JList<>(new String[] { "Hawaiian", "Ham and Cheese", "Pepperoni", "Overload" });
    private JScrollPane scrollFlavor = new JScrollPane(listFlavor); // Wrap listFlavor with JScrollPane

    private JLabel lblPizzaSize = new JLabel("Pizza Size");
    private JComboBox<String> cmbPizzaSize = new JComboBox<>(new String[] { "Small", "Medium", "Large", "Family" });
    private JLabel lblPizzaPrice = new JLabel("Pizza Price");
    private JTextField txtPizzaPrice = new JTextField();
    private JLabel lblDrinks = new JLabel("Drinks");
    private JList<String> listDrinks = new JList<>(new String[] { "Water", "Sprite", "Royal", "Iced Tea" });
    private JScrollPane scrollDrinks = new JScrollPane(listDrinks); // Wrap listDrinks with JScrollPane

    private JLabel lblDrinkSize = new JLabel("Drink Size");
    private JComboBox<String> cmbDrinkSize = new JComboBox<>(new String[] { "Regular", "Large" });
    private JLabel lblDrinkPrice = new JLabel("Drink Price");
    private JTextField txtDrinkPrice = new JTextField();
    private JButton btnOrder = new JButton("Place your Order");
    private JLabel lblItemOrder = new JLabel("Item Ordered");
    private JList<String> listOrder = new JList<>(new DefaultListModel<>());
    private JLabel lblPrice = new JLabel("Price");
    private JList<String> listPrice = new JList<>(new DefaultListModel<>());
    private JLabel lblTotal = new JLabel("Total");
    private JLabel lblTotalAmt = new JLabel("0");
    private JLabel lblAmtPay = new JLabel("Amount to Pay");
    private JTextField txtAmt = new JTextField();
    private JLabel lblCash = new JLabel("Given Cash");
    private JTextField txtCash = new JTextField();
    private JButton btnPay = new JButton("Pay Order");
    private JLabel lblChange = new JLabel("Change");
    private JTextField txtChange = new JTextField();

    public PizzaOrderFormLorenzo() {
        
        setTitle("My Pizza Order Form");
        setSize(500, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        lblName.setBounds(20, 20, 100, 30);
        txtName.setBounds(150, 20, 200, 30);
        lblAddress.setBounds(20, 60, 100, 30);
        txtAddress.setBounds(150, 60, 200, 30);
        lblFlavor.setBounds(20, 100, 100, 30);
        scrollFlavor.setBounds(150, 100, 200, 60); 
        lblPizzaSize.setBounds(20, 180, 100, 30);
        cmbPizzaSize.setBounds(150, 180, 200, 30);
        lblPizzaPrice.setBounds(20, 220, 100, 30);
        txtPizzaPrice.setBounds(150, 220, 200, 30);
        lblDrinks.setBounds(20, 260, 100, 30);
        scrollDrinks.setBounds(150, 260, 200, 60); 
        lblDrinkSize.setBounds(20, 340, 100, 30);
        cmbDrinkSize.setBounds(150, 340, 200, 30);
        lblDrinkPrice.setBounds(20, 380, 100, 30);
        txtDrinkPrice.setBounds(150, 380, 200, 30);
        btnOrder.setBounds(20, 420, 150, 30);
        lblItemOrder.setBounds(20, 460, 100, 30);
        listOrder.setBounds(150, 460, 150, 60);
        lblPrice.setBounds(310, 460, 100, 30);
        listPrice.setBounds(370, 460, 100, 60);
        lblTotal.setBounds(20, 530, 100, 30);
        lblTotalAmt.setBounds(150, 530, 100, 30);
        lblAmtPay.setBounds(20, 560, 100, 30);
        txtAmt.setBounds(150, 560, 100, 30);
        lblCash.setBounds(20, 590, 100, 30);
        txtCash.setBounds(150, 590, 100, 30);
        btnPay.setBounds(270, 560, 100, 30);
        lblChange.setBounds(270, 590, 100, 30);
        txtChange.setBounds(370, 590, 100, 30);

        // Disable editing on price and change fields
        txtPizzaPrice.setEditable(false);
        txtDrinkPrice.setEditable(false);
        txtAmt.setEditable(false);
        txtChange.setEditable(false);

        
        add(lblName);
        add(txtName);
        add(lblAddress);
        add(txtAddress);
        add(lblFlavor);
        add(scrollFlavor); 
        add(lblPizzaSize);
        add(cmbPizzaSize);
        add(lblPizzaPrice);
        add(txtPizzaPrice);
        add(lblDrinks);
        add(scrollDrinks);
        add(lblDrinkSize);
        add(cmbDrinkSize);
        add(lblDrinkPrice);
        add(txtDrinkPrice);
        add(btnOrder);
        add(lblItemOrder);
        add(listOrder);
        add(lblPrice);
        add(listPrice);
        add(lblTotal);
        add(lblTotalAmt);
        add(lblAmtPay);
        add(txtAmt);
        add(lblCash);
        add(txtCash);
        add(btnPay);
        add(lblChange);
        add(txtChange);

        cmbPizzaSize.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (cmbPizzaSize.getSelectedItem().equals("Small")) {
                    txtPizzaPrice.setText("300");
                } else if (cmbPizzaSize.getSelectedItem().equals("Medium")) {
                    txtPizzaPrice.setText("450");
                } else if (cmbPizzaSize.getSelectedItem().equals("Large")) {
                    txtPizzaPrice.setText("500");
                } else if (cmbPizzaSize.getSelectedItem().equals("Family")) {
                    txtPizzaPrice.setText("550");
                }
            }
        });


        cmbDrinkSize.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (cmbDrinkSize.getSelectedItem().equals("Regular")) {
                    txtDrinkPrice.setText("30");
                } else if (cmbDrinkSize.getSelectedItem().equals("Large")) {
                    txtDrinkPrice.setText("50");
                }
            }
        });

        btnOrder.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String selectedFlavor = listFlavor.getSelectedValue();
                String selectedPizzaSize = (String) cmbPizzaSize.getSelectedItem();
                String selectedDrink = listDrinks.getSelectedValue();
                String selectedDrinkSize = (String) cmbDrinkSize.getSelectedItem();
                String pizzaPrice = txtPizzaPrice.getText();
                String drinkPrice = txtDrinkPrice.getText();

                DefaultListModel<String> orderModel = (DefaultListModel<String>) listOrder.getModel();
                DefaultListModel<String> priceModel = (DefaultListModel<String>) listPrice.getModel();

                if (selectedFlavor != null && selectedDrink != null) {
                    orderModel.addElement(selectedFlavor + " (" + selectedPizzaSize + ")");
                    orderModel.addElement(selectedDrink + " (" + selectedDrinkSize + ")");
                    priceModel.addElement(pizzaPrice);
                    priceModel.addElement(drinkPrice);

                    int total = Integer.parseInt(lblTotalAmt.getText()) + Integer.parseInt(pizzaPrice) + Integer.parseInt(drinkPrice);
                    lblTotalAmt.setText(String.valueOf(total));
                    txtAmt.setText(String.valueOf(total));
                } else {
                    JOptionPane.showMessageDialog(null, "Please select pizza flavor and drink.");
                }
            }
        });

         btnPay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int amountToPay = Integer.parseInt(txtAmt.getText());
                    int givenCash = Integer.parseInt(txtCash.getText());
                    if (givenCash >= amountToPay) {
                        txtChange.setText(String.valueOf(givenCash - amountToPay));
                        JOptionPane.showMessageDialog(null, "Order Paid Successfully! Enjoy your meal!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient cash! Please provide enough money.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid cash amount.");
                }
            }
        });
    }
}