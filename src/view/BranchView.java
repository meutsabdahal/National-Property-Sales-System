package view;

import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BranchView {

    // creating object for JFrame
    public JFrame addBranchFrame = new JFrame("Add Branch");
    public JFrame editBranchFrame = new JFrame("Edit Branch");

    // creating object for JPanel
    private JPanel addBranchPanel = new JPanel();
    private JPanel editBranchPanel = new JPanel();

    // creating object for JLabel
    private JLabel branchName = new JLabel("Name:");
    private JLabel branchAddress = new JLabel("Address:");
    private JLabel branchPhone = new JLabel("Phone Number:");
    private JLabel branchEmail = new JLabel("Email:"); 
    private JLabel branchWebAddress = new JLabel("Web Address:");
    private JLabel secretaryUsername = new JLabel("Username:");
    private JLabel secretaryPassword= new JLabel("Password:");

    // creating object for JTextField and JPasswordField
    public JTextField branchNameTxt = new JTextField(20);
    public JTextField branchAddressTxt = new JTextField(20);
    public JTextField branchPhoneTxt = new JTextField(20);
    public JTextField branchEmailTxt = new JTextField(20); 
    public JTextField branchWebAddressTxt = new JTextField(20); 
    public JTextField secretaryUsernameTxt = new JTextField(20);
    public JTextField secretaryPasswordTxt = new JTextField(20);
    public JTextField editBranchNameTxt = new JTextField(20);
    public JTextField editBranchAddressTxt = new JTextField(20);
    public JTextField editBranchPhoneTxt = new JTextField(20);
    public JTextField editBranchEmailTxt = new JTextField(20);
    public JTextField editBranchWebAddressTxt = new JTextField(20);  
    public JTextField editSecretaryUsernameTxt = new JTextField(20);
    public JTextField editSecretaryPasswordTxt = new JTextField(20);

    // creating object for JButton
    private JButton addBranch = new JButton("Add Branch");
    private JButton editBranch = new JButton("Update");



    public void addBranches() {
    	addBranchFrame.setSize(600,350);
    	addBranchFrame.setLocationRelativeTo(null);
    	addBranchFrame.setVisible(true);
    	addBranchFrame.setResizable(false); 
    	addBranchFrame.add(addBranchPanel);
    	addBranchPanel.setLayout(null);
    	addBranchPanel.setBackground(Color.LIGHT_GRAY);
        
        // adding JLabel and JTextField to the panel and setting their position
    	addBranchPanel.add(branchName);
    	branchName.setBounds(80, 20, 80, 20);
    	addBranchPanel.add(branchNameTxt);
    	branchNameTxt.setBounds(175, 20, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	addBranchPanel.add(branchAddress);
    	branchAddress.setBounds(80, 50, 80, 20);
    	addBranchPanel.add(branchAddressTxt);
    	branchAddressTxt.setBounds(175, 50, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	addBranchPanel.add(branchPhone);
    	branchPhone.setBounds(80, 80, 100, 20);
    	addBranchPanel.add(branchPhoneTxt);
    	branchPhoneTxt.setBounds(175, 80, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	addBranchPanel.add(branchEmail);
    	branchEmail.setBounds(80, 110, 80, 20);
    	addBranchPanel.add(branchEmailTxt);
    	branchEmailTxt.setBounds(175, 110, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	addBranchPanel.add(branchWebAddress);
    	branchWebAddress.setBounds(80, 140, 100, 20);
    	addBranchPanel.add(branchWebAddressTxt);
    	branchWebAddressTxt.setBounds(175, 140, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	addBranchPanel.add(secretaryUsername);
    	secretaryUsername.setBounds(80, 170, 100, 20);
    	addBranchPanel.add(secretaryUsernameTxt);
    	secretaryUsernameTxt.setBounds(175, 170, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	addBranchPanel.add(secretaryPassword);
    	secretaryPassword.setBounds(80, 200, 100, 20);
    	addBranchPanel.add(secretaryPasswordTxt);
    	secretaryPasswordTxt.setBounds(175, 200, 150, 20);
        
        // adding JButton to the panel and setting its position
    	addBranchPanel.add(addBranch);
    	addBranch.setBounds(180, 250, 120, 30);	
    }


    public void editBranches() {
    	editBranchFrame.setSize(600,350);
    	editBranchFrame.setLocationRelativeTo(null);
    	editBranchFrame.setVisible(true);
    	editBranchFrame.setResizable(false); 
    	editBranchFrame.add(editBranchPanel);
    	editBranchPanel.setLayout(null);
    	editBranchPanel.setBackground(Color.LIGHT_GRAY);
        
        // adding JLabel and JTextField to the panel and setting their position
    	editBranchPanel.add(branchName);
    	branchName.setBounds(80, 20, 80, 20);
    	editBranchPanel.add(editBranchNameTxt);
    	editBranchNameTxt.setBounds(175, 20, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	editBranchPanel.add(branchAddress);
    	branchAddress.setBounds(80, 50, 80, 20);
    	editBranchPanel.add(editBranchAddressTxt);
    	editBranchAddressTxt.setBounds(175, 50, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	editBranchPanel.add(branchPhone);
    	branchPhone.setBounds(80, 80, 100, 20);
    	editBranchPanel.add(editBranchPhoneTxt);
    	editBranchPhoneTxt.setBounds(175, 80, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	editBranchPanel.add(branchEmail);
    	branchEmail.setBounds(80, 110, 80, 20);
    	editBranchPanel.add(editBranchEmailTxt);
    	editBranchEmailTxt.setBounds(175, 110, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	editBranchPanel.add(branchWebAddress);
    	branchWebAddress.setBounds(80, 140, 100, 20);
    	editBranchPanel.add(editBranchWebAddressTxt);
    	editBranchWebAddressTxt.setBounds(175, 140, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	editBranchPanel.add(secretaryUsername);
    	secretaryUsername.setBounds(80, 170, 100, 20);
    	editBranchPanel.add(editSecretaryUsernameTxt);
    	editSecretaryUsernameTxt.setBounds(175, 170, 150, 20);
        
        // adding JLabel and JTextField to the panel and setting their position
    	editBranchPanel.add(secretaryPassword);
    	secretaryPassword.setBounds(80, 200, 100, 20);
    	editBranchPanel.add(editSecretaryPasswordTxt);
    	editSecretaryPasswordTxt.setBounds(175, 200, 150, 20);
        
        // adding JButton to the panel and setting its position
    	editBranchPanel.add(editBranch);
    	editBranch.setBounds(180, 250, 120, 30);	
	}
	

	// adding ActionListener to JButton
    public void addBranch(ActionListener a ){
    	addBranch.addActionListener(a);
	}
	// adding ActionListener to JButton
	public void updateBranch(ActionListener b ){
    	editBranch.addActionListener(b);
    }
}
