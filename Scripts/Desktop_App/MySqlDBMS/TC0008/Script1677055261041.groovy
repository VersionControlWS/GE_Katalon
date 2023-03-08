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
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions;
import com.kms.katalon.core.testobject.WindowsTestObject.LocatorStrategy;
import com.kms.katalon.core.testobject.WindowsTestObject
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.util.KeywordUtil

Windows.startApplication('C:/Users/Lenovo UTH-UK/Downloads/WindowsFormsApp3/WindowsFormsApp3.exe')

//try {

	driver = Windows.getDriver()

	CustomKeywords.'common.WinAppDriver.WindowsFunction.checkAppFormat'()
	CustomKeywords.'common.WinAppDriver.WindowsFunction.getCurrentActiveWindowTitle'()

	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Search Employee Record')

	//println(driver.findElement(By.xpath("//Window/*/Tree")).isDisplayed())
	println(driver.findElement(By.xpath("//Window/*/*/Tree")).isDisplayed())

//	String Xpath = CustomKeywords.'common.WinAppDriver.WindowsFunction.ifStatement'()
//	println(Xpath)	
//	if(driver.findElement(By.xpath("//Window/*/Tree")).isDisplayed()) {println("Yes1")}
//	else if(driver.findElement(By.xpath("//Window/*/*/Tree")).isDisplayed()){println("Yes2")}
//	else if(driver.findElement(By.xpath("//Window/*/*/*/Tree")).isDisplayed()){println("Yes3")}
//	else if(driver.findElement(By.xpath("//Window/*/*/*/*/Tree")).isDisplayed()){println("Yes4")}
//	else if(driver.findElement(By.xpath("//Window/Tree")).isDisplayed()){println("Yes5")}
//	else {println("No Tree")}
	
//	println(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_2'), 1, FailureHandling.CONTINUE_ON_FAILURE))
//	println(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_3'), 1, FailureHandling.CONTINUE_ON_FAILURE))
//	println(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_4'), 1, FailureHandling.CONTINUE_ON_FAILURE))
//	println(Windows.verifyElementPresent(findWindowsObject('Object Repository/DesktopApps/WinObj/Tree_5'), 1, FailureHandling.CONTINUE_ON_FAILURE))
//	}catch (Exception e) {
//		println("GGG")
//	}
	
	
	//Window/*/Tree
	//Window/*/*/Tree
	//Window/*/*/*/Tree
	//Window/*/*/*/*/Tree
	
	//String Xp = "//Window/*/*/Tree/TreeItem"
//	String XpLast = "//Window/*/Tree/TreeItem"
//	
////	element = driver.findElement(By.name("Node6"));
////	Actions act = new Actions(driver);
////	act.doubleClick(_Windows.findElement(By.name(Name))).build().perform();
////	
//	int rowCount = driver.findElements(By.xpath(Xp)).size();
//	println("Tree rowCount : "+rowCount)
//	
//
//	
////	JTree tree;
//	//for(int i=1;i<rowCount;++i){
//	//	tree.expandRow(i);
//	//}
//	
////	

//	List<WebElement> elements = driver.findElements(By.xpath(Xp));
//	count=1
//	for(WebElement element : elements){
//		//println(element.getAttribute("Name"))
//		//println(element.getAttribute("Value"))
//		WindowsTestObject cmb = new WindowsTestObject('')
//		cmb.setLocatorStrategy(LocatorStrategy.XPATH)
//		cmb.setLocator(Xp+"["+String.valueOf(count)+"]")
//		count=count+1
//		Windows.doubleClick(cmb)
//	}
//	println(driver.findElements(By.xpath("//Window/Tab[1]/Pane[1]/Tree[1]/TreeItem")).size());
//	println(driver.findElements(By.xpath("//Window/*/*/Tree/TreeItem/TreeItem")).size());
//	
//	
//	List<WebElement> elementss = driver.findElements(By.xpath("//Window/*/*/Tree/TreeItem/TreeItem"));
//	count=1
//	for(WebElement element1 : elementss){
//		WindowsTestObject cmb = new WindowsTestObject('')
//		cmb.setLocatorStrategy(LocatorStrategy.XPATH)
//		cmb.setLocator(Xp+"["+String.valueOf(count)+"]")
//		Windows.doubleClick(cmb)
//		//System.out.println("The "+count+" element at source is : "+element.getAttribute("ExpandCollapseState"));
//		count=count+1
//		println(count)
//		Thread.sleep(2000)
//	}
//
//	println(driver.findElements(By.xpath("//Window/*/*/Tree/TreeItem/TreeItem/TreeItem")).size());
//	
//	for (int i=0;i<10;i++) {
//		System.out.println(driver.findElement(By.xpath(Xp+"[3]")).getAttribute("FrameworkId"));		
//	}
	//int Qualification = driver.findElements(By.xpath("//Window/Tab[1]/Pane[1]/List[2]/CheckBox")).size();
	//int EmploymentType = driver.findElements(By.xpath("//Window/Tab[1]/Pane[1]/List[1]/ListItem")).size();

	//println("Qualification : "+Qualification)
	//println("EmploymentType : "+EmploymentType)
	
	
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
	//CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Search Employee Record')
//
//	Thread.sleep(3000)
	
//}finally {

	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Node0')
	Thread.sleep(3000)
	CustomKeywords.'common.WinAppDriver.WindowsFunction.findAndClickWindowsElementByName'('Node2')
	Windows.closeApplication()
//}
