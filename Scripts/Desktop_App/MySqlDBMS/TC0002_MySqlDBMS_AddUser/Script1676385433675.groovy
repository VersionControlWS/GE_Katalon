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

String Server_MenuItem = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Server_MenuItem'

String UsersNPrivileges = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Server_MenuItem - Users and Privileges'

String AddAccountButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/AddAccountButton'

String LoginName = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/LoginName'

String Password = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/Password'

String ConfirmPassword = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ConfirmPassword'

String ApplyButton = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/ApplyButton'

String TabItemAdministrativeRoles = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemAdministrativeRoles'

String MaintenanceAdmin = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/MaintenanceAdmin'

String TabItemMainTab = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemMainTab'

String TabItemMainAdminwhere = 'Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0002/TabItemAdminWheredataisEntered'

String LoginUserName = 'Test'

String LoginPassword = 'Test@1234'

Windows.startApplication(AppPath)

CustomKeywords.'desktopMySQL.function.LoginToMySqlwithPasswordAndVerifyHomePage'(password);

CustomKeywords.'desktopMySQLNav.Navigation.NavigateTo_MenuItem_Server_UsersandPrivileges'();

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

Windows.sendKeys(findWindowsObject(TabItemMainAdminwhere), Keys.chord(Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject(TabItemMainAdminwhere), Keys.chord(Keys.ENTER))

Windows.rightClick(findWindowsObject(TabItemMainTab))

Windows.sendKeys(findWindowsObject(TabItemMainTab), Keys.chord(Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject(TabItemMainTab), Keys.chord(Keys.ENTER))

Windows.closeApplication()

WebUI.callTestCase(findTestCase('Desktop_App/MySqlDBMS/TC0004_MySqlDBMS_DeleteUser'), [:], FailureHandling.CONTINUE_ON_FAILURE)

