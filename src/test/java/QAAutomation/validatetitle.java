package QAAutomation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LandingPage;
import Pages.LoginPage;
import Resources.Base;

public class validatetitle extends Base{
	
	
	@Test
	public void NavigationPage() throws IOException {
		
		driver = inicializador();
		driver.get("https://qaclickacademy.com/");
		LandingPage lp = new LandingPage(driver);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[7]/div[1]/div[1]/div[2]"))).click();
		System.out.println(lp.getTitlePage().getText());
		    assertEquals(lp.getTitlePage().getText(), "FEATURED COURSES");

 }
	  
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}	
