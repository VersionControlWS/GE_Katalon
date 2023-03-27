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

// C:\Users\Lenovo UTH-UK\Downloads\WindowsFormsApp3\WindowsFormsApp3.exe
Windows.startApplication('C:\\Users\\Lenovo UTH-UK\\Downloads\\WindowsFormsApp3 (1).exe')

//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "19-Jan-2029")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "20-Feb-2030")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "22-Mar-2031")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "23-Apr-2031")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "24-May-2033")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "25-Jun-2034")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "26-Jul-2035")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "27-Aug-2036")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "28-Sep-2037")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "29-Oct-2038")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "30-Nov-2039")
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//Windows.delay(4)

CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "31-Dec-2040")
Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
Windows.delay(4)


Windows.closeApplication()















//input_date = "23-November-2029"
//Date_Format = input_date
//Compare_InputDate_Format=""
//secondOuptputisValidFormat = ""
//
//if(Date_Format.contains(":") | Date_Format.contains("_") | Date_Format.contains("-"))  {
//	Date_Format = Date_Format.replace(":", " ").replace("-", " ").replace("_", " ")
//	Compare_InputDate_Format = String.valueOf(Date_Format.replace(":", " ").replace("-", " ").replace("_", " ").toLowerCase().replace(" ",""))
//}
//
//boolean isValidFormat = Date_Format.matches("(0[1-9]|[12]\\d|3[01]) ([a-zA-Z_\\-\\.]+)\\ ([0-9]{4})");
////println(isValidFormat)
//try {
//	if (isValidFormat == true) {
//		//println(Date_Format.split(" "))
//		Date_Format = Date_Format.split(" ")
//
//		Date date = new SimpleDateFormat("MMMM", Locale.ENGLISH).parse(Date_Format[1]);
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date);
//		//println(cal.get(Calendar.MONTH)+1);
//
//
//		"First Trial to send date in Date-Box"
//		Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), 10, 10)
//		Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), input_date)
//
//		String textFromDateTab1 =  Windows.getText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'))
//		//println(textFromDateTab.replace(" ","").toLowerCase())
//		String_populated_in_DateBox = textFromDateTab1.replace(" ","").toLowerCase()
//		//println(String_populated_in_DateBox)
//		boolean firstOutputisValidFormat = String_populated_in_DateBox.matches(Compare_InputDate_Format)
//		//println(firstOutputisValidFormat)
//
//		"Second Trial to send date in Date-Box"
//		if (firstOutputisValidFormat == false) {
//			Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), 10, 10)
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), Date_Format[0])
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'),Keys.chord(Keys.SPACE))
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), String.valueOf(cal.get(Calendar.MONTH)+1))
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'),Keys.chord(Keys.SPACE))
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), Date_Format[2])
//			Windows.delay(1.5)
//			String textFromDateTab2 =  Windows.getText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'))
//			//println(textFromDateTab2.replace(" ","").toLowerCase())
//			Date_in_DateBox = textFromDateTab2.replace(" ","").toLowerCase()
//			boolean secondOuptputisValidFormat = String_populated_in_DateBox.matches(Date_in_DateBox)
//
//		}
//
//		"Third Trial to send date in Date-Box"
//		if (secondOuptputisValidFormat == false) {
//			Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), 10, 10)
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), Date_Format[0])
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'),Keys.chord(Keys.TAB))
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), String.valueOf(cal.get(Calendar.MONTH)+1))
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'),Keys.chord(Keys.TAB))
//			Windows.sendKeys(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), Date_Format[2])
//
//		}
//	}
//}catch (Exception  e) {
//	println("Enter a valid Date-Format")
//	this.println(e)
//}

