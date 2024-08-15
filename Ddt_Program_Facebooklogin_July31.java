package ddtconceptprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ddt_Program_Facebooklogin_July31 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
    {
    	
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basics\\DDT\\chethan.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String un=w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		System.out.println(un);
		String pwd=w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		System.out.println(pwd);
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(un);
		Thread.sleep(2000);
		         //or
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(pwd);
		WebElement loginbutton=driver.findElement(By.name("login"));
		loginbutton.sendKeys(Keys.ENTER);
	}
}
