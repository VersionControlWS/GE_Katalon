package common.WinAppDriver

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.WindowsTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.ui.SystemOutputInterceptor
import internal.GlobalVariable
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.interactions.Actions;

import com.kms.katalon.core.testobject.WindowsTestObject.LocatorStrategy;
import com.kms.katalon.core.util.KeywordUtil

class WindowsFunction{

	WebDriver _Windows;

	WindowsFunction() {
		this._Windows = Windows.getDriver()
	}

	void display(){
		System.out.println(_Windows.getTitle())
	}

	@Keyword
	String ifStatement(){

		//		String value1 = _Windows.findElement(By.xpath("//Window/Tree")).isDisplayed()
		//		String value2 = _Windows.findElement(By.xpath("//Window/*/Tree")).isDisplayed()
		String value3 = _Windows.findElement(By.xpath("//Window/*/*/Tree")).isDisplayed()
		//		String value4 = _Windows.findElement(By.xpath("//Window/*/*/*/Tree")).isDisplayed()
		//		String value5 = _Windows.findElement(By.xpath("//Window/*/*/*/*/Tree")).isDisplayed()
		//		println(value1)
		//		println(value2)
		println(value3)
		//		println(value3)
		//		println(value4)
	}

	@Keyword
	void checkAppFormat(){
		System.out.println("")
		System.out.println("###################################################################################################")
		System.out.println("###                                                                                          ######")
		System.out.println("###	There are several Desktop application format such as Universal Windows Platform (UWP), \n###	Windows Forms (WinForms), Windows Presentation Foundation (WPF), Classic Windows, Win32")
		System.out.println("###\n### 	This Desktop-App is of format : "+"                                                      ######")
		System.out.println("### 	"+_Windows.findElement(By.xpath("//Window")).getAttribute("FrameworkId")+"       		   	                          				####");
		System.out.println("###                                                                                          ######")
		System.out.println("###################################################################################################")
	}

	@Keyword
	void getCurrentActiveWindowTitle(){
		try {
			// Get attribute of current active element
			String attr = _Windows.switchTo().activeElement().getAttribute("title");
			System.out.println(attr);
		}catch (Exception e) {
			String attr = _Windows.switchTo().activeElement().getAttribute("Title");
			System.out.println(attr);
		}
	}


	@Keyword
	void findAndClickWindowsElementByName(Name){
		String xpath = generateXpath(Name)
		//println(xpath)
		try {
			WebElement ele = _Windows.findElement(By.xpath(xpath))
			ele.click()
		}catch(Exception e){
			WebElement ele = _Windows.findElement(By.name(Name))
			ele.click()
		}
	}

	@Keyword
	void findAndDoubleClickWindowsElementByName(Name){
		WebElement ele = _Windows.findElement(By.name(Name))
		Actions act = new Actions(_Windows);
		act.doubleClick(_Windows.findElement(By.name(Name))).build().perform();
	}

	@Keyword
	void DoubleClickWindowsElementByName(Value){
		WindowsTestObject cmb = new WindowsTestObject('')
		cmb.setLocatorStrategy(LocatorStrategy.NAME)
		cmb.setLocator(Value)
		Windows.doubleClick(cmb)
	}

	//public static TestObject getTestObjectFromWebElement(WebElement element) {
	//	TestObject object = new TestObject()
	//	object.addProperty("xpath", ConditionType.CONTAINS, _Windows.findElement(By.name(element))
	//	return object
	//}

	@Keyword
	void findAndClickWindowsElementByXpath(Xpath){
		WebElement ele = _Windows.findElement(By.xpath(Xpath))
		ele.click()
	}

	@Keyword
	public String checkboxisSelected(Xpath) {
		WebElement ele = _Windows.findElement(By.xpath(Xpath));
		System.out.println("The checkbox element at source is : "+ele.getAttribute("Value.Value"));
		String status = ele.getAttribute("Value.Value")
		return status.trim().toLowerCase();
	}

	@Keyword
	void selectCheckbox(Xpath) {
		/**
		 * Validate Checkbox isSelected method and click
		 */
		WebElement checkBoxElement = _Windows.findElement(By.xpath(Xpath));
		String isSelected = checkboxisSelected(Xpath);

		//performing click operation if element is not checked
		if(isSelected == "unchecked") {
			checkBoxElement.click();
		}
		else if (checkBoxElement.isSelected()) {
			KeywordUtil.logInfo(checkBoxElement.getAttribute("Name")+" element is checked.")
		}
		else {
			checkBoxElement.click();
			KeywordUtil.logInfo("Element was not checked. Now handled and checked")
		}

	}

	@Keyword
	void unSelectCheckbox(Xpath) {
		/**
		 * Validate Checkbox isUncheckedSelected method and click
		 */
		WebElement checkBoxElement = _Windows.findElement(By.xpath(Xpath));
		String isNotSelected = checkboxisSelected(Xpath);

		//performing click operation if element is not checked
		if(isNotSelected == "checked") {
			checkBoxElement.click();
		}
	}

	@Keyword
	void closeTab() {
		WebElement element = _Windows.findElement(By.name("File"))
		element.sendKeys(Keys.chord(Keys.CONTROL, 'w'))
		Thread.sleep(3000)

		//		Actions actions = new Actions(_Windows);
		//		actionskeyDown(Keys.CONTROL).actionskeyDown(Keys.SHIFT).sendKeys(Keys.F4).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
		//		actionskeyDown(Keys.CONTROL).actionskeyDown(Keys.SHIFT).sendKeys(Keys.F4).keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).build().perform();

		//		StringBuilder keys = new StringBuilder();
		//		keys.append(Keys.CONTROL);
		//		keys.append(Keys.SHIFT);
		//		element.sendKeys(Keys.chord(keys.toString()));
		//		element.sendKeys(Keys.chord(Keys.CONTROL, 'w'))

	}

	@Keyword
	void Navigate_to_Menu_Server_UserAndPrevilidges() {
		WebElement element = _Windows.findElement(By.name("Server"))
		element.sendKeys(Keys.chord(Keys.ALT, 's'))
		element.sendKeys( Keys.chord(Keys.DOWN))
		element.sendKeys( Keys.chord('u'))
	}

	@Keyword
	void findAndsendKeysWindowsElementByName(Name, value){
		WebElement ele = _Windows.findElement(By.name(Name))
		ele.sendKeys(value)
	}

	@Keyword
	void findAndsendKeysWindowsElementByXpath(Name, value){
		WebElement ele = _Windows.findElement(By.xpath(Name))
		ele.sendKeys(value)
	}


	public static String AutoGeneratedUsername(){

		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = false;
		//	String generatedString = RandomStringUtils.random(length, useLetters, useNumbers).toLowerCase();
		String name = RandomStringUtils.random(length, useLetters, useNumbers).toLowerCase();
		//  System.out.println(name);

		String firstLetter = name.substring(0, 1);
		String remainingLetters = name.substring(1, name.length());

		firstLetter = firstLetter.toUpperCase();
		name = firstLetter + remainingLetters;
		System.out.println("Auto-Generated Username: " + name);
		return name.trim();

	}

	@Keyword
	void findAndsendKeysWindowsElementByXpathLogin(Name){
		WebElement ele = _Windows.findElement(By.xpath(Name))
		String value = AutoGeneratedUsername()
		ele.sendKeys(value)
	}


	//https://www.guru99.com/select-option-dropdown-selenium-webdriver.html
	//https://stackoverflow.com/questions/34490341/how-to-select-a-combobox-value-with-selenium-webdriver-where-its-a-div-with-rol
	@Keyword
	void selectElementValueByXpath(Xpath, value) {
		_Windows.findElement(By.xpath(Xpath)).sendKeys(value);
		//WebElement testDropDown = _Windows.findElement(By.xpath(Xpath));
		//Select dropdown = new Select(testDropDown);
		//dropdown.selectByValue(value);
		//dropdown.selectByVisibleText("Standard");
	}

	@Keyword
	public TestObject convertWebElementToTestObjectByXpath(Xpath) {
		WebElement ele = _Windows.findElement(By.xpath(Name))
		TestObject obj = _Windows.convertWebElementToTestObject(ele)
		return obj
	}

	public TestObject createTestObject(String locator){
		TestObject updatedTestObject = new TestObject("Grid")
		updatedTestObject.addProperty("xpath", ConditionType.EQUALS, locator)
		return updatedTestObject
	}

	/**
	 * Construct a Katalon-compatible TestObject in memory.
	 * @param css (String) The CSS selector used to find the target element.
	 * @return (TestObject) The constructed TestObject.
	 */
	@Keyword
	static TestObject makeTO(String css) {
		TestObject testobj = new TestObject()
		//testobj.addProperty("css", ConditionType.EQUALS, css)
		return testobj
	}

	@Keyword
	public static String generateXpath(String name) {
		String Xpath;
		return Xpath =  "//*[@Name='"+name+"']"
	}

	@Keyword
	public String returnElementExistance() {
		if(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_2'),1)) { return "B"}
		else if(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_4'),1)) { return "D"}
		else if(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_5'),1)) { return "E"}
		else if(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_3'),1)) { return "C"}
		else if(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_1'),1)) { return "A"}
		else {return null}
	}

}

class WinInstance{

	@Keyword
	public void toGenerateADriverInstance() {
		WindowsFunction s = new WindowsFunction();
		s.display();
	}
}