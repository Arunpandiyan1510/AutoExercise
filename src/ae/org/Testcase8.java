package ae.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\AutoExercise\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();

		WebElement products = driver.findElement(By.xpath("//i[@class='material-icons card_travel']"));
		products.click();

		WebElement pageTitle = driver.findElement(By.xpath("//h2[@class='title text-center']"));
		String pt = pageTitle.getText();
		System.out.println("Page Title : " + pt);

		WebElement viewProduct = driver.findElement(By.xpath("(//i[@class='fa fa-plus-square'])[1]"));
		viewProduct.click();

		Thread.sleep(3000);

		List<WebElement> productsInfo = driver.findElements(By.xpath("//div[@class='product-information']"));

		for (WebElement product : productsInfo) {

			String name = product.findElement(By.xpath("//h2[text()='Blue Top']")).getText();
			String category = product.findElement(By.xpath("//p[text()='Category: Women > Tops']")).getText();
			String price = product.findElement(By.xpath("//span[text()='Rs. 500']")).getText();
			String availability = product.findElement(By.xpath("//b[text()='Availability:']")).getText();
			String condition = product.findElement(By.xpath("//b[text()='Condition:']")).getText();
			String brand = product.findElement(By.xpath("//b[text()='Brand:']")).getText();

			System.out.println("Name : " + name);
			System.out.println("Category : " + category);
			System.out.println("Price : " + price);
			System.out.println("Availability : " + availability);
			System.out.println("Condition : " + condition);
			System.out.println("Brand : " + brand);
			System.out.println("----------------------------------");

		}

	}

}
