package model;

import view.SecretaryView;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class HouseModel {
    // creating object for class
    private SecretaryView secretaryView;

    // parameterized constructor
    public HouseModel(SecretaryView secretaryView){
        this.secretaryView = secretaryView;
    }
    
    public void addHouses(String houseAddressTxt, String houseRoomTxt, String houseSellingPriceTxt, String houseGarden, String houseGarage) {
    
        String house[] = {houseAddressTxt, houseRoomTxt, houseSellingPriceTxt, houseGarden, houseGarage};
        ArrayList<String> values = new ArrayList<String>();

        // adding array to arraylist 
        values.add(house[0]);
        values.add(house[1]);
        values.add(house[2]);
        values.add(house[3]);
        values.add(house[4]);

        // try block
        try {

            // writing object of arraylist in file
            FileWriter addHouse = new FileWriter("files/houses.txt", true);
			PrintWriter pwAddHouse = new PrintWriter(addHouse);
			pwAddHouse.write(values+"\n");
			pwAddHouse.close();
            JOptionPane.showMessageDialog(null, "House Added");
            
        }
        // catch block
        catch (EOFException ex) {
            JOptionPane.showMessageDialog(null, "End of File Reached");
            
		} catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No File Found for Houses");
            
		} catch (IOException ex) {
			ex.printStackTrace();
		}

    }


    public void displayHouses() {
        
        // try block
		try {

            // reading arraylist from file and displaying in the form of table
            FileReader readHouse = new FileReader("files/houses.txt");
		    BufferedReader buffReadHouse = new BufferedReader(readHouse);
            Object[] houseRow = buffReadHouse.lines().toArray();
            int row = 0;
        
            // displaying data in JTable
            while(row < houseRow.length) {
                String houses = houseRow[row].toString().trim();
                String[] col = houses.split(", ");
                col[0] = col[0].replace("[","");
                col[4] = col[4].replace("]","");
                secretaryView.houseTableModel.addRow(col);
                row++;
            }
            buffReadHouse.close();

        } 
        // catch block
        catch (EOFException ex) {
            JOptionPane.showMessageDialog(null, "End of File Reached");
            
		} catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No File Found for Houses");
            
		} catch (IOException ex) {
			ex.printStackTrace();
		}
    }

    public void deleteHouse() {

        // removing selected row from table
		secretaryView.houseTableModel.removeRow(secretaryView.houseTable.getSelectedRow());
        ArrayList<String> removeHouse = new ArrayList<String>();
        
        // try block
        try {

            // deleting the selected row from the file
            FileWriter deleteHouse = new FileWriter("files/houses.txt");
            PrintWriter pwDeleteHouse = new PrintWriter(deleteHouse);
            for (int row = 0; row < secretaryView.houseTableModel.getRowCount(); row++) {
                int column = 0;
                while(column < secretaryView.houseTableModel.getColumnCount()) {
                    removeHouse.add(secretaryView.houseTableModel.getValueAt(row,column).toString());
                     column++;
                 }
                 pwDeleteHouse.println(removeHouse);
                removeHouse.clear();
            }
            pwDeleteHouse.close();

        } 
        // catch block
        catch (EOFException ex) {
            JOptionPane.showMessageDialog(null, "End of File Reached");
            
		} catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No File Found for Houses");
            
		} catch (IOException ex) {
			ex.printStackTrace();
		}
    }

    public void sellHouses(String houseAddressTxt, String houseRoomTxt, String houseSellingPriceTxt, String houseGarden, String houseGarage,String houseSoldPriceTxt){

        String soldHouses[] = {houseAddressTxt, houseRoomTxt, houseSellingPriceTxt, houseGarden, houseGarage, houseSoldPriceTxt};
        ArrayList<String> values = new ArrayList<String>();

        // adding array to arraylist
        values.add(soldHouses[0]);
        values.add(soldHouses[1]);
        values.add(soldHouses[2]);
        values.add(soldHouses[3]);
        values.add(soldHouses[4]);
        values.add(soldHouses[5]);

        // try block
        try {

            // writing object of arraylist in file
            FileWriter soldHouse = new FileWriter("files/soldHouses.txt", true);
			PrintWriter pwSoldHouse = new PrintWriter(soldHouse);
			pwSoldHouse.write(values+"\n");
			pwSoldHouse.close();
            JOptionPane.showMessageDialog(null, "House Sold");
            
        } 
        // catch block
        catch (EOFException ex) {
            JOptionPane.showMessageDialog(null, "End of File Reached");
            
		} catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No File Found for Houses");
            
		} catch (IOException ex) {
			ex.printStackTrace();
		}
    }
}