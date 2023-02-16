package src.test.java.testClassPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords;
import com.thoughtworks.selenium.webdriven.Windows;

import src.test.java.testClassPackage.desktopFunction;

public class TestClass {
	
	WindowsBuiltinKeywords Windows;
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void SetUp() {
		System.out.println("Before");
		Windows.startApplication("C:/Program Files/MySQL/MySQL Workbench 8.0/MySQLWorkbench.exe");
	}

	@Test
	public void testcase1() {
		System.out.println("Test");
		
		desktopFunction MySQL = new desktopFunction();
		
		MySQL.LoginToMySqlwithPasswordAndVerifyHomePage("root@123");
		MySQL.NavigateTo_MenuItem_Server_UsersandPrivileges();
		MySQL.AddUserAccount("JUnit", "Test@1234");
		MySQL.CloseOpenedFunctionTab();
		MySQL.CloseMainTab();
	}
	
	@SuppressWarnings("static-access")
	@AfterMethod
	public void tearDown() {
		System.out.println("tear");
		Windows.closeApplication();
	}
}