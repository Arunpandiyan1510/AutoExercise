package ae.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\AutoExercise\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();

		WebElement testcase = driver.findElement(By.xpath("(//i[@class='fa fa-list'])[1]"));
		testcase.click();

		WebElement textTest = driver.findElement(By.xpath("//b[text()='Test Cases']"));

		String TEXT = textTest.getText();

		System.out.println("Page Title : " + TEXT);

	}

}
