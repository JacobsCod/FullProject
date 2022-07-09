package QAAutomation;

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

public class HomePage extends Base{
	
	
	@BeforeTest
	public void inicializar() throws IOException
	{
		
		driver = inicializador();
		
	}
	
	
	
	@Test(dataProvider="getData")
	public void NavigationPage(String email, String password, String text) throws IOException {
		
		driver = inicializador();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[7]/div[1]/div[1]/div[2]"))).click();
		lp.getLogin().click();
		LoginPage lpg = new LoginPage(driver);
		lpg.getemail().sendKeys(email);
		lpg.getpassword().sendKeys(password);
		lpg.getbtnsign().click();
		System.out.print(text);
		}
	
	
	@DataProvider
	public  Object[][] getData() {
		
		Object [][] data = new Object[2][3];
		data [0][0]="probando data";
		data [0][1]="12345345";
		data [0][2]="probando data";
		
		data [1][0]="probando data";
		data [1][1]="12345345";
		data [1][2]="probando data";
		
		
		return data; 
		
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
