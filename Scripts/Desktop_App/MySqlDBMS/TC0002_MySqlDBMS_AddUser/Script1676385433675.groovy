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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

def fileDir = RunConfiguration.getProjectDir()
String ProjectExePath = fileDir
System.out.println('Curent project running path : ' + ProjectExePath)

//String AppPath = GlobalVariable.AppPath
//String password = GlobalVariable.MyDBMSPassword

String AppPath = 'C:/Program Files/MySQL/MySQL Workbench 8.0/MySQLWorkbench.exe'
String password = 'root@123'


System.out.println('Path of exe file : ' + AppPath)

String LoginUserName = 'Test'
String LoginPassword = 'Test@1234'

Windows.startApplication(AppPath)

CustomKeywords.'desktopMySQL.function.LoginToMySqlwithPasswordAndVerifyHomePage'(password);
CustomKeywords.'desktopMySQLNav.Navigation.NavigateTo_MenuItem_Server_UsersandPrivileges'();
CustomKeywords.'desktopMySQL.function.AddUserAccount'(LoginUserName, LoginPassword);
CustomKeywords.'desktopMySQL.function.CloseOpenedFunctionTab'();
CustomKeywords.'desktopMySQL.function.CloseMainTab'();

Windows.closeApplication()

