package model;

import view.SecretaryView;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

import view.NationalPropertySalesSystemView;

public class LogIn {
    
    // creating objects for class
    private NationalPropertySalesSystemView view;
    private SecretaryView secretaryView;

    // parameterized constructor
    public LogIn(NationalPropertySalesSystemView view, SecretaryView secretaryView){
        this.view = view;
        this.secretaryView = secretaryView;
    }

    public void secretaryLogIn(){

        boolean password = false;
        String secretaryUsername = view.usernameTxt.getText();
        String secretaryPassword = view.passwordTxt.getText();

        // try block
        try {

            // scanning from branches
            File branchSecretary = new File("files/branches.txt");
            Scanner sc = new Scanner(branchSecretary);

            // scanning till the end of the file
            while(sc.hasNextLine() == true){
                String secretary[] = sc.nextLine().split(",");

                if (secretaryUsername.equalsIgnoreCase(secretary[5]) &&
                     secretaryPassword.equalsIgnoreCase(secretary[6])) {

                    // if the index value if array matched with textfield then password is set to be true and breaking the loop
                    password = true;
                    break;
                } 
                // if the index value if array didn't matched with textfield then password is set to be false 
                else 
                    password = false;
            }

            if (password = true){
                // if password is true, calling secretaryInterface method
                secretaryView.secretaryInterface();
            } 
            // if password isn't true message is shown
            else 
                JOptionPane.showMessageDialog(null,  "Wrong Username or Password", null, JOptionPane.ERROR_MESSAGE);
                 
        }
        
        // catch block
		catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No File Found for Branches");  
		} 
            
        
    }
}