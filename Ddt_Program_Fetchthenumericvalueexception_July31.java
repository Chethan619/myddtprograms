package ddtconceptprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ddt_Program_Fetchthenumericvalueexception_July31 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
    {
    	
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basics\\DDT\\chethan.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String value=w1.getSheet("login1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}
}
