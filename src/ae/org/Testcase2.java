package ae.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\autoexer\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement logBtn = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
		logBtn.click();

		WebElement mail = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]"));
		mail.sendKeys("arunps1510@gmail.com");

		WebElement pwds = driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]"));
		pwds.sendKeys("Arun@1234");

		WebElement subBtn = driver.findElement(By.xpath("(//button[@data-qa='login-button'])[1]"));
		subBtn.click();

		WebElement name = driver.findElement(By.xpath("//b[text()='ARUN']"));

		if (name.isDisplayed()) {

			String usname = name.getText();

			System.out.println("Username : " + usname);

		} else {
			System.out.println("USERNAME is not visible on the webpage");
		}

		WebElement delete = driver.findElement(By.xpath("(//a[@style='color:brown;'])[2]"));
		delete.click();

//		Thread.sleep(3000);
//		WebElement DL = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
//		
//		if(DL.isDisplayed()) {
//			
//			String del = delete.getText();
//			
//			System.out.println("Delete print : " + del);
//			
//		} else {
//			System.out.println("DELETE is not visible on the webpage");
//			
//		}
	}

}
