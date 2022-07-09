package QAAutomation;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LandingPage;
import Pages.LoginPage;
import Resources.Base;

public class validateNav extends Base{
	
	@BeforeTest
	public void inicializar() throws IOException {
		driver = inicializador();
		driver.get("https://qaclickacademy.com/");
	}
	
	
	@Test
	public void NavigationPage() throws IOException {
		
		
		LandingPage lp = new LandingPage(driver);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[7]/div[1]/div[1]/div[2]"))).click();
	    System.out.println(lp.getNav().isDisplayed());
	    assertTrue(lp.getNav().isDisplayed());
	   
	     }
	
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}	
