package Resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public WebDriver driver;
	public WebDriverWait w;
	public Properties prop;
	
	
	public WebDriver inicializador() throws IOException{
      
		
		
		prop = new Properties();
		
		FileInputStream fils = new FileInputStream("C:\\Users\\Junior Jacobs\\Desktop\\AutomationFull\\FullProject\\src\\test\\java\\Resources\\data.properties");
		
		
		prop.load(fils);
		String brosername = prop.getProperty("browser");
		
		if (brosername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Junior Jacobs\\Desktop\\AutomationFull\\FullProject\\src\\test\\java\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();
		    w = new WebDriverWait(driver, Duration.ofSeconds(4));
			
		}else {
			
			//////////code
		}
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		return driver;
		
	}
	
	public void getScreenShotPath(String testCaseName) throws IOException {
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports"+ testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		
	}


}
