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
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.By as By

public String returnElementExistance() {
	if(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_2'),1)) { return "Tree_2"}
	else if(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_4'),1)) { return "Tree_4"}
	else if(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_5'),1)) { return "Tree_5"}
	else if(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_3'),1)) { return "Tree_3"}
	else if(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_1'),1)) { return "Tree_1"}
	else {return null}
}


Windows.startApplication('C:/Users/Lenovo UTH-UK/Downloads/WindowsFormsApp3/WindowsFormsApp3.exe')
CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Search Employee Record')

String presenceOfElement = returnElementExistance()
println("Object present on screen is : "+presenceOfElement)

Windows.closeApplication()