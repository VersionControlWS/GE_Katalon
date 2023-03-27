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

//Windows.startApplication('C:/Users/Lenovo UTH-UK/Downloads/WindowsFormsApp3/WindowsFormsApp3.exe')
Windows.startApplication('C:/Users/Lenovo UTH-UK/Downloads/putty.exe')
//Windows.click(findWindowsObject('Object Repository/DesktopApps/Trial_TCs/TabItem'))
//Windows.delay(3)

List<WebElement> allObjectsInATree = new ArrayList<WebElement>();

if(Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/TreeItem_Name'))).size() > 0) {
		
	allObjectsInATree = Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/TreeItem_Name')))
	println("By Name :")
	println(allObjectsInATree.size())
	
}else if(Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/TreeItem_ClassName'))).size() > 0) {
		
	allObjectsInATree = Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/TreeItem_ClassName')))
	println("By Class-Name :")
	println(allObjectsInATree.size())
	
}else if(Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/TreeItem_TagName'))).size() > 0) {
		
	allObjectsInATree = Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/TreeItem_TagName')))
	println("By TagName :")
	println(allObjectsInATree.size())
	
}else if(Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/TreeItem_ID'))).size() > 0) {
		
	allObjectsInATree = Windows.findElements(findWindowsObject(('Object Repository/DesktopApps/Trial_TCs/TreeItem_ID')))
	println("By ID :")
	println(allObjectsInATree.size())
}



for (WebElement all1 : allObjectsInATree) {
	println(all1.getAttribute("Name"))
	if((all1.getAttribute("Name"))== "SSH") {
		count=0
		while (!all1.isDisplayed()) {all1.sendKeys(Keys.chord(Keys.PAGE_DOWN)); count=count+1; if(count>10) {break;} }
		String Value = all1.getAttribute("Name")
		WindowsTestObject cmb = new WindowsTestObject('')
		cmb.setLocatorStrategy(LocatorStrategy.NAME)
		cmb.setLocator(Value)
		Windows.doubleClick(cmb)
	}else {
		println(String.valueOf("SSH")+" does not exist in the tree")
	}
}

Windows.delay(3)
Windows.closeApplication()