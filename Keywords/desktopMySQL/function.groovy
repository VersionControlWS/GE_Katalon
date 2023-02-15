package desktopMySQL

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class function {

	@Keyword
	public void LoginToMySqlwithPasswordAndVerifyHomePage(password) {

		//Object repository elements for this function
		String SelectFirstDBButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/SelectFirstDBButton'
		String PasswordTextFieldinEditPopUp = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/PasswordTextFieldinEditPopUp'
		String OKButtonLoginPopUp = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/OKButtonLoginPopUp'
		String SchemaKeywordLoginPage = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0001/SchemaKeywordHomePage'

		Windows.verifyElementPresent(findWindowsObject(SelectFirstDBButton), 5)
		Windows.click(findWindowsObject(SelectFirstDBButton))
		Windows.setText(findWindowsObject(PasswordTextFieldinEditPopUp), password)
		Windows.click(findWindowsObject(OKButtonLoginPopUp))
		Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)
		String LoginText = Windows.getText(findWindowsObject(SchemaKeywordLoginPage))
		System.out.println(('Successfully logged into Dashboard, hence ' + LoginText) + ' is visible')
		Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)

	}
	
	@Keyword
	public void AddUserAccount(LoginUserName, LoginPassword) {
		
		String AddAccountButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/AddAccountButton';
		String LoginName = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/LoginName';		
		String Password = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Password';		
		String ConfirmPassword = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ConfirmPassword';		
		String ApplyButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ApplyButton';		
		String TabItemAdministrativeRoles = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemAdministrativeRoles';		
		String MaintenanceAdmin = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/MaintenanceAdmin';		
		
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

}
