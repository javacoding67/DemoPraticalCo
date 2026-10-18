package doximo.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleExcel {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\malat\\eclipse-workspace\\MavenJuly2026\\target\\Inputdta.xlsx");
		
		
		Workbook w=new XSSFWorkbook();
		
		Sheet sheet = w.createSheet("data");
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("sjgb");
		
		FileOutputStream s=new FileOutputStream(file);
		w.write(s);
		
		
	
	

	}

}
