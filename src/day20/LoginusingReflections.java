package day20;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginusingReflections 
{
	LoginActions keys=new LoginActions();
	Method[] methods=keys.getClass().getMethods();
	@Test
	public void loginTest() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		
		FileInputStream f=new FileInputStream("E:\\July16Batch\\WebdriverProject\\src\\com\\qedge\\keywords\\ActionKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			String action=r.getCell(3).getStringCellValue();
			executeActions(action);
		}
	}
	
	public void executeActions(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<methods.length;i++)
		{
			if(methods[i].getName().equals(action))
			{
				methods[i].invoke(keys);
				break;
			}
		}
	}
}
