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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging.peppertree.ai/login')

WebUI.verifyElementVisible(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0016/Page_GIROPie/img'))

WebUI.click(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0016/Page_GIROPie/div_Continue'))

WebUI.rightClick(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0016/Page_GIROPie/div_Please enter a valid email address'))

//WebUI.verifyElementText(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0016/Page_GIROPie/div_Please enter a valid email address_MuiA_b88e37'), 
//    '')

CustomKeywords.'verify.Element.stringToastElementPresent'(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0016/Pop-up_Message/Page_GIROPie/div_Please enter a valid email address'))

CustomKeywords.'verify.Element.stringToastElementText'(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0016/Pop-up_Message/Page_GIROPie/div_Please enter a valid email address'),
	'Please Enter A Valid Email Address')

WebUI.closeBrowser()

