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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.testobject.WindowsTestObject.LocatorStrategy;
import com.kms.katalon.core.testobject.WindowsTestObject
import org.openqa.selenium.interactions.Actions



Windows.startApplication('C:\\Users\\Lenovo UTH-UK\\Downloads\\WindowsFormsApp3 (1).exe')

//'Maximize Window'
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/Button_Maximize'))
//
//Windows.setText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/UTH_Recorded/EmpName'), 'EmpName1')
//
//Windows.setText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/UTH_Recorded/EmpID'), 'EmpID')
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/UTH_Recorded/RadioButton'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/UTH_Recorded/Qualification_CheckBox'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/UTH_Recorded/EmpType_CheckBoxList'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/UTH_Recorded/EmpType_CheckBoxList_ChkBox'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/UTH_Recorded/RptMngr_ListItem'))
//
//CustomKeywords.'common.WinAppDriver.WindowsFunction.datePicker'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane', "31-Dec-2040")
//
//Windows.clickElementOffset(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/DatePicker_Pane'), -60, -60)
//
//Windows.setText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/UTH_Recorded/WorkLocation_Edit'), 'India')
//
//Windows.setText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/UTH_Recorded/Document'), 'Launched an innovative virtual reality ideas for new billboards, increasing sales by 40% over a 6-month period')

//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/Search Employee Record'))

//CustomKeywords.'common.WinAppDriver.WindowsFunction.selectDateFromCalender'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar', "19 March 2023" , "")
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Menu/File_MenuItem'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Menu/New_MenuItem'))

//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Menu/Project_MenuItem'))

//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Text'))

//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Button'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Button(1)'))

//Windows.setText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Edit'), 'one')
//
//Windows.setText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Edit(1)'), '20')

//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/AddEmployeeRecord_Button'))

//driver = Windows.getDriver()
//
//println(Windows.getText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/DataGrid_Table')))

//String cmb = 'Object Repository/DesktopApps/UTH_InHouseApp/Trail/DataGrid_Table'
//WebElement element = driver.findElement(By.name("DataGridView"));
//String elementText = element.getText();
//System.out.println(elementText);


//System.out.println(Windows.getAttribute(findWindowsObject(cmb), "Grid.ColumnCount"))
//System.out.println(Windows.getAttribute(findWindowsObject(cmb), "Grid.RowCount"))

//String RowCountTemp = "RowCount:" + Windows.getAttribute(findWindowsObject(cmb), "Grid.RowCount")
//String [] RowCountTemps = RowCountTemp.split(":")
//
//System.out.println(RowCountTemps[RowCountTemps.length-1])
//int rown = RowCountTemps[RowCountTemps.length-1].trim().toInteger()
//System.out.println("rown " + rown)

//CustomKeywords.'common.WinAppDriver.WindowsFunction.valuePresentInDataGrid'(cmb, "EmpName1", "Test")

//rownumber = Windows.getAttribute(findWindowsObject(cmb), "Grid.RowCount")
////System.out.println(rownumber)
//
//rowNo=""
//FlagFoundA=false
//strValue = "EmpName1"
//WindowsTestObject dataGridObject = new WindowsTestObject('')
//WindowsTestObject EmpdataGridObject = new WindowsTestObject('')
//
//for(int i = 1;i < rownumber ;i++){
//
//	if (strValue != "" && strValue != " " && strValue != null) {
//		//System.out.println( "Row" + i)
//		
//		dataGridObject.setLocatorStrategy(LocatorStrategy.NAME)
//		EmpdataGridObject.setLocatorStrategy(LocatorStrategy.NAME)
//		String value = "Row " + (i-1)
//		String Empvalue = "EmpName Row " + (i-1)
//		dataGridObject.setLocator(value)
//		EmpdataGridObject.setLocator(Empvalue)
//		//Windows.clickElementOffset(dataGridObject, 60, 15)
//		//Windows.clickElementOffset(dataGridObject, 60, 15)
//		//Windows.sendKeys(dataGridObject,Keys.chord(Keys.DELETE))
//		//System.out.println("Row Value : " + i +Windows.getAttribute(dataGridObject, "LegacyValue"))
//		String strRowValues = Windows.getAttribute(dataGridObject, "LegacyValue")
//		if (strRowValues.contains(strValue)){
//			/*System.out.println(strValue + " is present in row " + i)
//			 * Windows.comment(strValue + " is present in row " + i)*/
//			rowNo = i
//			FlagFoundA = true
//			break
//		}
//	}else {
//		FlagFoundA = false
//	}
//}
//
//if (FlagFoundA == true ){
//	System.out.println(strValue + " is present in row " + rowNo)
//	Windows.doubleClick(EmpdataGridObject)
//	Windows.sendKeys(EmpdataGridObject, "Test")
//	Windows.comment(strValue + " is present in row " + rowNo)
//}else{
//	System.out.println(strValue + " is not present in the table")
//	Windows.comment(strValue + " is not present in the table")
//}

//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/HyperLink_UTHUK'))

Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/Search Employee Record'))
Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/Search Employee Record'))

//V1incr = 0
//while( V1incr != 2 ) {
//	Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/V2_Button'))
//	V1incr++
//}

_driver = Windows.getDriver()
//slider = "//*[@AutomationId='trackBar1']"
new_pos = 75

//import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper;
//
//WebDriver driver = Windows.getDriver()
//Actions builder = new Actions(driver)
//WebElement sourceElement = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/V2_Button'), 20)
//builder.clickAndHold(sourceElement)
//Windows.delay(5)
//builder.release()

import com.kms.katalon.core.testobject.WindowsTestObject;
import org.openqa.selenium.By as By
import org.openqa.selenium.interactions.Actions as Actions

//WindowsTestObject testObject= findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/V2_Button')
//WindowsTestObject.LocatorStrategy selectedLocator = testObject.getLocatorStrategy();
//String v_locator = testObject.getLocator();
//print(v_locator)
//
//
//Actions v_act = new Actions(_driver);
//WebElement v_scroll = _driver.findElement(By.name(v_locator));
//v_act.clickAndHold(v_scroll).build().perform()
//Windows.delay(4)
//v_act.release()

CustomKeywords.'common.WinAppDriver.WindowsFunction.scrollClickAndHold'('Object Repository/DesktopApps/UTH_InHouseApp/Trail/V2_Button', 4)

Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/HScrollPageButton'))
Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/HScrollPageButton'))

CustomKeywords.'common.WinAppDriver.WindowsFunction.scrollClickAndHold'('Object Repository/DesktopApps/UTH_InHouseApp/Trail/HScrollPageButton', 4)

//WindowsTestObject htestObject= findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/HScrollPageButton')
//WindowsTestObject.LocatorStrategy hselectedLocator = htestObject.getLocatorStrategy();
//String h_locator = htestObject.getLocator();
//print(h_locator)
//
//
//Actions h_act = new Actions(_driver);
//WebElement h_scroll = _driver.findElement(By.name(h_locator));
//h_act.clickAndHold(h_scroll).build().perform()
//Windows.delay(4)
//h_act.release()

Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/tabPage3_TabItem'))
Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/tabPage3_TabItem'))
Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/tabPage3_TabItem'))

//Actions slide = new Actions(_driver)
//slide.dragAndDropBy(slider, new_pos, 0).build().perform()
//

//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/HScrollPageButton'))

CustomKeywords.'common.WinAppDriver.WindowsFunction.slideElementOffset'('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Thumb', 40)

//
//WindowsTestObject slider_locator_testObject= findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Thumb')
//WindowsTestObject.LocatorStrategy slider_locator_selectedLocator = slider_locator_testObject.getLocatorStrategy();
//String slider_locator = slider_locator_testObject.getLocator();
//print(slider_locator)
//
//Actions action = new Actions(_driver);
//WebElement horizontal_scroll = _driver.findElement(By.name(slider_locator));
//action.clickAndHold(horizontal_scroll).moveByOffset(30, 0).release().perform();

//while( incr != 4 ) {
//	Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/V2_Button'))
//	incr = incr + 1
//}

Windows.delay(2)

Windows.closeApplication()


