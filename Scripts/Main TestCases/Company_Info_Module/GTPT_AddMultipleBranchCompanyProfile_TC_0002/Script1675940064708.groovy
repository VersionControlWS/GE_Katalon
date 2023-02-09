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




public static String generateSessionKey(int length){
	String alphabet =
			new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");

	int n = alphabet.length();

	String result = new String();
	Random r = new Random();

	for (int i=0; i<length; i++)
		result = result + alphabet.charAt(r.nextInt(n));

	return result;
}

flag=0
String Branch_Name = generateSessionKey(4)


CustomKeywords.'giroPie.user.LoginwithUsernamePwd'()

CustomKeywords.'giroPie.user.NavigatetoCompanyProfilePage'()

WebUI.click(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/p_Add Branch'))

WebUI.setText(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/input_Branches_branchName'), Branch_Name)

WebUI.click(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/input__gstin'))

WebUI.click(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/p_07AAGFF2194N1Z1'))

WebUI.setText(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/input__gstin'), '07AAGFF2194N1Z1')

WebUI.setText(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/input__email'), 'ajay@uth-uk.com')

WebUI.setText(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/input__contactName'), 'SH')

WebUI.setText(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/input__address'), 'Jayanagar')

WebUI.setText(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/input__pin_code'), '560064')

WebUI.click(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Company_Info_Add_Branch/Page_GIROPie/div_Branch Updated'), 'Branch Updated')

WebUI.closeBrowser()

