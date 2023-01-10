import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("sinjuzacharias1992@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("Hello123#");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("johny@testmail.in");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //xpath inexing
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@testmail.in"); // css indexing
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//button[contains(@class, 'login')]")).click(); // Xpath Regular Expression
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // CSS  Regular Expression
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click(); // Xpath Regular Expression

//		driver.close();		

		
		
	}

}
