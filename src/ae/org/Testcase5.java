package ae.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\autoexer\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();

		WebElement log = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
		log.click();

		WebElement signName = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		signName.sendKeys("ARUN");

		WebElement signEmail = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		signEmail.sendKeys("arunps1510@gmail.com");

		WebElement signupBtn = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		signupBtn.click();

		WebElement exist = driver.findElement(By.xpath("//*[contains(text(),'Email Address')]"));

		if (exist.isDisplayed()) {
			String errorText = exist.getText();

			System.out.println("ERROR_TEXT : " + errorText);
		} else {
			System.out.println("Error Text is not visible on webpage");
		}

	}

}
