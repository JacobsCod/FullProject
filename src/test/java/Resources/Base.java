package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public WebDriver inicializador() throws IOException{
		
		Properties prop = new Properties();
		
		FileInputStream fils = new FileInputStream("C:\\Users\\Junior Jacobs\\Desktop\\AutomationFull\\FullProject\\src\\test\\java\\Resources\\data.properties");
		
		
		prop.load(fils);
		String brosername = prop.getProperty("browser");
		
		if (brosername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Junior Jacobs\\Desktop\\AutomationFull\\FullProject\\src\\test\\java\\Resources\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}else {
			
			//////////code
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		return driver;
		
	}

}
