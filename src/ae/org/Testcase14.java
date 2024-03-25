package ae.org;

import java.util.List;

import javax.print.attribute.standard.JobOriginatingUserName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunqa\\eclipse-workspace\\AutoExercise\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

		driver.manage().window().maximize();

		WebElement product = driver.findElement(By.xpath("//a[text()=' Products']"));
		product.click();

		Thread.sleep(3000);
		WebElement hoverOver1 = driver.findElement(By.xpath("(//div[@class='overlay-content'])[1]"));

		Actions act = new Actions(driver);

		act.moveToElement(hoverOver1).perform();

		WebElement addCart = driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]"));
		addCart.click();

		Thread.sleep(3000);
		WebElement continueShipping = driver
				.findElement(By.xpath("(//button[@class='btn btn-success close-modal btn-block'])[1]"));
		continueShipping.click();

		WebElement cart = driver.findElement(By.xpath("//a[text()=' Cart']"));
		cart.click();

		WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
		checkout.click();

		WebElement registerLink = driver.findElement(By.xpath("//u[text()='Register / Login']"));
		registerLink.click();

		WebElement name = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		name.sendKeys("ARUN");

		WebElement mail = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		mail.sendKeys("arunps0110@gamil.com");

		WebElement signupBtn = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		signupBtn.click();

		WebElement maleRdo = driver.findElement(By.id("id_gender1"));
		maleRdo.click();

		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("ARUn@1234");

		WebElement day = driver.findElement(By.id("days"));
		day.click();

		WebElement date = driver.findElement(By.xpath("//option[@value='15']"));
		date.click();

		WebElement month = driver.findElement(By.id("months"));
		month.click();

		WebElement oct = driver.findElement(By.xpath("//option[text()='October']"));
		oct.click();

		WebElement year = driver.findElement(By.id("years"));
		year.click();

		WebElement selectYear = driver.findElement(By.xpath("//option[text()='1999']"));
		selectYear.click();

		WebElement chck1 = driver.findElement(By.xpath("//input[@id='newsletter']"));
		chck1.click();

		WebElement chck2 = driver.findElement(By.xpath("//input[@id='optin']"));
		chck2.click();

		WebElement firstName = driver.findElement(By.xpath("//input[@data-qa='first_name']"));
		firstName.sendKeys("Arun");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastName.sendKeys("S");

		WebElement address1 = driver.findElement(By.xpath("//input[@data-qa='address']"));
		address1.sendKeys("KCT");

		WebElement state = driver.findElement(By.id("state"));
		state.sendKeys("TAMILNADU");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("COIMBATORE");

		WebElement zipCode = driver.findElement(By.id("zipcode"));
		zipCode.sendKeys("641024");

		WebElement mobNo = driver.findElement(By.id("mobile_number"));
		mobNo.sendKeys("1234567890");

		WebElement createBtn = driver.findElement(By.xpath("//button[@data-qa='create-account']"));
		createBtn.click();

		WebElement continueBtn = driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
		continueBtn.click();
		
		
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//i[@class='fa fa-user']"));

		String usn = userName.getText();

		System.out.println(usn);

		WebElement cart1 = driver.findElement(By.xpath("//a[text()=' Cart']"));
		cart1.click();

		WebElement checkout1 = driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
		checkout1.click();

		List<WebElement> yourAddress = driver.findElements(By.xpath("//ul[@class='address item box']"));

		for (WebElement AddressDetails : yourAddress) {

			String name1 = AddressDetails
					.findElement(By.xpath("(//li[@class='address_firstname address_lastname'])[1]")).getText();
			String adrs = AddressDetails.findElement(By.xpath("(//li[@class='address_address1 address_address2'])[2]"))
					.getText();
			String local = AddressDetails
					.findElement(By.xpath("(//li[@class='address_city address_state_name address_postcode'])[1]"))
					.getText();
			String country = AddressDetails.findElement(By.xpath("(//li[@class='address_country_name'])[1]")).getText();
			String mobNo1 = AddressDetails.findElement(By.xpath("(//li[@class='address_phone'])[1]")).getText();

			System.out.println("NAME : " + name1);
			System.out.println("ADDRESS : " + adrs);
			System.out.println("LOCALITY : " + local);
			System.out.println("COUNTRY : " + country);
			System.out.println("MOB NO : " + mobNo1);

			WebElement msgBox = driver.findElement(By.xpath("//textarea[@class='form-control']"));
			msgBox.sendKeys("CONFIRM THIS ORDER");

			WebElement placeBtn = driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
			placeBtn.click();

			WebElement cardName = driver.findElement(By.xpath("//input[@name='name_on_card']"));
			cardName.sendKeys("SBI");

			WebElement cardNo = driver.findElement(By.xpath("//input[@name='card_number']"));
			cardNo.sendKeys("1010101010");

			WebElement cvc = driver.findElement(By.xpath("//input[@name='cvc']"));
			cvc.sendKeys("123");

			WebElement month1 = driver.findElement(By.xpath("//input[@name='expiry_month']"));
			month1.sendKeys("10");

			WebElement year1 = driver.findElement(By.xpath("//input[@name='expiry_year']"));
			year1.sendKeys("2025");

			WebElement payBtn = driver.findElement(By.xpath("//button[@data-qa='pay-button']"));
			payBtn.click();

			WebElement orderMsg = driver.findElement(By.xpath("//b[text()='Order Placed!']"));

			String ordrmsg = orderMsg.getText();

			System.out.println(ordrmsg);

			WebElement delete = driver.findElement(By.xpath("//i[@class='fa fa-trash-o']"));
			delete.click();

			WebElement deleteMsg = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));

			String del = deleteMsg.getText();

			System.out.println(del);
		}

	}

}
