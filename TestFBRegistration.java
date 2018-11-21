package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desktop\\AutomationBrowser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//firstname
		driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).sendKeys("Test Selenium");
		//lastname
		driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).sendKeys("TS");
		//telephone
		driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).sendKeys("123-456-7854");
		//new password I don't want to add new password as I do not want to really create an account
		//driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("520wan");
		
		//select birthday
		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		sel1.selectByVisibleText("Sep");
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		sel2.selectByValue("6");
		Select sel3 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		sel3.selectByIndex(6);
		
		//check  female button
		driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).click();
		//click on a link
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		//go back
		driver.navigate().back();
		
		
		//click sign up button
		driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).click();
		
		//close the window
		driver.quit();
		

	}

}
