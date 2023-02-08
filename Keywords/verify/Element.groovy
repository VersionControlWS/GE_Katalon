package verify
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

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

import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import org.openqa.selenium.Keys as Keys


class Element {
	@Keyword
	def stringElementPresent (TestObject to,String Heading) {
		try {
			String element = WebUiBuiltInKeywords.findWebElement(to).getAttribute('textContent');
			element.trim()
			if(element.equalsIgnoreCase(Heading)) {
				System.out.println('')
				System.out.println(element +" Element is same as the expected heading " +Heading)
				System.out.println('')
			}else {
				System.out.println('')
				System.out.println(element +" Element is not same  as the expected heading " +Heading)
				System.out.println('')
			}
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to verify an element")
		}
	}
	// @Keyword
	// def stringToastElementPresent (TestObject to) {
	// try {
	// WebElement  element = WebUiBuiltInKeywords.findWebElement(to).getAttribute('textContent');
	// if(element.isDisplayed()) {
	// System.out.println('')
	// System.out.println(element + " is displayed")
	// System.out.println('')
	// }else (!element.isDisplayed()) {
	// System.out.println('')
	// System.out.println(element + " is not displayed")
	// System.out.println('')
	// }
	// }catch (Exception e) {
	// KeywordUtil.markFailed('ERROR: Toast object not found!')
	// }
	// }
	@Keyword
	def toastElement (TestObject to) {
		WebElement toast;
		toast = WebUiBuiltInKeywords.findWebElement(to)
		// if (toast == null) {
		if(!toast.isDisplayed()){
			System.out.println('')
			System.out.println('ERROR: object not found!')
			KeywordUtil.markPassed('ERROR: Toast object not found!')
			System.out.println('')
		}else if(toast.isDisplayed()){
			System.out.println('')
			System.out.println('Toast object found')
			KeywordUtil.markPassed("Toast object found")
			System.out.println('')
		}
	}
	@Keyword
	def elementPresent(TestObject to) {
		WebElement element;
		element = WebUiBuiltInKeywords.findWebElement(to)
		// if (element == null) {
		if(!element.isDisplayed()){
			System.out.println('')
			System.out.println('ERROR: object not found!')
			KeywordUtil.markPassed('ERROR: object not found!')
			System.out.println('')
		}else if(element.isDisplayed()){
			System.out.println('')
			System.out.println('object found')
			KeywordUtil.markPassed("object found")
			System.out.println('')
		}
	}
}