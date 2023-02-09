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
CustomKeywords.'giroPie.user.LoginwithUsernamePwd'()

WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/button_Invite'))

WebUI.verifyElementText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/Page_GIROPie/button_Invite Individual'),'Invite Individual')

CustomKeywords.'giroPie.user.EnterSellerDetails'('xxxy', 'CCCRPA0112X', 'darshan@uth-uk.com', '8197390625')

WebUI.waitForElementVisible(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/Page_GIROPie/img_Invite_MuiAvatar-img css-1hy9t21'), 5)

WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/Page_GIROPie/img_Invite_MuiAvatar-img css-1hy9t21'))

WebUI.waitForElementVisible(findTestObject('Object Repository/InviteSeller/li_User Management'), 2)

WebUI.click(findTestObject('Object Repository/InviteSeller/li_User Management'))

WebUI.verifyElementText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/button_Company Invites'), 'Company Invites')

WebUI.verifyElementText(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/button_Sent'), 'Sent')

WebUI.click(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/button_Sent'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Company_Invite_Seller/Page_GIROPie/div_Company Name Sender Branch GSTIN PAN Re_207067'), 3)

