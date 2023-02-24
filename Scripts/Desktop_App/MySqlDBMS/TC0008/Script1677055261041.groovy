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
import org.openqa.selenium.By as By
import java.util.List

Windows.startApplication('C:/Users/Lenovo UTH-UK/Downloads/WindowsFormsApp3/WindowsFormsApp3.exe')

try {
	
	driver = Windows.getDriver()
	//int Qualification = driver.findElements(By.xpath("//Window/Tab[1]/Pane[1]/List[2]/CheckBox")).size();
	//int EmploymentType = driver.findElements(By.xpath("//Window/Tab[1]/Pane[1]/List[1]/ListItem")).size();

	//println("Qualification : "+Qualification)
	//println("EmploymentType : "+EmploymentType)
	
	List<WebElement> elements = driver.findElements(By.xpath("//Window/Tab[1]/Pane[1]/List[2]/CheckBox"));
	System.out.println("Number of elements:" +elements.size());

	for (int i=0; i<elements.size();i++){
	  System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	}
	
	
//	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Window/Tab[1]/Pane[1]/Edit[2]','Emp1')
//	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Window/Tab[1]/Pane[1]/Edit[1]','12345')
//	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Male')
//
//	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Graduate')
//	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndDoubleClickWindowsElementByName'('Casual')
//	//CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Casual')
//	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Sachin')
//
//	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Window/Tab[1]/Pane[1]/Pane[1]', '24 Febrauary 2023')
//	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Window/Tab[1]/Pane[1]/ComboBox[1]/Edit[1]', 'India')
//	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndsendKeysWindowsElementByXpath'('//Window/Tab[1]/Pane[1]/Document[1]', 'Accomplished QA tester with 4+ years of experience. Skilled in manual and automated testing and creating test plans. Seeking to exceed Amazon’s high standard for Android-based testing. Created 200+ test plans and helped increase testing efficiency by 31%.')
//
//	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Search Employee Record')
//
//	Thread.sleep(3000)
}finally {

	Windows.closeApplication()
}
