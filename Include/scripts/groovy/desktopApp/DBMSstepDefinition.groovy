package desktopApp
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import javax.swing.JOptionPane;
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows;
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;
import org.apache.commons.lang.RandomStringUtils;

class DBMSstepDefinition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("to launch the Desktop-App MySQL and login using (.*)")
	def to_launch_the_DesktopApp_MySQL_and_login_using(String password) {

		//Object repository elements for this function
		String SelectFirstDBButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/SelectFirstDBButton'
		String PasswordTextFieldinEditPopUp = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/PasswordTextFieldinEditPopUp'
		String OKButtonLoginPopUp = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/OKButtonLoginPopUp'
		String SchemaKeywordLoginPage = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/SchemaKeywordHomePage'

		Windows.startApplication('C:/Program Files/MySQL/MySQL Workbench 8.0/MySQLWorkbench.exe')

		Windows.verifyElementPresent(findWindowsObject(SelectFirstDBButton), 5)
		Windows.click(findWindowsObject(SelectFirstDBButton))
		Windows.setText(findWindowsObject(PasswordTextFieldinEditPopUp), password)
		Windows.click(findWindowsObject(OKButtonLoginPopUp))
		Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)
		String LoginText = Windows.getText(findWindowsObject(SchemaKeywordLoginPage))
		System.out.println(('Successfully logged into Dashboard, hence ' + LoginText) + ' is visible')
		Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)

	}

	@When("the user Navigates to Server[MenuItem] -> UsersandPrivileges")
	def the_user_Navigates_to_Server_MenuItem_UsersandPrivileges() {

		//Object repository elements for this function
		String Server_MenuItem = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Server_MenuItem';
		String UserAndPrivileges_TextToVerify = 'Object Repository/DesktopApps/Desktop_DBMS/NavMenuItems/UserAndPrivileges_TextToVerify';

		Windows.verifyElementPresent(findWindowsObject(Server_MenuItem), 5)
		Windows.click(findWindowsObject(Server_MenuItem))
		Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN))
		Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN))
		Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN))
		Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ENTER))

		if(Windows.verifyElementPresent(findWindowsObject(UserAndPrivileges_TextToVerify), 5)) {
			String text = Windows.getText(findWindowsObject(UserAndPrivileges_TextToVerify))
			System.out.println("Successfully navigated to '"+text+"' page");
		}else {
			Windows.verifyElementPresent(findWindowsObject(Server_MenuItem), 5)
			Windows.click(findWindowsObject(Server_MenuItem))
			Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN))
			Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN))
			Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ARROW_DOWN))
			Windows.sendKeys(findWindowsObject(Server_MenuItem), Keys.chord(Keys.ENTER))

			String text = Windows.getText(findWindowsObject(UserAndPrivileges_TextToVerify))
			System.out.println("Successfully navigated to '"+text+"' page");

		}
	}


	public static String AutoGeneratedUsername(){

		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = false;
		//	String generatedString = RandomStringUtils.random(length, useLetters, useNumbers).toLowerCase();
		String name = RandomStringUtils.random(length, useLetters, useNumbers).toLowerCase();
		//  System.out.println(name);

		String firstLetter = name.substring(0, 1);
		String remainingLetters = name.substring(1, name.length());

		firstLetter = firstLetter.toUpperCase();
		name = firstLetter + remainingLetters;
		System.out.println("Auto-Generated Username: " + name);
		return name.trim();

	}

	@Then("enter details such auto-generated UserName (.*) to Add User Account")
	def enter_details_such_as_LoginName_LoginPassword(String LoginPassword) {

		String AddAccountButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/AddAccountButton';
		String LoginName = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/LoginName';
		String Password = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Password';
		String ConfirmPassword = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ConfirmPassword';
		String ApplyButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ApplyButton';
		String TabItemAdministrativeRoles = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemAdministrativeRoles';
		String MaintenanceAdmin = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/MaintenanceAdmin - ScriptGenerated';
		
		String LoginUserName = AutoGeneratedUsername()

		Windows.verifyElementPresent(findWindowsObject(AddAccountButton), 5)
		Windows.click(findWindowsObject(AddAccountButton))
		Windows.verifyElementPresent(findWindowsObject(LoginName), 5)
		Windows.setText(findWindowsObject(LoginName), LoginUserName)
		Windows.setText(findWindowsObject(Password), LoginPassword)
		Windows.setText(findWindowsObject(ConfirmPassword), LoginPassword)
		Windows.click(findWindowsObject(ApplyButton))
		Windows.click(findWindowsObject(TabItemAdministrativeRoles))
		Windows.verifyElementPresent(findWindowsObject(MaintenanceAdmin), 5)
		Windows.click(findWindowsObject(MaintenanceAdmin))
		Windows.click(findWindowsObject(ApplyButton))
	}

	@Then("close all instances")
	def close_all_instances() {

		String TabItemMainAdminwhere = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemAdminWheredataisEntered';

		if(Windows.verifyElementPresent(findWindowsObject(TabItemMainAdminwhere), 5)) {
			Windows.rightClick(findWindowsObject(TabItemMainAdminwhere))
			Windows.sendKeys(findWindowsObject(TabItemMainAdminwhere), Keys.chord(Keys.ARROW_DOWN))
			Windows.sendKeys(findWindowsObject(TabItemMainAdminwhere), Keys.chord(Keys.ENTER))

		}

		String TabItemMainTab = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemMainTab';

		if(Windows.verifyElementPresent(findWindowsObject(TabItemMainTab), 5)) {
			Windows.rightClick(findWindowsObject(TabItemMainTab))
			Windows.sendKeys(findWindowsObject(TabItemMainTab), Keys.chord(Keys.ARROW_DOWN))
			Windows.sendKeys(findWindowsObject(TabItemMainTab), Keys.chord(Keys.ENTER))
		}

		Windows.closeApplication()
	}

	/**
	 * Till here it is desktop-app
	 */


	@When("phone number is entered as (.*) in given textField")
	def phone_number_is_entered_in_textField(String phoneNumber) {
		//		println phoneNumber
		String phoneNumber_obj = 'Object Repository/Page_NachPay/inputLoginPage_Username'
		String submit_btn_obj = 'Object Repository/Page_NachPay/button_LoginPage_GetOTP'
		WebUI.setText(findTestObject(phoneNumber_obj), phoneNumber)
		WebUI.click(findTestObject(submit_btn_obj))
	}

	public static takeScrnShotAndStoreInReportsDirectory(String status){
		String dirName = RunConfiguration.getProjectDir()
		//println(dirName)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		String DateTime = dtf.format(now)
		//println(dirName+"/Reports/BDD_LoginScnKeyword"+status+"_"+DateTime)
		String path = dirName+"/Reports/BDD_LoginScnKeyword_"+status+"_"+DateTime+".png"
		WebUI.takeScreenshot(path)
	}


	public static String capitalizeWord(String str){
		String[] words=str.split("\\s");
		String capitalizeWord="";
		for(String w:words){
			String first=w.substring(0,1);
			String afterfirst=w.substring(1);
			capitalizeWord+=first.toUpperCase()+afterfirst+" ";
		}
		return capitalizeWord.trim();
	}

	@Then("error (.*) is verified in this step")
	def error_is_verfifed_in_this_step(String status) {
		println status
		String withFullStop = status+"."
		String withFullStopNew = capitalizeWord(withFullStop)
		//		println ("withFullStop : "+withFullStop)
		//		println ("withFullStopNew : "+withFullStopNew)
		WebUI.waitForElementVisible(findTestObject("Object Repository/LoginPage_TextNError/"+status), 5)
		takeScrnShotAndStoreInReportsDirectory(status)
		println("This is what is expected")
		println(WebUI.getText(findTestObject("Object Repository/LoginPage_TextNError/"+status)))
		println("")
		WebUI.verifyElementText(findTestObject("Object Repository/LoginPage_TextNError/"+status), withFullStopNew)
		println("")
		//		JOptionPane.showMessageDialog(null, status, "Verifying the text on this page", JOptionPane.INFORMATION_MESSAGE);
		//		WebUI.delay(5)
		WebUI.closeBrowser()
	}
}