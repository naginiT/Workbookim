package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects extends Browser  
	{
	 static WebDriver driver;
	 WebElement element;
	static By  Agriculture=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/a/span[2]");
	static By Sub=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/div/div/div/div/div/ul/li[1]/a/span");
	static By title=By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/div/div/div/div/div/ul/li[1]/div/div/div/div/div/ul/li[1]/a/span");

	
    public  Objects(WebDriver driver)
	{
		super();
	}
    public static WebElement Agricultre()
    {
    	return driver.findElement(Agriculture);
     }
    public static WebElement Agrisub()
    {
    	return driver.findElement(Sub);
     }
    public static WebElement Agripro()
    {
    	return driver.findElement(title);
     }
	
	}
	
