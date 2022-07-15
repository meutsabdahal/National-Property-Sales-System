package model;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import view.SoldView;

public class SoldModel {
    // creating object for class
    private SoldView soldView;

    // parameterized constructor
    public SoldModel(SoldView soldView){
        this.soldView = soldView;
    }
    
    public void displaySoldFlates() {
        
        // try block
		try {

            // reading arraylist from file and displaying in the form of table
            FileReader readSoldFlat = new FileReader("files/soldFlates.txt");
		    BufferedReader buffReadSoldFlat = new BufferedReader(readSoldFlat);
            Object[] soldFlatRow = buffReadSoldFlat.lines().toArray();
            int row = 0;
        
            // displaying data in JTable
            while(row < soldFlatRow.length) {
                String soldFlates = soldFlatRow[row].toString().trim();
                String[] col = soldFlates.split(", ");
                col[0] = col[0].replace("[","");
                col[5] = col[5].replace("]","");
                soldView.soldFlatTableModel.addRow(col);
                row++;
            }
            buffReadSoldFlat.close();

        } 
        // catch block
        catch (EOFException ex) {
            JOptionPane.showMessageDialog(null, "End of File Reached");
            
		} catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No File Found for Flates");
            
		} catch (IOException ex) {
			ex.printStackTrace();
		}
    }


    public void displaySoldHouses() {
        
        // try block
		try {

            // reading arraylist from file and displaying in the form of table
            FileReader readSoldHouse = new FileReader("files/soldHouses.txt");
		    BufferedReader buffReadSoldHouse = new BufferedReader(readSoldHouse);
            Object[] soldFlatHouse = buffReadSoldHouse.lines().toArray();
            int row = 0;
        
            // displaying data in JTable
            while(row < soldFlatHouse.length) {
                String soldHouses = soldFlatHouse[row].toString().trim();
                String[] col = soldHouses.split(", ");
                col[0] = col[0].replace("[","");
                col[5] = col[5].replace("]","");
                soldView.soldHouseTableModel.addRow(col);
                row++;
            }
            buffReadSoldHouse.close();

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