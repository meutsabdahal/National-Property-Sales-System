package view;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NationalPropertySalesSystemView {
    // creating object for JFrame
    public JFrame frame = new JFrame("National Property Sales");

    // creating object for JPanel
    protected JPanel logInPanel = new JPanel();

    // creating objects for JLabel
    private JLabel title = new JLabel("Log in to Your Account");
    private JLabel username = new JLabel("Username");
    private JLabel password= new JLabel("Password");
    private JLabel logInAs = new JLabel("Log in As: ");

    // creating objects for JTextField and JPassWordField 
    public JTextField usernameTxt = new JTextField(20);
    public JPasswordField passwordTxt = new JPasswordField(20);
    
    // creating object for JButton
    private JButton logIn = new JButton("Log In");
    public JButton close = new JButton("Close");

    // creating objects for JRadioButton
    public JRadioButton admin = new JRadioButton("Admin");
    public JRadioButton secretary = new JRadioButton("Secretary");  
    
    public NationalPropertySalesSystemView(){
        // calling function and adding panel to the frame with null layout
        GUILayout();
        frame.add(logInPanel);
        logInPanel.setLayout(null);
        
        // adding JLabel to panel with italic font and setting its position
        logInPanel.add(title);
        title.setFont(new Font(null, Font.ITALIC, 40));
        title.setBounds(280, 40, 450, 50);
        
        // adding JLabel and JTextFied to the panel with italic font and setting position
        logInPanel.add(username); 
        username.setFont(new Font(null, Font.ITALIC, 25));
        username.setBounds(420, 180, 200, 30); 
        logInPanel.add(usernameTxt);  
        usernameTxt.setBounds(380, 220, 200, 30);
        
        // adding JLabel and JPasswordFied to the panel with italic font and setting position
        logInPanel.add(password);
        password.setFont(new Font(null, Font.ITALIC, 25));
        password.setBounds(420, 280, 200, 30);
        logInPanel.add(passwordTxt);
        passwordTxt.setBounds(380, 320, 200, 30);
        
        // adding JLabel and JRadioButton to the panel with italic font and setting position
        logInPanel.add(logInAs);
        logInAs.setFont(new Font(null, Font.ITALIC, 15));
        logInAs.setBounds(400, 360, 200, 30);
        logInPanel.add(admin);
        admin.setBounds(480, 365, 100, 20);
        logInPanel.add(secretary);
        secretary.setBounds(580, 365, 100, 20);
        
        // adding JButton to the panel with position
        logInPanel.add(logIn);
        logIn.setBounds(435, 420, 100, 40);   
    }

    public void GUILayout() {
    	frame.setSize(1000,700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }

    // adding ActionListener to JButton
    public void logIn(ActionListener a){
        logIn.addActionListener(a);
    }
    // adding ActionListener to JButton
    public void close(ActionListener c){
    	close.addActionListener(c);
    }


}
