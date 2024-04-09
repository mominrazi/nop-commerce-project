package nop_commerce_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class nop_commerce {
	
	WebDriver driver;
	@Test
	public void one() throws InterruptedException {
		
		driver =new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Momin");
		
		driver.findElement(By.id("LastName")).sendKeys("Razi");
		
		WebElement year = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
		Select sc =new Select(year);
		
		sc.selectByVisibleText("2002");
		
		WebElement month = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
		
Select sc2 =new Select(month);
		
		sc2.selectByVisibleText("February");
		WebElement day = driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
		
		Select sc3 =new Select(day);
				
				sc3.selectByVisibleText("27");
				
		
		driver.findElement(By.id("Email")).sendKeys("mominrazim786@gmail.com");
		driver.findElement(By.id("Newsletter")).click();
		driver.findElement(By.id("Password")).sendKeys("mominrazim786");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("mominrazim786");
		Thread.sleep(1000);
		
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.xpath("//a[@href=\"/books\"][1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@alt=\"Picture of Fahrenheit 451 by Ray Bradbury\"][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button-37")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"button-1 checkout-as-guest-button\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("momin");
		driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("razim");
		driver.findElement(By.name("BillingNewAddress.Email")).sendKeys("mominrazim786@gmail.com");
		driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Masai");

		WebElement dropdown = driver.findElement(By.id("BillingNewAddress_CountryId"));
		
		Select s=new Select(dropdown);
		s.selectByVisibleText("India");
		

		WebElement dropdown2 = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
		
		Select s2=new Select(dropdown2);
		s2.selectByVisibleText("Select state");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Mumbai");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Mumbai");

		driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Bhiwandi");
		
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("421302");
		
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9309959058");
		
		driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("123456");
		
		driver.findElement(By.name("save")).click();
		
		
		driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();
		
driver.findElement(By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]")).click();
		
		
driver.findElement(By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]")).click();
	
	
driver.findElement(By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]")).click();
	
	driver.findElement(By.xpath("//button[@class=\"button-1 order-completed-continue-button\"]")).click();
	
	}
	

}
