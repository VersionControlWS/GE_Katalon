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

String AppPath = GlobalVariable.AppPath

String PasswordTextFieldinEditPopUp = 'Object Repository/DesktopApps/Desktop_DBMS/PasswordTextFieldinEditPopUp'
String OKButtonLoginPopUp = 'Object Repository/DesktopApps/Desktop_DBMS/OKButtonLoginPopUp'
String SchemaKeywordLoginPage = 'Object Repository/DesktopApps/Desktop_DBMS/TreeItem'

String PlusButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/PlusButton';
String ConnectionName = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ConnectionName';
String FrontPageEditUserName = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/FrontPageEditUserName';
String Schema = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Schema';
String OKButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/OKButton';

String NewUserAdded = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/NewUserAdded';

String ConnectionNameTextToEnter = "Test";
String ConnectionUsername = "Test";
String DefaultSchema = "freshers";
String NewUserLoginPassword = "Test@1234";

Windows.startApplication(AppPath)

Windows.verifyElementPresent(findWindowsObject(PlusButton), 5)
Windows.click(findWindowsObject(PlusButton))
Windows.verifyElementPresent(findWindowsObject(ConnectionName), 5)
Windows.sendKeys(findWindowsObject(ConnectionName), ConnectionNameTextToEnter)
Windows.click(findWindowsObject(FrontPageEditUserName))
Windows.clearText(findWindowsObject(FrontPageEditUserName))
Windows.sendKeys(findWindowsObject(FrontPageEditUserName), ConnectionUsername)
Windows.sendKeys(findWindowsObject(Schema), DefaultSchema)
Windows.click(findWindowsObject(OKButton))

Windows.doubleClick(findWindowsObject(NewUserAdded))
Windows.setText(findWindowsObject(PasswordTextFieldinEditPopUp), NewUserLoginPassword)
Windows.click(findWindowsObject(OKButtonLoginPopUp))
Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)

String LoginText = Windows.getText(findWindowsObject(SchemaKeywordLoginPage))
System.out.println(('Successfully logged into Dashboard, hence ' + LoginText) + ' is visible')

Windows.closeApplication()