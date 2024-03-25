package ae.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\AutoExercise\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();

		WebElement homeScroll = driver.findElement(By.xpath("//i[@class='fa fa-home']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,8500)");

		WebElement subText = driver.findElement(By.xpath("//h2[text()='Subscription']"));

		String ST = subText.getText();

		System.out.println(ST);

		WebElement email = driver.findElement(By.id("susbscribe_email"));
		email.sendKeys("arunps151@gmail.com");

		WebElement arrowBtn = driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']"));
		arrowBtn.click();

		WebElement successMsg = driver.findElement(By.xpath("//div[@class='alert-success alert']"));

		String successText = successMsg.getText();

		System.out.println(successText);

	}

}
