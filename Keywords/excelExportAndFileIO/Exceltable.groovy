package excelExportAndFileIO

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.org.apache.bcel.internal.generic.RETURN

import groovy.inspect.swingui.ObjectBrowser
import internal.GlobalVariable
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.util.List;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Exceltable {
	List<Row> matchingRow;
	int useddata;
	String[][] matchingRowValues;

	@Keyword
	public Object[][] readExceltable(String filePath, String fileName, String sheetName,String searchTerms)  {

		//    public static void main(String[] args) {
		//        String[][] table;
		try {
			File file = new File(filePath + "\\" + fileName);

			//Create an object of FileInputStream class to read excel file

			FileInputStream inputStream = new FileInputStream(file);

			Workbook workbook = null;

			//Find the file extension by splitting file name in substring  and getting only extension name

			String fileExtensionName = fileName.substring(fileName.indexOf("."));

			//Check condition if the file is xlsx file

			if (fileExtensionName.equals(".xlsx")) {

				//If it is xlsx file then create object of XSSFWorkbook class

				workbook = new XSSFWorkbook(inputStream);

			}

			//Check condition if the file is xls file

			else if (fileExtensionName.equals(".xls")) {

				//If it is xls file then create object of HSSFWorkbook class

				workbook = new HSSFWorkbook(inputStream);

			}
			List<Table> tables = new ArrayList<>();

			Sheet sheet = workbook.getSheet(sheetName);
			String sheetnames = sheet.getSheetName();
			System.out.println(sheet.getSheetName());

			int firstRowIndex = -1, lastRowIndex = -1;
			for (Row row : sheet) {
				for (Cell cell : row) {
					if (cell.getStringCellValue().equals(searchTerms)) {
						firstRowIndex = row.getRowNum();
						System.out.println("123  "+row.getRowNum());
						break;
					}
				}
				if (firstRowIndex != -1) {
					break;
				}
			}
			for (int i = firstRowIndex + 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				if (row == null) {
					lastRowIndex = i ;
					System.out.println("321  "+lastRowIndex);
					break;
				}
			}
			int numOfColumns = sheet.getRow(firstRowIndex).getLastCellNum();
			System.out.println("numOfColumns"+numOfColumns);
			List<Row> table = new ArrayList<>();
			for (int i = firstRowIndex; i < lastRowIndex; i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < numOfColumns; j++) {
					Cell cell = row.getCell(j);

				}
				table.add(row);
			}
			System.out.println("Stored Table: ");
			for (Row row : table) {
				for (Cell value : row) {
					System.out.print(value.getStringCellValue() + "\t");
				}
				System.out.println();
			}
			String Executes = "Yes";
			matchingRow = new ArrayList<>();
			for (Row row : table) {
				for (Cell cell : row) {

					//                        for (String Executes: Execute) {
					if (cell.getStringCellValue().equals(Executes)) {
						System.out.print(cell.getStringCellValue() + "\t");
						System.out.println("execute Found in row: " + (row.getRowNum() + 1));
						matchingRow.add(row);
					}
					//                        }

				}
				System.out.println();
			}
			System.out.println("Yes value: ");
			for (Row row :matchingRow) {
				for (Cell value : row) {
					System.out.print("Yes found in "+row.getRowNum() + "\t");
					System.out.print(value.getStringCellValue() + "\t");
				}
				useddata++;
				System.out.println();
			}
			matchingRowValues = new String[useddata][numOfColumns];

			for (int i = 0; i < matchingRow.size(); i++) {
				Row row = matchingRow.get(i);



				System.out.println(row.getLastCellNum());
				for (int j = 0; j < row.getLastCellNum(); j++) {
					Cell cell = row.getCell(j);

					matchingRowValues[i][j] = cell.getStringCellValue();
				}

			}
			System.out.println("Testdata to execute testcase : " + "Sheetname " + sheetnames + " Testcasename ");
			for (String[] rowValues : matchingRowValues) {
				for (String value : rowValues) {
					System.out.print(value + "\t");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return matchingRowValues;
	}
	public static void main(String[] args) throws IOException {


		Exceltable objExceltable = new Exceltable();

		objExceltable.readExceltable("C:\\Users\\adars\\Excel", "TestData.xlsx", "Module_1", "TestScript_1");


	}
}