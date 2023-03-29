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

import java.text.SimpleDateFormat

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


	@Keyword
	public void datePicker(tstObject, input_date) {

		String Date_Format = input_date
		String Compare_InputDate_Format=""
		String secondOuptputisValidFormat = ""

		if(Date_Format.contains(":") | Date_Format.contains("_") | Date_Format.contains("-"))  {
			Date_Format = Date_Format.replace(":", " ").replace("-", " ").replace("_", " ")
			Compare_InputDate_Format = String.valueOf(Date_Format.replace(":", " ").replace("-", " ").replace("_", " ").toLowerCase().replace(" ",""))
		}

		boolean isValidFormat = Date_Format.matches("(0[1-9]|[12]\\d|3[01]) ([a-zA-Z_\\-\\.]+)\\ ([0-9]{4})");
		//println(isValidFormat)
		try {
			if (isValidFormat == true) {

				String[] strArray = null;
				//println(Date_Format.split(" "))
				strArray = Date_Format.split(" ")
				Date date = new SimpleDateFormat("MMMM", Locale.ENGLISH).parse(String.valueOf(strArray[1]));
				Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				//println(cal.get(Calendar.MONTH)+1);

				"First Trial to send date in Date-Box"
				Windows.clickElementOffset(findWindowsObject(tstObject), 10, 10)
				Windows.sendKeys(findWindowsObject(tstObject), input_date)

				String textFromDateTab1 =  Windows.getText(findWindowsObject(tstObject))
				//println(textFromDateTab1.replace(" ","").toLowerCase())
				String String_populated_in_DateBox = textFromDateTab1.replace(" ","").toLowerCase()
				//println(String_populated_in_DateBox)
				boolean firstOutputisValidFormat = String_populated_in_DateBox.matches(Compare_InputDate_Format)
				//println(firstOutputisValidFormat)

				"Second Trial to send date in Date-Box"
				if (firstOutputisValidFormat == false) {
					Windows.clickElementOffset(findWindowsObject(tstObject), 10, 10)
					Windows.sendKeys(findWindowsObject(tstObject), strArray[0])
					Windows.sendKeys(findWindowsObject(tstObject),Keys.chord(Keys.SPACE))
					Windows.sendKeys(findWindowsObject(tstObject), String.valueOf(cal.get(Calendar.MONTH)+1))
					Windows.sendKeys(findWindowsObject(tstObject),Keys.chord(Keys.SPACE))
					Windows.sendKeys(findWindowsObject(tstObject), strArray[2])
					Windows.delay(1.5)
					String textFromDateTab2 =  Windows.getText(findWindowsObject(tstObject))
					//println(textFromDateTab2.replace(" ","").toLowerCase())
					String  Date_in_DateBox = textFromDateTab2.replace(" ","").toLowerCase()
					secondOuptputisValidFormat = String_populated_in_DateBox.matches(Date_in_DateBox)

				}

				"Third Trial to send date in Date-Box"
				if (secondOuptputisValidFormat == false) {
					Windows.clickElementOffset(findWindowsObject(tstObject), 10, 10)
					Windows.sendKeys(findWindowsObject(tstObject), strArray[0])
					Windows.sendKeys(findWindowsObject(tstObject),Keys.chord(Keys.TAB))
					Windows.sendKeys(findWindowsObject(tstObject), String.valueOf(cal.get(Calendar.MONTH)+1))
					Windows.sendKeys(findWindowsObject(tstObject),Keys.chord(Keys.TAB))
					Windows.sendKeys(findWindowsObject(tstObject), strArray[2])
				}
			}
		}catch (Exception  e) {
			println("Enter a valid Date-Format")
			this.println(e)
		}

	}

	@Keyword
	public void selectDateFromCalender(tstObject, given_date, attrib) {

		'Maximize Window'
		//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/Button_Maximize'))

		//Windows.clickElementOffset(findWindowsObject(tstObject), 15, 25)
		//Windows.clickElementOffset(findWindowsObject(tstObject), 140, 25)
		//Windows.clickElementOffset(findWindowsObject(tstObject), 270, 25)
		Windows.clickElementOffset(findWindowsObject(tstObject), 150, 185)

		def attributeValue = ""
		def classValue = ""
		def nameValue = ""
		def idValue = ""
		def xpathValue = ""

		try {
			attributeValue = Windows.getAttribute(findWindowsObject(tstObject), 'AutomationId')
			classValue = Windows.getAttribute(findWindowsObject(tstObject), 'class')
			nameValue = Windows.getAttribute(findWindowsObject(tstObject), 'name')
			idValue = Windows.getAttribute(findWindowsObject(tstObject), 'id')
			xpathValue = Windows.getAttribute(findWindowsObject(tstObject), attrib)

			//println(attributeValue)
			//println(classValue)
			//println(nameValue)
			//println(idValue)
			//println(xpathValue)
		}catch (Exception  e) {
			println("There is no locators with basic values")
			this.println(e)
		}
		int set_Val = 0
		WebElement ele;
		if (attributeValue != null && set_Val == 0) {
			ele = _Windows.findElement(By.xpath("//*[@AutomationId='"+attributeValue+"']"));
			//System.out.println("The current date is : "+ele.getAttribute("Value.Value"));
			set_Val = 1
		}
		if (classValue != null && set_Val == 0) {
			ele = _Windows.findElement(By.xpath("//*[@class='"+classValue+"']"));
			//System.out.println("The current date is : "+ele.getAttribute("Value.Value"));
			set_Val = 1
		}
		if (nameValue != null && set_Val == 0) {
			ele = _Windows.findElement(By.xpath("//*[@name='"+nameValue+"']"));
			//System.out.println("The current date is : "+ele.getAttribute("Value.Value"));
			set_Val = 1
		}
		if (idValue != null && set_Val == 0) {
			ele = _Windows.findElement(By.xpath("//*[@id='"+idValue+"']"));
			//System.out.println("The current date is : "+ele.getAttribute("Value.Value"));
			set_Val = 1
		}
		if (xpathValue != null && set_Val == 0) {
			ele = _Windows.findElement(By.xpath("//*[@"+attrib+"='"+attributeValue+"']"));
			//System.out.println("The current date is : "+ele.getAttribute("Value.Value"));
			set_Val = 1
		}

		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
		Date date = new Date();
		//System.out.println(formatter.format(date));
		//Date current_date = formatter.format(date)
		//given_date = "01 March 2023"

		if(formatter.parse(formatter.format(date)).after(formatter.parse(given_date)))
		{
			//System.out.println(String.valueOf(current_date)+" is greater than "+String.valueOf(given_date));
			while( String.valueOf(ele.getAttribute("Value.Value")) != String.valueOf(given_date) ) {
				Windows.sendKeys(findWindowsObject(tstObject),Keys.chord(Keys.ARROW_LEFT))
			}
		}else{
			//System.out.println(String.valueOf(current_date)+" is lesser than "+String.valueOf(given_date));
			while( String.valueOf(ele.getAttribute("Value.Value")) != String.valueOf(given_date) ) {
				Windows.sendKeys(findWindowsObject(tstObject),Keys.chord(Keys.ARROW_RIGHT))
			}
		}
	}

	@Keyword
	public void valuePresentInDataGrid(tstObject, strValue, updatedString) {
		String rownumber = Windows.getAttribute(findWindowsObject(tstObject), "Grid.RowCount")

		String rowNo;
		boolean FlagFoundA = false
		//strValue = "EmpName1"

		WindowsTestObject dataGridObject = new WindowsTestObject('')
		WindowsTestObject EmpdataGridObject = new WindowsTestObject('')

		for(int i = 1;i < rownumber ;i++){

			if (strValue != "" && strValue != " " && strValue != null) {

				dataGridObject.setLocatorStrategy(LocatorStrategy.NAME)
				EmpdataGridObject.setLocatorStrategy(LocatorStrategy.NAME)
				String value = "Row " + (i-1)
				String Empvalue = "EmpName Row " + (i-1)
				dataGridObject.setLocator(value)
				EmpdataGridObject.setLocator(Empvalue)
				String strRowValues = Windows.getAttribute(dataGridObject, "LegacyValue")
				println(strRowValues)
				println(strValue)
				if (strRowValues.contains(strValue)){
					println('A')
					rowNo = i
					FlagFoundA = true
					break
				}
			}else {
				FlagFoundA = false
			}
		}

		if (FlagFoundA == true ){
			System.out.println(strValue + " is present in row " + rowNo)
			Windows.click(EmpdataGridObject)
			Windows.sendKeys(EmpdataGridObject, updatedString)
			Windows.comment(strValue + " is present in row " + rowNo)
		}else{
			System.out.println(strValue + " is not present in the table")
			Windows.comment(strValue + " is not present in the table")
		}
	}

	@Keyword
	public void slideElementOffset(testObject, offset) {

		WindowsTestObject slider_locator_testObject= findWindowsObject(testObject)
		WindowsTestObject.LocatorStrategy slider_locator_selectedLocator = slider_locator_testObject.getLocatorStrategy();
		String slider_locator = slider_locator_testObject.getLocator();
		//print(slider_locator)

		_Windows = Windows.getDriver()
		Actions action = new Actions(_Windows);
		WebElement horizontal_scroll = _Windows.findElement(By.name(slider_locator));
		action.clickAndHold(horizontal_scroll).moveByOffset(offset, 0).release().perform();
	}

	@Keyword
	public void scrollClickAndHold(testObject, timeOut){

		WindowsTestObject scroll_testObject= findWindowsObject(testObject)
		WindowsTestObject.LocatorStrategy selectedLocator = scroll_testObject.getLocatorStrategy();
		String locator = scroll_testObject.getLocator();
		//print(locator)

		_Windows = Windows.getDriver()
		Actions action = new Actions(_Windows);
		WebElement scroll = _Windows.findElement(By.name(locator));
		action.clickAndHold(scroll).build().perform()
		Windows.delay(timeOut)
		action.release()
	}
}

class WinInstance{

	@Keyword
	public void toGenerateADriverInstance() {
		WindowsFunction s = new WindowsFunction();
		s.display();
	}
}