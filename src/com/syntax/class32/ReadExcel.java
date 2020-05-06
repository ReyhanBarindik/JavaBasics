package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		
		String filePath= System.getProperty("user.dir") + "\\TestData\\Canvas.xlsx";
		FileInputStream fis = new FileInputStream (filePath);
		
		//get an Object of Workbook type 
		
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet= book.getSheet("Sheet1");
		
		// need to find numbers of rows
        int rows = sheet.getPhysicalNumberOfRows();
        
		//find number of columns
		int cols= sheet.getRow(0).getLastCellNum();
		
		//get data from all rows and all columns 
		for (int i=0; i<rows; i++) {              //iterates over rows
			for (int j=0; j<cols; j++) {
				String cV= sheet.getRow(i).getCell(j).toString();
				System.out.print(cV+"     ");
			
			
			
			
			}
			System.out.println();
		
		}
		
		
		
		
		
		
		
		
		
	}

}
