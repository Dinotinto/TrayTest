package pages;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;
import utilities.DriveManager;

public class StepDef {



    DriveManager setdriver = new DriveManager();
	LoginPage loginpage = new LoginPage() ;
	WorkFlow createworkflowpage = new WorkFlow();
	Dash openDashboard = new Dash();
	WorkBookDelete workflowbookdelete = new WorkBookDelete();
    LogOut logit = new LogOut();
	
	@Before
	public void startSession(){
		setdriver.startSession("firefox");
		}

	@Given("^I Login to Tray\\.io$")
	public void i_Login_to_Tray_io() throws Throwable {
		loginpage.gotoUrl();
		loginpage.clickHomepageLoginButton();
		loginpage.usernameandPassword();
		loginpage.clickLoginButton();
	}



	@Given("^I Create a new Workflow$")
	public void i_Create_a_new_Workflow() throws Throwable {
		createworkflowpage.clickWork();
		createworkflowpage.sendkeysToworkflow();
		createworkflowpage.clickCrtWorkflow();
	}


	@When("^I Go back to Dashboard$")
	public void i_Go_back_to_Dashboard() throws Throwable {
		openDashboard.dashBoard();
	}

	@When("^Delete the previously created Workflow$")
	public void delete_the_previously_created_Workflow() throws Throwable {
		workflowbookdelete.hover();
		workflowbookdelete.clickDeleteLink();
		workflowbookdelete.deleteWorkflowPopup();
	}

	@Then("^Log out of Tray\\.io$")
	public void log_out_of_Tray_io() throws Throwable {
      logit.logOut();
	}


	@After
	public void closeSesssion(){
		setdriver.tearDown();
	}








}
