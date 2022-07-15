package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlatView {
    // creating object for JFrame
    public JFrame addFlatesFrame = new JFrame("Add Flates");
    public JFrame editFlat = new JFrame("Edit Flat");
    public JFrame sellFlat = new JFrame("Sell Flat");

	// creating object for JFrame
    private JPanel addFlatesPanel = new JPanel();
    private JPanel editFlatesPanel = new JPanel();
    private JPanel sellFlatesPanel = new JPanel();

	// creating object for JFrame
    private JLabel flatAddress = new JLabel("Address: ");
    private JLabel flatRoom = new JLabel("Number of Rooms: ");
    private JLabel flatSellingPrice = new JLabel("Selling Price:");
    private JLabel flatSoldPrice = new JLabel("Sold Price:");
    private JLabel floorNumber = new JLabel("Floor No.:");
    private JLabel monthlyCharge = new JLabel("Monthly Charge:");

	// creating object for JFrame
    public JTextField flatAddressTxt = new JTextField(20);  
    public JTextField flatRoomTxt = new JTextField(20); 
    public JTextField flatSellingPriceTxt = new JTextField(20);
    public JTextField flatSoldPriceTxt = new JTextField(20);
    public JTextField floorNumberTxt = new JTextField(20);  
    public JTextField monthlyChargeTxt = new JTextField(20);
    public JTextField editFlatAddressTxt = new JTextField(20);  
    public JTextField editFlatRoomTxt = new JTextField(20); 
    public JTextField editFlatSellingPriceTxt = new JTextField(20);
    public JTextField editFloorNumberTxt = new JTextField(20);  
    public JTextField editMonthlyChargeTxt = new JTextField(20);

	// creating object for JFrame
    private JButton addFlat = new JButton("Add Flat");
    private JButton editFlates = new JButton("Update");
    private JButton sellFlates = new JButton("Sell");


    public void addFlates() {
    	addFlatesFrame.setSize(500,380);
    	addFlatesFrame.setLocationRelativeTo(null);
    	addFlatesFrame.setVisible(true);
    	addFlatesFrame.setResizable(false); 
    	addFlatesFrame.add(addFlatesPanel);
    	addFlatesPanel.setLayout(null);
    	addFlatesPanel.setBackground(Color.LIGHT_GRAY);
		
		// adding JLabel and JTextField to the panel and setting their position
    	addFlatesPanel.add(flatAddress);
    	flatAddress.setBounds(25, 40, 80, 20);
    	addFlatesPanel.add(flatAddressTxt);
    	flatAddressTxt.setBounds(150, 40, 150, 20);
		
		// adding JLabel and JTextField to the panel and setting their position
    	addFlatesPanel.add(flatRoom);
    	flatRoom.setBounds(25, 80, 120, 20);
    	addFlatesPanel.add(flatRoomTxt);
    	flatRoomTxt.setBounds(150, 80, 150, 20);
		
		// adding JLabel and JTextField to the panel and setting their position
    	addFlatesPanel.add(flatSellingPrice);
    	flatSellingPrice.setBounds(25, 120, 80, 20);
    	addFlatesPanel.add(flatSellingPriceTxt);
    	flatSellingPriceTxt.setBounds(150, 120, 150, 20);
		
		// adding JLabel and JTextField to the panel and setting their position
    	addFlatesPanel.add(floorNumber);
    	floorNumber.setBounds(25, 160, 80, 20);
    	addFlatesPanel.add(floorNumberTxt);
    	floorNumberTxt.setBounds(150, 160, 150, 20);
		
		// adding JLabel and JTextField to the panel and setting their position
    	addFlatesPanel.add(monthlyCharge);
    	monthlyCharge.setBounds(25, 200, 110, 20);
    	addFlatesPanel.add(monthlyChargeTxt);
    	monthlyChargeTxt.setBounds(150, 200, 150, 20);
		
		// adding JButton to the panel and setting their position
    	addFlatesPanel.add(addFlat);
    	addFlat.setBounds(170, 250, 100, 30);
    }
    
    public void editFlat() {
    	editFlat.setSize(500,380);
    	editFlat.setLocationRelativeTo(null);
    	editFlat.setVisible(true);
    	editFlat.setResizable(false); 
    	editFlat.add(editFlatesPanel);
    	editFlatesPanel.setLayout(null);
    	editFlatesPanel.setBackground(Color.LIGHT_GRAY);
		
		// adding JLabel and JTextField to the panel and setting their position
    	editFlatesPanel.add(flatAddress);
    	flatAddress.setBounds(25, 40, 80, 20);
    	editFlatesPanel.add(editFlatAddressTxt);
    	editFlatAddressTxt.setBounds(150, 40, 150, 20);
		
		// adding JLabel and JTextField to the panel and setting their position
    	editFlatesPanel.add(flatRoom);
    	flatRoom.setBounds(25, 80, 120, 20);
    	editFlatesPanel.add(editFlatRoomTxt);
    	editFlatRoomTxt.setBounds(150, 80, 150, 20);
		
		// adding JLabel and JTextField to the panel and setting their position
    	editFlatesPanel.add(flatSellingPrice);
    	flatSellingPrice.setBounds(25, 120, 80, 20);
    	editFlatesPanel.add(editFlatSellingPriceTxt);
    	editFlatSellingPriceTxt.setBounds(150, 120, 150, 20);
		
		// adding JLabel and JTextField to the panel and setting their position
    	editFlatesPanel.add(floorNumber);
    	floorNumber.setBounds(25, 160, 80, 20);
    	editFlatesPanel.add(editFloorNumberTxt);
    	editFloorNumberTxt.setBounds(150, 160, 150, 20);
		
		// adding JLabel and JTextField to the panel and setting their position
    	editFlatesPanel.add(monthlyCharge);
    	monthlyCharge.setBounds(25, 200, 110, 20);
    	editFlatesPanel.add(editMonthlyChargeTxt);
    	editMonthlyChargeTxt.setBounds(150, 200, 150, 20);
		
		// adding JButton to the panel and setting their position
    	editFlatesPanel.add(editFlates);
    	editFlates.setBounds(170, 250, 100, 30);
    }

    public void sellFlat() {
    	sellFlat.setSize(350,150);
    	sellFlat.setLocationRelativeTo(null);
    	sellFlat.setVisible(true);
    	sellFlat.setResizable(false);
    	sellFlat.add(sellFlatesPanel);
    	sellFlatesPanel.setLayout(null);
    	sellFlatesPanel.setBackground(Color.LIGHT_GRAY);
		
		// adding JLabel and JTextField to the panel and setting their position
    	sellFlatesPanel.add(flatSoldPrice);
    	flatSoldPrice.setBounds(30, 30, 100, 20);
    	sellFlatesPanel.add(flatSoldPriceTxt);
    	flatSoldPriceTxt.setBounds(110, 30, 150, 20);
		
		// adding JButton to the panel and setting their position
    	sellFlatesPanel.add(sellFlates);
    	sellFlates.setBounds(100, 60, 100, 30);
    	
    }

	// adding ActionListener to JButton
    public void addFlat(ActionListener a) {
    	addFlat.addActionListener(a);
    }
	// adding ActionListener to JButton
    public void updateFlat(ActionListener b) {
    	editFlates.addActionListener(b);
	}
	// adding ActionListener to JButton
    public void sellFlates(ActionListener c) {
    	sellFlates.addActionListener(c);
	}
	

	
}