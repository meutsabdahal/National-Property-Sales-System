package model;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import view.AdminView;

public class BranchModel {
    // creating object for class
    private AdminView adminView;

    // parameterized constructor
    public BranchModel(AdminView adminView){
        this.adminView = adminView;
    }

    public void addBranches(String branchNameTxt, String branchAddressTxt, String branchPhoneTxt, String branchEmailTxt, String branchWebAddressTxt, String secretaryUsernameTxt, String secretaryPasswordTxt) {

        String branch[] = {branchNameTxt, branchAddressTxt, branchPhoneTxt, branchEmailTxt, branchWebAddressTxt, secretaryUsernameTxt, secretaryPasswordTxt};
        ArrayList<String> values = new ArrayList<String>();
        
        // adding array to arraylist 
        values.add(branch[0]);
        values.add(branch[1]);
        values.add(branch[2]);
        values.add(branch[3]);
        values.add(branch[4]);
        values.add(branch[5]);
        values.add(branch[6]);

        // try block
        try {
            // writing object of arraylist in file
            FileWriter addBranch = new FileWriter("files/branches.txt", true);
			PrintWriter pwAddBranch = new PrintWriter(addBranch);
			pwAddBranch.write(values+"\n");
			pwAddBranch.close();
            JOptionPane.showMessageDialog(null, "Branch Added");
            
        } 
        // catch block
        catch (EOFException ex) {
            JOptionPane.showMessageDialog(null, "End of File Reached");
            
		} catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No File Found for Branches");
            
		} catch (IOException ex) {
			ex.printStackTrace();
		}
    }

    public void displayBranches() {
        
        // try block
		try {
            // reading arraylist from file and displaying in the form of table
            FileReader readbranch = new FileReader("files/branches.txt");
		    BufferedReader buffReadBranch = new BufferedReader(readbranch);
            Object[] branchRow = buffReadBranch.lines().toArray();
            int row = 0;
        
            // displaying data in JTable
            while(row < branchRow.length) {
                String branches = branchRow[row].toString().trim();
                String[] col = branches.split(", ");
                col[0] = col[0].replace("[","");
                col[6] = col[6].replace("]","");
                adminView.branchTableModel.addRow(col);
                row++;
            }
            buffReadBranch.close();
        } 
        // catch block
        catch (EOFException ex) {
            JOptionPane.showMessageDialog(null, "End of File Reached");
            
		} catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No File Found for Branches");
            
		} catch (IOException ex) {
			ex.printStackTrace();
		}
    }

    
    public void deleteBranch() {

        // removing selected row from table
		adminView.branchTableModel.removeRow(adminView.branchTable.getSelectedRow());
		ArrayList<String> removebranch = new ArrayList<String>();
        
        // try block
        try {
            // deleting the selected row from the file
            FileWriter deleteBranch = new FileWriter("files/branches.txt");
            PrintWriter pwDeleteBranch = new PrintWriter(deleteBranch);
            for (int row = 0; row < adminView.branchTableModel.getRowCount(); row++) {
                int column = 0;
                while(column < adminView.branchTableModel.getColumnCount()) {
                    removebranch.add(adminView.branchTableModel.getValueAt(row,column).toString());
                     column++;
                 }
                 pwDeleteBranch.println(removebranch);
                 removebranch.clear();
            }
            pwDeleteBranch.close();
            

        }
        // catch block
        catch (EOFException ex) {
            JOptionPane.showMessageDialog(null, "End of File Reached");
            
		} catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No File Found for Branches");
            
		} catch (IOException ex) {
			ex.printStackTrace();
		}catch (IndexOutOfBoundsException ex) {
			JOptionPane.showMessageDialog(null, "No Branch Selected");
		}
    }
}