import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelCopy {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("E:\\July16Batch\\WebdriverProject\\src\\com\\qedge\\excelfiles\\registration.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws1=wb.getSheet("Sheet1");
		XSSFSheet ws2=wb.getSheet("Sheet2");
		Iterator<Row> row1=ws1.iterator();
		Iterator<Row> row2=ws2.iterator();
		int x=0;
		Row r2=null;
		while(row1.hasNext())
		{
			Row r1=row1.next();
			
			Iterator<Cell> cell1=r1.iterator();
			r2=ws2.createRow(x);
			int y=0;
			while(cell1.hasNext())
			{
				Cell c=cell1.next();
				r2.createCell(y).setCellValue(c.getStringCellValue());
				y++;
			}
			x++;
			
			
		}
		FileOutputStream f1=new FileOutputStream("E:\\July16Batch\\WebdriverProject\\src\\com\\qedge\\excelfiles\\registration.xlsx");
		wb.write(f1);
		f1.close();
		
		

	}

}
