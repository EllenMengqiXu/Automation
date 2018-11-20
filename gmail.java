package seleniumtt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sampleselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\exu\\Desktop\\AutomationBrowser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		//fullsize
		driver.manage().window().maximize();
		//account name
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("hello@email.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		//password
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("nihao123");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		
		driver.close();
	}

}
