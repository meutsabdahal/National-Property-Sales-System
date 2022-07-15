package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class SoldView {
    // creating object for JFrame
    public JFrame soldProperties = new JFrame("Sold Properties");

    // creating object for JPanel
    private JPanel soldProperty = new JPanel();

    // creating objects for JLabel
    private JLabel soldFlatList = new JLabel("List of Sold Flats");
    private JLabel soldHouseList = new JLabel("List of Sold Houses");

    // creating objects for JTable
    public JTable soldHouseTable = new JTable();
    public JTable soldFlatTable = new JTable();

    // creating objects for DefaultTableModel
    public DefaultTableModel soldFlatTableModel = (DefaultTableModel)soldFlatTable.getModel();
    public DefaultTableModel soldHouseTableModel = (DefaultTableModel)soldHouseTable.getModel();
    
    // creating objects for JScrollPane
    protected JScrollPane soldFlatScrollPane = new JScrollPane(soldFlatTable);
    protected JScrollPane soldHouseScrollPane = new JScrollPane(soldHouseTable);

    // // creating objects for JButton
    private JButton closeSoldFrame = new JButton("Close");

    public void soldProperties(){
    	soldProperties.setSize(700,700);
    	soldProperties.setLocationRelativeTo(null);
    	soldProperties.setVisible(true);
    	soldProperties.setResizable(false); 
    	soldProperties.add(soldProperty);
    	soldProperty.setLayout(null);
    	soldProperty.setBackground(Color.LIGHT_GRAY);
    	
        // adding JLabel to the panel with italic font and setting position
    	soldProperty.add(soldFlatList);
    	soldFlatList.setFont(new Font(null, Font.ITALIC, 20));
    	soldFlatList.setBounds(300, 10, 200, 30);

        // adding JLabel to the panel with italic font and setting position
    	soldProperty.add(soldHouseList);
    	soldHouseList.setFont(new Font(null, Font.ITALIC, 20));
    	soldHouseList.setBounds(300, 305, 200, 30);
        

        // adding JScrollPane to the panel with table column 
        soldProperty.add(soldFlatScrollPane);
    	String[] flatColumn = {"Address", "No. of Rooms", "Selling Price", "Floor Number", "Monthly Charge","Sold Price"};
        soldFlatTableModel.setColumnIdentifiers(flatColumn);

        
        // setting table selectionmode and default editor with its position
    	soldFlatTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		soldFlatScrollPane.setBounds(20, 50, 650, 250);
		soldFlatTable.setDefaultEditor(Object.class, null);
        
        // adding JScrollPane to the panel with table column 
        String[] houseColumn = {"Address", "No. of Rooms", "Selling Price", "Garden", "Garage", "Sold Price"};
        soldHouseTableModel.setColumnIdentifiers(houseColumn);
        soldProperty.add(soldHouseScrollPane);

        // setting table selectionmode and default editor with its position
		soldHouseTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		soldHouseScrollPane.setBounds(20, 350, 650, 250);
		soldHouseTable.setDefaultEditor(Object.class, null);

        // adding JButton to panel and setting its position
    	soldProperty.add(closeSoldFrame);
    	closeSoldFrame.setBounds(300, 610, 100, 40);
    	
    }

    // adding ActionListener to JButton
    public void closeSoldFrame(ActionListener a) {
    	closeSoldFrame.addActionListener(a);
    }
    
    
}