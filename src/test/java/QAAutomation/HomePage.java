package QAAutomation;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.LandingPage;
import Resources.Base;

public class HomePage extends Base{
	
	
	@Test
	public void NavigationPage() throws IOException {
		
		driver = inicializador();
		driver.get("https://qaclickacademy.com/");
		LandingPage lp = new LandingPage();
		lp.getLogin().click();
		}

}
