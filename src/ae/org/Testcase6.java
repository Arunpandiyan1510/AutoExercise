package ae.org;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\autoexer\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		driver.manage().window().maximize();
		
		WebElement contactUs = driver.findElement(By.xpath("//i[@class='fa fa-envelope']"));
		contactUs.click();
		
		WebElement title = driver.findElement(By.xpath("(//h2[@class='title text-center'])[2]"));
		
		if(title.isDisplayed()) {
			
			String titletext = title.getText();
			
			System.out.println("TITLE  : " + titletext);
		} else {
			System.out.println("Title is not display on webpage");
		}
		
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("Arun");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email.sendKeys("arunps1510@gmail.com");
		
		WebElement subject = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		subject.sendKeys("AUTOMATION");
		
		WebElement Msg = driver.findElement(By.id("message"));
		Msg.sendKeys("Learn Selenium Automation");
		

	}

}
