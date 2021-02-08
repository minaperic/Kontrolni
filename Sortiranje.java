package kontrolni3;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sortiranje {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(Home.URLSORT_XPATH);
		
		WebElement dropdown = driver.findElement(By.xpath(Home.PRICE_XPATH));
		dropdown.click();
		
		
		
		
		
	}

}
