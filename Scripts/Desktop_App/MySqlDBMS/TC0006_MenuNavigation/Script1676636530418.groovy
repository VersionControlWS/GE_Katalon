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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

Windows.startApplication('C:/Program Files/MySQL/MySQL Workbench 8.0/MySQLWorkbench.exe')
CustomKeywords.'desktopDriver.A.toGenerateADriverInstance'()
CustomKeywords.'desktopDriver.WinFunctions.findAndClickWindowsElement'('Local instance MySQL80')
CustomKeywords.'desktopDriver.WinFunctions.findAndsendKeysWindowsElement'('Password', 'root@123')
CustomKeywords.'desktopDriver.WinFunctions.findAndClickWindowsElement'('OK')
//CustomKeywords.'desktopDriver.WinFunctions.findAndClickWindowsElement'('Server')
CustomKeywords.'desktopMySQLNav.Navigation.NavigateTo_MenuItem_Server_UsersandPrivileges'();
CustomKeywords.'desktopDriver.WinFunctions.findAndClickWindowsElement'('Add Account')
//CustomKeywords.'desktopDriver.WinFunctions.findAndsendKeysWindowsElementByXpathLogin'('//Edit[@Name="Login Name:"]')
////CustomKeywords.'desktopDriver.WinFunctions.findAndClickWindowsElementByXpath'('//ComboBox[@Name="Authentication Type:"]')
//CustomKeywords.'desktopDriver.WinFunctions.selectElementValueByXpath'('//ComboBox[@Name="Authentication Type:"]', 'SHA256 Password')
//CustomKeywords.'desktopDriver.WinFunctions.findAndsendKeysWindowsElementByXpath'('//Edit[@Name="Password:"]', 'Test@1234')
//CustomKeywords.'desktopDriver.WinFunctions.findAndsendKeysWindowsElementByXpath'('//Edit[@Name="Confirm Password:"]', 'Test@1234')
CustomKeywords.'desktopDriver.WinFunctions.findAndClickWindowsElement'('Administrative Roles')
CustomKeywords.'desktopDriver.WinFunctions.findAndClickWindowsElementByXpath'('//TreeItem[@Name="MaintenanceAdmin"]/DataItem[1]')
//CustomKeywords.'desktopDriver.WinFunctions.findAndClickWindowsElementByXpath'('//TreeItem[@Name="MaintenanceAdmin"]/DataItem[@Name="Column0"]')
CustomKeywords.'desktopDriver.WinFunctions.trial'()
CustomKeywords.'desktopDriver.WinFunctions.trialtoClose'()
//Windows.startApplication('C:/Program Files/MySQL/MySQL Workbench 8.0/MySQLWorkbench.exe')
//driver = CustomKeywords.'desktopDriver.WinFunctions.getdriver'()
////driver = Windows.getDriver()
////
//println(driver.getTitle())
//
//
//CustomKeywords.'desktopDriver.WinFunctions.findWindowsElementAndPerformAction'('Local instance MySQL80')
//
////WebElement ele = driver.findElement(By.name('Local instance MySQL80'))
//
////ele.click()
//
//ele = driver.findElement(By.name('Password'))
//
//ele.sendKeys('root@123')
//
//CustomKeywords.'desktopDriver.WinFunctions.findWindowsElementAndPerformAction'('OK')
//
////ele = driver.findElement(By.name('OK'))
//
////ele.click()
//
//CustomKeywords.'desktopDriver.WinFunctions.findWindowsElementAndPerformAction'('Server')

//ele = driver.findElement(By.name('Server'))

//ele.click()
//
//Thread.sleep(3000)

//ele = driver.findElement(By.xpath('//*[@Name=\'Users and Privileges\']'))

//println(ele)
//ele.click()

//CustomKeywords.'desktopMySQL.function.LoginToMySqlwithPasswordAndVerifyHomePage'("root@123")
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0006/MenuItem_File'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0006/MenuItem_Edit'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0006/MenuItem_View'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0006/MenuItem_Query'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0006/MenuItem_Database'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0006/MenuItem_Server'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0006/MenuItem_Tools'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0006/MenuItem_Scripting'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/DBMS_TC0006/MenuItem_Help'))
Windows.closeApplication()
