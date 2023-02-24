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

	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Add Connection')
	Thread.sleep(5000)
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Edit[@Name="Connection Name"]', 'Test')
	
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Edit[@Name="Host Name"]', '127.0.0.1')
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Edit[@Name="Port"]', '3306')
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Edit[@Name="User Name"]', 'Test')
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Edit[@Name="Default Schema"]', 'freshers')
	
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('SSL')

}finally {
	Windows.closeApplication()
}