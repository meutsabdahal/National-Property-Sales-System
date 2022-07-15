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

public class FlatModel {

    // creating object for class
    private SecretaryView secretaryView;

    // parameterized constructor
    public FlatModel(SecretaryView secretaryView){
        this.secretaryView = secretaryView;
    }

    public void addFlates(String flatAddressTxt,String flatRoomTxt, String flatSellingPriceTxt, String floorNumberTxt,String monthlyChargeTxt ) {
        
        String flat[] = {flatAddressTxt,flatRoomTxt, flatSellingPriceTxt, floorNumberTxt,monthlyChargeTxt};
        ArrayList<String> values = new ArrayList<String>();

        // adding array to arraylist 
        values.add(flat[0]);
        values.add(flat[1]);
        values.add(flat[2]);
        values.add(flat[3]);
        values.add(flat[4]);
        
        // // try block
        try {

            // writing object of arraylist in file
            FileWriter addFlat = new FileWriter("files/flates.txt", true);
			PrintWriter pwAddFlat = new PrintWriter(addFlat);
			pwAddFlat.write(values+"\n");
			pwAddFlat.close();
            JOptionPane.showMessageDialog(null, "Flat Added");
            
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


    public void displayFlates() {
        
        // // try block
		try {

            // reading arraylist from file and displaying in the form of table
            FileReader readFlat = new FileReader("files/flates.txt");
		    BufferedReader buffReadFlat = new BufferedReader(readFlat);
            Object[] flatRow = buffReadFlat.lines().toArray();
            int row = 0;
            
            // displaying data in JTable
            while(row < flatRow.length) {
                String flates = flatRow[row].toString().trim();
                String[] col = flates.split(", ");
                col[0] = col[0].replace("[","");
                col[4] = col[4].replace("]","");
                secretaryView.flatTableModel.addRow(col);
                row++;
            }
            buffReadFlat.close();

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
    
    public void deleteFlat() {

        // removing selected row from table
		secretaryView.flatTableModel.removeRow(secretaryView.flatTable.getSelectedRow());
		ArrayList<String> removeFlat = new ArrayList<String>();
        
        // try block
        try {

            // deleting the selected row from the file
            FileWriter deleteFlat = new FileWriter("files/flates.txt");
            PrintWriter bwDeleteFlat = new PrintWriter(deleteFlat);
            for (int row = 0; row < secretaryView.flatTableModel.getRowCount(); row++) {
                int column = 0;
                while(column < secretaryView.flatTableModel.getColumnCount()) {
                    removeFlat.add(secretaryView.flatTableModel.getValueAt(row,column).toString());
                     column++;
                 }
                bwDeleteFlat.println(removeFlat);
                removeFlat.clear();
            }
            bwDeleteFlat.close();
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
    

    public void sellFlates(String flatAddressTxt,String flatRoomTxt, String flatSellingPriceTxt, String floorNumberTxt,String monthlyChargeTxt, String flatSoldPriceTxt ) {
    
        String soldFlates[] = {flatAddressTxt,flatRoomTxt, flatSellingPriceTxt, floorNumberTxt,monthlyChargeTxt,flatSoldPriceTxt};
        ArrayList<String> values = new ArrayList<String>();

        // adding array to arraylist 
        values.add(soldFlates[0]);
        values.add(soldFlates[1]);
        values.add(soldFlates[2]);
        values.add(soldFlates[3]);
        values.add(soldFlates[4]);
        values.add(soldFlates[5]);

        // try block
        try {

            // writing object of arraylist in file
            FileWriter soldFlat = new FileWriter("files/soldFlates.txt", true);
			PrintWriter pwSoldFlat = new PrintWriter(soldFlat);
			pwSoldFlat.write(values+"\n");
			pwSoldFlat.close();
            JOptionPane.showMessageDialog(null, "Flat Sold");
            
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


}
