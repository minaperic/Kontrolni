package kontrolni3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logovanje {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get(Home.URL);
	
	WebElement username = driver.findElement(By.xpath(Home.USERNAME_XPATH));
	username.click();
	
	WebElement username2 = driver.findElement(By.xpath(Home.USERNAME_XPATH));
	username2.click();
	username2.sendKeys("mina");
	
	WebElement password = driver.findElement(By.xpath(Home.PASSWORD_XPATH));
	password.click();
	
	WebElement password2 = driver.findElement(By.xpath(Home.PASSWORD_XPATH));
	password2.click();
	password2.sendKeys("sifra");
	
	WebElement login = driver.findElement(By.xpath(Home.LOGIN_XPATH));
	login.click();
	
	
	driver.navigate().refresh();
	
	
	WebElement usernameNovi = driver.findElement(By.xpath(Home.USERNAME_XPATH));
	usernameNovi.click();
	
	WebElement usernameNovi2 = driver.findElement(By.xpath(Home.USERNAME_XPATH));
	usernameNovi2.click();
	usernameNovi2.sendKeys("standard_user");
	
	WebElement passwordNovi = driver.findElement(By.xpath(Home.PASSWORD_XPATH));
	passwordNovi.click();
	
	WebElement passwordNovi2 = driver.findElement(By.xpath(Home.PASSWORD_XPATH));
	passwordNovi2.click();
	passwordNovi2.sendKeys("secret_sauce");
	
	WebElement login2 = driver.findElement(By.xpath(Home.LOGIN_XPATH));
	login2.click();
	
	}
}
