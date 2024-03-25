package ae.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\AutoExercise\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();
		
		WebElement products = driver.findElement(By.xpath("//a[text()=' Products']"));
		products.click();
		
		
		Thread.sleep(3000);
		WebElement hoverOver1 = driver.findElement(By.xpath("(//div[@class='overlay-content'])[1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(hoverOver1).perform();
		
		WebElement addCartBtn1 = driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]"));
		addCartBtn1.click();
		
		Thread.sleep(3000);
		WebElement continueShiping = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
		continueShiping.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement hoverOver2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='overlay-content'])[2]")));
		
//	    WebElement hoverOver2 = driver.findElement(By.xpath("(//div[@class='overlay-content'])[2]"));
	    
		act.moveToElement(hoverOver2).perform();
		
		WebElement addCartBtn2 = driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[2]"));
		addCartBtn2.click();
		
		WebElement viewCart = driver.findElement(By.xpath("(//p[@class='text-center'])[2]"));
		viewCart.click();
		
		
		
	
	}

}
