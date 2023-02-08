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

CustomKeywords.'nachPay.user.LoginwithUsernamePwd'()

CustomKeywords.'nachPay.user.NavigatetoBankPage'()

try {
WebUI.click(findTestObject('Object Repository/Bank/AddBankButton_bankProfilePage'))

WebUI.click(findTestObject('Object Repository/Bank/mainBranch_dropdown_bankProfile'))

WebUI.click(findTestObject('Object Repository/Bank/dropdown_selection_mainBranch'))

WebUI.click(findTestObject('Object Repository/Bank/svg_Add as Beneficiary_MuiSvgIcon-root MuiS_73e4e0'))

WebUI.click(findTestObject('Object Repository/Bank/li_YES BANK'))

WebUI.setText(findTestObject('Object Repository/Bank/input__branchName'), 'Test')

WebUI.setText(findTestObject('Object Repository/Bank/input__accountNumber'), '28451236')

WebUI.click(findTestObject('Object Repository/Bank/input__ifsc'))

WebUI.setText(findTestObject('Object Repository/Bank/input__ifsc'), 'YESB0000653')

WebUI.click(findTestObject('Object Repository/Bank/accountType_dropdown'))

WebUI.click(findTestObject('Object Repository/Bank/li_Savings account'))

WebUI.setText(findTestObject('Object Repository/Bank/input__micr'), '560532002')

WebUI.setText(findTestObject('Object Repository/Bank/input__accountHolderName'), 'ATB')

WebUI.click(findTestObject('Object Repository/Bank/button_Submit'))

WebUI.click(findTestObject('Object Repository/Bank/Error_BankProfile_AccountNumberAlreadyExists'))
}finally {
WebUI.closeBrowser()
}
