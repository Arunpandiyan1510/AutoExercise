package ae.org;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase15 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\AutoExercise\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();

		WebElement logBtn = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
		logBtn.click();

		WebElement usName = driver.findElement(By.xpath("//input[@type='text']"));
		usName.sendKeys("ARUN");

		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
		email.sendKeys("arun000@gmail.com");

		WebElement subBtn = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		subBtn.click();

		WebElement genderRdo = driver.findElement(By.id("id_gender1"));
		genderRdo.click();

		WebElement pwd = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
		pwd.sendKeys("Arun@1234");

		WebElement day = driver.findElement(By.id("days"));
		day.click();

		WebElement date = driver.findElement(By.xpath("//option[@value='15']"));
		date.click();

		WebElement month = driver.findElement(By.id("months"));
		month.click();

		WebElement months = driver.findElement(By.xpath("(//option[@value='10'])[2]"));
		months.click();

		WebElement year = driver.findElement(By.id("years"));
		year.click();

		WebElement years = driver.findElement(By.xpath("//option[@value='1999']"));
		years.click();

		WebElement chck1 = driver.findElement(By.id("newsletter"));
		chck1.click();

		WebElement chck2 = driver.findElement(By.id("optin"));
		chck2.click();

		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("ARUN");

		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("S");

		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("KCT");

		WebElement state = driver.findElement(By.id("state"));
		state.sendKeys("TamilNadu");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("CBE");

		WebElement zipcode = driver.findElement(By.id("zipcode"));
		zipcode.sendKeys("641523");

		WebElement mobNo = driver.findElement(By.id("mobile_number"));
		mobNo.sendKeys("7164129877");

		WebElement creBtn = driver.findElement(By.xpath("//button[@data-qa='create-account']"));
		creBtn.click();

		WebElement coniBtn = driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
		coniBtn.click();

		Thread.sleep(3000);
		WebElement Verifyname = driver.findElement(By.xpath("//b[text()='ARUN']"));

		String nameTop = Verifyname.getText();

		System.out.println("NAME : " + nameTop);
		System.out.println("-----------------------");

		Thread.sleep(3000);
		WebElement hoverOver1 = driver.findElement(By.xpath("(//div[@class='overlay-content'])[1]"));

		Actions act = new Actions(driver);

		act.moveToElement(hoverOver1).perform();

		WebElement addCartBtn1 = driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]"));
		addCartBtn1.click();

		Thread.sleep(3000);
		WebElement cntBtn = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
		cntBtn.click();

		WebElement cart = driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[1]"));
		cart.click();

		WebElement proceedBtn = driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
		proceedBtn.click();

		List<WebElement> addressDetails = driver.findElements(By.xpath("//ul[@class='address item box']"));

		for (WebElement addresDetail : addressDetails) {

			String name = addresDetail.findElement(By.xpath("(//li[@class='address_firstname address_lastname'])[1]"))
					.getText();
			String address = addresDetail.findElement(By.xpath("(//li[@class='address_address1 address_address2'])[2]"))
					.getText();
			String locality = addresDetail
					.findElement(By.xpath("(//li[@class='address_city address_state_name address_postcode'])[1]"))
					.getText();
			String country = addresDetail.findElement(By.xpath("(//li[@class='address_country_name'])[1]")).getText();
			String mobNumber = addresDetail.findElement(By.xpath("(//li[@class='address_phone'])[1]")).getText();

			System.out.println("NAME : " + name);
			System.out.println("ADDRESS : " + address);
			System.out.println("LOCALITY :  " + locality);
			System.out.println("COUNTRY : " + country);
			System.out.println("MOBNUMBER : " + mobNumber);

			System.out.println("-----------------------");

			WebElement desBox = driver.findElement(By.xpath("//textarea[@class='form-control']"));
			desBox.sendKeys("Confirm My order");

			WebElement placeBtn = driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
			placeBtn.click();

			Thread.sleep(3000);
			WebElement cardName = driver.findElement(By.xpath("//input[@name='name_on_card']"));
			cardName.sendKeys("CBI CARD");

			WebElement cardNumber = driver.findElement(By.xpath("//input[@name='card_number']"));
			cardNumber.sendKeys("110010110010");

			WebElement cvc = driver.findElement(By.xpath("//input[@name='cvc']"));
			cvc.sendKeys("786");

			WebElement exmonth = driver.findElement(By.xpath("//input[@name='expiry_month']"));
			exmonth.sendKeys("03");

			WebElement exyear = driver.findElement(By.xpath("//input[@data-qa='expiry-year']"));
			exyear.sendKeys("2025");

			WebElement subBtn1 = driver.findElement(By.xpath("//button[@data-qa='pay-button']"));
			subBtn1.click();

			String successMsg = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! Your order')]"))
					.getText();
			System.out.println(successMsg);

			System.out.println("-----------------------");

			WebElement cnteBtn = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
			cnteBtn.click();

			WebElement deleBtn = driver.findElement(By.xpath("//i[@class='fa fa-trash-o']"));
			deleBtn.click();

			String delTxt = driver.findElement(By.xpath("//b[text()='Account Deleted!']")).getText();
			System.out.println(delTxt);

			WebElement cntBtn1 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
			cntBtn1.click();

		}

	}

}
