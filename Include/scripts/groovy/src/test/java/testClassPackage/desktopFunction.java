package src.test.java.testClassPackage;
import internal.GlobalVariable;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint;
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase;
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.checkpoint.Checkpoint;
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.testcase.TestCase;
import com.kms.katalon.core.testdata.TestData;
import com.kms.katalon.core.testobject.TestObject;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords;

import internal.GlobalVariable;
import org.openqa.selenium.Keys;


public class desktopFunction {
	
	WindowsBuiltinKeywords Windows;


	public void LoginToMySqlwithPasswordAndVerifyHomePage(String password) {

		String SelectFirstDBButton = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/SelectFirstDBButton";
		String PasswordTextFieldinEditPopUp = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/PasswordTextFieldinEditPopUp";
		String OKButtonLoginPopUp = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/OKButtonLoginPopUp";
		String SchemaKeywordLoginPage = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/SchemaKeywordHomePage";

		Windows.verifyElementPresent(findWindowsObject(SelectFirstDBButton), 5);
		Windows.click(findWindowsObject(SelectFirstDBButton));
		Windows.setText(findWindowsObject(PasswordTextFieldinEditPopUp), password);
		Windows.click(findWindowsObject(OKButtonLoginPopUp));
		Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5);
		String LoginText = Windows.getText(findWindowsObject(SchemaKeywordLoginPage));
//		System.out.println(("Successfully logged into Dashboard, hence " + LoginText + " is visible");
		Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5);

	}


	public void AddUserAccount(String LoginUserName, String LoginPassword) {

		String AddAccountButton = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/AddAccountButton";
		String LoginName = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/LoginName";
		String Password = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Password";
		String ConfirmPassword = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ConfirmPassword";
		String ApplyButton = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ApplyButton";
		String TabItemAdministrativeRoles = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemAdministrativeRoles";
		String MaintenanceAdmin = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/MaintenanceAdmin - ScriptGenerated";

		Windows.verifyElementPresent(findWindowsObject(AddAccountButton), 5);
		Windows.click(findWindowsObject(AddAccountButton));
		Windows.verifyElementPresent(findWindowsObject(LoginName), 5);
		Windows.setText(findWindowsObject(LoginName), LoginUserName);
		Windows.setText(findWindowsObject(Password), LoginPassword);
		Windows.setText(findWindowsObject(ConfirmPassword), LoginPassword);
		Windows.click(findWindowsObject(ApplyButton));
		Windows.click(findWindowsObject(TabItemAdministrativeRoles));
		Windows.verifyElementPresent(findWindowsObject(MaintenanceAdmin), 5);
		Windows.click(findWindowsObject(MaintenanceAdmin));
		Windows.click(findWindowsObject(ApplyButton));
	}


	public void DeleteUserAccount() {

		String DeleteAccountButton = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/DeleteButton";

		String NewlyAddedDataItem_User = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/NewlyAddedDataItem_User";
		String DeleteButton = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/DeleteButton";
		String DeleteTextHeader = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/DeleteTextHeader";
		String DeleteButton_PopUp = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/DeleteButton_PopUp";
		String RefreshButton = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/RefreshButton";

		Windows.verifyElementPresent(findWindowsObject(DeleteAccountButton), 5);
		Windows.verifyElementPresent(findWindowsObject(NewlyAddedDataItem_User), 5);
		Windows.doubleClick(findWindowsObject(NewlyAddedDataItem_User));
		Windows.click(findWindowsObject(DeleteAccountButton));
		Windows.verifyElementPresent(findWindowsObject(DeleteTextHeader), 5);
		Windows.click(findWindowsObject(DeleteButton_PopUp));
		Windows.verifyElementPresent(findWindowsObject(RefreshButton), 5);
		Windows.click(findWindowsObject(RefreshButton));
	}


	public void ToAddNewConnectionClickonPlusButton(String AppPath) {

		String PlusButton = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/PlusButton";

		if(Windows.verifyElementPresent(findWindowsObject(PlusButton), 5)) {
			Windows.click(findWindowsObject(PlusButton));
		}else {
			Windows.startApplication(AppPath);

			Windows.verifyElementPresent(findWindowsObject(PlusButton), 5);
			Windows.click(findWindowsObject(PlusButton));
		}
	}


	public void EnterNewConnectionDetails(String ConnectionNameTextToEnter, String ConnectionUsername, String DefaultSchema) {

		String ConnectionName = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ConnectionName";
		String FrontPageEditUserName = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/FrontPageEditUserName";
		String Schema = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Schema";
		String OKButton = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/OKButton";


		Windows.verifyElementPresent(findWindowsObject(ConnectionName), 5);
		Windows.sendKeys(findWindowsObject(ConnectionName), ConnectionNameTextToEnter);
		Windows.click(findWindowsObject(FrontPageEditUserName));
		Windows.clearText(findWindowsObject(FrontPageEditUserName));
		Windows.sendKeys(findWindowsObject(FrontPageEditUserName), ConnectionUsername);
		Windows.sendKeys(findWindowsObject(Schema), DefaultSchema);
		Windows.click(findWindowsObject(OKButton));
	}


	public void VerifyNewlyAddedConnection(String NewUserLoginPassword) {

		String NewUserAdded = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/NewUserAdded";

		String PasswordTextFieldinEditPopUp = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/PasswordTextFieldinEditPopUp";
		String OKButtonLoginPopUp = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/OKButtonLoginPopUp";
		String SchemaKeywordLoginPage = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/SchemaKeywordHomePage";


		Windows.click(findWindowsObject(NewUserAdded));
		Windows.verifyElementPresent(findWindowsObject(PasswordTextFieldinEditPopUp), 5);
		Windows.setText(findWindowsObject(PasswordTextFieldinEditPopUp), NewUserLoginPassword);
		Windows.click(findWindowsObject(OKButtonLoginPopUp));
		Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5);

		String LoginText = Windows.getText(findWindowsObject(SchemaKeywordLoginPage));
//		System.out.println(("Successfully logged into Dashboard, hence " + LoginText + " is visible");
	}


	public void DeleteConnection() {

		String NewlyAddedConnectionTest = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC005/NewlyAddedConnectionTest";
		String DeletePopUpText = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC005/Text";
		String DeleteButton = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC005/DeleteButton";

		Windows.rightClick(findWindowsObject(NewlyAddedConnectionTest));

		Windows.sendKeys(findWindowsObject(NewlyAddedConnectionTest),Keys.chord(Keys.ARROW_UP));
		Windows.sendKeys(findWindowsObject(NewlyAddedConnectionTest),Keys.chord(Keys.ARROW_UP));
		Windows.sendKeys(findWindowsObject(NewlyAddedConnectionTest),Keys.chord(Keys.ENTER));

		String Rcvd_text =  Windows.getText(findWindowsObject(DeletePopUpText));
		System.out.println(Rcvd_text);
		Windows.verifyElementPresent(findWindowsObject(DeletePopUpText), 5);
		Windows.click(findWindowsObject(DeleteButton));

		//System.out.println(Windows.getText(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC005/FirstDisplayedConnection')))
	}




	public void CloseOpenedFunctionTab() {

		String TabItemMainAdminwhere = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemAdminWheredataisEntered";

		if(Windows.verifyElementPresent(findWindowsObject(TabItemMainAdminwhere), 5)) {
			Windows.rightClick(findWindowsObject(TabItemMainAdminwhere));
			Windows.sendKeys(findWindowsObject(TabItemMainAdminwhere), Keys.chord(Keys.ARROW_DOWN));
			Windows.sendKeys(findWindowsObject(TabItemMainAdminwhere), Keys.chord(Keys.ENTER));
		}
	}


	public void CloseMainTab() {

		String TabItemMainTab = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemMainTab";

		if(Windows.verifyElementPresent(findWindowsObject(TabItemMainTab), 5)) {
			Windows.rightClick(findWindowsObject(TabItemMainTab));
			Windows.sendKeys(findWindowsObject(TabItemMainTab), Keys.chord(Keys.ARROW_DOWN));
			Windows.sendKeys(findWindowsObject(TabItemMainTab), Keys.chord(Keys.ENTER));
		}
	}

	public void NavigateTo_MenuItem_Server_UsersandPrivileges() {

		//Object repository elements for this function
		String Server_MenuItem = "Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Server_MenuItem";
		String UserAndPrivileges_TextToVerify = "Object Repository/DesktopApps/Desktop_DBMS/NavMenuItems/UserAndPrivileges_TextToVerify";

		Windows.verifyElementPresent(findWindowsObject(Server_MenuItem), 5);
		Windows.click(findWindowsObject(Server_MenuItem));
		Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN));
		Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN));
		Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN));
		Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ENTER));

		if(Windows.verifyElementPresent(findWindowsObject(UserAndPrivileges_TextToVerify), 5)) {
			String text = Windows.getText(findWindowsObject(UserAndPrivileges_TextToVerify));
					System.out.println("Successfully navigated to '"+text+"' page");
		}else {
			Windows.verifyElementPresent(findWindowsObject(Server_MenuItem), 5);
			Windows.click(findWindowsObject(Server_MenuItem));
			Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN));
			Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN));
			Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN));
			Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ENTER));

			String text = Windows.getText(findWindowsObject(UserAndPrivileges_TextToVerify));
			System.out.println("Successfully navigated to '"+text+"' page");

		}
	}
}