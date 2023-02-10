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

WebUI.verifyElementVisible(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0017/Page_GIROPie/img'))

WebUI.setText(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0017/Page_GIROPie/input_Sign Up_r0'), 'ajay@uth-uk.com')

WebUI.click(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0017/Page_GIROPie/div_Continue'))

//WebUI.verifyElementText(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0017/Page_GIROPie/div_Please fill all the fields'), 
//    'Please fill all the fields')

CustomKeywords.'verify.Element.stringToastElementPresent'(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0017/Page_GIROPie/div_Please fill all the fields'))

CustomKeywords.'verify.Element.stringToastElementText'(findTestObject('Object Repository/Login_Module/GTPT_Login_TC_0017/Page_GIROPie/div_Please fill all the fields'),
	'Please Fill All The Fields')

WebUI.closeBrowser()
