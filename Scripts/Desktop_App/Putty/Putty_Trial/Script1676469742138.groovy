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

Windows.startApplicationWithTitle('C:\\Users\\Lenovo UTH-UK\\Downloads\\putty.exe', 'PuTTY Configuration')

Windows.click(findWindowsObject('Object Repository/DesktopApps/Desk_putty/HostNameEdit'))

Windows.setText(findWindowsObject('Object Repository/DesktopApps/Desk_putty/HostNameEdit'), '34.27.230.36')

Windows.click(findWindowsObject('Object Repository/DesktopApps/Desk_putty/OpenButton'))

Windows.click(findWindowsObject('Object Repository/DesktopApps/Desk_putty/TitleBar'))

Windows.click(findWindowsObject('Object Repository/DesktopApps/Desk_putty/Window'))

Windows.setText(findWindowsObject('Object Repository/DesktopApps/Desk_putty/Window'), '34.27.230.36 - PuTTY')

Windows.click(findWindowsObject('Object Repository/DesktopApps/Desk_putty/OKButton'))

Windows.click(findWindowsObject('Object Repository/DesktopApps/Desk_putty/TitleBar'))

Windows.rightClick(findWindowsObject('Object Repository/DesktopApps/Desk_putty/TitleBar'))

Windows.click(findWindowsObject('Object Repository/DesktopApps/Desk_putty/MenuItem'))

Windows.click(findWindowsObject('Object Repository/DesktopApps/Desk_putty/Window'))

Windows.setText(findWindowsObject('Object Repository/DesktopApps/Desk_putty/Window'), '34.27.230.36 - PuTTY')

Windows.click(findWindowsObject('Object Repository/DesktopApps/Desk_putty/OKButton(2)'))

Windows.closeApplication()

