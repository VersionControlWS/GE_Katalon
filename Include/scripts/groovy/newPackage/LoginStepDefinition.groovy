package newPackage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.testobject.TestObject
import javax.swing.JOptionPane;
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   

class LoginStepDefinition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("to launch the browser with (.*)")
	def to_launch_the_browser_with(String url) {
		//		println url
		WebUI.openBrowser('')
		WebUI.navigateToUrl(url)
		WebUI.maximizeWindow()
	}

	@When("I enter the user details such as (.*) (.*) in given textField")
	def I_enter_the_user_details_such_as(String username, String password) {
		//		println value
		String user_obj = 'Object Repository/Page_NachPay/inputLoginPage_Username'
		String pass_obj = 'Object Repository/Page_NachPay/inputLoginPage_Password'
		String submit_btn_obj = 'Object Repository/Page_NachPay/button_ContinueLoginPage'
		WebUI.setText(findTestObject(user_obj), username)
		WebUI.setText(findTestObject(pass_obj),password)
		WebUI.click(findTestObject(submit_btn_obj))
	}

	@When("phone number is entered as (.*) in given textField")
	def phone_number_is_entered_in_textField(String phoneNumber) {
//		println phoneNumber
		String phoneNumber_obj = 'Object Repository/Page_NachPay/inputLoginPage_Username'
		String submit_btn_obj = 'Object Repository/Page_NachPay/button_LoginPage_GetOTP'
		WebUI.setText(findTestObject(phoneNumber_obj), phoneNumber)
		WebUI.click(findTestObject(submit_btn_obj))
	}

	public static takeScrnShotAndStoreInReportsDirectory(String status){
		String dirName = RunConfiguration.getProjectDir()
		//println(dirName)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		String DateTime = dtf.format(now)
		//println(dirName+"/Reports/BDD_LoginScnKeyword"+status+"_"+DateTime)
		String path = dirName+"/Reports/BDD_LoginScnKeyword_"+status+"_"+DateTime+".png"
		WebUI.takeScreenshot(path)
	}
	
	@Then("I verify the (.*) in step")
	def I_verify_the_status_in_step(String status) {
//		println status
		WebUI.waitForElementVisible(findTestObject("Object Repository/LoginPage_TextNError/"+status), 5)
		takeScrnShotAndStoreInReportsDirectory(status)
		//		WebUI.verifyElementText(findTestObject("Object Repository/LoginPage_TextNError/"+status), status)
		println("This is what is expected")
		println(WebUI.getText(findTestObject("Object Repository/LoginPage_TextNError/"+status)))
		println("")
		WebUI.verifyElementText(findTestObject("Object Repository/LoginPage_TextNError/"+status), status)
		println("")
		//		JOptionPane.showMessageDialog(null, status, "Verifying the text on this page", JOptionPane.INFORMATION_MESSAGE);
		//		WebUI.delay(5)
		WebUI.closeBrowser()
	}

	public static String capitalizeWord(String str){
		String[] words=str.split("\\s");
		String capitalizeWord="";
		for(String w:words){
			String first=w.substring(0,1);
			String afterfirst=w.substring(1);
			capitalizeWord+=first.toUpperCase()+afterfirst+" ";
		}
		return capitalizeWord.trim();
	}

	@Then("error (.*) is verified in this step")
	def error_is_verfifed_in_this_step(String status) {
		println status
		String withFullStop = status+"."
		String withFullStopNew = capitalizeWord(withFullStop)
		//		println ("withFullStop : "+withFullStop)
		//		println ("withFullStopNew : "+withFullStopNew)
		WebUI.waitForElementVisible(findTestObject("Object Repository/LoginPage_TextNError/"+status), 5)
		takeScrnShotAndStoreInReportsDirectory(status)
		println("This is what is expected")
		println(WebUI.getText(findTestObject("Object Repository/LoginPage_TextNError/"+status)))
		println("")
		WebUI.verifyElementText(findTestObject("Object Repository/LoginPage_TextNError/"+status), withFullStopNew)
		println("")
		//		JOptionPane.showMessageDialog(null, status, "Verifying the text on this page", JOptionPane.INFORMATION_MESSAGE);
		//		WebUI.delay(5)
		WebUI.closeBrowser()
	}
}