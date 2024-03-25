package ae.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\AutoExercise\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();

		WebElement cart = driver.findElement(By.xpath("//a[text()=' Cart']"));
		cart.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		WebElement subTxt = driver.findElement(By.xpath("//h2[text()='Subscription']"));

		String ST = subTxt.getText();

		System.out.println(ST);

		WebElement submailBox = driver.findElement(By.id("susbscribe_email"));
		submailBox.sendKeys("arunps1510@gmail.com");

		WebElement arrowBtn = driver.findElement(By.id("subscribe"));
		arrowBtn.click();

		WebElement sucsMsg = driver.findElement(By.xpath("//div[@class='alert-success alert']"));
		String successTxt = sucsMsg.getText();
		System.out.println(successTxt);

	}

}
