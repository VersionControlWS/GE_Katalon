import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.ui.SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

String LoginPassword = 'root@123';

String AuthenticationType = 'Standard';
String SetNewPwd = 'Test@1234';

String AppPath = 'C:/Program Files/MySQL/MySQL Workbench 8.0/MySQLWorkbench.exe';


try {

	Windows.startApplication(AppPath)

	CustomKeywords.'common.WinAppDriver.WinInstance.toGenerateADriverInstance'()

	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Local instance MySQL80')
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByName'('Password', LoginPassword)
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('OK')

	CustomKeywords.'common.WinAppDriver.WindowsFunction.Navigate_to_Menu_Server_UserAndPrevilidges'()
	//CustomKeywords.'desktopMySQLNav.Navigation.NavigateTo_MenuItem_Server_UsersandPrivileges'();

	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Add Account')

	//Enter user details such as Login Name, Authentication Type, Password, Confirm Password

	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpathLogin'('//Edit[@Name="Login Name:"]')

	//CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByXpath'('//ComboBox[@Name="Authentication Type:"]')
	//CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByXpath'('//Button[@Name="Open"]')
	//CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Standard')
	//OR
	CustomKeywords.'common.WinAppDriver.WindowsFunction.selectElementValueByXpath'('//ComboBox[@Name="Authentication Type:"]', 'SHA256 Password')
	//Windows.setText(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/AuthType'), 'Standard')
	//Thread.sleep(3000)

	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Edit[@Name="Password:"]', SetNewPwd)
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Edit[@Name="Confirm Password:"]', SetNewPwd)
	//
	////Enter user details such as Login Name, Authentication Type, Password, Confirm Password
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Administrative Roles')
	//
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByXpath'('//TreeItem[@Name="MaintenanceAdmin"]/DataItem[1]')
	////CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByXpath'('//TreeItem[@Name="MaintenanceAdmin"]/DataItem[@Name="Column0"]')
	//
	//CustomKeywords.'common.WinAppDriver.WindowsFunction.selectCheckbox'('//TreeItem[@Name="MaintenanceAdmin"]/DataItem[@Name="Column0"]')
	////CustomKeywords.'common.WinAppDriver.WindowsFunction.selectCheckbox'('//TreeItem[@Name="BackupAdmin"]/DataItem[@Name="Column0"]')
	//
	////Click on Apply button
	////CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Apply')

	CustomKeywords.'common.WinAppDriver.WindowsFunction.closeTab'()

	//Pending
	//CustomKeywords.'common.WinAppDriver.WindowsFunction.closeConnection'()
}finally {
	Windows.closeApplication()
}