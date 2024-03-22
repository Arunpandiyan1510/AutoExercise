package ae.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunqa\\eclipse-workspace\\AutoExercise\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement products = driver.findElement(By.xpath("//i[@class='material-icons card_travel']"));
		products.click();
		
		Thread.sleep(3000);
		WebElement allProducts = driver.findElement(By.xpath("//h2[@class='title text-center']"));
		String Title = allProducts.getText();
		System.out.println(Title);
		
		WebElement searchBox1 = driver.findElement(By.id("search_product"));
		searchBox1.sendKeys("Men Tshirt");
		
		WebElement searchBtn1 = driver.findElement(By.id("submit_search"));
		searchBtn1.click();
		
		WebElement searchRemove = driver.findElement(By.id("search_product"));
		searchRemove.clear();
		
		WebElement searchBtn2 = driver.findElement(By.id("submit_search"));
		searchBtn2.click();
		
		WebElement searchBox2 = driver.findElement(By.id("search_product"));
		searchBox2.sendKeys("Green Side Placket Detail T-Shirt");
		
		WebElement searchBtn3 = driver.findElement(By.id("submit_search"));
		searchBtn3.click();
		
		
	}

}
