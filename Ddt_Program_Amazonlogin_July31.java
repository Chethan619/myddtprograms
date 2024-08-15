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

public class Ddt_Program_Amazonlogin_July31 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
    {
    	
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basics\\DDT\\chethan.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String email=w1.getSheet("amazonlogin").getRow(0).getCell(0).getStringCellValue();
		System.out.println(email);
		String pass=w1.getSheet("amazonlogin").getRow(0).getCell(1).getStringCellValue();
		System.out.println(pass);
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fevents%2Fgreatfreedomsale%2F%26ref_%3Dnav_signin%3F_encoding%3DUTF8%26ref_%3Dnav_signin%26pf_rd_p%3Df4439f2e-5da6-4843-8810-cae10051d62d%26pf_rd_s%3Dnav-sitewide-msg%26pf_rd_t%3D4201%26pf_rd_i%3Dnavbar-4201%26pf_rd_m%3DA21TJRUUN4KGV%26pf_rd_r%3D7EAQD7PS323ZMXVH2AEY%26discounts-widget%3D%252522%25257B%25255C%252522state%25255C%252522%25253A%25257B%25255C%252522refinementFilters%25255C%252522%25253A%25257B%25257D%25257D%25252C%25255C%252522version%25255C%252522%25253A1%25257D%252522&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys(email);
		Thread.sleep(2000);
		WebElement continuebutton=driver.findElement(By.className("a-button-input"));
		continuebutton.click();
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pass);
		WebElement submitbutton=driver.findElement(By.id("signInSubmit"));
		submitbutton.click();
	}
}
