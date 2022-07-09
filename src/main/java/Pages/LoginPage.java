package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']\r\n");
	By btnsign = By.xpath("//body/section[@id='hero']/div[1]/form[1]/div[3]/input[1]");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
	}


	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getbtnsign()
	{
		return driver.findElement(btnsign);
	}
	

}


    