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

import java.text.SimpleDateFormat
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.time.format.DateTimeFormatter  
import java.time.LocalDate
import java.time.*;
import com.kms.katalon.core.testobject.*; 

try {
	// C:\Users\Lenovo UTH-UK\Downloads\WindowsFormsApp3\WindowsFormsApp3.exe
	Windows.startApplication('C:\\Users\\Lenovo UTH-UK\\Downloads\\WindowsFormsApp3 (1).exe')

	CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "31-Dec-2040")
	Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)

	Windows.delay(3)

	Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/Search Employee Record'))

	CustomKeywords.'common.WinAppDriver.WindowsFunction.selectDateFromCalender'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar', "01 March 2023" , "")
	
	Windows.delay(1)
	Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/TabItem_tabPage3'))
	
	Windows.delay(1)
	Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/TabItem_tabPage4'))
	
}finally {
	Windows.delay(1)
//	Windows.closeApplication()
}



































//'Maximize Window'
////Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/Button_Maximize'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/Search Employee Record'))
////Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar'), 15, 25)
////Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar'), 140, 25)
////Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar'), 270, 25)
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar'), 150, 185)
//_Windows = Windows.getDriver()
//
//
//def attributeValue = Windows.getAttribute(findWindowsObject("Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar"), 'AutomationId')
//def classValue = Windows.getAttribute(findWindowsObject("Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar"), 'class')
//def nameValue = Windows.getAttribute(findWindowsObject("Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar"), 'name')
//def idValue = Windows.getAttribute(findWindowsObject("Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar"), 'id')
////def xpathValue = Windows.getAttribute(findWindowsObject("Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar"), 'xpath')
//
////println(attributeValue)
////println(classValue)
////println(nameValue)
////println(idValue)
////println(xpathValue)
//set_Val = 0
//WebElement ele;
//if (attributeValue != null && set_Val == 0) {
//	ele = _Windows.findElement(By.xpath("//*[@AutomationId='"+attributeValue+"']"));
//	//System.out.println("The current date is : "+ele.getAttribute("Value.Value"));
//}  
//if (classValue != null && set_Val == 0) {
//	ele = _Windows.findElement(By.xpath("//*[@class='"+classValue+"']"));
//	//System.out.println("The current date is : "+ele.getAttribute("Value.Value"));
//}
//if (nameValue != null && set_Val == 0) {
//	ele = _Windows.findElement(By.xpath("//*[@name='"+nameValue+"']"));
//	//System.out.println("The current date is : "+ele.getAttribute("Value.Value"));
//}
//if (idValue != null && set_Val == 0) {
//	ele = _Windows.findElement(By.xpath("//*[@id='"+idValue+"']"));
//	//System.out.println("The current date is : "+ele.getAttribute("Value.Value"));
//}
////if (xpathValue != null && set_Val == 0) {
////	ele = _Windows.findElement(By.xpath("//*[@AutomationId='"+attributeValue+"']"));
////	//System.out.println("The current date is : "+ele.getAttribute("Value.Value"));
////}
//
//SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
//Date date = new Date();
////System.out.println(formatter.format(date)); 
//current_date = formatter.format(date)
////given_date = "01 March 2023"
//
//if(formatter.parse(formatter.format(date)).after(formatter.parse(given_date)))
//	{
//		//System.out.println(String.valueOf(current_date)+" is greater than "+String.valueOf(given_date));
//		while( String.valueOf(ele.getAttribute("Value.Value")) != String.valueOf(given_date) ) {
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar'),Keys.chord(Keys.ARROW_LEFT))
//		}
//	}else{
//		//System.out.println(String.valueOf(current_date)+" is lesser than "+String.valueOf(given_date));
//		while( String.valueOf(ele.getAttribute("Value.Value")) != String.valueOf(given_date) ) {
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar'),Keys.chord(Keys.ARROW_RIGHT))
//		}
//	}

Windows.delay(1)
Windows.closeApplication()
