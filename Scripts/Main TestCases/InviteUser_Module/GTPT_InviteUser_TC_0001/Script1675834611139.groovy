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

WebUI.navigateToUrl('https://staging.peppertree.ai/')

WebUI.setText(findTestObject('Object Repository/Giropie/input_Sign Up_r0'), 'shreyankm262@gmail.com')

WebUI.setText(findTestObject('Object Repository/Giropie/input__MuiInputBase-input MuiOutlinedInput-_047092'), 'Peppertree@123')

WebUI.sendKeys(findTestObject('Object Repository/Giropie/input__MuiInputBase-input MuiOutlinedInput-_047092'), Keys.chord(
        Keys.ENTER))


WebUI.verifyElementText(findTestObject('Object Repository/Giropie/span_Dashboard'), 'Dashboard')

WebUI.click(findTestObject('Object Repository/Giropie/img_Invite_MuiAvatar-img css-1hy9t21'))

WebUI.click(findTestObject('Object Repository/Giropie/li_User Management'))

WebUI.verifyElementVisible(findTestObject('Giropie/button_Invite User'))

WebUI.click(findTestObject('Giropie/button_Invite User'))

CustomKeywords.'giroPie.user.EnterUserDetails'('shreyank', 'mshreyank1999@gmail.com', '9856321474', 'IT')

WebUI.setText(findTestObject('Giropie/input_Invite User Bulk_MuiInputBase-input M_bcd2f6'), 'shreyank')

WebUI.setText(findTestObject('Giropie/input_Invite User Bulk_MuiInputBase-input M_bcd2f6'), 'mshreyank1999@gmail.com')

WebUI.click(findTestObject('Giropie/div_Main Branch'))

WebUI.click(findTestObject('Giropie/li_Main Branch'))

WebUI.setText(findTestObject('Giropie/input_Invite User Bulk_MuiInputBase-input M_bcd2f6'), '9856321474')

WebUI.setText(findTestObject('Object Repository/Giropie/input_Invite User Bulk_MuiInputBase-input M_bcd2f6'), 'IT')

WebUI.click(findTestObject('Page_GIROPie/button_Invite User'))

WebUI.verifyElementText(findTestObject('Object Repository/Giropie/td_shreyank'), 'shreyank')

WebUI.verifyElementText(findTestObject('Object Repository/Giropie/td_mshreyank1999gmail.com'), 'mshreyank1999@gmail.com')

WebUI.verifyElementText(findTestObject('Object Repository/Giropie/td_User'), 'User')

WebUI.verifyElementText(findTestObject('Object Repository/Giropie/td_IT'), 'IT')

WebUI.verifyElementText(findTestObject('Object Repository/Giropie/td_Active'), 'Active')

WebUI.closeBrowser()

