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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

flag = 0
try {
	WebUI.callTestCase(findTestCase('Common_TestCases/TC0004_GP_PT_InvalidLogin'), [('url') : '', ('username') : '', ('password') : ''],
	FailureHandling.STOP_ON_FAILURE)

	WebDriver driver = DriverFactory.getWebDriver()

	WebUI.waitForElementVisible(findTestObject('Object Repository/LoginPage/Page_GIROPie/ErrorOnLoginPage_UserNotFound'), 2)

//	String UserNotFound_Error = driver.findElement(By.xpath('//*[@id="root"]/div/div[1]/div/div[2]')).getText()

	CustomKeywords.'verify.Element.stringToastElementPresent'(findTestObject('Object Repository/LoginPage/Page_GIROPie/ErrorOnLoginPage_UserNotFound'))
	
//	WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/Page_GIROPie/ErrorOnLoginPage_UserNotFound'), 5)
//	WebUI.takeElementScreenshot(findTestObject('Object Repository/LoginPage/Page_GIROPie/ErrorOnLoginPage_UserNotFound'))
//
//	System.out.println(UserNotFound_Error)
//	Error_OnLoginPage = 'User Not Found.'
//
//	if (UserNotFound_Error.equalsIgnoreCase(Error_OnLoginPage)) {
//		System.out.println('User not able to login with incorrect credentials')
//	}
	flag = 1
}finally {
	if(flag == 0) {
		WebUI.takeScreenshot()
	}
	CustomKeywords.'giroPie.user.closeBrowser'()
}

