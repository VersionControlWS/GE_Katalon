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


public static String getRandomNumberString() {

	Random rnd = new Random();
	int number = rnd.nextInt(999999999);

	return String.format("%09d", number);
}

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
String Branch_Name = generateSessionKey(6)
//println(Branch_Name)
String Account_Number = getRandomNumberString()
//println(Account_Number)
String IFSC = 'YESB0000653'
String MICR = '560532002'
String accountHolderName = Branch_Name


CustomKeywords.'giroPie.user.LoginwithUsernamePwd'()

CustomKeywords.'giroPie.user.NavigatetoBankPage'()

try {

	CustomKeywords.'giroPie.user.EnterBankDetails'(Branch_Name, Account_Number, IFSC, MICR, accountHolderName)
	flag = 1

}finally {
	if(flag == 0) {
		WebUI.takeScreenshot()
	}
	CustomKeywords.'giroPie.user.closeBrowser'()
}
