import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static void main(String[] args) {

		
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		// Invoke Browser
	    // ChromeDriver driver= mew ChromeDriver();
	   //	Firefox, IE, Safari, Microsoft Edge
	
	// Chrome
	//	System.setProperty("webdriver.chrome.driver", dir +"\\drivers\\chromedriver.exe");
//	// Selenium Manager (Beta phase)	
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");

	// Firefox
//		System.setProperty("webdriver.gecko.driver", dir +"\\drivers\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://rahulshettyacademy.com");

	// 	MS Edge
//		System.setProperty("webdriver.edge.driver", dir +"\\drivers\\msedgedriver.exe");
		WebDriver driver2= new EdgeDriver();
		driver2.get("https://rahulshettyacademy.com");
	}

}
