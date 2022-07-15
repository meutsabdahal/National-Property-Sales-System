package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

import model.FlatModel;
import model.HouseModel;
import model.BranchModel;
import model.SoldModel;
import model.LogIn;
import view.NationalPropertySalesSystemView;
import view.AdminView;
import view.SecretaryView;
import view.BranchView;
import view.HouseView;
import view.FlatView;
import view.SoldView;


public class NationalPropertySalesSystemControl {
    // creating objects for respective classes
    private FlatModel flatModel;
    private HouseModel houseModel;
    private BranchModel branchModel;
    private SoldModel soldModel;
    private LogIn logIn;
    private NationalPropertySalesSystemView view;
    private AdminView adminView;
    private SecretaryView secretaryView;
    private BranchView branchView;
    private HouseView houseView;
    private FlatView flatView;
    private SoldView soldView;

    // parameterized constructor
    public NationalPropertySalesSystemControl(FlatModel flatModel,HouseModel houseModel,BranchModel branchModel,SoldModel soldModel,LogIn logIn, NationalPropertySalesSystemView view, AdminView adminView,
    SecretaryView secretaryView,BranchView branchView,HouseView houseView,FlatView flatView,SoldView soldView){
        this.flatModel = flatModel;
        this.view = view;
        this.adminView = adminView;
        this.secretaryView = secretaryView;
        this.branchView = branchView;
        this.houseView = houseView;
        this.flatView = flatView;
        this.houseModel = houseModel;
        this.branchModel = branchModel;
        this.soldView = soldView;
        this.soldModel = soldModel;
        this.logIn = logIn;

    }

    public void runProgram(){
        // function for ActionEvent
        view.logIn(new ActionListener(){
            public void actionPerformed(ActionEvent e){

               if (view.admin.isSelected()) {

                //    getting text value from JTextField
                   String username = view.usernameTxt.getText();
                   String password = view.passwordTxt.getText();
                   if (username.equals("admin") && password.equals("admin")) {

                    // calling method if condition satisfy
                       adminView.adminInterface();
                       branchModel.displayBranches();
                   }
                // displaying error message if condition didn't satisfy    
                   else
                        JOptionPane.showMessageDialog(null,  "Wrong Usernme or Password","Invalid", JOptionPane.ERROR_MESSAGE);
               }
               else if (view.secretary.isSelected()) {

                   // calling method if condition satisfy 
                   logIn.secretaryLogIn();
                   flatModel.displayFlates();
                   houseModel.displayHouses();
               } 
                // displaying error message if condition didn't satisfy
               else
                JOptionPane.showMessageDialog(null,  "Wrong Usernme or Password","Invalid", JOptionPane.ERROR_MESSAGE);
                   
           }
       });

        // function for ActionEvent
        view.close(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // exiting the whole system  
                System.exit(0);
            }
        });

        // function for ActionEvent
        soldView.closeSoldFrame(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // disposing the JFrame
                soldView.soldProperties.dispose();
            }
        });

        // function for ActionEvent
        secretaryView.editHouse(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    houseView.editHouse();
            }
        });

         // function for ActionEvent
        secretaryView.editFlat(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 flatView.editFlat();              
            }
        });
        // function for ActionEvent
        adminView.editBranch(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                if(adminView.branchTable.getSelectionModel().isSelectionEmpty()){
                    JOptionPane.showMessageDialog(null, "No Row Selected");
                }
                else
                    branchView.editBranches();        
            }
        });

        // function for ActionEvent
        secretaryView.deleteHouse(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                houseModel.deleteHouse();
                JOptionPane.showMessageDialog(null, "House Deleted");
            
            }
        });

        // function for ActionEvent
        secretaryView.deleteFlat(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                flatModel.deleteFlat();
                JOptionPane.showMessageDialog(null, "Flat Deleted");
          
            }
        });

        // function for ActionEvent
            adminView.deleteBranch(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(adminView.branchTable.getSelectionModel().isSelectionEmpty()){
                        JOptionPane.showMessageDialog(null, "No Row Selected");
                    }
                    else{
                        branchModel.deleteBranch();
                        JOptionPane.showMessageDialog(null, "Branch Deleted");
                    }
                    
                }
            });

        // function for ActionEvent
        secretaryView.sellHouse(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                houseView.sellHouse();
            }
        });

        // function for ActionEvent
        secretaryView.sellFlat(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                flatView.sellFlat();
            }
        });


        // function for ActionEvent
        secretaryView.sold(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // displaying sold items 
                soldView.soldProperties();
                soldModel.displaySoldFlates();
                soldModel.displaySoldHouses();
            }
        });

        // function for ActionEvent
        adminView.addBranches(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // opening JFrame to add branches
                branchView.addBranches();   

 
            }
        });
        
        // function for ActionEvent
        branchView.addBranch(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // getting text value from JTextField
                String branchNameTxt = branchView.branchNameTxt.getText();
				String branchAddressTxt = branchView.branchAddressTxt.getText();
				String branchPhoneTxt = branchView.branchPhoneTxt.getText();
				String branchEmailTxt = branchView.branchEmailTxt.getText();
				String branchWebAddressTxt = branchView.branchWebAddressTxt.getText();
				String secretaryUsernameTxt = branchView.secretaryUsernameTxt.getText();
                String secretaryPasswordTxt = branchView.secretaryPasswordTxt.getText();

                // calling function and disposing the JFrame
                branchModel.addBranches(branchNameTxt, branchAddressTxt, branchPhoneTxt, branchEmailTxt, branchWebAddressTxt, secretaryUsernameTxt, secretaryPasswordTxt);
                branchView.addBranchFrame.dispose(); 
            }
        });

        // function for ActionEvent
        secretaryView.addHouses(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // opening JFrame to add houses
                houseView.addHouses();    
            }
        });

        // function for ActionEvent
        secretaryView.addFlates(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // opening JFrame to add flates
                flatView.addFlates();    
            }
        });

        // function for ActionEvent
        houseView.addHouse(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // getting text value from JTextField
                String houseAddressTxt = houseView.houseAddressTxt.getText();
				String houseRoomTxt = houseView.houseRoomTxt.getText();
				String houseSellingPriceTxt = houseView.houseSellingPriceTxt.getText();
				String houseGarden = houseView.getHouseGarden();
                String houseGarage = houseView.getHouseGarage();

                // calling function and disposing the JFrame
                houseModel.addHouses(houseAddressTxt, houseRoomTxt, houseSellingPriceTxt, houseGarden, houseGarage);
                houseView.addHousesFrame.dispose();   
            }
        });

        // function for ActionEvent
        flatView.addFlat(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // getting text value from JTextField
                String flatAddressTxt = flatView.flatAddressTxt.getText();
            	String flatRoomTxt = flatView.flatRoomTxt.getText();
            	String flatSellingPriceTxt = flatView.flatSellingPriceTxt.getText();
            	String floorNumberTxt = flatView.floorNumberTxt.getText();
                String monthlyChargeTxt =  flatView.monthlyChargeTxt.getText();
                
                // calling function and disposing the JFrame
                flatModel.addFlates(flatAddressTxt, flatRoomTxt, flatSellingPriceTxt, floorNumberTxt, monthlyChargeTxt);
                flatView.addFlatesFrame.dispose();   
            }
        });

        // function for ActionEvent
        flatView.updateFlat(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                // getting text from JTextField and setting its value on row index respectively on table model
				secretaryView.flatTableModel.setValueAt(flatView.editFlatAddressTxt.getText(), secretaryView.flatTable.getSelectedRow(), 0);
				secretaryView.flatTableModel.setValueAt(flatView.editFlatRoomTxt.getText(), secretaryView.flatTable.getSelectedRow(), 1);
				secretaryView.flatTableModel.setValueAt(flatView.editFlatSellingPriceTxt.getText(), secretaryView.flatTable.getSelectedRow(), 2);
				secretaryView.flatTableModel.setValueAt(flatView.editFloorNumberTxt.getText(), secretaryView.flatTable.getSelectedRow(), 3);
				secretaryView.flatTableModel.setValueAt(flatView.editMonthlyChargeTxt.getText(), secretaryView.flatTable.getSelectedRow(), 4);
                
                // getting text value from JTextField
                String editFlatAddressTxt = flatView.editFlatAddressTxt.getText();
	        	String editFlatRoomTxt = flatView.editFlatRoomTxt.getText();
	            String editFlatSellingPriceTxt = flatView.editFlatSellingPriceTxt.getText();
	            String editFloorNumberTxt = flatView.editFloorNumberTxt.getText();
                String editMonthlyChargeTxt =  flatView.editMonthlyChargeTxt.getText();
                
                // calling two functions and disposing the frame
                flatModel.deleteFlat();
                flatModel.addFlates(editFlatAddressTxt, editFlatRoomTxt, editFlatSellingPriceTxt, editFloorNumberTxt, editMonthlyChargeTxt);
                JOptionPane.showMessageDialog(null, "Flat Updated");
                flatView.editFlat.dispose();   
            }
        });

        // function for ActionEvent
        houseView.updateHouse(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    
                // getting text from JTextField and setting its value on row index respectively on table model
				secretaryView.houseTableModel.setValueAt(houseView.editHouseAddressTxt.getText(), secretaryView.houseTable.getSelectedRow(), 0);
				secretaryView.houseTableModel.setValueAt(houseView.editHouseRoomTxt.getText(), secretaryView.houseTable.getSelectedRow(), 1);
				secretaryView.houseTableModel.setValueAt(houseView.editHouseSellingPriceTxt.getText(), secretaryView.houseTable.getSelectedRow(), 2);
               
                // getting text value from JTextField
                String editHouseAddressTxt = houseView.editHouseAddressTxt.getText();
				String editHouseRoomTxt = houseView.editHouseRoomTxt.getText();
				String editHouseSellingPriceTxt = houseView.editHouseSellingPriceTxt.getText();
				String houseGarden = houseView.getHouseGarden();
                String houseGarage = houseView.getHouseGarage();

                // calling two functions and disposing the frame
                houseModel.deleteHouse();
                houseModel.addHouses(editHouseAddressTxt, editHouseRoomTxt, editHouseSellingPriceTxt, houseGarden, houseGarage);
                JOptionPane.showMessageDialog(null, "House Updated");
                houseView.editHouse.dispose();   
            }
        });

        // function for ActionEvent
        branchView.updateBranch(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                // getting text from JTextField and setting its value on row index respectively on table model
				adminView.branchTableModel.setValueAt(branchView.editBranchNameTxt.getText(), adminView.branchTable.getSelectedRow(), 0);
				adminView.branchTableModel.setValueAt(branchView.editBranchAddressTxt.getText(), adminView.branchTable.getSelectedRow(), 1);
                adminView.branchTableModel.setValueAt(branchView.editBranchPhoneTxt.getText(), adminView.branchTable.getSelectedRow(), 2);
                adminView.branchTableModel.setValueAt(branchView.editBranchEmailTxt.getText(), adminView.branchTable.getSelectedRow(), 3);
				adminView.branchTableModel.setValueAt(branchView.editBranchWebAddressTxt.getText(), adminView.branchTable.getSelectedRow(), 4);
                adminView.branchTableModel.setValueAt(branchView.editSecretaryUsernameTxt.getText(), adminView.branchTable.getSelectedRow(), 5);
				adminView.branchTableModel.setValueAt(branchView.editSecretaryPasswordTxt.getText(), adminView.branchTable.getSelectedRow(), 6);
          
                // getting text value from JTextField
                String editBranchNameTxt = branchView.editBranchNameTxt.getText();
				String editBranchAddressTxt = branchView.editBranchAddressTxt.getText();
				String editBranchPhoneTxt = branchView.editBranchPhoneTxt.getText();
				String editBranchEmailTxt = branchView.editBranchEmailTxt.getText();
				String editBranchWebAddressTxt = branchView.editBranchWebAddressTxt.getText();
				String editSecretaryUsernameTxt = branchView.editSecretaryUsernameTxt.getText();
                String editSecretaryPasswordTxt = branchView.editSecretaryPasswordTxt.getText();

                // calling two functions and disposing the frame
                branchModel.deleteBranch();
                branchModel.addBranches(editBranchNameTxt, editBranchAddressTxt, editBranchPhoneTxt, editBranchEmailTxt, editBranchWebAddressTxt, editSecretaryUsernameTxt, editSecretaryPasswordTxt);
                branchView.editBranchFrame.dispose();
            }
        });

        // function for ActionEvent
        flatView.sellFlates(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // getting text value from JTextField
                String flatAddressTxt = secretaryView.flatTable.getValueAt(secretaryView.flatTable.getSelectedRow(), 0).toString();
            	String flatRoomTxt = secretaryView.flatTable.getValueAt(secretaryView.flatTable.getSelectedRow(), 1).toString();
            	String flatSellingPriceTxt = secretaryView.flatTable.getValueAt(secretaryView.flatTable.getSelectedRow(), 2).toString();
            	String floorNumberTxt = secretaryView.flatTable.getValueAt(secretaryView.flatTable.getSelectedRow(), 3).toString();
            	String monthlyChargeTxt =  secretaryView.flatTable.getValueAt(secretaryView.flatTable.getSelectedRow(), 4).toString();
                String flatSoldPriceTxt = flatView.flatSoldPriceTxt.getText();
                
                // calling two function and disposing the function
                flatModel.sellFlates(flatAddressTxt, flatRoomTxt, flatSellingPriceTxt, floorNumberTxt, monthlyChargeTxt, flatSoldPriceTxt);
                flatModel.deleteFlat();
                flatView.sellFlat.dispose();   
            }
        });


        // function for ActionEvent
        houseView.sellHouses(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // getting text value from JTextField
                String houseAddressTxt = secretaryView.houseTable.getValueAt(secretaryView.houseTable.getSelectedRow(), 0).toString();
            	String houseRoomTxt = secretaryView.houseTable.getValueAt(secretaryView.houseTable.getSelectedRow(), 1).toString();
            	String houseSellingPriceTxt = secretaryView.houseTable.getValueAt(secretaryView.houseTable.getSelectedRow(), 2).toString();
            	String houseGarden = secretaryView.houseTable.getValueAt(secretaryView.houseTable.getSelectedRow(), 3).toString();
            	String houseGarage =  secretaryView.houseTable.getValueAt(secretaryView.houseTable.getSelectedRow(), 4).toString();
                String houseSoldPriceTxt = houseView.houseSoldPriceTxt.getText();
               
                // calling two functions and disposing the function
                houseModel.sellHouses(houseAddressTxt, houseRoomTxt, houseSellingPriceTxt, houseGarden, houseGarage, houseSoldPriceTxt);
                houseModel.deleteHouse();
                houseView.sellHouse.dispose();   
            }
        });


        // function for MouseEvent
        secretaryView.flatTable(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {  

                // getting value from table and setting it on JTextField
                flatView.editFlatAddressTxt.setText(secretaryView.flatTable.getValueAt(secretaryView.flatTable.getSelectedRow(), 0).toString());
                flatView.editFlatRoomTxt.setText(secretaryView.flatTable.getValueAt(secretaryView.flatTable.getSelectedRow(), 1).toString());
        		flatView.editFlatSellingPriceTxt.setText(secretaryView.flatTable.getValueAt(secretaryView.flatTable.getSelectedRow(), 2).toString());
        		flatView.editFloorNumberTxt.setText(secretaryView.flatTable.getValueAt(secretaryView.flatTable.getSelectedRow(), 3).toString());
        		flatView.editMonthlyChargeTxt.setText(secretaryView.flatTable.getValueAt(secretaryView.flatTable.getSelectedRow(), 4).toString());
                secretaryView.deleteFlat.setVisible(true);
                secretaryView.editFlat.setVisible(true);
                secretaryView.sellFlat.setVisible(true);

                secretaryView.deleteHouse.setVisible(false);
                secretaryView.editHouse.setVisible(false);
                secretaryView.sellHouse.setVisible(false);
            }
		});

        // function for MouseEvent
        secretaryView.houseTable(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {  
                // getting value from table and setting it on JTextField
                houseView.editHouseAddressTxt.setText(secretaryView.houseTable.getValueAt(secretaryView.houseTable.getSelectedRow(), 0).toString());
                houseView.editHouseRoomTxt.setText(secretaryView.houseTable.getValueAt(secretaryView.houseTable.getSelectedRow(), 1).toString());
                houseView.editHouseSellingPriceTxt.setText(secretaryView.houseTable.getValueAt(secretaryView.houseTable.getSelectedRow(), 2).toString());
                secretaryView.deleteHouse.setVisible(true);
                secretaryView.editHouse.setVisible(true);
                secretaryView.sellHouse.setVisible(true);

                secretaryView.deleteFlat.setVisible(false);
                secretaryView.editFlat.setVisible(false);
                secretaryView.sellFlat.setVisible(false);
            }
        });

        // function for MouseEvent
        adminView.branchTable(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
                
                // getting value from table and setting it on JTextField
                branchView.editBranchNameTxt.setText(adminView.branchTable.getValueAt(adminView.branchTable.getSelectedRow(), 0).toString());
                branchView.editBranchAddressTxt.setText(adminView.branchTable.getValueAt(adminView.branchTable.getSelectedRow(), 1).toString());
                branchView.editBranchPhoneTxt.setText(adminView.branchTable.getValueAt(adminView.branchTable.getSelectedRow(), 2).toString());
                branchView.editBranchEmailTxt.setText(adminView.branchTable.getValueAt(adminView.branchTable.getSelectedRow(), 3).toString());
                branchView.editBranchWebAddressTxt.setText(adminView.branchTable.getValueAt(adminView.branchTable.getSelectedRow(), 4).toString());
                branchView.editSecretaryUsernameTxt.setText(adminView.branchTable.getValueAt(adminView.branchTable.getSelectedRow(), 5).toString());
                branchView.editSecretaryPasswordTxt.setText(adminView.branchTable.getValueAt(adminView.branchTable.getSelectedRow(), 6).toString());
              
        	}
		});
    





    }

}
