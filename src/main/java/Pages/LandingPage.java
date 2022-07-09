package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin = By.xpath("//span[contains(text(),'Login')]");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navbar =By.xpath("//header/div[2]/div[1]/nav[1]");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
	}
	
	


	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	public WebElement getTitlePage()
	{
		return driver.findElement(title);
	}
	
	public WebElement getNav()
	{
		return driver.findElement(navbar);
	}

}


    