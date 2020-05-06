package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		String filePath= System.getProperty("user.dir") + "\\TestData\\MyTask.xlsx";

		FileInputStream fis = new FileInputStream (filePath);
		Workbook book = new XSSFWorkbook (fis);
		
		//writing into existing sheet
		Sheet sheet1 = book.getSheet("Sheet1");
		sheet1.getRow(0).createCell(9).setCellValue("SSN");       // Once in row You should create Cell     //row(0) --> header 
		sheet1.createRow(3).createCell(0).setCellValue("Turker");      // Then Create Row 
		//Sheet customSheet = book.createSheet("TestSh");
		
		FileOutputStream fos= new FileOutputStream (filePath);
		book.write(fos);
		
		
	}

}
