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

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.security.MessageDigest;

import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
//
//public class ExcelLib {
//public class ExcelLib {
//	
//	final static Logger log = LogManager.getLogger(ExcelLib.class);
//	private static final String encryptionKey           = "DXCIAS#256AES";
//	private static final String encryptionPrefix        = "{$encrypt$}";
//	private static final String characterEncoding       = "UTF-8";
//	private static final String cipherTransformation    = "AES/CBC/PKCS5PADDING";
//	private static final String aesEncryptionAlgorithm = "AES";
//	private static byte[] iv = new byte[16];
//	
//	
//	private Workbook workbook;
//	private Sheet worksheet;
//	private int rows;
//	private String testCaseName;
//	private int testCaseStartRow = 0;
//	private int testCaseEndRow=0;
//	private int usedColumnsCount = 0;
//	private int iterationCount = 0;
//	
//	public ExcelLib(String workSheetName, String testCaseName) {
	public ExcelLib() {
		this.workbook = initTestDataFile();
		this.worksheet = workbook.getSheet("Sheet1");
//		this.worksheet = workbook.getSheet(workSheetName);
//		this.testCaseName = testCaseName;
		this.rows = getRowCount();
		this.testCaseStartRow = getTestCaseStartRow();
		this.testCaseEndRow = getTestCaseEndRow();
		this.usedColumnsCount = getUsedColumnsCount();
		this.iterationCount = getIterationCount();
	}
	
//	private XSSFWorkbook initTestDataFile() {
	public XSSFWorkbook initTestDataFile() {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\Lenovo UTH-UK\\Desktop\\Input_Data.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook (fis);
//		ClassLoader classLoader = getClass().getClassLoader();
//		File file = new File(classLoader.getResource("Input_Data.xlsx").getFile());
//		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (InvalidFormatException e) {
//			log.error("Error in loadTestData :" ,e);
			System.out.println("Error in loadTestData :" ,e);
			throw new RuntimeException(e);
		} catch (IOException e) {
//			log.error("Error in loadTestData :" ,e);
			System.out.println("Error in loadTestData :" ,e);
			throw new RuntimeException(e);
		}
		return workbook;
	}

	public int getIterationCount(){
		try {
			System.out.println("Sart Row :"  + testCaseStartRow + " End Row :" + testCaseEndRow);
			for(int i =testCaseStartRow; i <= testCaseEndRow; i++){
				if(getCellData(usedColumnsCount,i).equalsIgnoreCase("Yes")){
					iterationCount++;
				}
			}
		} catch (Exception e) {
//			log.error("Error in getIterationCount",e);
			System.out.println("Error in getIterationCount",e);
			throw new RuntimeException(e);
		}
		if(iterationCount > 0){
//			log.debug("*************************************************************************************");
//			log.debug("Total number of iterations selected for test script: '"+testCaseName+"' is"+" "+iterationCount);
//			log.debug("*************************************************************************************");
			System.out.println("*************************************************************************************");
			System.out.println("Total number of iterations selected for test script is"+" "+iterationCount);
			System.out.println("*************************************************************************************");
		}else{
//			log.debug("*************************************************************************************");
//			log.debug("Total number of iterations selected is 0. Please check execute column in TestData.xls file");
//			log.debug("*************************************************************************************");
			System.out.println("*************************************************************************************");
			System.out.println("Total number of iterations selected is 0. Please check execute column in TestData.xls file");
			System.out.println("*************************************************************************************");
		}
		
		return iterationCount;
	}
	
//	/*Return Two Dimensional Array to DataProvider*/
//	public Object[][] getTestdata(){
//		int row = 0;
//		int col = 0;
//		String data[][] = new String[iterationCount][usedColumnsCount-1];
//		//Get the Test Data
//		for(int i =testCaseStartRow; i <= testCaseEndRow; i++){
//			col = 0;
//			boolean flag = false;
//			String cellData = getCellData(usedColumnsCount,i);
//			if(cellData.equalsIgnoreCase("Yes")){
//				flag = true;
//				for(int j = 1; j < usedColumnsCount; j++){
//					data[row][col] = getCellData(j, i);
//					col++;
//				}
//			}
//			if(flag){
//				row++;
//			}
//		}
//		return data;
//	}
//	
//	/*Get Cell Data*/
//	private String getCellData(int col, int row) {
//		String value = "";
//		Row rowObj = worksheet.getRow(row);
//		Cell cellObj = rowObj.getCell(col);
//		String cellValue = cellObj.getStringCellValue();
//		if (cellObj != null) {
//			value = cellValue;
//			if (cellValue.contains(encryptionPrefix)) {
//				value = decrypt(cellValue);
//			}
//		}
//		return value;
//	}
//	
//	/*Get TestCase Start Row*/
	public int getTestCaseStartRow(){
		try {
			for(int i = 0; i <= rows; i++){
				Row row = worksheet.getRow(i);
				if(row != null) {
					Cell cell = row.getCell(0);
					if(cell != null) {
						String columnName = cell.getStringCellValue();
						if(columnName.equals(testCaseName.trim())){
							testCaseStartRow = i;
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			log.error("Error in getTestCaseStartRow",e);
			throw new RuntimeException(e);
		}
		return testCaseStartRow;
	}
//	
//	/*Get Test Case End Row*/
	public int getTestCaseEndRow(){
		try {
			for(int i = 0; i <= rows; i++){
				Row row = worksheet.getRow(i);
				if(row != null) {
					Cell cell = row.getCell(0);
					if(cell != null) {
						String columnValue = cell.getStringCellValue();
						if(columnValue.equals(testCaseName.trim())){
							testCaseEndRow = i;
						}
					}
				}
			}
		} catch (Exception e) {
			log.error("Error in getTestCaseEndRow",e);
			throw new RuntimeException(e);
		}
		return testCaseEndRow;
	}
	
//	/*Get the Columns Count for the referenced test case*/
	public int getUsedColumnsCount(){
		try {
			int count = 0;
			Row row = worksheet.getRow(testCaseStartRow-1);
			int cellNum  = row.getLastCellNum();
			for(int i=0 ; i < cellNum ; i++) {
				Cell cell = row.getCell(i);
				usedColumnsCount = count++;
				if(cell != null) {
					String cellVal = cell.getStringCellValue();
					if("Execute".equals(cellVal)) {
						break;
					}
				}
			}
		} catch (Exception e) {
			log.error("Error in getUsedColumnsCount",e);
			throw new RuntimeException(e);
		}
		return usedColumnsCount;
	}
	
//	/*Gets the total number of row count in the excel sheet*/
	public int getRowCount() {
		return worksheet.getLastRowNum();
	}
//	
//		public String decrypt(String encryptedText) {
//		String decryptedText = "";
//		try {
//			encryptedText = encryptedText.substring(encryptionPrefix.length());
//			MessageDigest sha = null;
//			Cipher cipher = Cipher.getInstance(cipherTransformation);
//			byte[] key = encryptionKey.getBytes(characterEncoding);
//			sha = MessageDigest.getInstance("SHA-256");
//			key = sha.digest(key);
//			SecretKeySpec secretKey = new SecretKeySpec(key, aesEncryptionAlgorithm);
//			IvParameterSpec ivparameterspec = new IvParameterSpec(iv);
//			cipher.init(Cipher.DECRYPT_MODE, secretKey, ivparameterspec);
//			Base64.Decoder decoder = Base64.getDecoder();
//			byte[] cipherText = decoder.decode(encryptedText.getBytes("UTF8"));
//			decryptedText = new String(cipher.doFinal(cipherText), "UTF-8");
//
//		} catch (Exception E) {
//			System.err.println("decrypt Exception : "+E.getMessage());
//		}
//		return decryptedText;
//	}
//
//}
//
//class ExcelTC{
//	public static void main(String args[]) {
//	ExcelLib xl = new ExcelLib("Policy", "TC174CreateNewPolicyNone");
//	return xl.getTestdata();
//	}
//}
