package ae.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\AutoExercise\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();

		WebElement viewProduct = driver.findElement(By.xpath("(//ul[@class='nav nav-pills nav-justified'])[1]"));
		viewProduct.click();

		WebElement quantity = driver.findElement(By.id("quantity"));
		quantity.clear();
		quantity.sendKeys("4");

		WebElement addCartBtn = driver.findElement(By.xpath("//button[@class='btn btn-default cart']"));
		addCartBtn.click();

		Thread.sleep(3000);
		WebElement viewCart = driver.findElement(By.xpath("(//p[@class='text-center'])[2]"));
		viewCart.click();

		List<WebElement> productDetails = driver.findElements(By.xpath("//div[@class='table-responsive cart_info']"));

		for (WebElement product : productDetails) {

			String description = product.findElement(By.xpath("//td[@class='cart_description']")).getText();
			String price = product.findElement(By.xpath("//td[@class='cart_price']")).getText();
			String quantity1 = product.findElement(By.xpath("//td[@class='cart_quantity']")).getText();
			String total = product.findElement(By.xpath("//td[@class='cart_total']")).getText();

			System.out.println("DESCRIPTION : " + description);
			System.out.println("PRICE : " + price);
			System.out.println("QUANTITY : " + quantity1);
			System.out.println("TOTAL : " + total);

		}

	}

}
