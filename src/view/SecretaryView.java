package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class SecretaryView {


    // creating object for JPanel
    private JPanel secretaryNavPanel = new JPanel();
    public JPanel secretaryPanel = new JPanel();
    
    // creating objects for JLabel
    private JLabel flatList = new JLabel("List of Flats");
    private JLabel houseList = new JLabel("List of Houses");

    // creating objects for JButton
    private JButton addHouses = new JButton("Add Houses");
    private JButton addFlates = new JButton("Add Flats");
    private JButton sold = new JButton("Sold Properties");
    public JButton sellHouse = new JButton("Sell House");
    public JButton sellFlat = new JButton("Sell Flat");
    public JButton deleteHouse = new JButton("Delete House");
    public JButton editHouse = new JButton("Edit House");
    public JButton deleteFlat= new JButton("Delete Flat");
    public JButton editFlat = new JButton("Edit Flat");
  
    // creating objects for JTable
    public JTable houseTable = new JTable();
    public JTable flatTable = new JTable();

    // creating objects for DefaultTableModel
    public DefaultTableModel flatTableModel = (DefaultTableModel)flatTable.getModel();
    public DefaultTableModel houseTableModel = (DefaultTableModel)houseTable.getModel();
    
    // creating objects for JScrollPane
    private JScrollPane flatScrollPane = new JScrollPane(flatTable);
    private JScrollPane houseScrollPane = new JScrollPane(houseTable);

    // creating class object
    private NationalPropertySalesSystemView view;

    public SecretaryView(NationalPropertySalesSystemView view){
        this.view = view;
    }

    public void secretaryInterface(){
    	view.GUILayout();
    	view.frame.remove(view.logInPanel);
        view.frame.add(secretaryPanel);
        view.frame.add(secretaryNavPanel);

        // setting panel layout to null along with its position and background color
        secretaryNavPanel.setLayout(null);
     	secretaryNavPanel.setBounds(0, 0, 300, 800);
        secretaryNavPanel.setBackground(Color.MAGENTA);
    	secretaryPanel.setLayout(null);
        secretaryPanel.setBounds(300, 0, 700, 800);
        secretaryPanel.setBackground(Color.PINK);
     	
        // adding JButton to the panel and setting position
    	secretaryNavPanel.add(addHouses);
        addHouses.setBounds(100, 150, 150, 40);
        
        // adding JButton to the panel and setting position
    	secretaryNavPanel.add(addFlates);
        addFlates.setBounds(100, 450, 150, 40);
        
        // adding JButton to the panel and setting position
    	secretaryNavPanel.add(view.close);
        view.close.setBounds(100, 600, 80, 40);
        
        // adding JButton to the panel and setting position
       	secretaryNavPanel.add(sold);
       	sold.setBounds(60, 300, 200, 40);
        
        // adding JLabel to the panel with italic font and setting position
    	secretaryPanel.add(flatList);
    	flatList.setFont(new Font(null, Font.ITALIC, 20));
    	flatList.setBounds(300, 10, 200, 30);

        // adding JLabel to the panel with italic font and setting position
    	secretaryPanel.add(houseList);
    	houseList.setFont(new Font(null, Font.ITALIC, 20));
    	houseList.setBounds(300, 305, 200, 30);
        
        // adding JButton to the panel and setting position
    	secretaryPanel.add(deleteHouse);
        deleteHouse.setBounds(100, 625, 120, 20);
        deleteHouse.setVisible(false);

        // adding JButton to the panel and setting position
    	secretaryPanel.add(deleteFlat);
        deleteFlat.setBounds(100, 625, 120, 20);
        deleteFlat.setVisible(false);
        
        // adding JButton to the panel and setting position
    	secretaryPanel.add(editHouse);
        editHouse.setBounds(300, 625, 100, 20);
        editHouse.setVisible(false);

        // adding JButton to the panel and setting position
    	secretaryPanel.add(editFlat);
        editFlat.setBounds(300, 625, 100, 20);
        editFlat.setVisible(false);
        
        // adding JButton to the panel and setting position
    	secretaryPanel.add(sellHouse);
        sellHouse.setBounds(500, 625, 100, 20);
        sellHouse.setVisible(false);

        // adding JButton to the panel and setting position
        secretaryPanel.add(sellFlat);
    	sellFlat.setBounds(500, 625, 100, 20);
        sellFlat.setVisible(false);
        

        // adding JScrollPane to the panel with table column 
        secretaryPanel.add(flatScrollPane);
    	String[] flatColumn = {"Address", "No. of Rooms", "Selling Price", "Floor Number", "Monthly Charge"};
        flatTableModel.setColumnIdentifiers(flatColumn);

        
        // setting table selectionmode and default editor with its position
    	flatTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		flatScrollPane.setBounds(20, 50, 650, 250);
		flatTable.setDefaultEditor(Object.class, null);
        
        // adding JScrollPane to the panel with table column 
        String[] houseColumn = {"Address", "No. of Rooms", "Selling Price", "Garden", "Garage"};
        houseTableModel.setColumnIdentifiers(houseColumn);
        secretaryPanel.add(houseScrollPane);

        // setting table selectionmode and default editor with its position
		houseTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		houseScrollPane.setBounds(20, 350, 650, 250);
		houseTable.setDefaultEditor(Object.class, null);	 
    	
    }


    public void addHouses(ActionListener a) {
    	addHouses.addActionListener(a);
    }
    public void addFlates(ActionListener b) {
    	addFlates.addActionListener(b);
    }
    // adding ActionListener to JButton
     public void editHouse(ActionListener b){
        editHouse.addActionListener(b);
    }
    // adding ActionListener to JButton
     public void editFlat(ActionListener b){
        editFlat.addActionListener(b);
    }

    // adding ActionListener to JButton
    public void deleteHouse(ActionListener b){
        deleteHouse.addActionListener(b);
    }

    // adding ActionListener to JButton
    public void deleteFlat(ActionListener b){
        deleteFlat.addActionListener(b);
    }
    public void sellHouse(ActionListener c){
    	sellHouse.addActionListener(c);
    }
    public void sellFlat(ActionListener c){
    	sellFlat.addActionListener(c);
    }
    public void sold(ActionListener c){
    	sold.addActionListener(c);
    }

    // adding MouseListener to JTable
    public void flatTable(MouseListener a) {
    	flatTable.addMouseListener(a);
    }
    // adding MouseListener to JTable
    public void houseTable(MouseListener b) {
    	houseTable.addMouseListener(b);
    }

}