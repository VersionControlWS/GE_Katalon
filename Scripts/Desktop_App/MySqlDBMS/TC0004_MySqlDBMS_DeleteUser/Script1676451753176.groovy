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

String AppPath = GlobalVariable.AppPath
System.out.println('Path of exe file : ' + AppPath)

String SelectFirstDBButton = 'Object Repository/DesktopApps/Desktop_DBMS/SelectFirstDBButton'
String PasswordTextFieldinEditPopUp = 'Object Repository/DesktopApps/Desktop_DBMS/PasswordTextFieldinEditPopUp'
String OKButtonLoginPopUp = 'Object Repository/DesktopApps/Desktop_DBMS/OKButtonLoginPopUp'
String SchemaKeywordLoginPage = 'Object Repository/DesktopApps/Desktop_DBMS/TreeItem'
String CloseButton = 'Object Repository/DesktopApps/Desktop_DBMS/CloseButton'
String Server_MenuItem = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Server_MenuItem'
String UsersNPrivileges = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Server_MenuItem - Users and Privileges'

String DeleteAccountButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/DeleteButton';

String NewlyAddedDataItem_User = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/NewlyAddedDataItem_User';
String DeleteButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/DeleteButton';
String DeleteTextHeader = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/DeleteTextHeader';
String DeleteButton_PopUp = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/DeleteButton_PopUp';
String RefreshButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0003/RefreshButton';

String TabItemMainTab = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemMainTab';
String TabItemMainAdminwhere = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemAdminWheredataisEntered';

String password = "root@123";

Windows.startApplication(AppPath)

Windows.click(findWindowsObject(SelectFirstDBButton))
Windows.setText(findWindowsObject(PasswordTextFieldinEditPopUp), password)
Windows.click(findWindowsObject(OKButtonLoginPopUp))
Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)

String LoginText = Windows.getText(findWindowsObject(SchemaKeywordLoginPage))
System.out.println(('Successfully logged into Dashboard, hence ' + LoginText) + ' is visible')

Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)

Windows.click(findWindowsObject(Server_MenuItem))

Windows.sendKeys(findWindowsObject(Server_MenuItem),Keys.chord(Keys.ARROW_DOWN))
Windows.sendKeys(findWindowsObject(Server_MenuItem),Keys.chord(Keys.ARROW_DOWN))
Windows.sendKeys(findWindowsObject(Server_MenuItem),Keys.chord(Keys.ARROW_DOWN))
Windows.sendKeys(findWindowsObject(Server_MenuItem),Keys.chord(Keys.ENTER))
Windows.verifyElementPresent(findWindowsObject(DeleteAccountButton), 5)

Windows.verifyElementPresent(findWindowsObject(NewlyAddedDataItem_User), 5)
Windows.doubleClick(findWindowsObject(NewlyAddedDataItem_User))

Windows.click(findWindowsObject(DeleteAccountButton))
Windows.verifyElementPresent(findWindowsObject(DeleteTextHeader), 5)
Windows.click(findWindowsObject(DeleteButton_PopUp))

Windows.verifyElementPresent(findWindowsObject(RefreshButton), 5)
Windows.click(findWindowsObject(RefreshButton))

Windows.rightClick(findWindowsObject(TabItemMainAdminwhere))
Windows.sendKeys(findWindowsObject(TabItemMainAdminwhere),Keys.chord(Keys.ARROW_DOWN))
Windows.sendKeys(findWindowsObject(TabItemMainAdminwhere),Keys.chord(Keys.ENTER))

Windows.rightClick(findWindowsObject(TabItemMainTab))
Windows.sendKeys(findWindowsObject(TabItemMainTab),Keys.chord(Keys.ARROW_DOWN))
Windows.sendKeys(findWindowsObject(TabItemMainTab),Keys.chord(Keys.ENTER))

Windows.closeApplication()