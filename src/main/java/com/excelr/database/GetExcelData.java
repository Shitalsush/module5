package com.excelr.database;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {
	public static void main(String[] args) throws IOException {
		GetExcelData obj = new GetExcelData();
		obj.getData();
	}
	
	public Object[][] getData() throws IOException {
		
		String filePath = "C:\\Users\\pre-loaded\\eclipse-workspace\\ExcelRDemo1\\TestData1.xlsx";
		String sheetName= "details";
		
		XSSFWorkbook wb = new XSSFWorkbook(filePath);
		XSSFSheet sheet = wb.getSheet(sheetName);
		
		int rCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row Count is"+ rCount);
		System.out.println("Col Count is"+colCount);
		
		Object[][] data = new Object[rCount][colCount];
		
		for(int row = 0 ; row <rCount ; row++)
		{
			for(int col=0 ; col<colCount; col++)
			{
				data[row][col] =sheet.getRow(row).getCell(col).getStringCellValue();
				}
		}
		
		
		return data;
		
		
	}


}
