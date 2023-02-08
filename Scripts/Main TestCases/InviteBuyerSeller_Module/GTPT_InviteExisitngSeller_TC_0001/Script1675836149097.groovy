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

WebUI.openBrowser('https://staging.peppertree.ai/')

//WebUI.navigateToUrl('https://staging.peppertree.ai/')

WebUI.setText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/input_Sign Up_r0'), 'ajay@uth-uk.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/input__MuiInputBase-input MuiOutlinedInput-_047092'), 'kq/kfD0iu/MeAi4DzsByqw==')

WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/div_Continue'))

WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/button_Invite'))

WebUI.verifyElementText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/Page_GIROPie/button_Invite Individual'),'Invite Individual')

WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/input_As Buyer_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.setText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/input_As Seller_r5'), 'Darshan')

WebUI.setText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/input_As Seller_r6'), 'CCCRPA0112X')

WebUI.setText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/input_As Seller_r7'), 'darshan@uth-uk.com')

WebUI.setText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/input_As Seller_r8'), '8197390625')

WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/button_Invite_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/Page_GIROPie/img_Invite_MuiAvatar-img css-1hy9t21'), 5)

WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/Page_GIROPie/img_Invite_MuiAvatar-img css-1hy9t21'))

WebUI.waitForElementVisible(findTestObject('Object Repository/InviteSeller/li_User Management'), 2)

WebUI.click(findTestObject('Object Repository/InviteSeller/li_User Management'))

WebUI.verifyElementText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/button_Company Invites'), 'Company Invites')

WebUI.verifyElementText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/button_Sent'), 'Sent')

WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/button_Sent'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/div_Company Name Sender Branch GSTIN PAN Re_207067'), 3)

