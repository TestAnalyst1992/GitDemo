import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UIElementsEnableDisableCheck14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

		/* 
		 * In above case Selenium functions like isEnasbled() and isDisabled()
		 * wont work, This is becoz in modern UI Development they fade the UI 
		 * to indicate user that a particular feature or option is not available 
		 * specific to user stories... But if user clicks on faded UI then user will be directed 
		 * to change the process flow in accordance to that specific user story....
		 * 
		 * So How can we check the IsEnabled or isDisabled conditions of a UI
		 */
		System.out.println(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style"));
		if(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style"));
		if(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style").contains("0.5"))
		{
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
	//	driver.close();
	}

}
