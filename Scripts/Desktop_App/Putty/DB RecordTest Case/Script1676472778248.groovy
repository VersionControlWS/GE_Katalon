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

Windows.startApplicationWithTitle('C:/Program Files/MySQL/MySQL Workbench 8.0/MySQLWorkbench.exe', 'MySQL Workbench')

Windows.click(findWindowsObject('Object Repository/Native_Putty/Button'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/MenuItem'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/Menu'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/TitleBar'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/TitleBar'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/Button(1)'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/Pane'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/Pane(1)'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/Pane(1)'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/AuthenticationTypeComboBox'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/SHA256Password_ListItemOne'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/AuthenticationTypeComboBox'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/Standard_ListItemTwo'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/AuthenticationTypeComboBox'))

Windows.click(findWindowsObject('Object Repository/Native_Putty/caching_sha2_password_ListItemThree'))

Windows.closeApplication()

