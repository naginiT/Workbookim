package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionsexe 
	{
	 
	  public static void agriculture(WebElement Agriculture, WebElement sub)
	  {
			WebDriver driver = null;
			Actions a=new Actions(driver);
			a.moveToElement(Agriculture).perform();
			a.moveToElement(sub).perform();	 
			
			
		
	}


	
	/*public Actionsex(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void setfile() 
	
	{	
		
		//WebElement ele= Browser.driver.findElement(By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/a/span[2]"));
		Actionsex a=new Actionsex(Browser.driver);
		Thread.sleep(5000);
		a.moveToElement(ele).perform();
		//WebElement e=driver.findElement(By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/div/div/div/div/div/ul/li[1]/a/span"));
		Thread.sleep(5000);
		a.moveToElement(e).perform();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/div/div/div/div/div/ul/li[1]/div/div/div/div/div/ul/li[1]/a/span")).click();	
	
	}

	private Object moveToElement(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	}
