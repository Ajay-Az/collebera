package webDriverMethods;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.chrome.ChromeDriver;
public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.swiggy.com");//
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		URL url = new URL("https://www.facebook.com");
		driver.navigate().to(url);
		Thread.sleep(2000);
		driver.navigate().
		

	}

}
