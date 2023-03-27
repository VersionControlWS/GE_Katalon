import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.jgoodies.looks.windows.WindowsMenuBarUI as WindowsMenuBarUI
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
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement as Keys

import java.util.*;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebElement;
import com.kms.katalon.core.testobject.WindowsTestObject;
import com.kms.katalon.core.testobject.WindowsTestObject.LocatorStrategy;
import org.openqa.selenium.Keys 
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//public static void mainer(String[] args) {
//	FirefoxDriver driver = new FirefoxDriver();
//	driver.get("http://www.flipkart.com/");
//	List<WebElement> links = driver.findElements(By.tagName("a"));
//	for(int i = 0;i<links.size();i++){
//		System.out.println(links.get(i).getText());
//	}
//	System.out.println("Total number of links = " + links.size());
//}

Windows.startApplication('C:/Users/Lenovo UTH-UK/Downloads/WindowsFormsApp3/WindowsFormsApp3.exe')

//Windows.closeApplication()
//Windows.startApplicationWithTitle('C:/Users/Lenovo UTH-UK/Downloads/WindowsFormsApp3/WindowsFormsApp3.exe', '')
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Trial_TCs/Edit'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Trial_TCs/Button'))
//
//Windows.setText(findWindowsObject('Object Repository/DesktopApps/Trial_TCs/Pane'), 'austria')



Windows.click(findWindowsObject('Object Repository/DesktopApps/Trial_TCs/TabItem'))
Windows.delay(3)

//driver = Windows.getDriver()
//element = driver.findElement(By.xpath("//Window"))
//elementn = driver.findElement(By.xpath("//window"))
//String start="No Window"
//if(element.isDisplayed()) {
//	start = "//Window";
////}else if(elementn.isDisplayed()){
////	start = "//window";
////}
//print(start)

List<WebElement> allObj1 = Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/TreeItem')))
WebElement allObj = Windows.findElement(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/TreeItem')))
driver = Windows.getDriver()
//println(allObj)
for (WebElement all1 : allObj1) {
	
	
	
	println(all1.getAttribute("Name"))
	String Value = all1.getAttribute("Name")
	WindowsTestObject cmb = new WindowsTestObject('')
	cmb.setLocatorStrategy(LocatorStrategy.NAME)
	cmb.setLocator(Value)
	//Windows.doubleClick(cmb)
	all1.sendKeys(Keys.chord(Keys.RIGHT))
	all1.sendKeys(Keys.chord(Keys.PAGE_DOWN))
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,1000)","");
}

List<WebElement> allObj2 = Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/Node5')))
allObj.sendKeys(Keys.chord(Keys.HOME))

for (WebElement all2 : allObj2) {
	
	println(all2.getAttribute("Name"))
	String Value = all2.getAttribute("Name")
	WindowsTestObject cmb = new WindowsTestObject('')
	cmb.setLocatorStrategy(LocatorStrategy.NAME)
	cmb.setLocator(Value)
	//Windows.doubleClick(cmb)
	all2.sendKeys(Keys.chord(Keys.RIGHT))
	all2.sendKeys(Keys.chord(Keys.PAGE_DOWN))
}

List<WebElement> allObj3 = Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/Node8')))
allObj.sendKeys(Keys.chord(Keys.HOME))

for (WebElement all3 : allObj3) {
	
	println(all3.getAttribute("Name"))
	String Value = all3.getAttribute("Name")
	WindowsTestObject cmb = new WindowsTestObject('')
	cmb.setLocatorStrategy(LocatorStrategy.NAME)
	cmb.setLocator(Value)
	//Windows.doubleClick(cmb)
	all3.sendKeys(Keys.chord(Keys.RIGHT))
	all3.sendKeys(Keys.chord(Keys.PAGE_DOWN))
}

//Windows.click(findWindowsObject('Object Repository/DesktopApps/Trial_TCs/Tree'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Trial_TCs/Edit'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Trial_TCs/Button'))
//
//Windows.setText(findWindowsObject('Object Repository/DesktopApps/Trial_TCs/Edit'), 'Five')
//
////Windows.delay(3)
allObj.sendKeys(Keys.chord(Keys.HOME))

element = driver.findElement(By.name("Node17"))
element.click()
//do{
//	allObj.sendKeys(Keys.chord(Keys.PAGE_DOWN))
//}while(!element.isDisplayed());

//while (!element.isDisplayed()) { println(!element.isDisplayed()); allObj.sendKeys(Keys.chord(Keys.ARROW_DOWN)) }


//if(!element.isDisplayed()) {
//	allObj.sendKeys(Keys.chord(Keys.PAGE_DOWN))
//}else {
//	println("Element found")
//}

Windows.click(findWindowsObject('Object Repository/DesktopApps/Trial_TCs/Tree'))
Windows.closeApplication()

