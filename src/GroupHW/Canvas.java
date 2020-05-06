package GroupHW;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Canvas {

	public static void main(String[] args) throws IOException {

		String url = System.getProperty("user.dir") + "\\TestData\\Canvas.xlsx";

		FileInputStream fis = new FileInputStream(url);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet1 = book.getSheet("Sheet1");
        
		List<Map<String,String>> mapList= new ArrayList<>();
		Map<String,String> map= new LinkedHashMap<>();
		
		Iterator<Row> rowIterator = sheet1.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();

			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
               
				
				
				
				//map.put(key, value);
		        
				
				
				
				
			}
		}
		mapList.add(map);
		System.out.println(mapList);
	}

}
