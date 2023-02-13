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

'https://docs.katalon.com/docs/get-started/sample-projects/data-driven-test/sample-webui-tests-project-with-data-driven-testing-shopping-cart-sample-in-katalon-studio'
'https://github.com/katalon-studio-samples/custom-junit-report-example/blob/master/Scripts/Main%20Test%20Cases/TC1_Verify%20Successful%20Login/Script1482850539026.groovy'


'https://forum.katalon.com/t/how-to-write-log-messages-into-a-specific-file/42214'
KeywordUtil.logInfo("TESTING LOGGER IN KATALON")

WebUI.comment('Story: Login to CURA system')

WebUI.comment('Given that the user has the valid login information')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

//WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

WebUI.setText(findTestObject('Object Repository/LoginPage_GIROPie/input_TextField_Username'), "ajay@uth-uk.com")

WebUI.setText(findTestObject('Object Repository/LoginPage_GIROPie/input_TextField_password'), "Tree@2023")

WebUI.comment('When he logins to CURA system')

WebUI.click(findTestObject('Object Repository/LoginPage_GIROPie/Continue_SignUpButton'))

WebUI.comment('Then he should be able to login successfully')

//landingPage = WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage_TextNError/Dashboard'), GlobalVariable.G_Timeout)

WebUI.closeBrowser()