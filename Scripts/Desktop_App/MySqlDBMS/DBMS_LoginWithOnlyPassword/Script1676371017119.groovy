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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.configuration.RunConfiguration


def fileDir = RunConfiguration.getProjectDir()

String ProjectExePath = fileDir
System.out.println("Curent project running path : "+ProjectExePath)

String AppPath = 'C:\\Program Files\\MySQL\\MySQL Workbench 8.0\\MySQLWorkbench.exe'
String password = 'root@123'

System.out.println("Path of exe file : "+AppPath)

String SelectFirstDBButton = 'Object Repository/Desktop_DBMS/SelectFirstDBButton';
String PasswordTextFieldinEditPopUp = 'Object Repository/Desktop_DBMS/PasswordTextFieldinEditPopUp';
String OKButtonLoginPopUp = 'Object Repository/Desktop_DBMS/OKButtonLoginPopUp';
String SchemaKeywordLoginPage= 'Object Repository/Desktop_DBMS/TreeItem';
String CloseButton = 'Object Repository/Desktop_DBMS/CloseButton';

Windows.startApplication(AppPath)

Windows.click(findWindowsObject(SelectFirstDBButton))

Windows.setText(findWindowsObject(PasswordTextFieldinEditPopUp), password)

Windows.click(findWindowsObject(OKButtonLoginPopUp))

Thread.sleep(3000)

String LoginText = Windows.getText(findWindowsObject(SchemaKeywordLoginPage))

System.out.println("Successfully logged into Dashboard, hence "+LoginText+" is visible")
//System.out.println(LoginText)
Thread.sleep(3000)

Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)

Windows.click(findWindowsObject(CloseButton))