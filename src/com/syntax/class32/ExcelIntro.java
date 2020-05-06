package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		String filePath= "C:\\Users\\reyha\\Desktop\\Test2.xlsx";

		FileInputStream fis = new FileInputStream (filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet1");
		
		Row row1=sheet.getRow(0);
		
		Cell cell=row1.getCell(1);
		//get value from Cell
		String r1cell2=cell.toString();
		System.out.println(r1cell2);
		
		//how to get Jacksonville
		Row row3=sheet.getRow(2);
		Cell r3c3=row3.getCell(2);
		String cellValue= r3c3.toString();
		System.out.println(cellValue);
		
		//Short Way to acsses FL 
		String cellVa=sheet.getRow(1).getCell(3).toString();
		System.out.println(cellVa);
		
		//to retrieve values based on Type 
		double cellv=sheet.getRow(1).getCell(4).getNumericCellValue();   // double type ---> getNumericCellValue
		System.out.println((int)cellv);  //12345.0 ---> 12345
		
		String valC= sheet.getRow(1).getCell(4).toString();
		String [] arr= valC.split("\\.");
		System.out.println(arr[0]);
		
		
	}

}
