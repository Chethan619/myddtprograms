package ddtconceptprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ddt_Program_GrotechmindsRegistration_July31 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
    {
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basics\\DDT\\chethan.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String fname=w1.getSheet("grotechregpage").getRow(0).getCell(1).getStringCellValue();
		System.out.println(fname);
		String lasname=w1.getSheet("grotechregpage").getRow(1).getCell(1).getStringCellValue();
		System.out.println(lasname);
		String emailidvalue=w1.getSheet("grotechregpage").getRow(2).getCell(1).getStringCellValue();
		System.out.println(emailidvalue);
		String pwdvalue=w1.getSheet("grotechregpage").getRow(3).getCell(1).getStringCellValue();
		System.out.println(pwdvalue);
		String present_address=w1.getSheet("grotechregpage").getRow(4).getCell(1).getStringCellValue();
		System.out.println(present_address);
		String permanent_address=w1.getSheet("grotechregpage").getRow(5).getCell(1).getStringCellValue();
		System.out.println(permanent_address);
		String pincodevalue=w1.getSheet("grotechregpage").getRow(6).getCell(1).getStringCellValue();
		System.out.println(pincodevalue);
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.id("fname"));
		firstname.sendKeys(fname);
		WebElement lastname=driver.findElement(By.id("lname"));
		lastname.sendKeys(lasname);
		WebElement email_id=driver.findElement(By.id("email"));
		email_id.sendKeys(emailidvalue);
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys(pwdvalue);
		WebElement gender_male=driver.findElement(By.id("male"));
		gender_male.click();
		WebElement gender_female=driver.findElement(By.id("Female"));
		gender_female.click();
		WebElement address=driver.findElement(By.id("Present-Address"));
		address.sendKeys(present_address);
		WebElement perm_address=driver.findElement(By.id("Permanent-Address"));
		perm_address.sendKeys(permanent_address);
		WebElement pincode=driver.findElement(By.id("Pincode"));
		pincode.sendKeys(pincodevalue);
		WebElement dropdown=driver.findElement(By.id("Relegion"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("Hindu");
		WebElement choosefile=driver.findElement(By.id("file"));
		choosefile.sendKeys("C:\\Users\\DELL\\Downloads\\IMG_7501.JPG");
		WebElement ready_to_relocate=driver.findElement(By.id("relocate"));
		ready_to_relocate.click();
		WebElement done=driver.findElement(By.xpath("//button[@name='Submit']"));
		done.click();
		driver.switchTo().alert().accept();
    }
}
