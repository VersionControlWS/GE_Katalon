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
import com.kms.katalon.core.windows.keyword.helper.WindowsActionSettings as WindowsActionSettings
import groovy.swing.factory.WindowFactory as WindowFactory

//Windows.startApplicationWithTitle('C:/Users/Lenovo UTH-UK/Downloads/putty.exe', '')
Windows.startApplication('C:/Users/Lenovo UTH-UK/Downloads/putty.exe')

Windows.click(findWindowsObject('Object Repository/DesktopApp_Putty/HostName_TextField'))

Windows.setText(findWindowsObject('Object Repository/DesktopApp_Putty/HostName_TextField'), '34.27.230.36')

Windows.click(findWindowsObject('Object Repository/DesktopApp_Putty/OpenButton_SystemGenerated'))

Thread.sleep(6000)

//Windows.switchToWindow(findWindowsObject('Object Repository/DesktopApp_Putty/Putty_Window'))

//Windows.switchToWindowTitle('PuTTY')

//https://docs.katalon.com/docs/author/keywords/keyword-description-in-katalon-studio/windows-keywords/windows-switch-to-application#ariaid-title1
//Windows.switchToApplication()

//Thread.sleep(6000)
//
//Windows.sendKeys(findWindowsObject("Object Repository/DesktopApp_Putty/Putty_Window"), 'UTH_offshore')

//https://forum.katalon.com/t/switch-to-window-title-takes-long-desktop-app/41098/10
//WindowsTestObject targetWindow2 = findWindowsObject('')
//
//Windows.switchToDesktop()
//Windows.switchToWindow(targetWindow1)

Windows.closeApplication()