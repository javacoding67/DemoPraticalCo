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

public class EmpDemoPra {

	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\malat\\eclipse-workspace\\MavenJuly2026\\target\\Inputdta.xlsx");
		
		Workbook book=new XSSFWorkbook();
		
		Sheet sheet = book.createSheet("data");
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("hi");
		
		FileOutputStream n=new FileOutputStream(file);
		
		book.write(n);
		
		System.out.println("done");
		
	
		
		

	}

}
