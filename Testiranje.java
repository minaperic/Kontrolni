package testovi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.collect.Table.Cell;

import kontrolni3.Home;

public class Testiranje {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	
	@Test
	public void testUsernameBtn () {
		
		driver.navigate().to(Home.URL);
		
		SoftAssert sa = new SoftAssert();
		File f = new File("data.xlsx");
		try {
			InputStream inp = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkBook();
			XSSFSheet sheet = wb.getSheetAt(0);
			
			Row row;
			for(int i = 0; i < 1; i++) {
				row = sheet.getRow(i);
				
				String username = row.getCell(0).toString();
				String password = row.getCell(1).toString();
				

			driver.navigate().to(Home.URL);
			driver.findElement(By.xpath(Home.USERNAME_XPATH)).sendKeys(username);
			driver.findElement(By.xpath(Home.PASSWORD_XPATH)).sendKeys(password);;
			driver.findElement(By.xpath(Home.LOGIN_XPATH));
				 
			String actual = driver.getCurrentUrl();
			String expected = Home.URLSORT_XPATH;
			Assert.assertEquals(actual, expected);
			}
			wb.close();
				 
		} catch (IOException e) {
			System.out.println("Nije pronadjen folder");
			e.printStackTrace();
		}
		
	}
	

}
