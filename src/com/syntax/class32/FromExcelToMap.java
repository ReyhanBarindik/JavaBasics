package com.syntax.class32;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") + "\\TestData\\MyTask.xlsx";
        
		FileInputStream fis = new FileInputStream (filePath);
		
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		int rows =sheet.getPhysicalNumberOfRows();
		int cols =sheet.getRow(0).getLastCellNum();
		
		List <Map<String, String>> listMap = new ArrayList<>();
		
		for (int r =1; r<2; r++) {
			
			Map<String, String> map = new LinkedHashMap <>();
			
			for (int c= 0; c<cols; c++) {
				
				String key = sheet.getRow(0).getCell(c).toString();
				String value= sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
		}
			
			listMap.add(map);
			
		}
		System.out.println(listMap);
		
		System.out.println("________________");
		
		//for (Map<String,String> map : listMap) {
			//System.out.println(map);
		//}
		
		
		
	}

}
