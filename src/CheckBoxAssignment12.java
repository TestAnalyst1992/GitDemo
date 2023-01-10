import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAssignment12 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected(), "CheckBox Not selected");
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected(), "CheckBox selected");

		
		// Get the checkbox count in the page
		System.out.println("CheckBox count is : " +driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 3, "Count not as expected");
		driver.close();
		
	}

}
