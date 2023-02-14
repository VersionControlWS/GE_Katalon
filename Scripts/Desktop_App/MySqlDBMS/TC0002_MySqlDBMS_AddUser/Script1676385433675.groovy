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

String password = GlobalVariable.MyDBMSPassword

System.out.println('Path of exe file : ' + AppPath)

String SelectFirstDBButton = 'Object Repository/DesktopApps/Desktop_DBMS/SelectFirstDBButton'

String PasswordTextFieldinEditPopUp = 'Object Repository/DesktopApps/Desktop_DBMS/PasswordTextFieldinEditPopUp'

String OKButtonLoginPopUp = 'Object Repository/DesktopApps/Desktop_DBMS/OKButtonLoginPopUp'

String SchemaKeywordLoginPage = 'Object Repository/DesktopApps/Desktop_DBMS/TreeItem'

String CloseButton = 'Object Repository/DesktopApps/Desktop_DBMS/CloseButton'

String Server_MenuItem = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Server_MenuItem'

String UsersNPrivileges = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Server_MenuItem - Users and Privileges'

String AddAccountButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/AddAccountButton';


String LoginName = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/LoginName';
String Password = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Password';
String ConfirmPassword = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ConfirmPassword';
String ApplyButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ApplyButton';
String TabItemAdministrativeRoles = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemAdministrativeRoles';
String MaintenanceAdmin = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/MaintenanceAdmin';
String TabItemMainTab = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemMainTab';
String TabItemMainAdminwhere = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemAdminWheredataisEntered';

String PlusButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/PlusButton';
String ConnectionName = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ConnectionName';
String FrontPageEditUserName = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/FrontPageEditUserName';
String Schema = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Schema';
String OKButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/OKButton';

String NewUserAdded = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/NewUserAdded';

String LoginUserName = "Test";
String LoginPassword = "Test@1234";

Windows.startApplication(AppPath)

Windows.click(findWindowsObject(SelectFirstDBButton))

Windows.setText(findWindowsObject(PasswordTextFieldinEditPopUp), password)

Windows.click(findWindowsObject(OKButtonLoginPopUp))

//Thread.sleep(3000)
Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)

String LoginText = Windows.getText(findWindowsObject(SchemaKeywordLoginPage))

System.out.println(('Successfully logged into Dashboard, hence ' + LoginText) + ' is visible')

Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)

Windows.click(findWindowsObject(Server_MenuItem))

//Windows.click(findWindowsObject(UsersNPrivileges))

Windows.sendKeys(findWindowsObject(Server_MenuItem),Keys.chord(Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject(Server_MenuItem),Keys.chord(Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject(Server_MenuItem),Keys.chord(Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject(Server_MenuItem),Keys.chord(Keys.ENTER))

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

Windows.rightClick(findWindowsObject(TabItemMainAdminwhere))
Windows.sendKeys(findWindowsObject(TabItemMainAdminwhere),Keys.chord(Keys.ARROW_DOWN))
Windows.sendKeys(findWindowsObject(TabItemMainAdminwhere),Keys.chord(Keys.ENTER))

Windows.rightClick(findWindowsObject(TabItemMainTab))
Windows.sendKeys(findWindowsObject(TabItemMainTab),Keys.chord(Keys.ARROW_DOWN))
Windows.sendKeys(findWindowsObject(TabItemMainTab),Keys.chord(Keys.ENTER))


Windows.verifyElementPresent(findWindowsObject(PlusButton), 5)
Windows.click(findWindowsObject(PlusButton))
Windows.verifyElementPresent(findWindowsObject(ConnectionName), 5)
Windows.sendKeys(findWindowsObject(ConnectionName), "Test")
Windows.click(findWindowsObject(FrontPageEditUserName))
Windows.clearText(findWindowsObject(FrontPageEditUserName))
Windows.sendKeys(findWindowsObject(FrontPageEditUserName), "Test")
Windows.sendKeys(findWindowsObject(Schema),"freshers")
Windows.click(findWindowsObject(OKButton))

Windows.doubleClick(findWindowsObject(NewUserAdded))
Windows.setText(findWindowsObject(PasswordTextFieldinEditPopUp), LoginPassword)
Windows.click(findWindowsObject(OKButtonLoginPopUp))
Windows.verifyElementPresent(findWindowsObject(SchemaKeywordLoginPage), 5)
System.out.println(('Successfully logged into Dashboard, hence ' + LoginText) + ' is visible')