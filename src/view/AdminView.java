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


public class AdminView {
	// creating object for JPanel
    private JPanel adminNavPanel = new JPanel();
    private JPanel adminPanel = new JPanel();

	// creating objects for JLabel
    private JLabel branchList = new JLabel("List of Branches");

	// creating objects for JButton
    private JButton addBranches = new JButton("Add Branches");
	private JButton deleteBranch = new  JButton("Delete Branch");
	private JButton editBranch = new  JButton("Edit Branch");

	// creating objects for JTable
    public JTable branchTable = new JTable();

	// creating objects for DefaultTableModel
	public DefaultTableModel branchTableModel = (DefaultTableModel)branchTable.getModel();
	
	// creating objects for JTable
	private JScrollPane branchScrollPane = new JScrollPane(branchTable);

	// creating class object
    private NationalPropertySalesSystemView view;


	// constructor
    public AdminView(NationalPropertySalesSystemView view){
        this.view = view;
    }

    public void adminInterface(){
    	view.GUILayout();
    	view.frame.remove(view.logInPanel);
    	view.frame.add(adminNavPanel);
		view.frame.add(adminPanel);
		
		// setting panel layout to null along with its position and background color
		adminNavPanel.setLayout(null);
		adminNavPanel.setBackground(Color.RED);
		adminNavPanel.setBounds(0, 0, 200, 800);
		adminPanel.setLayout(null);
		adminPanel.setBackground(Color.GREEN);
    	adminPanel.setBounds(300, 0, 700, 800);
    	
    	// adding JButton to the panel and setting position
    	adminNavPanel.add(addBranches);
		addBranches.setBounds(50, 300, 120, 40);
		
		// adding JButton to the panel and setting position
    	adminNavPanel.add(view.close);
		view.close.setBounds(80, 600, 80, 40);
		
    	// adding JLabel to the panel with italic font and setting position
    	adminPanel.add(branchList);
    	branchList.setFont(new Font(null, Font.ITALIC, 30));
		branchList.setBounds(500, 50, 220, 30);
		
		// adding JButton to the panel and setting position
    	adminPanel.add(deleteBranch);
		deleteBranch.setBounds(400, 620, 120, 20);
		
		// adding JButton to the panel and setting position
    	adminPanel.add(editBranch);
		editBranch.setBounds(600, 620, 120, 20);
		
		// adding JScrollPane to the panel with table column 
		String[] branchColumn = {"Name","Address","Phone Number","Email","Web Address", "Username", "Password"};
		branchTableModel.setColumnIdentifiers(branchColumn);
		adminPanel.add(branchScrollPane);

		// setting table selectionmode and default editor with its position
		branchTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		branchScrollPane.setBounds(200, 100, 790, 450);
		branchTable.setDefaultEditor(Object.class, null);
	}
	
	// adding ActionListener to JButton
	public void addBranches(ActionListener a){
    	addBranches.addActionListener(a);
	}
	// adding MouseListener to JTable
	public void branchTable(MouseListener b) {
    	branchTable.addMouseListener(b);
	}
	
	// adding ActionListener to JButton
	public void deleteBranch(ActionListener b){
		deleteBranch.addActionListener(b);
	}
	// adding ActionListener to JButton
	public void editBranch(ActionListener c){
		editBranch.addActionListener(c);
	}
	
	
    	
}