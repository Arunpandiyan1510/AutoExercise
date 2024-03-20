package ae.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\autoexer\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement login = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
		login.click();

		WebElement uname = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		uname.sendKeys("ARUN");

		WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		email.sendKeys("arunps2810@gmail.com");

		WebElement subBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		subBtn.click();

		WebElement mr = driver.findElement(By.id("id_gender1"));
		mr.click();

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Arun@1234");

		WebElement days = driver.findElement(By.id("days"));
		days.click();

		WebElement date = driver.findElement(By.xpath("//option[@value='15']"));
		date.click();

		WebElement months = driver.findElement(By.id("months"));
		months.click();

		WebElement month = driver.findElement(By.xpath("(//option[@value='10'])[2]"));
		month.click();

		WebElement years = driver.findElement(By.id("years"));
		years.click();

		WebElement year = driver.findElement(By.xpath("//option[@value='1999']"));
		year.click();

		WebElement firstCheckbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		firstCheckbox.click();

		WebElement secCheckbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		secCheckbox.click();

		WebElement frtname = driver.findElement(By.xpath("//input[@name='first_name']"));
		frtname.sendKeys("Arunpandiyan");

		WebElement lastname = driver.findElement(By.xpath("//input[@data-qa='last_name']"));
		lastname.sendKeys("S");

		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("VT");

		WebElement adrs1 = driver.findElement(By.xpath("//input[@name='address1']"));
		adrs1.sendKeys("Coimbatore_South");

		WebElement adrs2 = driver.findElement(By.xpath("//input[@name='address2']"));
		adrs2.sendKeys("Sundarapuram");

		WebElement country = driver.findElement(By.id("country"));
		country.click();

		WebElement count = driver.findElement(By.xpath("//option[@value='India']"));
		count.click();

		WebElement state = driver.findElement(By.id("state"));
		state.sendKeys("TamilNadu");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Coimbatore");

		WebElement zipcode = driver.findElement(By.id("zipcode"));
		zipcode.sendKeys("641024");

		WebElement mobNum = driver.findElement(By.id("mobile_number"));
		mobNum.sendKeys("9876543210");

		WebElement creBtn = driver.findElement(By.xpath("//button[text()='Create Account']"));
		creBtn.click();

		Thread.sleep(3000);

		WebElement continueBtn = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		continueBtn.click();

//		WebElement delete = driver.findElement(By.xpath("(//a[@style='color:brown;'])[2]"));
//		delete.click();
//
//		Thread.sleep(3000);
//
//		WebElement contBtn = driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
//		contBtn.click();

	}

}
