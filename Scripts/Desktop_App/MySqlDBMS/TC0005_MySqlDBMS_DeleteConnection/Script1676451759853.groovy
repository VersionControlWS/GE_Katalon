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
System.out.println('Path of exe file : ' + AppPath)
Windows.startApplication(AppPath)

String NewlyAddedConnectionTest = 'Object Repository/DesktopApps/Desktop_DBMS/TC006/NewlyAddedConnectionTest';
Windows.rightClick(findWindowsObject(NewlyAddedConnectionTest))

Windows.sendKeys(findWindowsObject(NewlyAddedConnectionTest),Keys.chord(Keys.ARROW_UP))
Windows.sendKeys(findWindowsObject(NewlyAddedConnectionTest),Keys.chord(Keys.ARROW_UP))
Windows.sendKeys(findWindowsObject(NewlyAddedConnectionTest),Keys.chord(Keys.ENTER))

String DeletePopUpText = 'Object Repository/DesktopApps/Desktop_DBMS/TC006/Text';
String Rcvd_text =  Windows.getText(findWindowsObject(DeletePopUpText))
System.out.println(Rcvd_text)

Windows.verifyElementPresent(findWindowsObject(DeletePopUpText), 5)

String DeleteButton = 'Object Repository/DesktopApps/Desktop_DBMS/TC006/DeleteButton';
Windows.click(findWindowsObject(DeleteButton))

//println(Windows.getText(findWindowsObject('Object Repository/DesktopApps/Desktop_DBMS/TC006/FirstDisplayedConnection')))

Windows.closeApplication()