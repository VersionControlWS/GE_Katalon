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
Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/Search Employee Record'))

//CustomKeywords.'common.WinAppDriver.WindowsFunction.selectDateFromCalender'('Object Repository/DesktopApps/UTH_InHouseApp/DatePicker/monthCalendar', "19 March 2023" , "")
Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Menu/File_MenuItem'))

Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Menu/New_MenuItem'))

//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Menu/Project_MenuItem'))


Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Text'))

//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Button'))
//
//Windows.click(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Button(1)'))

Windows.setText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Edit'), 'one')

Windows.setText(findWindowsObject('Object Repository/DesktopApps/UTH_InHouseApp/Trail/Edit(1)'), '20')

Windows.delay(2)

Windows.closeApplication()


