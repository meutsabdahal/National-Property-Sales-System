package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HouseView {
    // creating object for JFrame
    public JFrame addHousesFrame = new JFrame("Add Houses");
    public JFrame editHouse = new JFrame("Edit House");
    public JFrame sellHouse = new JFrame("Sell House");

    // creating object for JPanel
    private JPanel addHousesPanel = new JPanel();
    private JPanel editHousePanel = new JPanel();
    private JPanel sellHousePanel = new JPanel();
      
    // creating object for JLabel
    private JLabel houseAddress = new JLabel("Address: ");
    private JLabel houseRoom = new JLabel("Number of Rooms: ");
    private JLabel houseSellingPrice = new JLabel("Selling Price:");
    private JLabel houseSoldPrice = new JLabel("Sold Price:");
    private JLabel houseGarden = new JLabel("Garden:");
    private JLabel houseGarage = new JLabel("Garage: ");

    // creating object for JTextField
    public JTextField houseAddressTxt = new JTextField(20);
    public JTextField houseRoomTxt = new JTextField(20);
    public JTextField houseSellingPriceTxt = new JTextField(20);
    public JTextField houseSoldPriceTxt = new JTextField(20);
    public JTextField editHouseAddressTxt = new JTextField(20);
    public JTextField editHouseRoomTxt = new JTextField(20);
    public JTextField editHouseSellingPriceTxt = new JTextField(20);
    public JTextField editBranchWebAddressTxt = new JTextField(20);

    // creating object for JButton
    private JButton addHouse = new JButton("Add House");
    private JButton editHouses = new JButton("Update");
    private JButton sellHouses = new JButton("Sell");

    // creating object for JRadioButton
    private JRadioButton houseGardenYes = new JRadioButton("Yes");
    private JRadioButton houseGardenNo = new JRadioButton("No");
    private JRadioButton houseGarageYes = new JRadioButton("Yes");
    private JRadioButton houseGarageNo = new JRadioButton("No");

	// getting value from JRadioButton
	public String getHouseGarden() {
    	if(houseGardenYes.isSelected()) {
    		return "Yes";
    	}
    	if(houseGardenNo.isSelected()) {
    		return "No";
    	}
    	else 
    		return null;
	}
	
	// getting value from JRadioButton
    public String getHouseGarage() {
    	if(houseGarageYes.isSelected()) {
    		return "Yes";
    	}
    	if(houseGarageNo.isSelected()) {
    		return "No";
    	}
    	else 
    		return null;
    }

    public void addHouses() {
    	addHousesFrame.setSize(500,400);
    	addHousesFrame.setLocationRelativeTo(null);
    	addHousesFrame.setVisible(true);
    	addHousesFrame.setResizable(false);

        // adding panel to the frame with null layout and color
    	addHousesFrame.add(addHousesPanel);
    	addHousesPanel.setLayout(null);
    	addHousesPanel.setBackground(Color.LIGHT_GRAY);
    	
        // adding JLabel and JTextField to the panel and setting their position
    	addHousesPanel.add(houseAddress);
    	houseAddress.setBounds(25, 40, 80, 20);
    	addHousesPanel.add(houseAddressTxt);
    	houseAddressTxt.setBounds(150, 40, 150, 20);
    
        // adding JLabel and JTextField to the panel and setting their position
    	addHousesPanel.add(houseRoom);
    	houseRoom.setBounds(25, 80, 120, 20);
    	addHousesPanel.add(houseRoomTxt);
    	houseRoomTxt.setBounds(150, 80, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	addHousesPanel.add(houseSellingPrice);
    	houseSellingPrice.setBounds(25, 120, 80, 20);
    	addHousesPanel.add(houseSellingPriceTxt);
    	houseSellingPriceTxt.setBounds(150, 120, 150, 20);
        
        // adding JLabel and JRadioButton to the panel and setting their position
    	addHousesPanel.add(houseGarden);
    	houseGarden.setBounds(25, 170, 80, 20);
    	addHousesPanel.add(houseGardenYes);
    	houseGardenYes.setBounds(150, 170, 75, 20);
    	addHousesPanel.add(houseGardenNo);
    	houseGardenNo.setBounds(225, 170, 75, 20);
        
        // adding JLabel and JRadioButton to the panel and setting their position
    	addHousesPanel.add(houseGarage);
    	houseGarage.setBounds(25, 220, 80, 20);
    	addHousesPanel.add(houseGarageYes);
    	houseGarageYes.setBounds(150, 220, 75, 20);
    	addHousesPanel.add(houseGarageNo);
    	houseGarageNo.setBounds(225, 220, 75, 20);
        
        // adding JButton to the panel and setting their position
    	addHousesPanel.add(addHouse);
    	addHouse.setBounds(170, 280, 100, 30);
    	
    }


    public void editHouse() {
    	editHouse.setSize(500,400);
    	editHouse.setLocationRelativeTo(null);
    	editHouse.setVisible(true);
    	editHouse.setResizable(false);
    	editHouse.add(editHousePanel);
    	editHousePanel.setLayout(null);
    	editHousePanel.setBackground(Color.LIGHT_GRAY);
    	
    	// adding JLabel and JTextField to the panel and setting their position
    	editHousePanel.add(houseAddress);
    	houseAddress.setBounds(25, 40, 80, 20);
    	editHousePanel.add(editHouseAddressTxt);
    	editHouseAddressTxt.setBounds(150, 40, 150, 20);
    
        // adding JLabel and JTextField to the panel and setting their position
    	editHousePanel.add(houseRoom);
    	houseRoom.setBounds(25, 80, 120, 20);
    	editHousePanel.add(editHouseRoomTxt);
    	editHouseRoomTxt.setBounds(150, 80, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	editHousePanel.add(houseSellingPrice);
    	houseSellingPrice.setBounds(25, 120, 80, 20);
    	editHousePanel.add(editHouseSellingPriceTxt);
		editHouseSellingPriceTxt.setBounds(150, 120, 150, 20);

        // adding JLabel and JRadioButton to the panel and setting their position
    	editHousePanel.add(houseGarden);
    	houseGarden.setBounds(25, 170, 80, 20);
    	editHousePanel.add(houseGardenYes);
    	houseGardenYes.setBounds(150, 170, 75, 20);
    	editHousePanel.add(houseGardenNo);
    	houseGardenNo.setBounds(225, 170, 75, 20);
		
		// adding JLabel and JRadioButton to the panel and setting their position
		editHousePanel.add(houseGarage);
		houseGarage.setBounds(25, 220, 80, 20);
		editHousePanel.add(houseGarageYes);
		houseGarageYes.setBounds(150, 220, 75, 20);
		editHousePanel.add(houseGarageNo);
		houseGarageNo.setBounds(225, 220, 75, 20);
        
        // adding JButton to the panel and setting their position
    	editHousePanel.add(editHouses);
    	editHouses.setBounds(170, 280, 100, 30);
    }

    public void sellHouse() {
    	sellHouse.setSize(350,150);
    	sellHouse.setLocationRelativeTo(null);
    	sellHouse.setVisible(true);
    	sellHouse.setResizable(false);
    	sellHouse.add(sellHousePanel);
    	sellHousePanel.setLayout(null);
    	sellHousePanel.setBackground(Color.LIGHT_GRAY);
        
        // adding JLabel and JTextField to the panel and setting their position
    	sellHousePanel.add(houseSoldPrice);
    	houseSoldPrice.setBounds(20, 30, 100, 20);
    	sellHousePanel.add(houseSoldPriceTxt);
    	houseSoldPriceTxt.setBounds(110, 30, 150, 20);
        
        // adding JButton to the panel and setting their position
    	sellHousePanel.add(sellHouses);
    	sellHouses.setBounds(100, 60, 100, 30);
    }

	// adding ActionListener to JButton
    public void addHouse(ActionListener a) {
    	addHouse.addActionListener(a);
	}
	// adding ActionListener to JButton
    public void sellHouses(ActionListener b) {
    	sellHouses.addActionListener(b);
	}
	// adding ActionListener to JButton
    public void updateHouse(ActionListener c) {
    	editHouses.addActionListener(c);
    }
}