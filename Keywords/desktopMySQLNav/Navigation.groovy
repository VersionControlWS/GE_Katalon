package desktopMySQLNav

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
import org.openqa.selenium.Keys as Keys

public class Navigation {

	@Keyword
	public void NavigateTo_MenuItem_Server_UsersandPrivileges() {

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
}
