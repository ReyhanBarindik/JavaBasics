package GroupHW;

import java.io.FileInputStream;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class task1 {

	public static void main(String[] args) throws Exception {
		
	 String path1 = System.getProperty("user.dir") + "\\TestData\\New XLSX Worksheet.xlsx";
	
	 FileInputStream fis = new FileInputStream (path1);
	 
	 Workbook book = new XSSFWorkbook (fis);
	 
	 Sheet sheet1 = book.getSheet("Sheet1");
	
	 int rows = sheet1.getPhysicalNumberOfRows();
	 int cols = sheet1.getRow(0).getLastCellNum();
	 
	 List<Map<String, String>> mapList = new ArrayList <>();
	 
	 for (int r = 1; r<rows; r++) {
		 
		 Map <String, String> map = new LinkedHashMap <>();
		 
		  for (int c= 0; c<cols; c++) {
			  
			  String key = sheet1.getRow(0).getCell(c).toString();
			  String value = sheet1.getRow(r).getCell(c).toString();
			  map.put(key, value);
			  
		  }
		 mapList.add(map);
	 }
	 System.out.println(mapList);
	 
	 

	}

}
