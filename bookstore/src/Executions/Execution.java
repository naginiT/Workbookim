package Executions;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Actions.Actionsexe;
import Objects.Browser;

public class Execution 
	{
	@Test
	public void Mouse(WebElement Agriculture, WebElement sub) throws Exception 
	{
		Browser.browserm();
		Actionsexe.agriculture(Agriculture, sub);
		
		
	}

}

