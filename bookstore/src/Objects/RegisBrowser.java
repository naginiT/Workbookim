package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisBrowser 
{
	public static WebDriver driver;
	@Test
	public static void browserm( ) throws Exception  
	{
		
	System.setProperty("webdriver.chrome.driver","D:\\imran\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" http://cubicitsolution.co.in/bookstore/index.php?route=account/register");
	
 
	 }

}
