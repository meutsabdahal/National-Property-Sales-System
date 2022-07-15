
import model.BranchModel;
import model.FlatModel;
import model.HouseModel;
import model.SoldModel;
import model.LogIn;
import view.NationalPropertySalesSystemView;
import view.AdminView;
import view.BranchView;
import view.HouseView;
import view.SecretaryView;
import view.SoldView;
import view.FlatView;
import control.NationalPropertySalesSystemControl;

public class NationalPropertySalesSystem {
	public static void main(String[] args) {
	
	// creating objects for respective classes with required parameter
	NationalPropertySalesSystemView view = new NationalPropertySalesSystemView();
	AdminView adminView = new AdminView(view);
	SecretaryView secretaryView = new SecretaryView(view);
	BranchView branchView = new BranchView();
	HouseView houseView = new HouseView();
	FlatView flatView = new FlatView();
	SoldView soldView = new SoldView();
	FlatModel flatModel = new FlatModel(secretaryView);
	HouseModel houseModel = new HouseModel(secretaryView);
	BranchModel branchModel = new BranchModel(adminView);
	SoldModel soldModel = new SoldModel(soldView);
	LogIn logIn = new LogIn(view, secretaryView);
	NationalPropertySalesSystemControl control = new NationalPropertySalesSystemControl(flatModel,houseModel,branchModel,soldModel,logIn, view, adminView,secretaryView,branchView,houseView,flatView,soldView);
	control.runProgram();
		
	}

	
}
