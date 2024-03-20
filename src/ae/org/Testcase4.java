package ae.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunqa\\eclipse-workspace\\autoexer\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com");
		
		driver.manage().window().maximize();
		
		WebElement log = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
		log.click();
		
		WebElement  username = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]"));
		username.sendKeys("arunps1510@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]"));
		pwd.sendKeys("Arun@1234");
		
		WebElement SubBtn = driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]"));
		SubBtn.click();
		
		WebElement NAME = driver.findElement(By.xpath("//b[text()='ARUN']"));
		
		if(NAME.isDisplayed()) {
			
			String name = NAME.getText();
			
			System.out.println("USERNAME : " + name);
			
		} else {
			System.out.println("UESRNAME is not visible on webpage");
		}
		
		WebElement logout = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
		logout.click();

		
	}

}
