package day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {


	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Row r=ws.getRow(0);
		Cell c=r.getCell(1);
		c.setCellValue("abc");
		
		r=ws.getRow(1);
		c=r.createCell(2);
		c.setCellValue("xyz");
		
		r=ws.createRow(4);
		c=r.createCell(0);
		c.setCellValue(10);
		
		
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		wb.write(f1);
		f1.close();
		

	}

}
