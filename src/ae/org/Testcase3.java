package ae.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\autoexer\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/login");

		driver.manage().window().maximize();

		WebElement log = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
		log.click();

		WebElement username = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		username.sendKeys("arun/@AD");

		WebElement pwd = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
		pwd.sendKeys("arun");

		WebElement subBtn = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
		subBtn.click();

		WebElement errormsg = driver.findElement(By.xpath("//*[contains(text(),'Your email')]"));

		if (errormsg.isDisplayed()) {

			String Err = errormsg.getText();

			System.out.println("Error Msg : " + Err);
		} else {
			System.out.println("Error Msg is not visible on webpage");
		}

	}

}
