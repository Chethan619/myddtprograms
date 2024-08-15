package ddtconceptprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ddt_Program_Easiestway_July31 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
    {
    	
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basics\\DDT\\chethan.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String un=w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		System.out.println(un);
		String pwd=w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		System.out.println(pwd);
	}
}
