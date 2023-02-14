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
import com.kms.katalon.core.windows.keyword.helper.WindowsActionSettings as WindowsActionSettings
import groovy.swing.factory.WindowFactory as WindowFactory

import com.kms.katalon.core.configuration.RunConfiguration

'Soruce'
'https://pgptool.github.io/'

def imgDir = RunConfiguration.getProjectDir()
//println(imgDir+"/tmp/pgptool.exe")
String DesktopAppPath = imgDir+"/DesktopApp/pgptool.exe"
'Start Desktop application'

try{
	Windows.startApplication(DesktopAppPath)
}catch (Exception e){
'In this example we could observe katalon i loses the connectivity with desktop-app'
'Copy the filepath from /DesktopApp directory and perform "Spy window object" to view the issue'

Windows.switchToWindowTitle("PGPTool")
}